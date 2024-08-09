package model;

import java.time.LocalDateTime;

public class RegistroDeHoras {
	private Usuario usuario;
	private LocalDateTime entrada;
	private LocalDateTime saida;

	public RegistroDeHoras(Usuario usuario) {
		this.usuario = usuario;
	}

	public void registrarEntrada() {
		this.entrada = LocalDateTime.now();
	}

	public void registrarSaida() {
		this.saida = LocalDateTime.now();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public LocalDateTime getEntrada() {
		return entrada;
	}

	public LocalDateTime getSaida() {
		return saida;
	}

	public long calcularHorasTrabalhadas() {
		if (entrada != null && saida != null) {
			return java.time.Duration.between(entrada, saida).toHours();
		}
		return 0;
	}
}
