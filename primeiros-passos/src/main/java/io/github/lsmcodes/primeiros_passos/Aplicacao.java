package io.github.lsmcodes.primeiros_passos;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Aplicacao implements CommandLineRunner {

        @Autowired
        Calculadora calculadora;

        @Override
        public void run(String... args) throws Exception {
                Scanner scanner = new Scanner(System.in);
                boolean aguardarInput = true;
                String opcao;

                while (aguardarInput) {
                        System.out.println("\nMenu:\n"
                                        + "1 - Somar\n"
                                        + "2 - Subtrair\n"
                                        + "3 - Multiplicar\n"
                                        + "4 - Dividir\n"
                                        + "Para sair, apenas digite qualquer outro numero");

                        opcao = scanner.nextLine();

                        String regex = "1|2|3|4";
                        Pattern pattern = Pattern.compile(regex);

                        if (!pattern.matcher(opcao).matches()) {
                                aguardarInput = false;
                                break;
                        }

                        System.out.println("Se o valor for decimal, use ponto no lugar da virgula\n"
                                        + "Digite o primeiro valor:");
                        double primeiroValor = Double.parseDouble(scanner.nextLine());

                        System.out.println("Digite o segundo valor:");
                        double segundoValor = Double.parseDouble(scanner.nextLine());

                        double resultado = 0;

                        switch (opcao) {
                                case "1":
                                        resultado = this.calculadora.somar(primeiroValor, segundoValor);
                                        break;
                                case "2":
                                        resultado = this.calculadora.subtrair(primeiroValor, segundoValor);
                                        break;
                                case "3":
                                        resultado = this.calculadora.multiplicar(primeiroValor, segundoValor);
                                        break;
                                case "4":
                                        resultado = this.calculadora.dividir(primeiroValor, segundoValor);
                                        break;
                        }

                        DecimalFormat decimalFormat = new DecimalFormat("#.##");
                        System.out.println("O resultado é: " + decimalFormat.format(resultado));
                }

                scanner.close();
        }

}