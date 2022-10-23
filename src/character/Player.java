package character;

import interfaces.IRace;

public class Player  {

    private CharacterStats cs;
    private IRace race;

    public Player (CharacterStats cs, IRace race){
        this.cs = cs;
        this.race = race;
    }

    @Override
    public String toString() {
        return "Player " +
                cs +
                ", race= " + race;
    }
}
