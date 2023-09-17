package pe.edu.cibertec.appwebtrasanction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.appwebtrasanction.model.bd.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,
        Integer> {
}
