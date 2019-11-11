package packageUNquitochi;

public class ConGorra extends Estado {

	public void accionar(UNquitochi uNquitochi) {
		if (uNquitochi.peso() - 1 < 0) {
			uNquitochi.setEstado(new Muerto());
		}else {
			uNquitochi.setPeso(uNquitochi.peso() -1 );
		}
	}
}
