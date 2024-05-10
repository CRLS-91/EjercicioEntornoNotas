package Ejercicio;

public class Registro {
    private String nombreAsignatura;
    private double nota;

    // Constructor
    public Registro(String nombreAsignatura, double nota) {
        this.nombreAsignatura = nombreAsignatura;
        this.nota = nota;
    }

    // Getters y Setters
    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
	

