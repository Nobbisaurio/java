package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p; // 1.* declarar una valiable p de tipo Persona
		Persona p2; // 1.* declarar una valiable p de tipo Persona
		p = new Persona(); // 2. instanciar un objeto Persona y referenciar a la variable p
		p2 = new Persona(); // 2. instanciar un objeto Persona y referenciar a la variable p

		// Modificar los atributos
		p.nombre = "David";
		p.edad = 21;
		p.estatura = 1.65;
		
		// accedo a los atributos
		System.out.println("---------------");
		System.out.println("nombre:" + p.nombre);
		System.out.println("edad:" + p.edad);
		System.out.println("estatura:" + p.estatura);

		// --------Modificar propiedades de p2--------
		p2.nombre = "Juan";
		p2.edad = 35;
		p2.estatura = 1.78;

		// acceder atributos de p2
		System.out.println("---------------");
		System.out.println("nombre:" + p2.nombre);
		System.out.println("edad:" + p2.edad);
		System.out.println("estatura:" + p2.estatura);

	}

}
