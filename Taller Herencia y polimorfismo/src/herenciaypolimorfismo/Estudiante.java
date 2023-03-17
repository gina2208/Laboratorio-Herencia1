package herenciaypolimorfismo;

import javax.swing.JOptionPane;

public class Estudiante extends Persona {

    protected String carnet;
    protected double promedioNotas;
    protected int numeroMaterias;

    public Estudiante() {

    }

    public Estudiante(String carnet, double promedioNotas, int numeroMaterias, String nombre, String apellido, int edad, double peso) {
        super(nombre, apellido, edad, peso);
        this.carnet = carnet;
        this.promedioNotas = promedioNotas;
        this.numeroMaterias = numeroMaterias;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    public int getNumeroMaterias() {
        return numeroMaterias;
    }

    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }

    public double calcularPromedio() {
        promedioNotas = leerNotasEstudiante() / numeroMaterias;
        return promedioNotas;
    }

    public double leerNotasEstudiante() {
          
        int i=0;
        double suma = 0.0;
        for (int j = 0; j < (numeroMaterias/2); j++) {
  
             suma = suma + (Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la nota del estudiante")));
                 
        }   
        
        return suma;
        
    }

    public Estudiante ingresarDatosEstudiante() {
        Estudiante nuevoEstudiante = new Estudiante();
        String nombre = "";
        String apellido = "";
        int edad = 0;
        double peso = 0.0;
        String carnet = "";
        int numeroMaterias = 0;
        nombre = leerDatoTipoCadena("Ingrese el nombre del estudiantes: ");
        apellido = leerDatoTipoCadena("Ingrese el apellido del estudiante: ");
        edad = leerDatoTipoEntero("Ingrese la edad del estudiante: ");
        peso = leerDatoTipoReal("Ingrese el peso del estudiante: ");
        carnet = leerDatoTipoCadena("Ingrese el carnet del estudiante: ");
        numeroMaterias = leerDatoTipoEntero("Ingrese el número de materias vistas por el estudiante: ");
        nuevoEstudiante.setNombre(nombre);
        nuevoEstudiante.setApellido(apellido);
        nuevoEstudiante.setEdad(edad);
        nuevoEstudiante.setPeso(peso);
        nuevoEstudiante.setCarnet(carnet);
        nuevoEstudiante.setNumeroMaterias(numeroMaterias);
        leerNotasEstudiante();
        calcularPromedio();
        return (nuevoEstudiante);
    }

    public void imprimirReporteNotasEstudiantes() {
        imprimirDatosPersona();

        JOptionPane.showMessageDialog(null, "El carnet del estudiante es " + carnet);
        JOptionPane.showMessageDialog(null, "El numero de materias del estudiantes es " + numeroMaterias);
        JOptionPane.showMessageDialog(null, "El promedio de notas es: " + promedioNotas);
    }

}
