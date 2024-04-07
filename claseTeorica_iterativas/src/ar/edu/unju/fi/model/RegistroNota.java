package ar.edu.unju.fi.model;

public class RegistroNota {
	private String codigo;
	private Alumno alumno;
	private Materias materias;
	private Float notaFinal;
	public RegistroNota() {
		// TODO Auto-generated constructor stub
	}
	public RegistroNota(String codigo, Alumno alumno, Materias materias, Float notaFinal) {
		this.codigo = codigo;
		this.alumno = alumno;
		this.materias = materias;
		this.notaFinal = notaFinal;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	public Materias getMaterias() {
		return materias;
	}
	public void setMaterias(Materias materias) {
		this.materias = materias;
	}
	public Float getNotaFinal() {
		return notaFinal;
	}
	public void setNotaFinal(Float notaFinal) {
		this.notaFinal = notaFinal;
	}
	@Override
	public String toString() {
		return " Registro de nota\n Codigo de nota: " + codigo + "\n Alumno: " + alumno + "\n Materia: " + materias + "\n Nota Final: " + notaFinal;
	}
	// java cuando colocamos un objeto y nada mas, automaticamente llama al metodo toString();
}
