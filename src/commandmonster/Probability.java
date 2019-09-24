/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandmonster;

/**
 *
 * @author irvin
 */
public class Probability {
    
    public static int getRollDice(int n)
    {
        return (int) (Math.random() * n) + 1;
    }
    
    public static int rollD20()
    {
        return getRollDice(20);
    }
    
    public static int rollD100()
    {
        return getRollDice(100);
    }
}
