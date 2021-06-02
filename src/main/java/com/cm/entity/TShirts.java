package com.cm.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tshirts")
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = false, onlyExplicitlyIncluded = true)
@EqualsAndHashCode(callSuper = false)
public class TShirts {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@ToString.Include
	private int id;
	
	@Column(name = "printedt_tshirts")
	private String printedTshirts;
	
	@Column(name = "causal_tshirts")
	private String causalTShirts;
	
	@Column(name = "plain_tshirts")
	private String plainTShirts;
	
	//@OneToOne(mappedBy="tshirts", cascade= {CascadeType.DETACH,
			//CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	//private Mens mens;

}
