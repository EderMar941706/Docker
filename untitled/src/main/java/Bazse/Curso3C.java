package main.java.Bazse;

import java.util.Scanner;

public class Curso3C {

    public static void main(String[] args) {
        int requiredSalary = 14000;
        int requiredYearsEmployed = 3;
        System.out.println("¿cuanto gana?:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        System.out.println("¿cuanto lleva laborando?");
        double years = scanner.nextDouble();
        scanner.close();
        if (salary >= (double)requiredSalary) {
            if (years >= (double)requiredYearsEmployed) {
                System.out.println("Felicidades, pasa a la ventanilla");
            } else {
                System.out.println("Perdon siga laborando para cumplir con los años" + requiredYearsEmployed + " years.");
            }
        } else {
            System.out.println("Perdon debes ganar arriba de 14000" + requiredSalary + "para el prestamo");
        }

    }
}