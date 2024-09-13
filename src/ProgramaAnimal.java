public class ProgramaAnimal {
    public static void main(String[] args) {

        Perro perro1 = new Perro("Pancho",6,"Labrador-Husky ");
        Perro perro2 = new Perro("Kina", 7, "Galgo Ingles");
        Perro perro3 = new Perro("Amy", 5, "Schnauzer ");
        Perro perro4 = new Perro("Diego", 5, "Schnauzer");
        Perro perro5 = new Perro("Paquita", 1, "Galgo Italiano ");
        Perro perro6 = new Perro("Micaela", 1, "Galgo Italiano ");
        Perro perro7 = new Perro("Grettel",3, "Schnauzer ");
        Perro perro8 = new Perro("Dotty", 2, "Terrier Escoces");
        Perro perro9 = new Perro("Akira", 2, "Pitbull ");

        Gato gato1 =new Gato("Anya", 4, "Siames");
        Gato gato2 =new Gato("Biscocho", 3, "Angora Albino");
        Gato gato3 =new Gato("Enrique", 4, "Pelo corto Americano");
        Gato gato4 =new Gato("Cataleya", 4, "Pelo corto Americano Atigrado");
        Gato gato5 =new Gato("Mudkip", 1, "Maine Coon");
        Gato gato6 =new Gato("Mushu", 1, "Japanese BobTail");

        perro1.comer();
        perro2.comer();
        perro3.comer();
        perro4.comer();
        perro5.comer();
        perro6.comer();
        perro7.comer();
        perro8.comer();
        perro9.comer();

        perro1.dormir();
        perro2.dormir();
        perro3.dormir();
        perro4.dormir();
        perro5.dormir();
        perro6.dormir();
        perro7.dormir();
        perro8.dormir();
        perro9.dormir();

        perro1.ladrar();
        perro2.ladrar();
        perro3.ladrar();
        perro4.ladrar();
        perro5.ladrar();
        perro6.ladrar();
        perro7.ladrar();
        perro8.ladrar();
        perro9.ladrar();

        gato1.comer();
        gato2.comer();
        gato3.comer();
        gato4.comer();
        gato5.comer();
        gato6.comer();


        gato1.dormir();
        gato2.dormir();
        gato3.dormir();
        gato4.dormir();
        gato5.dormir();
        gato6.dormir();


        gato1.maullar();
        gato2.maullar();
        gato3.maullar();
        gato4.maullar();
        gato5.maullar();
        gato6.maullar();

        System.out.println("¿Son iguales Pancho y Kina? " + perro1.equals(perro2));
        System.out.println("¿Son iguales Kina y Amy? " + perro2.equals(perro3));
        System.out.println("¿Son iguales Amy y Diego? " + perro3.equals(perro4));
        System.out.println("¿Son iguales Diego y Paquita? " + perro4.equals(perro5));
        System.out.println("¿Son iguales Paquita y Micaela? " + perro5.equals(perro6));
        System.out.println("¿Son iguales Micaela y Grettel? " + perro6.equals(perro7));
        System.out.println("¿Son iguales Grettel y Dotty? " + perro7.equals(perro8));
        System.out.println("¿Son iguales Dotty y Akira? " + perro8.equals(perro9));
        System.out.println("¿Son iguales Akira y Pancho?" + perro9.equals(perro1));

        System.out.println("HashCode de Pancho: " +perro1.hashCode());
        System.out.println("HashCode de Kina: " +perro2.hashCode());
        System.out.println("HashCode de Amy: " +perro3.hashCode());
        System.out.println("HashCode de Diego: " +perro4.hashCode());
        System.out.println("HashCode de Paquita: " +perro5.hashCode());
        System.out.println("HashCode de Micaela: " +perro6.hashCode());
        System.out.println("HashCode de Grettel: " +perro7.hashCode());
        System.out.println("HashCode de Dotty: " +perro8.hashCode());
        System.out.println("HashCode de Akira: " +perro9.hashCode());

        Object[] objects ={perro1, perro2, perro3, perro4, perro5, perro6, perro7, perro8, perro9, gato1, gato2, gato3, gato4, gato5, gato6, new Animal(), new Gato(),};

        for (Object obj : objects) {
            if (obj instanceof Perro) {
                System.out.println("Es un perro.");
            } else if (obj instanceof Gato) {
                System.out.println("Es un gato");
            } else if (obj instanceof Animal) {
                System.out.println("Es un animal");
            } else {
                System.out.println("tipo desconocido");}
        }

    }
}
