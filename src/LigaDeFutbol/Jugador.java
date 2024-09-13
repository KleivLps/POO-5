package LigaDeFutbol;

public class Jugador extends Persona {
    public int goles = 0;

    public Jugador(String nombre, Equipo equipo) {
        super(nombre, equipo);
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.equipo = null;
        this.goles = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public void gritaGol() {
        System.out.println(nombre + ": Metio un gol!!");
    }

    @Override
    public void gritarGol() {
        // Lógica para gritar gol si es necesario
    }

    @Override
    public String toString() {
        // Sobreescribimos el método toString para dar una representación adecuada del objeto
        return "Jugador: " + nombre +
                ", Goles: " + goles +
                (equipo != null ? ", Equipo: " + equipo.getNombre() : ", Sin equipo");
    }

    public static void mostrarJugador(String nombre, Equipo equipo) {
        System.out.println("Jugador: " + nombre + ", Equipo: " +
                (equipo != null ? equipo.getNombre() : "Sin equipo"));
    }
}
