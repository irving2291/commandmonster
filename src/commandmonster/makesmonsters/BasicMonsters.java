/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandmonster.makesmonsters;

import commandmonster.Pokemon;
import commandmonster.Probability;
import commandmonster.Skill;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author irvin
 */
public class BasicMonsters {

    public static Pokemon pikachu() {
        Pokemon pokemon = new Pokemon();
        pokemon.setName("pikachu");
        pokemon.setRace("pikachu");
        pokemon.setType("Thunder");
        pokemon.setHpTotal(230);
        pokemon.setDice(6);
        pokemon.setLevel(Probability.getRollDice(5));

        List<Skill> listSkill = new ArrayList<>();
        listSkill.add(BasicSkills.thunderBolt());
        listSkill.add(BasicSkills.headbutt());
        listSkill.add(BasicSkills.tackle());
        pokemon.setSkills(listSkill);

        List<String> listVul = new ArrayList<>();

        // vulnerabilidades
        listVul.add("rock");
        pokemon.setVulnerabilities(listVul);
        return pokemon;
    }

    public static Pokemon charmander() {
        Pokemon pokemon = new Pokemon();
        pokemon.setName("charmander");
        pokemon.setRace("charmander");
        pokemon.setType("fire");
        pokemon.setHpTotal(245);
        pokemon.setDice(8);
        pokemon.setLevel(Probability.getRollDice(4));

        List<Skill> listSkill = new ArrayList<>();
        listSkill.add(BasicSkills.blastBurn());
        listSkill.add(BasicSkills.tackle());
        pokemon.setSkills(listSkill);

        List<String> listVul = new ArrayList<>();
        listVul.add("water");
        pokemon.setVulnerabilities(listVul);
        return pokemon;
    }

    public static Pokemon ratata() {
        Pokemon pokemon = new Pokemon();
        pokemon.setName("ratata");
        pokemon.setRace("ratata");
        pokemon.setType("normal");
        pokemon.setHpTotal(195);
        pokemon.setDice(4);
        pokemon.setLevel(Probability.getRollDice(3));

        List<Skill> listSkill = new ArrayList<>();
        listSkill.add(BasicSkills.tackle());
        pokemon.setSkills(listSkill);

        List<String> listVul = new ArrayList<>();
        listVul.add("fire");
        pokemon.setVulnerabilities(listVul);
        return pokemon;
    }

    public static Pokemon bulbasaur() {
        Pokemon pokemon = new Pokemon();
        pokemon.setName("bulbasaur");
        pokemon.setRace("bulbasaur");
        pokemon.setType("plant");
        pokemon.setHpTotal(220);
        pokemon.setDice(8);
        pokemon.setLevel(Probability.getRollDice(15));

        List<Skill> listSkill = new ArrayList<>();
        listSkill.add(BasicSkills.tackle());
        listSkill.add(BasicSkills.hyperbeam());
        pokemon.setSkills(listSkill);

        List<String> listVul = new ArrayList<>();

        // vulnerabilidades
        listVul.add("fire");
        pokemon.setVulnerabilities(listVul);
        return pokemon;
    }

    public static Pokemon charmeleon() {
        Pokemon pokemon = new Pokemon();
        pokemon.setName("charmeleon");
        pokemon.setRace("charmeleon");
        pokemon.setType("fire");
        pokemon.setHpTotal(230);
        pokemon.setDice(8);
        pokemon.setLevel(Probability.getRollDice(15));

        List<Skill> listSkill = new ArrayList<>();
        listSkill.add(BasicSkills.tackle());
        listSkill.add(BasicSkills.flamewell());
        pokemon.setSkills(listSkill);

        List<String> listVul = new ArrayList<>();

        // vulnerabilidades
        listVul.add("whater");
        pokemon.setVulnerabilities(listVul);
        return pokemon;
    }

    public static Pokemon squirtle() {
        Pokemon pokemon = new Pokemon();
        pokemon.setName("squirtle");
        pokemon.setRace("squirtle");
        pokemon.setType("whater");
        pokemon.setHpTotal(260);
        pokemon.setDice(10);
        pokemon.setLevel(Probability.getRollDice(15));

        List<Skill> listSkill = new ArrayList<>();
        listSkill.add(BasicSkills.tackle());
        listSkill.add(BasicSkills.leer());
        pokemon.setSkills(listSkill);
        List<String> listVul = new ArrayList<>();

        // vulnerabilidades
        listVul.add("earth");
        pokemon.setVulnerabilities(listVul);
        return pokemon;
    }

