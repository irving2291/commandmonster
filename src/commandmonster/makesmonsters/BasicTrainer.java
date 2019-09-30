/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandmonster.makesmonsters;

import commandmonster.Pokemon;
import commandmonster.PokemonTrainer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author irvin
 */
public class BasicTrainer {

    public static PokemonTrainer ash(int typePlayer) {

        List<Pokemon> listPokemon = new ArrayList<>();
        listPokemon.add(BasicMonsters.pikachu());
        listPokemon.add(BasicMonsters.pidgey());
         listPokemon.add(BasicMonsters.squirtle());
        PokemonTrainer trainer = new PokemonTrainer(listPokemon, typePlayer);
        return trainer;

    }
    
        public static PokemonTrainer Lance (int typePlayer) {

        List<Pokemon> listPokemon = new ArrayList<>();
        listPokemon.add(BasicMonsters.bulbasaur());
        listPokemon.add(BasicMonsters.caterpie());
         listPokemon.add(BasicMonsters.charmeleon());
        PokemonTrainer trainer = new PokemonTrainer(listPokemon, typePlayer);
        return trainer;

    }
    
        public static PokemonTrainer Bruke(int typePlayer) {

        List<Pokemon> listPokemon = new ArrayList<>();
        listPokemon.add(BasicMonsters.meowth());
        listPokemon.add(BasicMonsters.nidoran());
         listPokemon.add(BasicMonsters.oddish());
        PokemonTrainer trainer = new PokemonTrainer(listPokemon, typePlayer);
        return trainer;

    }
        
        public static PokemonTrainer Pier(int typePlayer) {

        List<Pokemon> listPokemon = new ArrayList<>();
        listPokemon.add(BasicMonsters.pidgey());
        listPokemon.add(BasicMonsters.vulpix());
         listPokemon.add(BasicMonsters.zubat());
        PokemonTrainer trainer = new PokemonTrainer(listPokemon, typePlayer);
        return trainer;

    }
    
        public static PokemonTrainer Gary(int typePlayer) {

        List<Pokemon> listPokemon = new ArrayList<>();
        listPokemon.add(BasicMonsters.caterpie());
        listPokemon.add(BasicMonsters.ratata());
         listPokemon.add(BasicMonsters.nidoran());
        PokemonTrainer trainer = new PokemonTrainer(listPokemon, typePlayer);
        return trainer;

    }
        
        public static PokemonTrainer Tracy(int typePlayer) {

        List<Pokemon> listPokemon = new ArrayList<>();
        listPokemon.add(BasicMonsters.squirtle());
        listPokemon.add(BasicMonsters.vulpix());
         listPokemon.add(BasicMonsters.nidoran());
        PokemonTrainer trainer = new PokemonTrainer(listPokemon, typePlayer);
        return trainer;

    }
        
        public static PokemonTrainer Cynthia(int typePlayer) {

        List<Pokemon> listPokemon = new ArrayList<>();
        listPokemon.add(BasicMonsters.meowth());
        listPokemon.add(BasicMonsters.ratata());
         listPokemon.add(BasicMonsters.squirtle());
        PokemonTrainer trainer = new PokemonTrainer(listPokemon, typePlayer);
        return trainer;

    }
        
        public static PokemonTrainer Misty(int typePlayer) {

        List<Pokemon> listPokemon = new ArrayList<>();
        listPokemon.add(BasicMonsters.pidgey());
        listPokemon.add(BasicMonsters.charmeleon());
         listPokemon.add(BasicMonsters.charmander());
        PokemonTrainer trainer = new PokemonTrainer(listPokemon, typePlayer);
        return trainer;

    }
        
        public static PokemonTrainer Luis(int typePlayer) {

        List<Pokemon> listPokemon = new ArrayList<>();
        listPokemon.add(BasicMonsters.meowth());
        listPokemon.add(BasicMonsters.oddish());
         listPokemon.add(BasicMonsters.zubat());
        PokemonTrainer trainer = new PokemonTrainer(listPokemon, typePlayer);
        return trainer;

    }
        
        public static PokemonTrainer Julito(int typePlayer) {

        List<Pokemon> listPokemon = new ArrayList<>();
        listPokemon.add(BasicMonsters.meowth());
        listPokemon.add(BasicMonsters.ratata());
         listPokemon.add(BasicMonsters.squirtle());
        PokemonTrainer trainer = new PokemonTrainer(listPokemon, typePlayer);
        return trainer;

    }


}
