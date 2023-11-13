package Atv3.Prog3Casa;

import java.util.Scanner;

import Atv3.Prog2Portas.Portas;

public class Casa {
    String cor;
    Portas portas1, portas2, portas3;
    int count = 0;

    Scanner scanner = new Scanner(System.in);

    public Casa(String cor){
        this.cor = cor;
    }

    public void corCasa(){
        System.out.print("Informe qual a cor da casa: ");
        cor = scanner.nextLine();
    }

    public int contadorDePortas(){

        if(portas1.estaAberta()){
            count++;    
        }
        if(portas2.estaAberta()){
            count++;
        }
        if(portas3.estaAberta()){
            count++;
        }

        return count;
    }
}
