/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraistacalidad;

/**
 *
 * @author arons
 */
public class Calculadora {

    public String sumar(int a, int b) {

        if (a > 100000 || b > 100000) {
            return "No se puede ingresar datos mayores a 100000";
        } else {
            int c = (a + b);
            return "Tu suma es: " + c;
        }

    }

    public String restar(int a, int b) {
        if (a > 100000 || b > 100000) {
            return "No se puede ingresar datos mayores a 100000";
        } else {
            int c = (a - b);
            return "Tu resta es: " + c;
        }
    }

    public String multiplicar(int a, int b) {
        if (a > 100000 || b > 100000) {
            return "No se puede ingresar datos mayores a 100000";
        } else {
            int c = (a * b);
            return "Tu multiplicacion es: " + c;
        }
    }

    public String dividir(int a, int b) {
        if (a > 100000 || b > 100000) {
            return "No se puede ingresar datos mayores a 100000";
        } else {
            int c = (a + b);
            return "Tu suma es: " + c;
        }
    }
}
