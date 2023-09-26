package helper;

import ru.ifmo.se.pokemon.Move;

public class Helper {
    public static boolean chance(double chance) {
        return chance > Math.random();
    }

    public static String describeMovement(Move move) {
        return "does " + move.getClass().getName();
    }
}
