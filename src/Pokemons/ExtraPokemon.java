package Pokemons;

import ru.ifmo.se.pokemon.*;

public class ExtraPokemon extends Pokemon{
    final boolean valid_level;
    public ExtraPokemon(String name, int level){
        super(name, level);
        if(level>100 || level < 1){
            valid_level = false;
            System.out.println("Уровень покемона " + name + " не входит в требуемый диапазон 1-100");
        }
        else{
            valid_level = true;
        }
    }
    public boolean level_get(){
        return valid_level;
    }
}
