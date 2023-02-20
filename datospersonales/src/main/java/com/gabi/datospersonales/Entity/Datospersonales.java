
package com.gabi.datospersonales.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Datospersonales {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String direccion;
    private String dni;
    private String nombre;
    private int salario;
    private String telefono;

    public Datospersonales() {
    }

    public Datospersonales(String direccion, String dni, String nombre, int salario, String telefono) {
        this.direccion = direccion;
        this.dni = dni;
        this.nombre = nombre;
        this.salario = salario;
        this.telefono = telefono;
    }

   

   

  
    
    
    
}
