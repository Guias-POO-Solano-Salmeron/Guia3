package analisis_guia3.complementario2.basica;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.*;
public class CalculadoraBasica {
// Definiendo los atributos a utilizar
    String numero;
    private double numero1= 0;
    private double numero2=0;
    private double resultado= 0;

    //Agregando los métodos

    public void Suma(){
        numero = JOptionPane.showInputDialog("Ingrese el primer número para sumar");
        while (!isNumber(numero)) {
            numero = JOptionPane.showInputDialog(null,"Valor incorrecto, Por favor inserta un número positivo");
        }
        numero1= Double.parseDouble(numero);
        numero = JOptionPane.showInputDialog("Ingrese el segundo número para sumar");
        while (!isNumber(numero)) {
            numero = JOptionPane.showInputDialog(null,"Valor incorrecto, Por favor inserta un número positivo");
        }
        numero2= Double.parseDouble(numero);
        resultado = numero1 + numero2;
        JOptionPane.showInputDialog(null,"La suma de los números "+numero1+" y "+numero2+" es de "+resultado);
    }
    public void Resta(){
        numero = JOptionPane.showInputDialog("Ingrese el primer número para restar");
        while (!isNumber(numero)) {
            numero = JOptionPane.showInputDialog(null,"Valor incorrecto, Por favor inserta un número positivo");
        }
        numero1= Double.parseDouble(numero);
        numero = JOptionPane.showInputDialog("Ingrese el segundo número para restar");
        while (!isNumber(numero)) {
            numero = JOptionPane.showInputDialog(null,"Valor incorrecto, Por favor inserta un número positivo");
        }
        numero2= Double.parseDouble(numero);
        resultado = numero1 - numero2;
        JOptionPane.showInputDialog(null,"La resta de los números "+numero1+" y "+numero2+" es de "+resultado);
    }

    public void Multiplicacion(){
        numero = JOptionPane.showInputDialog("Ingrese el primer número para multiplicar");
        while (!isNumber(numero)) {
            numero = JOptionPane.showInputDialog(null,"Valor incorrecto, Por favor inserta un número positivo");
        }
        numero1= Double.parseDouble(numero);
        numero = JOptionPane.showInputDialog("Ingrese el segundo número para multiplicar");
        while (!isNumber(numero)) {
            numero = JOptionPane.showInputDialog(null,"Valor incorrecto, Por favor inserta un número positivo");
        }
        numero2= Double.parseDouble(numero);
        resultado = numero1 + numero2;
        JOptionPane.showInputDialog(null,"La multiplicación de los números "+numero1+" y "+numero2+" es de"+resultado);
    }
    public void Division(){
        numero = JOptionPane.showInputDialog("Ingrese el primer número para dividir");
        while (!isNumber(numero)) {
            numero = JOptionPane.showInputDialog(null,"Valor incorrecto, Por favor inserta un número positivo");
        }
        numero1= Double.parseDouble(numero);
        numero = JOptionPane.showInputDialog("Ingrese el segundo número para dividir");
        while (!isNumber(numero)) {
            numero = JOptionPane.showInputDialog(null,"Valor incorrecto, Por favor inserta un número positivo");
        }
        numero2= Double.parseDouble(numero);
        resultado = numero1 / numero2;
        JOptionPane.showInputDialog(null,"La división de los números "+numero1+" y "+numero2+" es de "+resultado);
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
