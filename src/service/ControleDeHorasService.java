package service;

import model.RegistroDeHoras;
import model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class ControleDeHorasService {
	private List<RegistroDeHoras> registros = new ArrayList<>();

	public void registrarEntrada(Usuario usuario) {
		RegistroDeHoras registro = new RegistroDeHoras(usuario);
		registro.registrarEntrada();
		registros.add(registro);
		System.out.println("Entrada registrada para o usuário: " + usuario.getNome());
	}

	public void registrarSaida(Usuario usuario) {
		for (RegistroDeHoras registro : registros) {
			if (registro.getUsuario().equals(usuario) && registro.getSaida() == null) {
				registro.registrarSaida();
				System.out.println("Saída registrada para o usuário: " + usuario.getNome());
				return;
			}
		}
		System.out.println("Nenhuma entrada encontrada para o usuário: " + usuario.getNome());
	}

	public void gerarRelatorio() {
		for (RegistroDeHoras registro : registros) {
			System.out.println("Usuário: " + registro.getUsuario().getNome() + " | Entrada: " + registro.getEntrada()
					+ " | Saída: " + registro.getSaida() + " | Horas Trabalhadas: "
					+ registro.calcularHorasTrabalhadas());
		}
	}
}
