package practicaTpColecciones20251C;

import java.util.ArrayList;
import java.util.List;

public class Fondeadero {

	private int cantidadMaxDeAmarras;

	protected List<Yate> yates = new ArrayList<>();

	public Fondeadero(int cantidadMaxDeAmarras) {
		this.cantidadMaxDeAmarras = cantidadMaxDeAmarras;
	}

	public boolean amarrarYate(Yate nuevoYate) {
		if (yates.add(nuevoYate)) {
			return true;
		}
		System.out.println("Yate inexistente");
		return false;
	}

	public boolean desamarrarYate(Yate nuevoYate) {
		if (yates.remove(nuevoYate)) {
			return true;
		}
		return false;
	}

	public int getCantidadDeYates() {
		return yates.size();
		
	}
	
	

}
