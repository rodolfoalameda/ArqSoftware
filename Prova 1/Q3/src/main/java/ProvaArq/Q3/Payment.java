package ProvaArq.Q3;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
	
	@Id
	private int id;
	private double value;
	private Date date;
	private boolean isPaid;
	private boolean isConfirmed;
	private Date expireDate;
	private String requester;
	
}
