package ProvaArq.Care;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CareRepository extends JpaRepository<Care, Integer>{

}
