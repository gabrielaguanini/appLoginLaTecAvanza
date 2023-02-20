
package com.gabi.datospersonales.Security.Service.Impl;

import com.gabi.datospersonales.Security.Entity.Usuario;
import com.gabi.datospersonales.Security.Entity.UsuarioRol;
import com.gabi.datospersonales.Security.Repositorios.RolRepository;
import com.gabi.datospersonales.Security.Repositorios.UsuarioRepository;
import com.gabi.datospersonales.Security.Service.UsuarioService;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioServiceImpl implements UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Autowired
    private RolRepository rolRepository;

    @Override
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception {
        Usuario usuarioLocal = usuarioRepository.findByUsername(usuario.getUsername());
        
        if(usuarioLocal!= null){
        System.out.println("El usuario ya existe");
        throw new Exception("El usuario ya esta presente");
        }
        
        else{
        for (UsuarioRol usuarioRol:usuarioRoles){
        rolRepository.save(usuarioRol.getRol());
        }
        usuario.getUsuarioRoles().addAll(usuarioRoles);
        usuarioLocal = usuarioRepository.save(usuario);
        }
        return usuarioLocal;
    }

    @Override
    public Usuario obtenerUsuario(String username) {
     return usuarioRepository.findByUsername(username);
        
    }

    @Override
    public void eliminarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public List<Usuario> listaUsuarios() {
        return usuarioRepository.findAll();
    }
    
}