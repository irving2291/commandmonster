/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandmonster;

import commandmonster.makesmonsters.BasicMonsters;
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
        List<Pokemon> listPokemon = new ArrayList<Pokemon>();
        listPokemon.add(BasicMonsters.pikachu());
        listPokemon.add(BasicMonsters.ratata());
        PokemonTrainer trainer = new PokemonTrainer(listPokemon, 1);
        return trainer;
    }
    
    public static PokemonTrainer opponent()
    {
        List<Pokemon> listPokemon = new ArrayList<Pokemon>();
        listPokemon.add(BasicMonsters.ratata());
        listPokemon.add(BasicMonsters.charmander());
        PokemonTrainer trainer = new PokemonTrainer(listPokemon, 2);
        return trainer;
    }
    
}
