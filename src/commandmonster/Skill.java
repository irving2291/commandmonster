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
    static final int MULTIPLIER_CRITIC_DAMAGE = 40;//*40%
    private String name;
    private String type;
    private int damage;
    private int powerPoint;
    private String typeSb;
    
   
    
    public Skill()
    {
        //
    }
    
    public Skill(String name, String type, int damage , int powerPoint ,String typeSb )
    {
        this.name = name;
        this.type = type;
        this.damage = damage;
        this.powerPoint = powerPoint;
        this.typeSb = typeSb;
    }
    
    /**
     * 
     * @param pokemon
     * @param damage
     * @return if true pokemon is dead, false pokemon continue life
     */
    public boolean run(Pokemon pokemon, int damage)
    {
        this.powerPoint -= 1;
        int currentHp = pokemon.getHpCurrent();
        int totalDamage = damage + this.getDamage();
        if (pokemon.isVulnerable(this)) {
            totalDamage = totalDamage + (int) Math.ceil((totalDamage * MULTIPLIER_CRITIC_DAMAGE)/100);
        }
        currentHp -= totalDamage;
        if (currentHp < 0) {
            pokemon.setHpCurrent(0);
            System.out.println("your attack has been deadly.");
            return true;
        }
        if (pokemon.isVulnerable(this)) {
            System.out.println("the attack has been very effective.");
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

    public int getPowerPoint() {
        return powerPoint;
    }

    public void setPowerPoint(int powerPoint) {
        this.powerPoint = powerPoint;
    }

    public String getTypeSb() {
        return typeSb;
    }

    public void setTypeSb(String typeSb) {
        this.typeSb = typeSb;
    }
    
}
