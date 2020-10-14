package br.com.sinqia.previdenciabackend.service.impl;

import br.com.sinqia.previdenciabackend.dto.CreateParticipanteDTO;
import br.com.sinqia.previdenciabackend.dto.ParticipanteDTO;
import br.com.sinqia.previdenciabackend.repository.ParticipanteRepository;
import br.com.sinqia.previdenciabackend.service.ParticipanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParticipanteServiceImpl implements ParticipanteService {

    @Autowired
    private ParticipanteRepository repository;

    @Override
    public ParticipanteDTO createParticipante(CreateParticipanteDTO dto) {
        return null;
    }

    @Override
    public ParticipanteDTO readParticipante(String cpf) {
        return null;
    }

    @Override
    public ParticipanteDTO updateParticipante(CreateParticipanteDTO dto, String cpf) {
        return null;
    }

}
