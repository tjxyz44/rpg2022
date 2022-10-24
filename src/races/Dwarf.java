package races;

import character.CharacterStats;

public class Dwarf implements IRace {

    CharacterStats cs;

    public Dwarf(CharacterStats cs){
        this.cs = cs;
        cs.setConstitution(cs.getConstitution() + 2);
        cs.setStrength(cs.getStrength() + 2);
        cs.setIntelligence(cs.getIntelligence() - 1);
    }

    @Override
    public String toString() {
        return "Dwarf";
    }
}
