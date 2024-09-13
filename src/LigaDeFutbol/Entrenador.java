package LigaDeFutbol;

public class Entrenador extends Persona{

    public Entrenador()
    {}

    @Override
    public void gritarGol() {
        System.out.println("El equipo "+ nombre + " hizo un gol!!!");
    }
}
