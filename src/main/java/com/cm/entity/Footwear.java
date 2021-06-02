package com.cm.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "footwear")
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = false, onlyExplicitlyIncluded = true)
@EqualsAndHashCode(callSuper = false)
public class Footwear {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@ToString.Include
	private int id;
	
	
	
	@Column(name = "branded")
	private String branded;
	
	@Column(name = "nonbranded")
	
	private String nonBranded;
	
	//@OneToOne(mappedBy="footwear", cascade= {CascadeType.DETACH,
		//	CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	//private Mens mens;

}
