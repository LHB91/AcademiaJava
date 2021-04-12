package controlador;

import java.util.ArrayList;
import java.util.List;

import model.Sorvete;

public class SorveteControlador {

	List<Sorvete> listaSorvete = new ArrayList<Sorvete>();

	public boolean salvarSorvete(Sorvete sorvete) {
		try {
			listaSorvete.add(sorvete);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean deletarSorvete(int codigo) {	
		try {
			listaSorvete.remove(codigo);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public List<Sorvete> listarSorvertes() {
		return listaSorvete;
	}

}
