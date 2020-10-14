package br.com.sinqia.previdenciabackend.controller;

import br.com.sinqia.previdenciabackend.dto.CreateParticipanteDTO;
import br.com.sinqia.previdenciabackend.dto.EnderecoDTO;
import br.com.sinqia.previdenciabackend.dto.ParticipanteDTO;
import br.com.sinqia.previdenciabackend.service.ParticipanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("participantes")
public class ParticipanteController {

    @Autowired
    private ParticipanteService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ParticipanteDTO createParticipante(@RequestBody @Valid CreateParticipanteDTO dto) {
        return service.createParticipante(dto);
    }

    @GetMapping("{cpf}")
    public ParticipanteDTO readParticipante(@PathVariable String cpf) {
        return service.readParticipante(cpf);
    }

    @PutMapping("{cpf}")
    public ParticipanteDTO updateParticipante(@RequestBody CreateParticipanteDTO dto, @PathVariable String cpf) {
        return service.updateParticipante(dto, cpf);
    }

    @GetMapping("{cpf}/enderecos")
    public EnderecoDTO readEndereco(@PathVariable String cpf) {
        return service.readEndereco(cpf);
    }

}
