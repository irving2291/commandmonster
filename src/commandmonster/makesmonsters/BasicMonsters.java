/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandmonster.makesmonsters;

import commandmonster.Pokemon;
import commandmonster.Probability;

/**
 *
 * @author irvin
 */
public class BasicMonsters {
    
    public static Pokemon pikachu()
    {
        Pokemon pokemon = new Pokemon();
        pokemon.setName("pikachu");
        pokemon.setRace("pikachu");
        pokemon.setType("Electrico");
        pokemon.setHp(100);
        pokemon.setDice(6);
        pokemon.setLevel(Probability.getRollDice(5));
        return pokemon;
    }
    
    public static Pokemon ratata()
    {
        Pokemon pokemon = new Pokemon();
        pokemon.setName("ratata");
        pokemon.setRace("ratata");
        pokemon.setType("normal");
        pokemon.setHp(95);
        pokemon.setDice(4);
        pokemon.setLevel(Probability.getRollDice(3));
        return pokemon;
    }
}
