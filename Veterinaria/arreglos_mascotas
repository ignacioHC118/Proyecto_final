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
	public Mascota Obtener(int x) {
		return masco.get(x);
	}
	
	public Mascota Buscar(String nombre) {
		for (int i = 0; i < Tamaño(); i++) {
			if(Obtener(i).getNom_pac()==nombre)return Obtener(i);
		}
		return null;
	}
	public void Eliminar(Mascota x) {
		masco.remove(x);
	}
}
