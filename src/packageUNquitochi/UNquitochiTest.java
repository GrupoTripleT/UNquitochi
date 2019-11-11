package packageUNquitochi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.Verifier;

import static org.mockito.Mockito.*;

class UNquitochiTest {
	
	public UNquitochi pepe;
	public AlarmClock alarm;
	public Screen screen;

	@BeforeEach
	void setUp() throws Exception {
		alarm = mock (AlarmClock.class);
		
		screen = mock (Screen.class);
		
		pepe = new UNquitochi(screen, alarm, 20);
	}

	@Test
	void testUNquitochiAccionarCuandoEstaDormido() {
		pepe.dormir();
		pepe.accionar();
		verify(screen, times(1)).text("ZZZ");
	}

}
