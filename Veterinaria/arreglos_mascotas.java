package arreglos;

import java.util.ArrayList;

import hijos.Perros;
import padre.Mascota;

public class Arreglo_mascotas {

	private ArrayList<Mascota>masco;
	public Arreglo_mascotas() {
		masco=new ArrayList<Mascota>();
		
	}
	public void Adicionar(Mascota x) {
		masco.add(x);
	}
	public int Tamaño() {
		return masco.size();
	}

	
}
