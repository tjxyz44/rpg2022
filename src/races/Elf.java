package races;

import character.CharacterStats;
import interfaces.IRace;

public class Elf implements IRace {

    CharacterStats cs;

    public Elf(CharacterStats cs){
       this.cs = cs;
       cs.setConstitution(cs.getConstitution() + 1);
       cs.setDexterity(cs.getDexterity() + 3);
       cs.setStrength(cs.getStrength() - 1);
    }

    @Override
    public String toString() {
        return "Elf";
    }
}
