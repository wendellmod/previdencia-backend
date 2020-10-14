package br.com.sinqia.previdenciabackend.service;

import br.com.sinqia.previdenciabackend.dto.CreateParticipanteDTO;
import br.com.sinqia.previdenciabackend.dto.ParticipanteDTO;

public interface ParticipanteService {

    ParticipanteDTO createParticipante(CreateParticipanteDTO dto);
    ParticipanteDTO readParticipante(String cpf);
    ParticipanteDTO updateParticipante(CreateParticipanteDTO dto, String cpf);

}
