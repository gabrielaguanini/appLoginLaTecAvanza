
package com.gabi.datospersonales.Security.Entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="roles")
public class Rol {
    
    @Id
    private Long idRol;
    private String nombre;
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="rol")
    private Set<UsuarioRol> UsuarioRoles = new HashSet<>();

    public Rol() {
    }
    
    

    public Rol(Long idRol, String nombre) {
        this.idRol = idRol;
        this.nombre = nombre;
    }
    
    
    
}
