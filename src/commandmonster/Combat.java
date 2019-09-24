/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandmonster;

import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author irvin
 */
public class Combat {
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
    
    public void run()
    {
        this.status = 1;
        Pokemon[] turnInBattle = new Pokemon[2];
        myPokemon = this.im.getFirstPokemon();
        opponentPokemon = this.opponent.getFirstPokemon();

        /**
         * if my pokemon is greater or equal to the opponent pokemon
         * in turn is first
         */
        if (myPokemon.RollInitiative() >= opponentPokemon.RollInitiative()) {
            turnInBattle[0] = myPokemon;
            turnInBattle[1] = opponentPokemon;
        } else {
            turnInBattle[0] = myPokemon;
            turnInBattle[1] = opponentPokemon;
        }
        do{
            //combat process
            turn(turnInBattle[0]);
            turn(turnInBattle[1]);
            
        }while(this.status == 1);
    }
    
    /**
     * turn in combat
     * @param pokemon 
     */
    private void turn(Pokemon pokemon)
    {
        System.out.println(pokemon.getName() + "  your turn.");
        System.out.println("1: attack | 2: change pokemon | 3: scape | 0: pass");
        int entry = new Scanner(System.in).nextInt();
        
        /**
         * first action is attack
         */
        switch(entry) {
            case 1:
                attack(pokemon);
            default:
                System.out.println("pass");
        }
    }
    
    /**
     * action can be
     * @param pokemon 
     */
    private void attack(Pokemon pokemon)
    {
        System.out.println("Tu ataque fue muy efectivo");
    }
}
