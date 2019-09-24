/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandmonster.actions;

import commandmonster.Pokemon;

/**
 *
 * @author irvin
 */
public interface ActionSkill {
    
    /**
     * run action to take from skill
     * 
     * @param pokemon 
     */
    public void run(Pokemon pokemon);
    
    /**
     * process of action
     * @param pokemon 
     */
    public void process(Pokemon pokemon);
}
