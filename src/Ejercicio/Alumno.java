package Ejercicio;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String apellidos;
    private String dni;
    private ArrayList<Registro> registros;

    // Constructor
    public Alumno(String nombre, String apellidos, String dni, ArrayList<Registro> registros) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.registros = registros;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public ArrayList<Registro> getRegistros() {
		return registros;
	}

	public void setRegistros(ArrayList<Registro> registros) {
		this.registros = registros;
	}
}



