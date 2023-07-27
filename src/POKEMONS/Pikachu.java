package POKEMONS;

public class Pikachu extends Pokemon implements IElectrico {
    public Pikachu() {
    }
    @Override
    public void atacarPlacaje() {
        System.out.println("Hola soy Pikachu y este es mi ataque placaje");
    }

    @Override
    public void atacarArañazo() {
        System.out.println("Hola soy Pikachu y este es mi ataque aranazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Hola soy Pikachu y este es mi ataque mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque punio trueno");
    }

    @Override
    public void atacaratacarRayo() {
        System.out.println("Hola soy Pikachu y este es mi ataque rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Hola soy Pikachu y este es mi ataque rayo carga");
    }
}
