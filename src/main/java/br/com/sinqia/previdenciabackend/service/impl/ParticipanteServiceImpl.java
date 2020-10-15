package br.com.sinqia.previdenciabackend.service.impl;

import br.com.sinqia.previdenciabackend.dto.CreateParticipanteDTO;
import br.com.sinqia.previdenciabackend.dto.EnderecoDTO;
import br.com.sinqia.previdenciabackend.dto.ParticipanteDTO;
import br.com.sinqia.previdenciabackend.entity.Endereco;
import br.com.sinqia.previdenciabackend.entity.Participante;
import br.com.sinqia.previdenciabackend.repository.ParticipanteRepository;
import br.com.sinqia.previdenciabackend.service.ParticipanteService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ParticipanteServiceImpl implements ParticipanteService {

    @Autowired
    private ParticipanteRepository repository;

    @Override
    public ParticipanteDTO createParticipante(CreateParticipanteDTO dto) {

        Participante participante = dto.buildParticipante();
        Participante savedParticipante = repository.save(participante);

        return new ParticipanteDTO(savedParticipante);
    }

    @Override
    public ParticipanteDTO readParticipante(String cpf) {

        Participante participante = findParticipanteById(cpf);

        return new ParticipanteDTO(participante);
    }

    @Override
    public ParticipanteDTO updateParticipante(CreateParticipanteDTO dto, String cpf) {

        Participante participante = findParticipanteById(cpf);
        BeanUtils.copyProperties(dto, participante);
        Participante upParticipante = repository.save(participante);

        return new ParticipanteDTO(upParticipante);
    }

    private Participante findParticipanteById(String id){
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

}
