import POKEMONS.Bulbasaur;
import POKEMONS.Charmander;
import POKEMONS.Pikachu;
import POKEMONS.Squirtle;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Squirtle squirtle= new Squirtle();
        Charmander charmander= new Charmander();
        Pikachu pikachu = new Pikachu();
        Bulbasaur bulbasaur= new Bulbasaur();
        squirtle.atacarArañazo();
        squirtle.atacarBurbuja();
        charmander.atacarMordisco();
        charmander.atacarLanzallamas();
        pikachu.atacarPlacaje();
        pikachu.atacarImpactrueno();
        bulbasaur.atacarArañazo();
        bulbasaur.atacarHojaAfilada();
    }
}