package cdc2.controller;

import cdc2.entities.Coche;
import cdc2.model.JPACocheDao;
/* Nombre: Ignacio Merchán Cámara
 * UVUS: ignmercam */
public class Main {

	public static void main(String[] args) {
		
		Coche c1 = new Coche(1, "Renault", "Clio", 3500, 2014);
		Coche c2 = new Coche(2, "Ford", "Fiesta", 1700, 2010);
		Coche c3 = new Coche(3, "Kia", "Ceed", 6900, 2018);
		
		JPACocheDao ventas = new JPACocheDao();
		
		ventas.save(c1);
		ventas.save(c2);
		ventas.save(c3);
		
		System.out.println(ventas.findAll());
		
		ventas.update(c3, 1);
				
	}

}
