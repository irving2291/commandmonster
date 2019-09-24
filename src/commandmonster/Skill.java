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
public class Skill {
    static final int MULTIPLIER_CRITIC_DAMAGE = 2;//*2
    private String name;
    private String type;
    private int damage;
    
    public Skill()
    {
        //
    }
    
    public Skill(String name, String type, int damage)
    {
        this.name = name;
    }
    
    /**
     * 
     * @param pokemon
     * @param damage
     * @return if true pokemon is dead, false pokemon continue life
     */
    public boolean run(Pokemon pokemon, int damage)
    {
        int currentHp = pokemon.getHpCurrent();
        int totalDamage = damage + this.getDamage();
        if (pokemon.isVulnerable(this)) {
            totalDamage = totalDamage*MULTIPLIER_CRITIC_DAMAGE;
        }
        currentHp -= totalDamage;
        if (currentHp < 0) {
            pokemon.setHpCurrent(0);
            return true;
        }
        pokemon.setHpCurrent(currentHp);
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
