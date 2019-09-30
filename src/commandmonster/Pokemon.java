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
public class Pokemon {
    private String name;
    private String race;
    private String type;
    private int hp;
    private int hpCurrent;
    private int dice;
    private int level;
    private List<String> vulnerabilities;
    
    // abilities
    private int speed;
    private int basicDefense;
    private int basicAttack;
    private int specialDefense;
    private int specialAttack;
    
    private List<Skill> skills;
    
    public Pokemon()
    {
        level = 3;
        speed = 10;
        dice = 6;
        hp = 50 + getInitHP();
        hpCurrent = hp;
    }
    
    public boolean isAlive()
    {
        return hpCurrent > 0;
    }
    
    private int getInitHP()
    {
        int total = 0;
        for (int i = 0; i < level; i++) {
            total += (Probability.getRollDice(this.dice) + 10);
        }
        return total;
    }
    
    /**
     * roll initiative of pokemon for indicate yourW speed
     * @return 
     */
    public int RollInitiative()
    {
       return Probability.rollD20() + getSpeed(); 
    }
    
    public int getDamage()
    {
        // remove when have make structure of dame by skill
        return 10 * level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDice() {
        return dice;
    }

    public void setDice(int dice) {
        this.dice = dice;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getSpeed() {
        return speed * level;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public int getHpCurrent() {
        return hpCurrent;
    }

    public void setHpCurrent(int hpCurrent) {
        this.hpCurrent = hpCurrent;
    }
    
    public void setHpTotal(int hpTotal) {
        this.hp = this.hpCurrent = hpTotal + getInitHP();
    }

    public List<String> getVulnerabilities() {
        return vulnerabilities;
    }

    public void setVulnerabilities(List<String> vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }
    
    public boolean isVulnerable(Skill skill)
    {
        boolean result = false;
        for (String vulnerability : vulnerabilities) {
            if (vulnerability.equals(skill.getType())) {
                result = true;
                break;
            }
        }
        return result;
    }

    public int getBasicDefense() {
        return basicDefense;
    }

    public void setBasicDefense(int basicDefense) {
        this.basicDefense = basicDefense;
    }

    public int getBasicAttack() {
        return basicAttack;
    }

    public void setBasicAttack(int basicAttack) {
        this.basicAttack = basicAttack;
    }

    public int getSpecialDefense() {
        return specialDefense;
    }

    public void setSpecialDefense(int specialDefense) {
        this.specialDefense = specialDefense;
    }

    public int getSpecialAttack() {
        return specialAttack;
    }

    public void setSpecialAttack(int specialAttack) {
        this.specialAttack = specialAttack;
    }
    
}
