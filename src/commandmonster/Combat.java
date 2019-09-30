
package commandmonster;

import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author irving
 */
public class Combat {
    static final int PROBABILITY_SCAPE = 20;//20%
    private PokemonTrainer im;
    private PokemonTrainer opponent;
    
    private Pokemon myPokemon;
    private Pokemon opponentPokemon;
    /**
     * 0: combat stop, 1: combat running, 2: combat finished
     */
    private int status;
    
    public Combat(PokemonTrainer im, PokemonTrainer opponent)
    {
        this.status = 0;
        this.im = im;
        this.opponent = opponent;
    }
    
    /**
     * execute combat
     */
    public void run()
    {
        this.status = 1;
        PokemonTrainer[] turnInBattle = new PokemonTrainer[2];
        myPokemon = im.getFirstPokemon();
        opponentPokemon = opponent.getFirstPokemon();

        do{
            /**
            * if my pokemon is greater or equal to the opponent pokemon
            * in turn is first
            */
           if (myPokemon.RollInitiative() >= opponentPokemon.RollInitiative()) {
               turnInBattle[0] = im;
               turnInBattle[1] = opponent;
           } else {
               turnInBattle[0] = opponent;
               turnInBattle[1] = im;
           }
        
            //combat process
            turn(turnInBattle[0], turnInBattle[1]);
            if (this.status == 1) 
                turn(turnInBattle[1], turnInBattle[0]);
            
        }while(this.status == 1);
        
        if (this.status == 2) {
            if (im.havePokemonAvailable()) {
                System.out.println("the fight is over, the winner is you");
            } else {
                System.out.println("the fight is over, the winner is the opponent");
            }
        }
    }
    
    /**
     * view interfaz pokemon
     * @param trainer 
     */
    public int interfaz(PokemonTrainer trainer)
    {
        System.out.println("##################################################################");
        Pokemon pokemon = trainer.getFirstPokemon();
        String actual;
        if (trainer.getTypePlayer() == 1) {
            actual = "you turn";
        } else {
            actual = "opponent turn";
        }

        System.out.println(actual);
        System.out.println("pokemon: " + pokemon.getName() + "            hp:" + pokemon.getHpCurrent()+"/"+pokemon.getHp());
        System.out.println("level: " + pokemon.getLevel());
        System.out.println("1: attack | 2: change pokemon | 3: scape | 0: pass");
        System.out.println("##################################################################");
        int entry = new Scanner(System.in).nextInt();
        return entry;
    }
    
    /**
     * turn in combat
     * @param pokemon 
     */
    private void turn(PokemonTrainer turnPokemonTrainer, PokemonTrainer oppPokemonTrainer)
    {
        Scanner scan = new Scanner(System.in);
        int entry = 2;
        if (!turnPokemonTrainer.getFirstPokemon().isAlive()) {
            System.out.println(turnPokemonTrainer.getFirstPokemon().getName()
                    + " can no longer continue.");
            System.out.println(oppPokemonTrainer.getMessageTypePlayer() + " have change pokemon.");
        } else {
            entry = interfaz(turnPokemonTrainer);
        }
        
        /**
         * first action is attack
         */
        switch(entry) {
            case 1:
                int c = 0;//count to mark number of skill
                
                /**
                 * print skill of pokemon in turn
                 */
                for (Skill skill : turnPokemonTrainer.getFirstPokemon().getSkills()) {
                    if (skill.getPowerPoint() > 0) {
                        System.out.println(c + ": " + skill.getName() + ": " + skill.getPowerPoint());
                    }
                    if (c == 3) {
                        break;
                    }
                    c++;
                }
                
                /**
                 * insert number of skill selected
                 */
                int select = scan.nextInt();
                
                /**
                 * action of attack
                 */
                attack(turnPokemonTrainer.getFirstPokemon().getSkills().get(select), turnPokemonTrainer, oppPokemonTrainer);
                break;
            case 2:
                changePokemon(turnPokemonTrainer);
                break;
            case 3:
                scape();
                break;
            default:
                System.out.println("pass");
        }
    }
    
    /**
     * action of attack
     * @param pokemon 
     */
    private void attack(Skill skill, PokemonTrainer turnPokemonTrainer, PokemonTrainer oppPokemonTrainer)
    {
        boolean isDead = skill.run(oppPokemonTrainer.getFirstPokemon(), turnPokemonTrainer.getFirstPokemon().getDamage());
    }
    
    /**
     * action of change pokemon
     */
    private void changePokemon(PokemonTrainer trainer)
    {
        List<Pokemon> belt = trainer.getBeltPokemons();
        int c = 0, available = 0;
        for (Pokemon pokemon : belt) {
            if (pokemon.getHpCurrent() > 0) {
                System.out.println(c + ": " + pokemon.getName() + " ---> " + pokemon.getHpCurrent() + "/" + pokemon.getHp() + "HP");
                available++;
            }
            c++;
        }
        if (available > 0) {
            int selected = new Scanner(System.in).nextInt();
            trainer.setFirstPokemon(belt.get(selected));
        } else {
            this.status = 2;
        }
        
    }
    
    /**
     * action of scape
     */
    private void scape()
    {
        /**
         * probability of scape from combat
         */
        if (Probability.rollD100() >= PROBABILITY_SCAPE) {
            this.status = 0;
            System.out.println("you have scape successfully...");
        }
    }
}
