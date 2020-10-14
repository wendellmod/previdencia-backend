package br.com.sinqia.previdenciabackend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Table(name = "tb_prev_endereco")
@SecondaryTable(name = "tb_prev_end_participante", pkJoinColumns = @PrimaryKeyJoinColumn(name = "endereco_id"))
public class Endereco {

    @Id
    @Column(name = "cep", length = 8)
    private String cep;

    @Column(name = "logradouro", length = 150, nullable = false)
    private String logradouro;

    @Column(name = "bairro", length = 50, nullable = false)
    private String bairro;

    @Column(name = "localidade", length = 20, nullable = false)
    private String localidade;

    @Column(name = "uf", length = 2, nullable = false)
    private String uf;

    @Column(name = "numero", length = 5, table = "tb_prev_end_participante")
    private String numero;

    @Column(name = "complemento", length = 200, table = "tb_prev_end_participante")
    private String complemento;

    // Relacionamentos
    @OneToOne(mappedBy = "endereco")
    private Participante participante;

}
