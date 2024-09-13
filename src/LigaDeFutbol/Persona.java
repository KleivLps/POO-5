package LigaDeFutbol;

public abstract class Persona {

    protected String nombre;
    protected int edad;
    protected Equipo equipo;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        this.equipo = null;
    }

    public Persona(String nombre, Equipo equipo) {
        this.nombre = nombre;
        this.equipo = equipo;
    }

    public void gritaGol() {
        System.out.println("Jugador: " + nombre + " hizo un gol");
    }

    public abstract void gritarGol();
}
