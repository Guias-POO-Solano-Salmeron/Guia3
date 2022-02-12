package analisis_guia3.complementario2.avanzada;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.*;
public class CalculadoraAvanzada {
    // Definiendo los atributos a utilizar
    String numero;
    private double numero1 = 0;
    private double numero2 = 0;
    private double resultado = 0;

    //Definiendo los Metodos
    public void Potencia() {
        numero = JOptionPane.showInputDialog("Ingrese el primer número de la base");
        while (!isNumber(numero)) {
            numero = JOptionPane.showInputDialog(null,"Valor incorrecto, Por favor inserta un número positivo");
        }
        numero1= Double.parseDouble(numero);
        numero = JOptionPane.showInputDialog("Ingrese la potencia");
        while (!isNumber(numero)) {
            numero = JOptionPane.showInputDialog(null,"Valor incorrecto, Por favor inserta un número positivo");
        }
        numero2= Double.parseDouble(numero);
        resultado = Math.pow(numero1,numero2);
        JOptionPane.showInputDialog(null,"La potencia de los números "+numero1+"^"+numero2+" es "+resultado);
    }

    public void Opuesto() {
        numero = JOptionPane.showInputDialog("Ingrese un número");
        while (!isNumber(numero)) {
            numero = JOptionPane.showInputDialog(null, "Valor incorrecto, Por favor inserta un número positivo");
        }
        numero1 = Double.parseDouble(numero);

        if (numero1 > 0) {
            JOptionPane.showMessageDialog(null, "El numero opuesto de " + numero1 + " es: " + "-" + numero1);
        } else if (numero1 == 0) {
            JOptionPane.showMessageDialog(null, "El numero opuesto de " + numero1 + " es: " + "0");
        } else if (numero1 < 0) {
            resultado = numero1 * -1;
            JOptionPane.showMessageDialog(null, "El numero opuesto de " + numero1 + " es: " + resultado);
        }
    }

    public void Factorial() {
        numero = JOptionPane.showInputDialog("Ingrese un número");
        while (!isNumber(numero)) {
            numero = JOptionPane.showInputDialog(null,"Valor incorrecto, Por favor inserta un número positivo");
        }
        numero1= Double.parseDouble(numero);
        int fact = 1;
        String cadena = Double.toString(numero1) + "!: ";
        for( int i = 1; i <= numero1; i++ ) {
            fact *= i;
            if (i<numero1)
            {
                cadena += Integer.toString(i) + "*";
            }else
            if(i==numero1)
            {
                cadena += Integer.toString(i);
            }
        }
        JOptionPane.showMessageDialog(null, "El factorial del número: "+numero1+" es "+" = " + fact);
    }

    //Usando try catch para excepciones de números
    private static boolean isNumber(String n) {
        try {
            Double.parseDouble(n);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}