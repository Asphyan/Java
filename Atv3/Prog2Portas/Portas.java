package Atv3.Prog2Portas;

import java.util.Scanner;

public class Portas {
    boolean aberta;
    String cor;
    float dinx;
    float diny;
    float dinz;

    public Portas(boolean aberta, String cor, float dinx, float diny, float dinz){
        this.aberta =  aberta;
        this.cor = cor;
        this.dinx = dinx;
        this.diny = diny;
        this.dinz = dinz;
    }

    public void abre(){
        aberta = true;
    }

    public void fecha(){
        aberta = false;
    }

    public boolean estaAberta(){
        return aberta;
    }

    public void mostrar(){
        System.out.println("\nDIMENÇÕES v\n");
        System.out.printf("################\n");
        System.out.printf("Altura = %.2fm\nLargura = %.2fm\nProfundidade = %.2fm", dinx, diny, dinz);
        System.out.printf("\n################");

        System.out.println("\n\nCOLORAÇÃO v\n");
        System.out.printf("################\n");
        System.out.printf("%s", cor);
        System.out.printf("\n################\n");

        System.out.println("\nESTADO v");
        System.out.printf("\n################");
        estaAberta();
        System.out.printf("\n################\n");
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe as dimenções da porta");

        System.out.printf("\nAltura: ");
        float dinx = scanner.nextFloat();
        System.out.printf("\nLargura: ");
        float diny = scanner.nextFloat();
        System.out.printf("\nProfundidade: ");
        float dinz = scanner.nextFloat();

        System.out.printf("\nCor da porta: ");
        String cor = scanner.next();

        Portas portas = new Portas(false, cor, dinx, diny, dinz);

        portas.fecha();
        portas.abre();

        portas.mostrar();

        scanner.close();
    }
}
