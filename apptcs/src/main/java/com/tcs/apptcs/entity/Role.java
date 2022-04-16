package com.tcs.apptcs.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;

@Entity
public class Role implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8556900520084659010L;

	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO, generator="native")
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private String description;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(description, id, name);
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Role other = (Role) obj;
		return Objects.equals(description, other.description) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	
	
	

}
