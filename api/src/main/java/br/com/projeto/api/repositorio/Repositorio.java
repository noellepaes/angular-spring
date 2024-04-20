package br.com.projeto.api.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.projeto.api.modelo.Pessoa;
import java.util.List;



public interface Repositorio extends CrudRepository<Pessoa, Long>{

    Pessoa findByCodigo(long codigo);

    List<Pessoa> findByOrderByNome();

    @Query(value = "SELECT SUM(idade) FROM PESSOAS"
    , nativeQuery = true)
    int somaIdades();
}
