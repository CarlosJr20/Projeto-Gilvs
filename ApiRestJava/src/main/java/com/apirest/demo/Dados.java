package com.apirest.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "DADOS")
public class Dados {
	/*NÃO MEXER AQUI*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	private Long id;
	/*FIM - NÃO MEXER AQUI*/

	 @Column(name = "NOME", length = 50, nullable = false)
	 private String nome;

	 @Column(name = "DISCIPLINA", length = 50, nullable = false)
	 private String disciplina;


	 @Column(name = "NOTA1", length = 11, nullable = false)
     private float nota1;

	 @Column(name = "NOTA2", length = 11, nullable = false)
     private float nota2;

	 @Column(name = "STATUS", length = 50, nullable = false)
     private String status;

	
}
