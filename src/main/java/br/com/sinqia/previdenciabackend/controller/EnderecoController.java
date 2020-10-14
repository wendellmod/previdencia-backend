package br.com.sinqia.previdenciabackend.controller;

import br.com.sinqia.previdenciabackend.dto.CreateEnderecoDTO;
import br.com.sinqia.previdenciabackend.dto.EnderecoDTO;
import br.com.sinqia.previdenciabackend.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EnderecoDTO createEndereco(@RequestBody @Valid CreateEnderecoDTO dto,
                                      @RequestParam String cpf) {
        return service.createEndereco(dto, cpf);
    }

    @PutMapping("participantes/{cpf}/enderecos")
    public EnderecoDTO updateEnderecoParticipante(@RequestBody CreateEnderecoDTO dto,
                                                  @PathVariable String cpf) {
        return service.updateEnderecoParticipante(dto, cpf);
    }

}
