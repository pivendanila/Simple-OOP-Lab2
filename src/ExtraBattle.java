import ru.ifmo.se.pokemon.Battle;
import Pokemons.*;

public class ExtraBattle {

    Battle pokemonBattle = new Battle();
    private int allyCounter = 0;
    private int foeCounter = 0;

    public ExtraBattle(ExtraPokemon[] pokemonsAlly, ExtraPokemon[] pokemonsFoe) {
        for (ExtraPokemon extraPokemon : pokemonsAlly) {
            if (extraPokemon.level_get()) {
                pokemonBattle.addAlly(extraPokemon);
                allyCounter++;
            }
        }
        for (ExtraPokemon extraPokemon : pokemonsFoe) {
            if (extraPokemon.level_get()) {
                pokemonBattle.addFoe(extraPokemon);
                foeCounter++;
            }
        }
    }

    public void go() {
        if (allyCounter == 0 && foeCounter == 0) {
            System.out.println("Не было указано ни одного подходящего покемона");
        }
        else if (allyCounter + foeCounter == 1) {
            System.out.println("Одного покемона не хватает для проведения боя :(");
        }
        else if (allyCounter == 0 || foeCounter == 0){
                System.out.println("В другой команде нет ни одного покемона :(");
        }
        else {
            pokemonBattle.go();
        }
    }
}
