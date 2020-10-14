package br.com.sinqia.previdenciabackend.dto;

import br.com.sinqia.previdenciabackend.entity.Endereco;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter @Setter
@NoArgsConstructor
public class CreateEnderecoDTO {

    @NotBlank
    @NotNull(message = "Digite um CEP válido")
    private String cep;

    @NotBlank
    @NotNull(message = "Digite um logradouro válido")
    private String logradouro;

    @NotBlank
    @NotNull(message = "Informe o bairro")
    private String bairro;

    @NotBlank
    @NotNull(message = "Informe sua localidade. Ex: São Paulo")
    private String localidade;

    @NotBlank
    @NotNull(message = "Informe o UF. Ex: SP")
    private String uf;

    public Endereco buildEndereco() {

        Endereco endereco = new Endereco();
        endereco.setCep(cep);
        endereco.setLogradouro(logradouro);
        endereco.setBairro(bairro);
        endereco.setLocalidade(localidade);
        endereco.setUf(uf);

        return endereco;
    }

}
