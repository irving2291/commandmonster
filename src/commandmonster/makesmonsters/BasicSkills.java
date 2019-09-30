/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandmonster.makesmonsters;

import commandmonster.Skill;

/**
 *
 * @author ijacome
 */
public class BasicSkills {
 
    /**
     * bola trueno 
     * @return 
     */
    public static Skill thunderBolt() {
        return new Skill("Thunder Bolt", "thunder", 60 , 15 , "special ");
    }
    /**
     * tackleada 
     * @return 
     */
    public static Skill tackle() {
        return new Skill("tackle", "normal", 40 , 40 , "basic" );
    }
    /**
     * anillo igneo
     * @return 
     */
    public static Skill blastBurn() {
        return new Skill("Blast Burn", "fire", 150 ,5, "special" );
    }
    /**
     * Hiper colmillo
     * @return 
     */
    public static Skill hiperfang() {
        return new Skill("Hiper Fang", "normal", 120 , 20 , "special");
    }
    
    /**
     * ataque rapido
     * @return 
     */
     public static Skill quickatack() {
        return new Skill("Quick Atack", "normal", 60 , 30 , "basic");
        
    }
     /**
      * cabezaso
      * @return 
      */
     public static Skill headbutt() {
        return new Skill("Headbutt", "normal", 80 , 20 , "basic");
        
     }
     /**
      * lanza llamas 
      * @return 
      */
     public static Skill flamethrower() {
        return new Skill("flamethrower", "fire", 100 , 15 ,"special" );
        
     }
     /**
      * rueda de fuego
      * @return 
      */
     public static Skill flamewell() {
        return new Skill("flamewell", "fire", 110 , 25  , "special");
        
     }
     /**
      * ataque psiquico 
      * @return 
      */
     public static Skill zenheadbut() {
        return new Skill("zenheadbut", "psychic", 150 , 10 , "special");
    }
     /**
      * Recuperacion 
      * @return 
      */
     public static Skill recover() {
        return new Skill("recover", "normal", 150 , 20 ,"special" );
    }
     /**
      * Hyper rayo 
      * @return 
      */
     public static Skill hyperbeam() {
        return new Skill("hyperbeam", "normal", 150 , 10 , "special");
    }
     /**
      * Golpe elevado
      * @return 
      */
     public static Skill skyuppercut() {
        return new Skill("skyuppercut", "normal", 150 ,15 , "basic");
    }
    /**
     * mirada maliciosa 
     * @return 
     */ 
    public static Skill leer() {
        // decrece defensa base reduce la defensa base -20 y se acumula 
        return new Skill("leer ", "normal", 0 , 40 , "basic" );
    }
 }

