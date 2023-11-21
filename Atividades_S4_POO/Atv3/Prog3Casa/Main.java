package Atv3.Prog3Casa;

import Atv3.Prog2Portas.Portas;

public class Main {
    public static void main(String[] args) {
        Casa newCasa = new Casa(null);

        Portas portas1 = new Portas(false, null, 0, 0, 0);
        Portas portas2 = new Portas(false, null, 0, 0, 0);
        Portas portas3 = new Portas(false, null, 0, 0, 0);

        newCasa.portas1 = portas1;
        newCasa.portas2 = portas2;
        newCasa.portas3 = portas3;


        portas1.abre();
        portas2.fecha();
        portas3.abre();
        newCasa.corCasa();

        System.out.println("Portas abertas: " + newCasa.contadorDePortas());
    }
}
