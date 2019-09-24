/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandmonster;

import java.util.List;

/**
 *
 * @author irvin
 */
public class PokemonTrainer {
    /**
     * 1 is human, 2 is AI
     */
    private int typePlayer;
    private Pokemon firstPokemon;
    private List<Pokemon> beltPokemons;
    private List<Pokemon> allPokemonCaptcha;
    
    public PokemonTrainer()
    {
        //
    }
    
    /**
     * 
     * @param typePlayer 1 is human, 2 is AI
     */
    public PokemonTrainer(int typePlayer)
    {
        this.typePlayer = typePlayer;
    }
    
    public PokemonTrainer(List<Pokemon> beltPokemons, int typePlayer)
    {
        this.beltPokemons = beltPokemons;
        this.firstPokemon = beltPokemons.get(0);
        this.typePlayer = typePlayer;
    }
    
    public void setFirstPokemon(Pokemon pokemon)
    {
        this.firstPokemon = pokemon;
    }
    
    public Pokemon getFirstPokemon()
    {
        return this.firstPokemon;
    }

    public int getTypePlayer() {
        return typePlayer;
    }

    public void setTypePlayer(int typePlayer) {
        this.typePlayer = typePlayer;
    }

    public List<Pokemon> getBeltPokemons() {
        return beltPokemons;
    }

    public void setBeltPokemons(List<Pokemon> beltPokemons) {
        this.beltPokemons = beltPokemons;
    }
    
    
}
