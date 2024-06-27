package io.github.lsmcodes.singleton_e_prototype;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SingletonEPrototypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingletonEPrototypeApplication.class, args);
	}

	@Bean
	CommandLineRunner run(EnviarEmail enviarEmail) {
		return args -> {
			Scanner scanner = new Scanner(System.in);
			boolean aguardarInput = true;
			String opcao;

			while (aguardarInput) {
				System.out.println("\nMenu:\n"
						+ "1 - Enviar email\n"
						+ "Para sair, apenas digite qualquer outro numero");

				opcao = scanner.nextLine();

				switch (opcao) {
					case "1":
						System.out.println("Nome do remetente:");
						String nomeDoRemetente = scanner.nextLine();

						System.out.println("Email do remetente:");
						String emailDoRemetente = scanner.nextLine();

						System.out.println("Nome do destinatario:");
						String nomeDoDestinatario = scanner.nextLine();

						System.out.println("Email do destinatario:");
						String emailDoDestinatario = scanner.nextLine();

						System.out.println("Conteudo do email:");
						String conteudoDoEmail = scanner.nextLine();

						String emailEnviado = enviarEmail.enviarEmail(nomeDoRemetente,
								emailDoRemetente,
								nomeDoDestinatario, emailDoDestinatario,
								conteudoDoEmail);
						System.out.println("Email enviado: " + emailEnviado);
						break;
					default:
						aguardarInput = false;
						break;
				}
			}

			scanner.close();
		};
	}

}