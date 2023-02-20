
package com.gabi.datospersonales.Security.Service;

import com.gabi.datospersonales.Security.Entity.Usuario;
import com.gabi.datospersonales.Security.Entity.UsuarioRol;
import java.util.List;
import java.util.Set;

public interface UsuarioService { 
    
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception; 
    public Usuario obtenerUsuario(String username);
    public void eliminarUsuario(Long id);
    public List <Usuario> listaUsuarios();
    
}