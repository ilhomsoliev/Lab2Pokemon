package pokemons.dustox;

import moves.physical.Endeavor;
import moves.status.FocusEnergy;
import moves.status.Mimic;
import moves.status.Substitute;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

// https://pokemondb.net/pokedex/Dustox
public class Dustox extends Pokemon {
    public Dustox(String name, int level) {
        super(name, level);
        // Stats
        super.setType(Type.BUG, Type.POISON);
        super.setStats(60, 50, 70, 50, 90, 65);
        // Moves
        super.setMove(new Endeavor(), new Substitute(), new Mimic(), new FocusEnergy());

    }
}
