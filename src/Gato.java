public class Gato extends Animal{
    protected String color;

    public Gato() {

    }

    public Gato(String nombre, int edad) {
        super(nombre,edad);
    }

    public Gato(String nombre, int edad, String color) {
        super(nombre,edad);
        this.color = color;
    }

    public void maullar() {
        System.out.println("Miau");
    }

    @Override
    public void comer() {
        System.out.println("El gato " +nombre+ " esta comiendo whiskat");
    }

    @Override
    public void dormir() {
        System.out.println("El gato " +nombre+ " esta durmiendo encima del sofa.");
    }
}
