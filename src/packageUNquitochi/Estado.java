package packageUNquitochi;

public class Estado {

	public void alimentarse(UNquitochi uNquitochi) {
		uNquitochi.setEstado(new Boquiaberto());
	}

	public void jugar(UNquitochi uNquitochi) {
		uNquitochi.setEstado(new ConGorra());
	}

	public void accionar(UNquitochi uNquitochi) {
		
	}

	public void dormir(UNquitochi uNquitochi) {
		uNquitochi.setEstado(new Dormido());
		uNquitochi.getAlarma().despertarEn(uNquitochi.getMinADormir(),uNquitochi);
	}

	public void despertarse(UNquitochi uNquitochi) {
		// TODO Auto-generated method stub
		
	}

}
