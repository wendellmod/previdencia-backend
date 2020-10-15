package br.com.sinqia.previdenciabackend.service.impl;

import br.com.sinqia.previdenciabackend.dto.CreateEnderecoDTO;
import br.com.sinqia.previdenciabackend.dto.EnderecoDTO;
import br.com.sinqia.previdenciabackend.entity.Endereco;
import br.com.sinqia.previdenciabackend.entity.Participante;
import br.com.sinqia.previdenciabackend.repository.EnderecoRepository;
import br.com.sinqia.previdenciabackend.repository.ParticipanteRepository;
import br.com.sinqia.previdenciabackend.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class EnderecoServiceImpl implements EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private ParticipanteRepository participanteRepository;

    @Override
    public EnderecoDTO createEndereco(String cpf, CreateEnderecoDTO dto) {

        Participante participante = findParticipanteById(cpf);
        Endereco endereco = dto.buildEndereco();
        Endereco savedEndereco = enderecoRepository.save(endereco);
        participante.setEndereco(savedEndereco);
        this.participanteRepository.save(participante);

        return new EnderecoDTO(savedEndereco);
    }

    private Participante findParticipanteById(String id){
        return participanteRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

}
