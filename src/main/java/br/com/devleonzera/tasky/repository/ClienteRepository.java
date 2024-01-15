package br.com.devleonzera.tasky.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.devleonzera.tasky.entity.Cliente;
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
