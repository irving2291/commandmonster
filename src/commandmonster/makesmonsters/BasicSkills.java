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
    
    public static Skill thunderBolt()
    {
        return new Skill("Thunder Bolt", "thunder", 60);
    }
    
    public static Skill tackle()
    {
        return new Skill("tackle", "normal", 40);
    }
    
    public static Skill blastBurn()
    {
        return new Skill("Blast Burn", "fire", 150);
    }
}
