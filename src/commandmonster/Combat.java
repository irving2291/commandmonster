
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
    }
    
    /**
     * view interfaz pokemon
     * @param trainer 
     */
    public void interfaz(PokemonTrainer trainer)
    {
        Pokemon pokemon = trainer.getFirstPokemon();
        System.out.println("pokemon: " + pokemon.getName());
        System.out.println(pokemon.getHpCurrent()+"/"+pokemon.getHp());
    }
    
    /**
     * turn in combat
     * @param pokemon 
     */
    private void turn(PokemonTrainer turnPokemonTrainer, PokemonTrainer oppPokemonTrainer)
    {
        Pokemon turnPokemon = turnPokemonTrainer.getFirstPokemon();
        Pokemon opponentPokemon = oppPokemonTrainer.getFirstPokemon();
        String actual;
        if (turnPokemonTrainer.getTypePlayer() == 1) {
            actual = "you turn";
        } else {
            actual = "opponent turn";
        }

        System.out.println(actual);
        interfaz(turnPokemonTrainer);
        System.out.println("1: attack | 2: change pokemon | 3: scape | 0: pass");
        Scanner scan = new Scanner(System.in);
        int entry = scan.nextInt();
        
        /**
         * first action is attack
         */
        switch(entry) {
            case 1:
                int c = 0;//count to mark number of skill
                
                /**
                 * print skill of pokemon in turn
                 */
                for (Skill skill : turnPokemon.getSkills()) {
                    System.out.println(c + ": " + skill.getName());
                    c++;
                }
                
                /**
                 * insert number of skill selected
                 */
                int select = scan.nextInt();
                
                /**
                 * action of attack
                 */
                attack(turnPokemon.getSkills().get(select), turnPokemon, opponentPokemon);
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
    private void attack(Skill skill, Pokemon turnPokemon, Pokemon opponentPokemon)
    {
        skill.run(opponentPokemon, turnPokemon.getDamage());
        System.out.println("Tu ataque fue muy efectivo");
    }
    
    /**
     * action of change pokemon
     */
    private void changePokemon(PokemonTrainer trainer)
    {
        List<Pokemon> belt = trainer.getBeltPokemons();
        int c = 0;
        for (Pokemon pokemon : belt) {
            System.out.println(c + ": " + pokemon.getName());
            c++;
        }
        int selected = new Scanner(System.in).nextInt();
        trainer.setFirstPokemon(belt.get(selected));
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
