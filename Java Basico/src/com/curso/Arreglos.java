package com.curso;

public class Arreglos {
	
	public static void main(String[] args) {

		String[] meses = new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
				"Septiembre", "Octubre", "Noviembre", "Diciembre", "Diciembre2" };

		for (int i = 0; i < meses.length; i++) {
			System.out.println(meses[i]);
		}

//		float[][] temperaturas = new float[3][13];

		int[][] temperaturas2 = new int[][] { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12 },
				{ 21, 22, 23, 24, 25, 26, 27, 28, 29, 210, 211, 212 },
				{ 31, 32, 33, 34, 35, 36, 37, 38, 39, 310, 311, 312 } };

		for (int i = 0; i < temperaturas2.length; i++) {
			for (int j = 0; j < temperaturas2[i].length; j++) {
				System.out.println("La temperatura del año " + (i + 1) + " y del mes " + (j + 1) + " es de "
						+ temperaturas2[i][j]);

			}
			System.out.println("Fin de año");
		}

		String[] nombres = new String[] { "Cesar", "Pablo", "Ana" };
		for (String nombre : nombres) {
			System.out.println(nombre);
		}

		// FOR EACH en matriz
		for (int[] arreglo : temperaturas2) {
			for (int temperatura : arreglo) {
				System.out.println("La temperatura fue " + temperatura);
			}
			System.out.println("Fin de Año");
		}

	}

}
