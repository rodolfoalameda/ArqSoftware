package ProvaArq.Q3;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "payment", path = "payment")

public interface PaymentRepositoy extends PagingAndSortingRepository<Payment, Integer>{

}
