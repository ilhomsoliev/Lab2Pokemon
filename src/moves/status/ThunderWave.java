package moves.status;

import ru.ifmo.se.pokemon.*;

// Done
public class ThunderWave extends StatusMove {
    public ThunderWave() {
        super(Type.ELECTRIC, 0, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.paralyze(p);
        Status effectedPokemon = p.getCondition();
        if(effectedPokemon.equals(Status.PARALYZE)){
            System.out.println("I MADE SUCCESSFUL ThunderWave!!!");
        }
    }

    @Override
    protected String describe() {
        return "использует Электроволну";
    }
}