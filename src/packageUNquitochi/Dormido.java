package packageUNquitochi;

public class Dormido extends Estado {

	public void alimentarse(UNquitochi uNquitochi) {
		uNquitochi.ponerEnPantalla("ZZZ");
	}

	public void jugar(UNquitochi uNquitochi) {
		uNquitochi.ponerEnPantalla("ZZZ");
	}

	public void accionar(UNquitochi uNquitochi) {
		uNquitochi.ponerEnPantalla("ZZZ");
	}

	public void dormir(UNquitochi uNquitochi) {
		uNquitochi.ponerEnPantalla("ZZZ");
	}

	public void despertarse(UNquitochi uNquitochi) {
		uNquitochi.setEstado(new Boquiaberto());		
	}
}
