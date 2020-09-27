package ProvaArq.Care;

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
@RequestMapping("/care")
public class CareController {

	@Autowired
    private CareService cSer;

    @GetMapping
    public ResponseEntity<List<Care>> exibir() {
        return new ResponseEntity<List<Care>>(cSer.exibir(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Care>> exibirUm(@PathVariable int id) {
        return new ResponseEntity<Optional<Care>>(cSer.exibirUm(id), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Care> guardar(@RequestBody Care c) {
        cSer.guardar(c);
        return new ResponseEntity<Care>(HttpStatus.CREATED);
    }
	
}
