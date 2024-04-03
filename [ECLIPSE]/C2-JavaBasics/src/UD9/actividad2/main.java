package UD9.actividad2;

public class main {

	public static void main(String[] args) {

		serie[] series = new serie[5];
		videojuego[] videojuegos = new videojuego[5];

		rellenarseries(series);
		rellenarvideojuegos(videojuegos);

		launcherArray(series, videojuegos);

		System.out.println("series entregadas: " + contarseriesEntregadas(series));
		System.out.println("videojuegos entregados: " + contarvideojuegosEntregadas(videojuegos));
		
		System.out.println("El videojuego con más horas estimadas es: " + masHoras(videojuegos));
		System.out.println("La serie con más temporadas es: " + masTemporadas(series));
	}

	public static void rellenarseries(serie[] s) {
		s[0] = new serie();
		s[1] = new serie("t1", "c1");
		s[2] = new serie("t2", 11, "g2", "c2");
		s[3] = new serie("t3", 7, "g3", "c3");
		s[4] = new serie("t4", 18, "g4", "c4");
	}

	public static void rellenarvideojuegos(videojuego[] v) {
		v[0] = new videojuego();
		v[1] = new videojuego("v1", 15);
		v[2] = new videojuego("v2", 5, "g7", "co2");
		v[3] = new videojuego("v3", 19, "g8", "co3");
		v[4] = new videojuego("v4", 10, "g9", "co4");
	}

	public static void launcherArray(serie[] s, videojuego[] v) {
		s[0].entregar();
		s[3].entregar();
		v[1].entregar();
		v[2].entregar();
		v[4].entregar();
	}

	public static int contarseriesEntregadas(serie[] s) {
		int count = 0;

		for (int i = 0; i < s.length; i++) {
			if (s[i].isEntregado()) {
				count++;
			}
		}

		return count;
	}
	
	public static int contarvideojuegosEntregadas(videojuego[] v) {
		int count = 0;

		for (int i = 0; i < v.length; i++) {
			if (v[i].isEntregado()) {
				count++;
			}
		}
		return count;
	}

	public static String masTemporadas(serie[] s) {
		serie serieMasTemporadas = new serie();
		
		for (int i = 0; i < s.length; i++) {
			serieMasTemporadas = (serie) serieMasTemporadas.compareTo(s[i]);
		}
		
		return serieMasTemporadas.toString();
	}
	
	public static String masHoras(videojuego[] v) {
		videojuego videojuegoMasHoras = new videojuego();
		
		for (int i = 0; i < v.length; i++) {
			videojuegoMasHoras = (videojuego) videojuegoMasHoras.compareTo(v[i]);
		}
		
		return videojuegoMasHoras.toString();
	}
}