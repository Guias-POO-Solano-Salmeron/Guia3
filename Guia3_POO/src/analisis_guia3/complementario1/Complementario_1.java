import javax.swing.*;

public class Complementario_1 {
    //Declaración de atributos
    private String subjects[] = new String[6];

    private String studentName;
    private String studentLastName;

    private String studentID;
    private String studentAge;


    public Complementario_1(String studentID, String studentName, String studentLastName, String studentAge)
    {
        this.studentName=studentName;
        this.studentLastName=studentLastName;
        this.studentID=studentID;
        this.studentAge=studentAge;
    }

    // Método para el registro de un estudiante
    public void studentRegistration()
    {
        // Serie de Inputs para el ingreso de datos del estudiante

        // Carnet
        studentID = JOptionPane.showInputDialog("1. Escribe el carnet del alumno: ");
        // Primer Nombre
        studentName = JOptionPane.showInputDialog("2. Escribe el nombre del alumno: ");
        // Apellido
        studentLastName = JOptionPane.showInputDialog("3. Escribe el apellido del alumno: ");
        // Edad
        studentAge = JOptionPane.showInputDialog("4. Escribe la edad del alumno: ");
    }

    // Método para mostrar la información del estudiante al usuario
    public void showInfo()
    {
        JOptionPane.showMessageDialog(
                null,
                "\t~~ Info del Estudiante ~~\n" +
                        "- Carnet: " + studentID +
                        "\n- Nombre: " + studentName +
                        "\n- Apellido: " + studentLastName +
                        "\n- Edad: " + studentAge + "\n "
        );
        int nSubject = 1;
        for (int i=0; i<=4; i++)
        {
            System.out.print(
                    "N° Materia" + nSubject + ": " + subjects[i]
            );
            nSubject += 1;
        }
    }


    // Método para el ingreso de materias
    public void subjectRegistration()
    {
        int nSubject = 1;

        for (int i=0; i<=4; i++)
        {
            subjects[i] = JOptionPane.showInputDialog("Escribe el nombre de su materia #" + nSubject + ": ");
            nSubject += 1;
        }
    }


    public static void main(String[] args) {
        // Registro de un nuevo estudiante. Se llenan las credenciales necesarias
        Complementario_1 obj1 = new Complementario_1(
                "SA212548",
                "Daniel" ,
                "Salmi" ,
                "18"
        );
        obj1.studentRegistration();
        obj1.subjectRegistration();
        obj1.showInfo();
    }
}