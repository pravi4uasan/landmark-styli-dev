package com.cm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "dress")
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = false, onlyExplicitlyIncluded = true)
@EqualsAndHashCode(callSuper = false)
public class Dress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@ToString.Include
	private int id;
	
	@Column(name = "casual_dresses")
	private String casualDresses;
	
	@Column(name = "party_dresses")
	private String partyDresses;

}
