/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorafiguras1;
import java.util.Scanner;
/**
 *
 * @author 123
 */
public class Main {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor del lado del cuadrado: ");
        double lado = scanner.nextDouble();

        try {
            double area = cuadrado.calcularArea(lado);
            double perimetro = cuadrado.calcularPerimetro(lado);

            System.out.println("Área del cuadrado: " + area);
            System.out.println("Perímetro del cuadrado: " + perimetro);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
