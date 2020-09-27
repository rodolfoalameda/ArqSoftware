package ProvaArq.Care;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Care {
	
	@Id
	private int idCare;
	private int idStaff;
	private int idSupportedPeople;
	
	
}
