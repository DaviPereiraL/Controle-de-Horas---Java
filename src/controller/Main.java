package controller;

import model.Usuario;
import service.ControleDeHorasService;

public class Main {
	public static void main(String[] args) {
		ControleDeHorasService controleDeHoras = new ControleDeHorasService();

		Usuario usuario1 = new Usuario("João", "Desenvolvedor", 1);
		Usuario usuario2 = new Usuario("Maria", "Designer", 2);

		// Registrar entrada
		controleDeHoras.registrarEntrada(usuario1);
		controleDeHoras.registrarEntrada(usuario2);

		// Simular tempo de trabalho (apenas para teste, isso seria real em um sistema
		// funcional)
		try {
			Thread.sleep(2000); // 2 segundos de espera
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Registrar saída
		controleDeHoras.registrarSaida(usuario1);
		controleDeHoras.registrarSaida(usuario2);

		// Gerar relatório
		controleDeHoras.gerarRelatorio();
	}
}
