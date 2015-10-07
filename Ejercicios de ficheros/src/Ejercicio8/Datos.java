package Ejercicio8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Datos {

	String nombre, apellidos, direccion, poblacion, telefono, fNacimiento;
	
	public Datos() {
		
	}
	
	public Datos(String nombre, String apellidos, String direccion,
			String poblacion, String telefono, String fNacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.poblacion = poblacion;
		this.telefono = telefono;
		this.fNacimiento = fNacimiento;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getfNacimiento() {
		return fNacimiento;
	}

	public void setfNacimiento(String fNacimiento) {
		this.fNacimiento = fNacimiento;
	}
	
	public void agenda() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellidos);
		System.out.println("Direccion: " + direccion);
		System.out.println("Poblacion: " + poblacion);
		System.out.println("Telefono: " + telefono);
		System.out.println("Fecha de Nacimiento: " + fNacimiento);
	}

	public void escribircontacto(Datos nuevo) {
		try {
			File f = new File("agendatelefonica.txt");
			FileWriter fw;
			BufferedWriter bw;
			if (f.exists()) {
				fw = new FileWriter(f, true);
				bw = new BufferedWriter(fw);
				bw.newLine();
				bw.write(nuevo.nombre + "%" + nuevo.apellidos + "%"
						+ nuevo.direccion + "%" + nuevo.poblacion + "%"
						+ nuevo.telefono + "%" + nuevo.fNacimiento);

			} else {

				fw = new FileWriter(f);
				bw = new BufferedWriter(fw);
				bw.write(nuevo.nombre + "%" + nuevo.apellidos + "%"
						+ nuevo.direccion + "%" + nuevo.poblacion + "%"
						+ nuevo.telefono + "%" + nuevo.fNacimiento);
			}
			bw.close();
			fw.close();

		} catch (Exception e) {
			e.getMessage();
		}

	}

	public void mostraragenda() {
		try {
			File f = new File("agenda.txt");
			if (f.exists()) {
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				String lectura;
				while ((lectura = br.readLine()) != null) {
					String[] listaContactos = lectura.split("%");
					Datos contactos = new Datos(listaContactos[0], listaContactos[1],
							listaContactos[2], listaContactos[3], listaContactos[4], listaContactos[5]);
					contactos.agenda();
				}
			br.close();
			} else {
				System.out.println("error");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
