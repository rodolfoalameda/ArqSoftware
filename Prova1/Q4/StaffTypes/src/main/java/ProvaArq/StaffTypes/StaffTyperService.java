package ProvaArq.StaffTypes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StaffTyperService {

	@Autowired
    private StaffTypeRepository sRep;

    //Post
    public void guardar(StaffTypes s) {
        sRep.save(s);
    }

    //Get por id
    public Optional<StaffTypes> exibirUm(int id) {
        return sRep.findById(id);
    }

    //Get 
    public List<StaffTypes> exibir() {
        return sRep.findAll();
    }
	
	
}
