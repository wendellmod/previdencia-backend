package br.com.sinqia.previdenciabackend.dto;

import br.com.sinqia.previdenciabackend.entity.Participante;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter @Setter
@NoArgsConstructor
public class CreateParticipanteDTO {

    @NotBlank
    @NotNull(message = "Informe seu nome completo")
    private String nomeCompleto;

    @NotBlank
    @NotNull(message = "Informe o seu CPF. Apenas números")
    private String cpf;

    @NotBlank
    @NotNull(message = "Informe sua data de nascimento")
    private LocalDate dataNascimento;

    @NotBlank
    @NotNull(message = "Informe seu e-mail")
    private String email;

    @NotBlank
    @NotNull(message = "Informe o seu telefone residêncial, ou celular")
    private String telefone;

    @NotBlank
    @NotNull(message = "Digite uma senha")
    private String senha;

    public Participante buildParticipante() {

        Participante participante = new Participante();
        participante.setNomeCompleto(nomeCompleto);
        participante.setCpf(cpf);
        participante.setDataNascimento(dataNascimento);
        participante.setEmail(email);
        participante.setTelefone(telefone);
        participante.setSenha(senha);

        return participante;
    }

}
