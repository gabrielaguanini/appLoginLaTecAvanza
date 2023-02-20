
package com.gabi.datospersonales.Security.Repositorios;


import com.gabi.datospersonales.Security.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
    
    public Usuario findByUsername(String Username);
    
}
