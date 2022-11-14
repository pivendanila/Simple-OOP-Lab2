import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;


public class Main {
    public static void main(String[] args) {
        Battle PokemonBattle = new Battle();

        Furfrou furfrou = new Furfrou("Фурфрою", 1);
        Staryu staryu = new Staryu("Старью", 1);
        Starmie starmie = new Starmie("Старми", 1);
        Happiny happiny = new Happiny("Хэппини", 1);
        Blissey blissey = new Blissey("Блисси", 1);
        Chansey chansey = new Chansey("Чэнси", 1);

        PokemonBattle.addAlly(furfrou);
        PokemonBattle.addFoe(staryu);
        PokemonBattle.addAlly(starmie);
        PokemonBattle.addFoe(happiny);
        PokemonBattle.addAlly(blissey);
        PokemonBattle.addFoe(chansey);

        PokemonBattle.go();
    }

}