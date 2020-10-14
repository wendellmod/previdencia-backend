package br.com.sinqia.previdenciabackend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.time.LocalDate;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Table(name = "tb_prev_participante")
public class Participante {

    @Id
    @Column(name = "cpf", length = 11)
    private String cpf;

    @Column(name = "nome_completo", length = 150, nullable = false)
    private String nomeCompleto;

    @Column(name = "data_nascimento", nullable = false)
    private LocalDate dataNascimento;

    @Email
    @Column(name = "email", length = 150, nullable = false)
    private String email;

    @Column(name = "telefone", length = 13, nullable = false)
    private String telefone;

    @Column(name = "senha", length = 20, nullable = false)
    private String senha;

    // Relacionamentos
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id", referencedColumnName = "cep")
    private Endereco endereco;

}
