package analisis_guia3.complementario3;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.*;
public class Animales {
    private String nombre;
    private String edad;
    private String alimento;

    public void mostrardatos() {
        JOptionPane.showConfirmDialog(null, "Datos del animal\n" + "Nombre: " + nombre + "\n" + "Edad: " + edad + "\n" + "Alimento: " + alimento);
    }

    public void ingresodatos() {
        nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de su mascota");
        edad = JOptionPane.showInputDialog(null, "Ingrese la edad de su mascota");
        alimento = JOptionPane.showInputDialog(null, "Ingrese el alimento de su mascota");
    }

    public static class Gallo extends Animales {
        String colorplumas;

        public void ingresodatos2() {
            ingresodatos();
            colorplumas = JOptionPane.showInputDialog(null, "Ingrese el color de plumas de su mascota");
        }

        public void mostrardatos2() {
            mostrardatos();
            JOptionPane.showMessageDialog(null, "Color de plumas: " + colorplumas);
        }
    }

    public static class Perro extends Animales {
        String colorpelaje;

        public void ingresodatos3() {
            ingresodatos();
            colorpelaje = JOptionPane.showInputDialog(null, "Ingrese el color del pelaje de su mascota");
        }

        public void mostrardatos3() {
            mostrardatos();
            JOptionPane.showMessageDialog(null, "Color de pelaje: " + colorpelaje);
        }
    }

    public static class Gato extends Animales {
        String colorojos;

        public void ingresodatos4() {
            ingresodatos();
            colorojos = JOptionPane.showInputDialog(null, "Ingrese el color de ojos de su mascota");
        }

        public void mostrardatos4() {
            mostrardatos();
            JOptionPane.showMessageDialog(null, "Color de ojos: " + colorojos);
        }
    }

    public static class Hamster extends Animales {
        String cantidadpulgas;

        public void ingresodatos5() {
            ingresodatos();
            cantidadpulgas = JOptionPane.showInputDialog(null, "Ingrese la cantidad de pulgas de su mascota");
        }

        public void mostrardatos5() {
            mostrardatos();
            JOptionPane.showMessageDialog(null, "Color de plumas: " + cantidadpulgas);
        }
    }

    public static void main(String[] args) {
        Animales ani = new Animales();
        Animales.Gallo gallo = new Gallo();
        Animales.Perro perro = new Perro();
        Animales.Gato gato= new Gato();
        Animales.Hamster hamster = new Hamster();
        int seleccion;
        String numero;
        do {
            numero = JOptionPane.showInputDialog("Ingrese su mascota\n" + "Elija una opcion: \n" + "1. Gallo. \n" + "2. Perro. \n" + "3. Gato. \n" + "4. Hámster. \n" + "5. Salir. \n");
            while (!isNumber(numero)) {
                numero = JOptionPane.showInputDialog(null, "Valor incorrecto\n" + "Elija una opcion: \n" + "1. Gallo. \n" + "2. Perro. \n" + "3. Gato. \n" + "4. Hámster. \n" + "5. Salir. \n");
            }
            seleccion = Integer.parseInt(numero);
            if (seleccion == 1) {
                gallo.ingresodatos2();
                gallo.mostrardatos2();
            } else if (seleccion == 2) {
                perro.ingresodatos3();
                perro.mostrardatos3();
            } else if (seleccion == 3) {
                gato.ingresodatos4();
                gato.mostrardatos4();
            } else if (seleccion == 4) {
                hamster.ingresodatos5();
                hamster.mostrardatos5();
            } else if (seleccion == 5) {
                System.exit(0);
            }
        }
        while (seleccion != 1 || seleccion != 2 || seleccion != 3 || seleccion != 4 || seleccion != 5);
    }


        // Validar ingreso de enteros
        private static boolean isNumber (String n){
            try {
                Integer.parseInt(n);
                return true;
            } catch (NumberFormatException nfe) {
                return false;
            }
        }


}

