package io.github.lsmcodes.orm_e_jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "alunos")
public class Aluno {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "user_id")
        private int id;

        @Column(length = 50, nullable = false)
        private String nome;

        @Column(length = 6, nullable = false)
        private double nota;


        public int getId() {
                return id;
        }

        public String getNome() {
                return nome;
        }

        public double getNota() {
                return nota;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public void setNota(double nota) {
                this.nota = nota;
        }

        @Override
        public String toString() {
                return getId() + " - Nome: " + getNome() + ", Nota: " + getNota();
        }

}