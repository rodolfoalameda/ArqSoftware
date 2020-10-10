package ProvaArq.Staff;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Staff {

	@Id
	private int idStaff;
	private int staffType;
	private String foreName;
	private String surName;
	
}
