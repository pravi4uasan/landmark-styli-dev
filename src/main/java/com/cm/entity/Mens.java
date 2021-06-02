package com.cm.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;



import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Entity
@Table(name = "mens")
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = false, onlyExplicitlyIncluded = true)
@EqualsAndHashCode(callSuper = false)
public class Mens {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@ToString.Include
	private int id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="footwear_id")
	@NotFound(action=NotFoundAction.IGNORE)
	private Footwear footwear;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="tshirts_id")
	@NotFound(action=NotFoundAction.IGNORE)
	private TShirts tshirts;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="shirts_id")
	@NotFound(action=NotFoundAction.IGNORE)
	private Shirts shirts;
	
	@OneToOne(mappedBy="mens", cascade= {CascadeType.DETACH,
			CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	private Categories categories;
	
	

}
