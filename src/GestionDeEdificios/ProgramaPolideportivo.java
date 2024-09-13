package GestionDeEdificios;

import java.util.ArrayList;

public class ProgramaPolideportivo {
    public static void main(String[] args) {
        ArrayList<Edificio> edificios = new ArrayList<>();

        Polideportivo poli1 = new Polideportivo(50, 20, 30, "Polideportivo Central", "Techado");
        Polideportivo poli2 = new Polideportivo(60, 25, 35, "Polideportivo Norte", "Abierto");

        EdificioOFICINAS edificio1 = new EdificioOFICINAS(20, 44, 20 ,25, 3, 7);
        EdificioOFICINAS edificio2 = new EdificioOFICINAS(30, 50, 30 ,30, 5, 6);

        edificios.add(poli1);
        edificios.add(poli2);
        edificios.add(edificio1);
        edificios.add(edificio2);

        int techados = 0;
        int abiertos = 0;

        for (Edificio edificio : edificios) {
            System.out.println("Superficie: " +edificio.calcularSuperficie());
            System.out.println("Volumen: " +edificio.calcularVolumen());

            if (edificio instanceof Polideportivo polideportivo) {
                if (polideportivo.getTipoInstalacion().equalsIgnoreCase("Techado")) {
                    techados++;
                } else if (polideportivo.getTipoInstalacion().equalsIgnoreCase("Abierto")) {
                    abiertos++;
                } else if (edificio instanceof EdificioOFICINAS edificioOficinas) {
                    System.out.println("Capacidad de personas: " +edificioOficinas.cantidadPersonas());
                }
                System.out.println();
            }

            System.out.println("Cantidad de polideportivos techados: " +techados);
            System.out.println("Cantidad de polideportivos abiertos: " +abiertos);
        }
    }
}
