package com.Sistema.app.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import com.Sistema.app.model.PessoaDesaparecida;

public interface AppRepository extends CrudRepository<PessoaDesaparecida, Long> {
    // Métodos corrigidos - usar Optional e convenção Spring Data
    Optional<PessoaDesaparecida> findById(long idPessoaDesaparecida);
}