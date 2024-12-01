package SpringBoot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SpringBoot.entities.Responsablerh;


@Repository
public interface ResponsablerhRepository extends JpaRepository<Responsablerh,Long> {
	 List<Responsablerh> findByStatut(Responsablerh.Statut statut);

}
