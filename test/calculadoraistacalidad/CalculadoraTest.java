/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package calculadoraistacalidad;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author arons
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @Test
    public void testSumar() {
        System.out.println("sumar");
        int a = 12;
        int b = 2;
        Calculadora instance = new Calculadora();
        String expResult = "";
        String result = instance.sumar(a, b);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testRestar() {
        System.out.println("restar");
        int a = 0;
        int b = 0;
        Calculadora instance = new Calculadora();
        String expResult = "";
        String result = instance.restar(a, b);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int a = 0;
        int b = 0;
        Calculadora instance = new Calculadora();
        String expResult = "";
        String result = instance.multiplicar(a, b);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDividir() {
        System.out.println("dividir");
        int a = 0;
        int b = 0;
        Calculadora instance = new Calculadora();
        String expResult = "";
        String result = instance.dividir(a, b);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
