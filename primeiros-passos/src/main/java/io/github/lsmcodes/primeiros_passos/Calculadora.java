package io.github.lsmcodes.primeiros_passos;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {

        public double somar(double primeiroValor, double segundoValor) {
                double soma = primeiroValor + segundoValor;
                return soma;
        }

        public double subtrair(double primeiroValor, double segundoValor) {
                double diferenca = primeiroValor - segundoValor;
                return diferenca;
        }

        public double multiplicar(double primeiroValor, double segundoValor) {
                double produto = primeiroValor * segundoValor;
                return produto;
        }

        public double dividir(double primeiroValor, double segundoValor) {
                if((primeiroValor != 0) && (segundoValor != 0)) {
                        double quociente = primeiroValor / segundoValor;
                        return quociente;
                } else {
                        throw new ArithmeticException("Nenhum dos dois valores pode ser zero.");
                }
        }

}