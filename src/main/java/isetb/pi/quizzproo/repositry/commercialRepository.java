package isetb.pi.quizzproo.repositry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import isetb.pi.quizzproo.entities.commercial;
@Repository
public interface commercialRepository extends JpaRepository<commercial,Long>{
	
}