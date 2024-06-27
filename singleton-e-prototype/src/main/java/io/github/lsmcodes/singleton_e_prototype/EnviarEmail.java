package io.github.lsmcodes.singleton_e_prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Classe que simula o envio de emails
 */
@Component
public class EnviarEmail {

        @Autowired
        Usuario remetente;

        @Autowired
        Usuario destinatario;

        public String enviarEmail(String nomeDoRemetente, String emailDoRemetente, String nomeDoDestinatario,
                        String emailDoDestinatario, String conteudoDoEmail) {
                this.remetente.setNome(nomeDoRemetente);
                this.remetente.setEnderecoDeEmail(nomeDoDestinatario);

                this.destinatario.setNome(nomeDoDestinatario);
                this.destinatario.setEnderecoDeEmail(nomeDoDestinatario);
                this.destinatario.getEmailsRecebidos().add(conteudoDoEmail);

                String emailEnviado = this.destinatario.getEmailsRecebidos().getLast();
                return emailEnviado;
        }

}