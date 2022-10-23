package app;

import character.CharacterStats;
import character.Player;
import races.*;

public class TestMain {
    public static void main(String[] args) {
        CharacterStats dwarfStats = new CharacterStats(10, 10, 10, 10, 10, 10);
        CharacterStats elfStats = new CharacterStats(10, 10, 10, 10, 10, 10);
        Player dwarfPlayer = new Player(dwarfStats, new Dwarf(dwarfStats));
        Player elfPlayer = new Player(elfStats, new Elf(elfStats));



//        System.out.println(newPlayer.getConstitution());
//        System.out.println(newPlayer.getStrength());
//        System.out.println(newPlayer.getCharisma());
        System.out.println(dwarfPlayer);
        System.out.println(elfPlayer);
        System.out.println("hello worl");
    }
}
