package io.github.lsmcodes.orm_e_jpa;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import io.github.lsmcodes.orm_e_jpa.model.Aluno;
import io.github.lsmcodes.orm_e_jpa.repository.AlunoRepository;

@Component
public class Start implements CommandLineRunner {

        @Autowired
        private AlunoRepository repository;

        @Override
        public void run(String... args) throws Exception {
                Scanner scanner = new Scanner(System.in);
                boolean aguardarInput = true;
                String opcao;

                Aluno aluno = null;

                while (aguardarInput) {
                        System.out.println("\nMenu:\n"
                                        + "1 - Adicionar aluno\n"
                                        + "2 - Remover aluno\n"
                                        + "3 - Editar aluno\n"
                                        + "4 - Listar alunos\n"
                                        + "Para sair, apenas digite qualquer outro numero");

                        opcao = scanner.nextLine();

                        switch (opcao) {
                                case "1":
                                        System.out.println("Nome:");
                                        String nome = scanner.nextLine();

                                        System.out.println("Nota:");
                                        double nota = Double.parseDouble(scanner.nextLine());

                                        aluno = new Aluno();
                                        aluno.setNome(nome);
                                        aluno.setNota(nota);

                                        this.repository.save(aluno);
                                        break;
                                case "2":
                                        System.out.println("Id do aluno a ser removido:");
                                        int idParaRemover = Integer.parseInt(scanner.nextLine());

                                        this.repository.delete(verificarSeAlunoExiste(idParaRemover));
                                        break;
                                case "3":
                                        System.out.println("Id do aluno a ser editado:");
                                        int idParaEditar = Integer.parseInt(scanner.nextLine());
                                        
                                        Aluno alunoParaEditar = verificarSeAlunoExiste(idParaEditar);

                                        System.out.println("Novo nome:");
                                        String novoNome = scanner.nextLine();

                                        System.out.println("Nova nota:");
                                        double novaNota = Double.parseDouble(scanner.nextLine());

                                        alunoParaEditar.setNome(novoNome);
                                        alunoParaEditar.setNota(novaNota);
                                        this.repository.save(alunoParaEditar);
                                        break;
                                case "4":
                                        System.out.println("Alunos:");
                                        for (Aluno alunoAtual : this.repository.findAll()) {
                                                System.out.println(alunoAtual.toString());
                                        }
                                        break;
                                default:
                                        aguardarInput = false;
                                        break;
                        }
                }

                scanner.close();
        }

        private Aluno verificarSeAlunoExiste(int id) {
                Optional<Aluno> aluno = this.repository.findById(id);

                if(aluno.isPresent()) {
                        return aluno.get();
                } else {
                        throw new IllegalArgumentException("O id inserido e invalido.");
                }
        }
        
}