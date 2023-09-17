package pe.edu.cibertec.appwebtrasanction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.appwebtrasanction.model.bd.Direccion;

@Repository
public interface DireccionRepository extends JpaRepository<Direccion,
        Integer> {
}
