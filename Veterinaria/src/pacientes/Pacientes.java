package pacientes;

public class Pacientes {
	private String nombre,especie,raza,sexo,color,fecha_nacimiento,nombres_dueño,direccion;
	private double peso;
	private int telefono_dueño;
	public Pacientes(String nombre, String especie, String raza, String sexo, String color, String fecha_nacimiento,
			String nombres_dueño, String direccion, double peso, int telefono_dueño) {
		super();
		this.nombre = nombre;
		this.especie = especie;
		this.raza = raza;
		this.sexo = sexo;
		this.color = color;
		this.fecha_nacimiento = fecha_nacimiento;
		this.nombres_dueño = nombres_dueño;
		this.direccion = direccion;
		this.peso = peso;
		this.telefono_dueño = telefono_dueño;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public String getNombres_dueño() {
		return nombres_dueño;
	}
	public void setNombres_dueño(String nombres_dueño) {
		this.nombres_dueño = nombres_dueño;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getTelefono_dueño() {
		return telefono_dueño;
	}
	public void setTelefono_dueño(int telefono_dueño) {
		this.telefono_dueño = telefono_dueño;
	}
	

}
