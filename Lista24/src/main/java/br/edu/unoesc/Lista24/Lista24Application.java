package br.edu.unoesc.Lista24;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.edu.unoesc.Lista24.Repository.AlunoRepository;
import br.edu.unoesc.Lista24.model.Aluno;

@SpringBootApplication
public class Lista24Application {

	public void imprimir(String a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		SpringApplication.run(Lista24Application.class, args);

	}

	@Bean
	CommandLineRunner commandLineRunner(AlunoRepository repositorio) {
		return args -> {

			Aluno a = new Aluno(1L, "Gabriel Ferrandin", new BigDecimal(1500.00), LocalDate.of(2000, 1, 1));
			repositorio.save(a);
			Aluno b = new Aluno(2L, "Elias Lucas", new BigDecimal(2000.00), LocalDate.of(1997, 8, 22));
			repositorio.save(b);
			Aluno c = new Aluno(2L, "Edson Penteado", new BigDecimal(2550.00), LocalDate.of(1970, 9, 29));
			repositorio.save(c);
			Aluno d = new Aluno(2L, "Cleci Piacentini", new BigDecimal(5000.00), LocalDate.of(1968, 2, 28));
			repositorio.save(d);

		};

	}

}
