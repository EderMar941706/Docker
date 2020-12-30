package main.java.Bazse;
import java.util.Scanner;
public class java1 {
 public static void main(String args[]){
     double penny = .01;
     double nickel = .05;
     double dime = .10;
     double quarter = .25;
     int dollar = 1;

     Scanner scanner = new Scanner(System.in);

     System.out.println("Bienvenido al 'Cambio del Dollar'!" +
             "Su objetivo es introducir cambios suficientes para llegar exactamente $1.00");
     System.out.println("ingresa su .01 centavos:");
     int numofPennies = scanner.nextInt();

     System.out.println("ingresa su .02 centavos:");
     int numofNickels = scanner.nextInt();

     System.out.println("Ingrese sus .10 centavos");
     int numofDimes = scanner.nextInt();

     System.out.println("Ingrese .25 de dolar");
     int numofQuarters = scanner.nextInt();

     scanner.close();

     double total = numofPennies * penny + numofNickels * nickel + numofDimes * dime + numofQuarters * quarter;
             if(total < dollar) {
                 double amountShort = dollar - total;

                 //Manera de hacer la impresión decimal con solo 2 lugares decimales
                 System.out.println("Perdiste eres demasiado bajo" + String.format("%.2f", amountShort) + " cents.");
             }
             else if(total > dollar) {
                 double amountOver = total - dollar;

                 //Manera de hacer la impresión decimal con solo 2 lugares decimales
                 System.out.println("perdiste eres bajo" + String.format("%.2f", amountOver) + "cent.");
             }
             else{
                 System.out.println("eso es todo!! logaraste la cantidad exacta !Tugasnas¡");
                 }
             }

}

