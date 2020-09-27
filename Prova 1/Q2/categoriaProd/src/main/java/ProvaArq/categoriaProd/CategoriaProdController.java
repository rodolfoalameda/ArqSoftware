package ProvaArq.categoriaProd;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catProdutos")
public class CategoriaProdController {

	@GetMapping
	public List<CategoriaProd> findAll(){
		return new ArrayList<CategoriaProd>();
	}
	
	
}
