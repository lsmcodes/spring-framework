package io.github.lsmcodes.beans_versus_components;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BeansVersusComponentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeansVersusComponentsApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ConversorJson conversorJson) {
		return args -> {
			Scanner scanner = new Scanner(System.in);
			boolean aguardarInput = true;
			String opcao;

			while (aguardarInput) {
				System.out.println("\nMenu:\n"
						+ "1 - Converter endereço para Json\n"
						+ "Para sair, apenas digite qualquer outro numero");

				opcao = scanner.nextLine();

				switch (opcao) {
					case "1":
						System.out.println("Cep:");
						String cep = scanner.nextLine();

						System.out.println("Cidade:");
						String cidade = scanner.nextLine();

						System.out.println("Estado:");
						String estado = scanner.nextLine();

						System.out.println("Logradouro:");
						String logradouro = scanner.nextLine();

						String json = conversorJson.converterEnderecoParaJson(cep, cidade,
								estado, logradouro);

						System.out.println("Json:\n" + json);
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