
package packageUNquitochi;

public class UNquitochi {

	public AlarmClock alarm;
	public Screen screen;
	public Integer minADormi;
	public Estado estado;
	public Integer peso;
	
	public UNquitochi(Screen screen,AlarmClock alarm, Integer minADormir) {
		this.alarm = alarm;
		this.screen = screen;
		this.minADormi = minADormir;
		
		this.setPeso(2);
		this.setEstado(new Boquiaberto());
		
	}
	
	public AlarmClock getAlarma() {
		return this.alarm;
	}
	
	public void setEstado(Estado unEstado) {
		// TODO Auto-generated method stub
		this.estado = unEstado;
	}

	public void setPeso(int unPeso) {
		// TODO Auto-generated method stub
		this.peso = unPeso;
	}

	public void ponerEnPantalla(String txt) {
		this.screen.text(txt);
	}
	
	public void alimentarse() {
		this.getEstado().alimentarse(this);
	}
	
	private Estado getEstado() {
		// TODO Auto-generated method stub
		return this.estado;
	}

	public void jugar() {
		this.getEstado().jugar(this);
	}
	
	public void accionar() {
		this.getEstado().accionar(this);
	}
	
	public void dormir() {
		this.getEstado().dormir(this);
	}
	
	public void despertarse() {
		this.getEstado().despertarse(this);
	}

	public Integer getMinADormir() {
		// TODO Auto-generated method stub
		return this.minADormi;
	}

	public Integer peso() {
		// TODO Auto-generated method stub
		return this.peso;
	}

	
	
}
