package com.cm.entity;

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

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Entity
@Table(name = "categories")
@Getter
@Setter
@NoArgsConstructor
public class Categories {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@ToString.Include
	private int id;
	
	@Column(name = "type")
	private String Type;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="mens_id")
	@NotFound(action=NotFoundAction.IGNORE)
	private Mens mens;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="womens_id")
	@NotFound(action=NotFoundAction.IGNORE)
	private Womens womens;

}
