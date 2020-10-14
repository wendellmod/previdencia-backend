package br.com.sinqia.previdenciabackend.service.impl;

import br.com.sinqia.previdenciabackend.dto.CreateEnderecoDTO;
import br.com.sinqia.previdenciabackend.dto.EnderecoDTO;
import br.com.sinqia.previdenciabackend.entity.Endereco;
import br.com.sinqia.previdenciabackend.entity.Participante;
import br.com.sinqia.previdenciabackend.repository.EnderecoRepository;
import br.com.sinqia.previdenciabackend.service.EnderecoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoServiceImpl implements EnderecoService {

    @Autowired
    private EnderecoRepository repository;

    @Override
    public EnderecoDTO createEndereco(CreateEnderecoDTO dto, String cpf) {

        Endereco endereco = dto.buildEndereco();
        Participante participante = new Participante();
        participante.setCpf(cpf);
        endereco.setParticipante(participante);
        Endereco savedEndereco = repository.save(endereco);

        return new EnderecoDTO(savedEndereco);
    }

    @Override
    public EnderecoDTO updateEnderecoParticipante(CreateEnderecoDTO dto, String cpf) {

        Participante participante = new Participante();
        participante.setCpf(cpf);
        Endereco endereco = dto.buildEndereco();
        endereco.setParticipante(participante);
        BeanUtils.copyProperties(dto, endereco);
        Endereco upEndereco = repository.save(endereco);

        return new EnderecoDTO(upEndereco);
    }

}
