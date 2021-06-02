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
@Table(name = "shirts")
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = false, onlyExplicitlyIncluded = true)
@EqualsAndHashCode(callSuper = false)
public class Shirts {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@ToString.Include
	private int id;
	
	@Column(name = "party_shirts")
	private String partyShirts;
	
	@Column(name = "causal_shirts")
	private String causalShirts;
	
	@Column(name = "plain_shirts")
	private String plainShirts;
	
	//@OneToOne(mappedBy="shirts", cascade= {CascadeType.DETACH,
			//CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	//private Mens mens;

}