    public static Pokemon caterpie() {
        Pokemon pokemon = new Pokemon();
        pokemon.setName("caterpie");
        pokemon.setRace("caterpie");
        pokemon.setType("plant");
        pokemon.setHpTotal(190);
        pokemon.setDice(6);
        pokemon.setLevel(Probability.getRollDice(5));

        List<Skill> listSkill = new ArrayList<>();
        listSkill.add(BasicSkills.tackle());
        listSkill.add(BasicSkills.leer());
        pokemon.setSkills(listSkill);

        List<String> listVul = new ArrayList<>();

        // vulnerabilidades
        listVul.add("fire");
        pokemon.setVulnerabilities(listVul);
        return pokemon;
    }

    public static Pokemon pidgey() {
        Pokemon pokemon = new Pokemon();
        pokemon.setName("pidgey");
        pokemon.setRace("pidgey");
        pokemon.setType("plant");
        pokemon.setHpTotal(160);
        pokemon.setDice(6);
        pokemon.setLevel(Probability.getRollDice(15));

        List<Skill> listSkill = new ArrayList<>();
        listSkill.add(BasicSkills.tackle());
        listSkill.add(BasicSkills.recover());
        pokemon.setSkills(listSkill);

        List<String> listVul = new ArrayList<>();

        // vulnerabilidades
        listVul.add("fire");
        pokemon.setVulnerabilities(listVul);
        return pokemon;
    }

    public static Pokemon nidoran() {
        Pokemon pokemon = new Pokemon();
        pokemon.setName("nidoran");
        pokemon.setRace("nidoran");
        pokemon.setType("earth");
        pokemon.setHpTotal(215);
        pokemon.setDice(10);
        pokemon.setLevel(Probability.getRollDice(7));

        List<Skill> listSkill = new ArrayList<>();
        listSkill.add(BasicSkills.tackle());
        listSkill.add(BasicSkills.leer());
        pokemon.setSkills(listSkill);

        List<String> listVul = new ArrayList<>();

        // vulnerabilidades
        listVul.add("whater");
        pokemon.setVulnerabilities(listVul);
        return pokemon;
    }

    public static Pokemon vulpix() {
        Pokemon pokemon = new Pokemon();
        pokemon.setName("vulpix");
        pokemon.setRace("vulpix");
        pokemon.setType("fire");
        pokemon.setHpTotal(220);
        pokemon.setDice(12);
        pokemon.setLevel(Probability.getRollDice(20));

        List<Skill> listSkill = new ArrayList<>();
        listSkill.add(BasicSkills.tackle());
        listSkill.add(BasicSkills.flamethrower());
        pokemon.setSkills(listSkill);

        List<String> listVul = new ArrayList<>();

        // vulnerabilidades
        listVul.add("whater");
        pokemon.setVulnerabilities(listVul);
        return pokemon;
    }

    public static Pokemon zubat() {
        Pokemon pokemon = new Pokemon();
        pokemon.setName("zubat");
        pokemon.setRace("zubat");
        pokemon.setType("fly");
        pokemon.setHpTotal(230);
        pokemon.setDice(10);
        pokemon.setLevel(Probability.getRollDice(20));

        List<Skill> listSkill = new ArrayList<>();
        listSkill.add(BasicSkills.tackle());
        listSkill.add(BasicSkills.leer());
        pokemon.setSkills(listSkill);

        List<String> listVul = new ArrayList<>();

        // vulnerabilidades
        listVul.add("electry");
        pokemon.setVulnerabilities(listVul);
        return pokemon;
    }

    public static Pokemon oddish() {
        Pokemon pokemon = new Pokemon();
        pokemon.setName("oddish");
        pokemon.setRace("oddish");
        pokemon.setType("plant");
        pokemon.setHpTotal(200);
        pokemon.setDice(6);
        pokemon.setLevel(Probability.getRollDice(10));

        List<Skill> listSkill = new ArrayList<>();
        listSkill.add(BasicSkills.tackle());
        listSkill.add(BasicSkills.hyperbeam());
        pokemon.setSkills(listSkill);

        List<String> listVul = new ArrayList<>();

        // vulnerabilidades
        listVul.add("fire");
        pokemon.setVulnerabilities(listVul);
        return pokemon;
    }

    public static Pokemon meowth() {
        Pokemon pokemon = new Pokemon();
        pokemon.setName("meowth");
        pokemon.setRace("meowth");
        pokemon.setType("normal");
        pokemon.setHpTotal(260);
        pokemon.setDice(12);
        pokemon.setLevel(Probability.getRollDice(25));

        List<Skill> listSkill = new ArrayList<>();
        listSkill.add(BasicSkills.zenheadbut());
        listSkill.add(BasicSkills.skyuppercut());
        pokemon.setSkills(listSkill);

        List<String> listVul = new ArrayList<>();

        // vulnerabilidades
        listVul.add("fight");
        pokemon.setVulnerabilities(listVul);
        return pokemon;
    }
}
