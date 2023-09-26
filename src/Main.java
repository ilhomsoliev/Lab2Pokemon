import pokemons.claydol.Claydol;
import pokemons.dustox.Dustox;
import pokemons.frillish.Frillish;
import pokemons.magnemite.Magnemite;
import pokemons.magneton.Magneton;
import pokemons.shaymin.ShayminLand;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    // My Pokemons
    // https://pokemondb.net/pokedex/frillish - done
    // https://pokemondb.net/pokedex/Shaymin-Land
    // https://pokemondb.net/pokedex/Dustox
    // https://pokemondb.net/pokedex/Magnemite
    // https://pokemondb.net/pokedex/Magneton
    // https://pokemondb.net/pokedex/Claydol

    public static void main(String[] args) {

        Battle battle = new Battle();

        battle.addAlly(new Frillish("Frillish", 12));
        battle.addAlly(new ShayminLand("Shaymin", 5));
        battle.addAlly(new Dustox("Dustox", 10));

        battle.addFoe(new Magnemite("Magnemite", 2));
        battle.addFoe(new Magneton("Magneton", 5));
        battle.addFoe(new Claydol("Claydol", 10));

        battle.go();
    }
}
