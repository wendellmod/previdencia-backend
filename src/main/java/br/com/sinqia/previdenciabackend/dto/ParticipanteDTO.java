package br.com.sinqia.previdenciabackend.dto;

import br.com.sinqia.previdenciabackend.entity.Participante;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
@NoArgsConstructor
public class ParticipanteDTO {

    private String nomeCompleto;
    private String cpf;
    private LocalDate dataNascimento;
    private String email;
    private String telefone;
    private String senha;

    public ParticipanteDTO(Participante participante) {
        this.nomeCompleto = participante.getNomeCompleto();
        this.cpf = participante.getCpf();
        this.dataNascimento = participante.getDataNascimento();
        this.email = participante.getEmail();
        this.telefone = participante.getTelefone();
        this.senha = participante.getSenha();
    }

}
