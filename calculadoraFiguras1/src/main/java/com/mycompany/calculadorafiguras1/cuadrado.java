/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorafiguras1;

/**
 *
 * @author 123
 */
public class cuadrado {
        /**
     * Método para calcular el área de un cuadrado.
     * @param lado La longitud de un lado del cuadrado.
     * @return El área del cuadrado (lado * lado).
     * @throws IllegalArgumentException si el lado es negativo.
     */
    public static double calcularArea(double lado) {
        if (lado < 0) {
            throw new IllegalArgumentException("El lado no puede ser negativo");
        }
        return lado * lado;
    }

     /**
     * Método para calcular el perímetro de un cuadrado.
     * @param lado La longitud de un lado del cuadrado.
     * @return El perímetro del cuadrado (4 * lado).
     * @throws IllegalArgumentException si el lado es negativo.
     */
    public static double calcularPerimetro(double lado) {
        if (lado < 0) {
            throw new IllegalArgumentException("El lado no puede ser negativo");
        }
        return 4 * lado;
    }
}
