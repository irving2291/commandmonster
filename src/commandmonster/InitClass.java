/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandmonster;

import commandmonster.makesmonsters.BasicMonsters;
import commandmonster.makesmonsters.BasicTrainer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author irvin
 */
public class InitClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PokemonTrainer im = im();
        PokemonTrainer opponent = opponent();
        Combat combatOne = new Combat(im, opponent);
        
        combatOne.run();
    }
    
    public static PokemonTrainer im()
    {
        return BasicTrainer.ash(1);
        
    }
    
    public static PokemonTrainer opponent()
    {
        return BasicTrainer.Cynthia(2);
    }
    
}
