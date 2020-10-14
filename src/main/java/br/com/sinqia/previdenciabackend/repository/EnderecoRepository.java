package br.com.sinqia.previdenciabackend.repository;

import br.com.sinqia.previdenciabackend.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, String> {
}
