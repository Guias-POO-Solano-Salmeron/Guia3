package analisis_guia3.ejercicios;
import  analisis_guia3.complementario2.basica.*;
import  analisis_guia3.complementario2.avanzada.*;
import javax.swing.JOptionPane;
import javax.swing.*;
public class Complementario2 {
    public static void main(String[] args) {
        CalculadoraBasica basica = new CalculadoraBasica();
        CalculadoraAvanzada avanzada = new CalculadoraAvanzada();
        int seleccion;
        String numero;
        do
        {
            numero = JOptionPane.showInputDialog("Bienvenido\n" + "Escoge una opcion: \n" + "1. Calculadora Basica. \n" + "2. Calculadora Avanzada. \n");
            while (!isNumber(numero)) {
                numero = JOptionPane.showInputDialog(null,"Valor incorrecto\n Selecciona una opcion: \n" + "1. Calculadora Basica. \n" + "2. Calculadora Avanzada. \n");
            }
            seleccion= Integer.parseInt(numero);
            switch (seleccion)
            {
                case 1:
                    do
                    {
                        numero = JOptionPane.showInputDialog("Calculadora básica\n"+ "Elige una opcion: \n" + "1. Suma. \n" + "2. Resta. \n" + "3. Multiplicacion. \n" + "4. Division. \n" + "5. Salir. \n");
                        while (!isNumber(numero)) {
                            numero = JOptionPane.showInputDialog(null,"Valor incorrecto\n"+ "Elige una opcion: \n" + "1. Suma. \n" + "2. Resta. \n" + "3. Multiplicacion. \n" + "4. Division. \n" + "5. Salir. \n");
                        }
                        seleccion= Integer.parseInt(numero);
                        if(seleccion==1)
                        {
                            basica.Suma();
                        }else
                        if(seleccion==2)
                        {
                            basica.Resta();
                        }else
                        if(seleccion==3)
                        {
                            basica.Multiplicacion();
                        }else
                        if(seleccion==4)
                        {
                            basica.Division();
                        }else
                        if(seleccion==5)
                        {
                            System.exit(0);
                        }
                    }while (seleccion != 1 || seleccion != 2 || seleccion != 3 || seleccion != 4);
                    break;

                case 2:
                    int seleccion2;
                    do
                    {
                        numero = JOptionPane.showInputDialog("Calculadora avanzada\n"+ "Seleccione una opcion: \n" + "1. Potencia. \n" + "2. Opuesto. \n" + "3. Factorial. \n" + "4. Salir. \n");
                        while (!isNumber(numero)) {
                            numero = JOptionPane.showInputDialog(null,"Valor incorrecto\n"+ "Seleccion una opcion: \n" + "1. Potencia. \n" + "2. Opuesto. \n" + "3. Factorial. \n" + "4. Salir. \n");
                        }
                        seleccion2= Integer.parseInt(numero);
                        if(seleccion2 ==1)
                        {
                            avanzada.Potencia();
                        }else
                        if(seleccion2 ==2)
                        {
                            avanzada.Opuesto();
                        }else
                        if(seleccion2 ==3)
                        {
                            avanzada.Factorial();
                        }else
                        if(seleccion2 ==4)
                        {
                            System.exit(0);
                        }
                    }while (seleccion2 != 1 || seleccion2 != 2 || seleccion2 != 3);


                    break;

                default:
            }
        }while (seleccion != 1 || seleccion != 2);
    }
    //Usando try catch para excepciones de números
    private static boolean isNumber(String n) {
        try {
            Integer.parseInt(n);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
