package br.com.sinqia.previdenciabackend.service;

import br.com.sinqia.previdenciabackend.dto.CreateEnderecoDTO;
import br.com.sinqia.previdenciabackend.dto.EnderecoDTO;

public interface EnderecoService {

    EnderecoDTO createEndereco(CreateEnderecoDTO dto, String cpf);

    EnderecoDTO updateEnderecoParticipante(CreateEnderecoDTO dto, String cpf);
}
