package br.com.sinqia.previdenciabackend.controller;

import br.com.sinqia.previdenciabackend.dto.CreateEnderecoDTO;
import br.com.sinqia.previdenciabackend.dto.EnderecoDTO;
import br.com.sinqia.previdenciabackend.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("participantes/{cpf}/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EnderecoDTO createEndereco(@PathVariable String cpf,
                                      @RequestBody @Valid CreateEnderecoDTO dto) {
        return service.createEndereco(cpf, dto);
    }

}
