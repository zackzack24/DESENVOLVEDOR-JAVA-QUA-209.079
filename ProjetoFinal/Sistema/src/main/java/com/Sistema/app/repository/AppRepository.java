package com.Sistema.app.repository;

import org.springframework.data.repository.CrudRepository;
import com.Sistema.app.model.PessoaDesaparecida;

public interface AppRepository extends CrudRepository<PessoaDesaparecida,Long> {
    // Você pode adicionar métodos personalizados aqui, se necessário
    PessoaDesaparecida findById(long idPessoaDesaparecida);
    PessoaDesaparecida deleteById(long idPessoaDesaparecida);

    PessoaDesaparecida findByName(String PessoaDesaparecida);

}
