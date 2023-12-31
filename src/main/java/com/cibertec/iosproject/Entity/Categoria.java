package com.cibertec.iosproject.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "categoria")
public class Categoria {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int idCategoria;
    private String nombre;
    private String tipo;
    private String imagen;
}
