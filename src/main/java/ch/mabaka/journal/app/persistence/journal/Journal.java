package ch.mabaka.journal.app.persistence.journal;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import ch.mabaka.journal.app.persistence.AbstractEntity;

@Entity
public class Journal extends AbstractEntity {
	
	@NotNull
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
