package br.cesed.si.lsi.security.springsecurityatividade1;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Payment {

	private double value;
	private Date date;
	private Boolean isPaid;
	private Boolean isConfirmed;
	private Date expireDate;
	private Boolean paidfull;
}
