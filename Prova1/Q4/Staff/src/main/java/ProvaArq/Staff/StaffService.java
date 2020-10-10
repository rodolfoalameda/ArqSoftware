package ProvaArq.Staff;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class StaffService {
	
	@Autowired
    private StaffRepository sRep;

    //Post
    public void guardar(Staff s) {
        sRep.save(s);
    }

    //Get id
    public Optional<Staff> exibirUm(int id) {
        return sRep.findById(id);
    }

    //Get 
    public List<Staff> exibir() {
        return sRep.findAll();
    }
	
}
