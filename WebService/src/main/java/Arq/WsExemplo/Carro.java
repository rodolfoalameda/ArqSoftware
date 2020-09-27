package Arq.WsExemplo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Carro {
	
	@Id
	private int id;
	private String nome;
	private int ano;
	
}
