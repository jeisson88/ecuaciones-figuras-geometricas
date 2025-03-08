/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.calculadorafiguras1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 123
 */
public class cuadradoTest {
    
    /**
     * Prueba unitaria para verificar que el cálculo del área con un lado positivo es correcto.
     */
    @Test
    public void calcularArea_LadoPositivo_RetornaArea() {
        double lado = 5; // Definimos un lado de longitud 5
        double esperado = 25; // El área esperada es 5 * 5 = 25
        double resultado = cuadrado.calcularArea(lado); // Llamamos al método calcularArea
        assertEquals(esperado, resultado, 0); // Comparamos el resultado con el esperado
    }



    /**
     * Prueba unitaria para verificar que el cálculo del perímetro con un lado positivo es correcto.
     */
    @Test
    public void calcularPerimetro_LadoPositivo_RetornaPerimetro() {
        double lado = 4;
        double esperado = 16; // El perímetro esperado es 4 * 4 = 16
        double resultado = cuadrado.calcularPerimetro(lado);
        assertEquals(esperado, resultado, 0);
    }



    /**
     * Prueba unitaria que intencionalmente fallará.
     * Se espera un resultado incorrecto a propósito.
     */
    @Test
    public void calcularArea_TestFallido() {
        double lado = 4;
        double esperado = 20; // Intencionalmente incorrecto (debería ser 16)
        double resultado = cuadrado.calcularArea(lado);
        assertEquals(esperado, resultado, 0);
    }
}
