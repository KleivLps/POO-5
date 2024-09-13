import java.util.Objects;

public class Perro extends Animal{
    protected String raza;

    public Perro() {
    }
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }
    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }
    public void ladrar() {
        System.out.println("Woof Woof");
    }

    @Override
    public void comer() {
        System.out.println("El perro " + nombre + " esta comiendo croquetas.");
    }

    @Override
    public void dormir() {
        System.out.println("El perro " + nombre + " esta durmiendo (Zzz Zzz Zzz).");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return  true;
        if (o == null || getClass() != o.getClass()) return false;
        Perro perro =(Perro) o;
        return edad == perro.edad &&
                Objects.equals(nombre, perro.nombre) &&
                Objects.equals(raza, perro.raza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, raza);
    }

}
