package packageUNquitochi;

public class Boquiaberto extends Estado{


	public void accionar(UNquitochi uNquitochi) {
		if (uNquitochi.peso() + 1 > 5) {
			uNquitochi.setEstado(new Muerto());
		}else {
			uNquitochi.setPeso(uNquitochi.peso() + 1 );
		}
	}
}
