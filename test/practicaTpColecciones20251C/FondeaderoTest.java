package practicaTpColecciones20251C;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FondeaderoTest {

	// 1. Crear el Fondeadero recibiendo como parámetro la cantidad máxima de
	// amarras.

	@Test
	public void DadoQueExisteElClubPuedoCrearUnFondeadero() {
		Fondeadero nuevoFondeadero = new Fondeadero(70);
	}

	// 2. amararYate(Yate yate): amarra el yate. Mensaje si no existe el Yate

	@Test
	public void dadoQueExisteUnFondeaderoPuedoAmarrarUnYate() {
		Fondeadero nuevoFondeadero = new Fondeadero(70);

		Yate nuevoYate = new Yate();

		boolean yateAmarrado = nuevoFondeadero.amarrarYate(nuevoYate);

		assertTrue(yateAmarrado);
	}

	// 3. desamarrarYate(Yate yate): libera la amarra.

	@Test
	public void dadoQueExisteUnYateAmarradoPuedoLiberarLaAmarra() {
		Fondeadero nuevoFondeadero = new Fondeadero(70);

		Yate nuevoYate = new Yate();

		boolean yateAmarrado = nuevoFondeadero.amarrarYate(nuevoYate);

		boolean yateDesamarrado = nuevoFondeadero.desamarrarYate(nuevoYate);

		assertTrue(yateDesamarrado);

	}

	// 4. obtenerCantidadDeYatesAmarrados: devuelve el total de amarras ocupadas.

	@Test
	public void dadoQueExisteUnFondeaderoPuedoVerLaCantidadDeYatesAmarrados() {
		Fondeadero nuevoFondeadero = new Fondeadero(70);

		// creamos y agregamos 4 yates
		Yate nuevoYate = new Yate();
		Yate nuevoYate2 = new Yate();
		Yate nuevoYate3 = new Yate();
		Yate nuevoYate4 = new Yate();

		nuevoFondeadero.amarrarYate(nuevoYate);
		nuevoFondeadero.amarrarYate(nuevoYate2);
		nuevoFondeadero.amarrarYate(nuevoYate3);
		nuevoFondeadero.amarrarYate(nuevoYate4);

		int cantidadObtenida = nuevoFondeadero.getCantidadDeYates();

		assertEquals(4, nuevoFondeadero.getCantidadDeYates());

	}

	// 5. obtenerCantidadDeAmarrasDisponibles: devuelve el total de amarras libres.

	@Test
	public void dadoQueExisteUnFondeaderoPuedoSaberCuantasAmarrasDisponiblesHay() {
		Fondeadero nuevoFondeadero = new Fondeadero(70);

		// creamos y agregamos 4 yates
		
		Yate nuevoYate = new Yate();
		Yate nuevoYate2 = new Yate();
		Yate nuevoYate3 = new Yate();
		Yate nuevoYate4 = new Yate();

		nuevoFondeadero.amarrarYate(nuevoYate);
		nuevoFondeadero.amarrarYate(nuevoYate2);
		nuevoFondeadero.amarrarYate(nuevoYate3);
		nuevoFondeadero.amarrarYate(nuevoYate4);
		
		int cantidadObtenida = nuevoFondeadero.getCantidadDeAmarrasDisponibles();
		
		assertEquals(66, nuevoFondeadero.getCantidadDeAmarrasDisponibles());
	}

}