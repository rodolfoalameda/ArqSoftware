package ProvaArq.StaffTypes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/stafftypes")
public class StaffTypesController {

	@Autowired
    private StaffTyperService sSer;

    @GetMapping
    public ResponseEntity<List<StaffTypes>> exibir() {
        return new ResponseEntity<List<StaffTypes>>(sSer.exibir(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<StaffTypes>> exibirUm(@PathVariable int id) {
        return new ResponseEntity<Optional<StaffTypes>>(sSer.exibirUm(id), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<StaffTypes> guardar(@RequestBody StaffTypes s) {
        sSer.guardar(s);
        return new ResponseEntity<StaffTypes>(HttpStatus.CREATED);
    }
	
}
