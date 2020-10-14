package br.com.sinqia.previdenciabackend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_prev_endereco")
public class Endereco {

    @Id
    @Column(name = "cep")
    private String cep;

    @Column(name = "logradouro", length = 150, nullable = false)
    private String logradouro;

    @Column(name = "bairro", length = 50, nullable = false)
    private String bairro;

    @Column(name = "localidade", length = 20, nullable = false)
    private String localidade;

    @Column(name = "uf", length = 2, nullable = false)
    private String uf;

}
