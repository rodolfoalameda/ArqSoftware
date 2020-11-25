package br.cesed.si.lsi.security.springsecurityatividade1;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	List<Payment> payments = Arrays.asList(
			new Payment(50, new Date(), true, false, new Date(), false),
			new Payment(550, new Date(), true, true, new Date(), true)
	);
	
	@Secured({"USER"})
	@GetMapping("/{requester}")
	public ResponseEntity<Payment> findById(@PathVariable int idCliente) {
		return new ResponseEntity<Payment>(new Payment(550, new Date(), true, true, new Date(), true), HttpStatus.OK);
	}
	
	@Secured({"ADMIN"})
	@GetMapping()
	public ResponseEntity< List<Payment> > listar() {
		return new ResponseEntity< List<Payment> >(payments, HttpStatus.OK);
	}
	
	@Secured({"ADMIN", "USER"})
	@PostMapping
	public ResponseEntity<Payment> criarNovaConta(@RequestBody Payment payment) {
		return new ResponseEntity<Payment>(payment, HttpStatus.CREATED);
	}
}
