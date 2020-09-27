package Arq.WsExemplo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "carro", path = "carro")
public interface CarroRepository extends PagingAndSortingRepository<Carro, Integer>{

	
	
}
