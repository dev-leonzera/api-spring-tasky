package br.com.devleonzera.tasky.repository;

import br.com.devleonzera.tasky.entity.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
}
