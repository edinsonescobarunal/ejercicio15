// Capítulo 4: Estructura decisión lógica - Ejercicio 15.

import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double pesoEsferaA, pesoEsferaB, pesoEsferaC, pesoEsferaD;

        System.out.println("Ingrese el peso de la esfera A:");
        pesoEsferaA = entrada.nextDouble();
        System.out.println("Ingrese el peso de la esfera B:");
        pesoEsferaB = entrada.nextDouble();
        System.out.println("Ingrese el peso de la esfera C:");
        pesoEsferaC = entrada.nextDouble();
        System.out.println("Ingrese el peso de la esfera D:");
        pesoEsferaD = entrada.nextDouble();

        if(pesoEsferaA == pesoEsferaB && pesoEsferaA == pesoEsferaC) {
            System.out.println("La esfera D es la diferente");

            if(pesoEsferaD > pesoEsferaA){
                System.out.println("La esfera D es de mayor peso");
            }
            else {
                System.out.println("La esfera D es de menor peso");
            }
        }
        else{
            if(pesoEsferaA == pesoEsferaB && pesoEsferaA == pesoEsferaD){
                System.out.println("La esfera C es la diferente");

                if(pesoEsferaC > pesoEsferaA){
                    System.out.println("La esfera C es de mayor peso");
                }
                else{
                    System.out.println("La esfera C es de menor peso");
                }
            }
            else{
                if(pesoEsferaA == pesoEsferaC && pesoEsferaA == pesoEsferaD){
                    System.out.println("La esfera B es la diferente");

                    if(pesoEsferaB > pesoEsferaD){
                        System.out.println("La esfera B es de mayor peso");
                    }
                    else {
                        System.out.println("La esfera B es de menor peso");
                    }
                }
                else {
                    System.out.println("La esfera A es la diferente");

                    if(pesoEsferaA > pesoEsferaB){
                        System.out.println("La esfera A es de mayor peso");
                    }
                    else {
                        System.out.println("La esfera A es de menor peso");
                    }
                }
            }
        }
    }
}
