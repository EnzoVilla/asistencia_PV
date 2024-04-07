package ar.edu.unju.fi.main;

import java.util.Scanner;
import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materias;
import ar.edu.unju.fi.model.RegistroNota;

public class Main {

	public static void main(String[] args) {
		//nos pide que para el alumno Ariel Vega se registren sus notas finales de 4 materias
		Alumno alumno = generarAlumno();
		registrarNotas(alumno, 2);
		
		
	}
	public static Alumno generarAlumno() {
		Alumno alumno = new Alumno();
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Ingrese legajo: ");
		Integer legajo = scanner.nextInt(); // permite que ingresemos por consola
		System.out.println("Ingrese nombre: ");
		String nombre = scanner.next();
		System.out.println("Ingrese apellido: ");
		String apellido = scanner.next();
		alumno.setLegajo(legajo);
		alumno.setApellido(apellido);
		alumno.setNombre(nombre);
		//scanner.close();
		//por algun motivo el primer scanner.close era el que generaba error 
		//despues de una investigacion encontre que: close() invalida el objeto Scanner, lo que significa que no se puede utilizar después de llamar a close()
		return alumno;
	}
	public static void registrarNotas(Alumno alumno, int numMaterias) {
		Scanner scanner = new Scanner(System.in); 
		// el error que se habia presentado en la clase era que:
		// el while (numMaterias <= 2) iba a iterar una sola vez porque ya valia 2, por lo que reemplaze con un for ya que conozco cuantas
		// materias quiero registrar
		for(int i = 1; i<=numMaterias;i++) {
			System.out.println("Ingrese el codigo de materia:");
			String codigoMateria = scanner.next();
			System.out.println("Ingrese el nombre de materia:");
			String nombreMateria = scanner.next();
			Materias materia = new Materias(codigoMateria, nombreMateria);
			System.out.println("Ingrese el codigo de la nota:");
			String codigoNota = scanner.next();
			System.out.println("Ingrese la nota final:");
			Float nota = scanner.nextFloat();
			RegistroNota registroNota = new RegistroNota(codigoNota, alumno, materia, nota);
			System.out.println(registroNota.toString());
		}
		scanner.close();
	}
}
