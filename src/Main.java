import Pokemons.*;
public class Main {
    public static void main(String[] args) {

        Furfrou furfrou = new Furfrou("Фурфрою", 1);
        Staryu staryu = new Staryu("Старью", 1);
        Starmie starmie = new Starmie("Старми", -2);
        Happiny happiny = new Happiny("Хэппини", 2);
        Blissey blissey = new Blissey("Блисси", 1);
        Chansey chansey = new Chansey("Чэнси", 1);
        ExtraPokemon[] Foe = {furfrou, staryu, chansey};
        ExtraPokemon[] Ally = {happiny, blissey, starmie};
        ExtraBattle eb = new ExtraBattle(Ally, Foe);
        eb.go();
    }

}