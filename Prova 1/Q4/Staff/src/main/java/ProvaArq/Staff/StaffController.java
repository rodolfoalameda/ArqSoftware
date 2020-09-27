package ProvaArq.Staff;

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


@RequestMapping
@Controller
public class StaffController {

	@Autowired
    private StaffService sSer;

    @GetMapping
    public ResponseEntity<List<Staff>> exibir() {
        return new ResponseEntity<List<Staff>>(sSer.exibir(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Staff>> exibirUm(@PathVariable int id) {
        return new ResponseEntity<Optional<Staff>>(sSer.exibirUm(id), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Staff> guardar(@RequestBody Staff s) {
        sSer.guardar(s);
        return new ResponseEntity<Staff>(HttpStatus.CREATED);
    }
	
}
