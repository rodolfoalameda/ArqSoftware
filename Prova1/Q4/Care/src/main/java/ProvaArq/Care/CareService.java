package ProvaArq.Care;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CareService {

	@Autowired
    private CareRepository cRep;

    //Post
    public void guardar(Care c) {
        cRep.save(c);
    }

    //Get id
    public Optional<Care> exibirUm(int id) {
        return cRep.findById(id);
    }

    //Get 
    public List<Care> exibir() {
        return cRep.findAll();
    }
	
}
