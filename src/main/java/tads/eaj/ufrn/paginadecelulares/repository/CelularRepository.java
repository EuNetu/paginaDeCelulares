package tads.eaj.ufrn.paginadecelulares.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tads.eaj.ufrn.paginadecelulares.model.Celular;

public interface CelularRepository extends JpaRepository<Celular, Long> {
}
