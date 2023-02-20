
package com.gabi.datospersonales.Security.Controladores;

import com.gabi.datospersonales.Security.Entity.Rol;
import com.gabi.datospersonales.Security.Entity.Usuario;
import com.gabi.datospersonales.Security.Entity.UsuarioRol;
import com.gabi.datospersonales.Security.Service.UsuarioService;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    
    @Autowired 
    private UsuarioService usuarioService;
    
    @Autowired 
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    
    @PostMapping("/guardarusuario")
    public Usuario guardarUsuario(@RequestBody Usuario usuario)throws Exception{
        
        Set<UsuarioRol> roles = new HashSet<>();
        
        usuario.setPassword(this.bCryptPasswordEncoder.encode(usuario.getPassword()));
        
        Rol rol = new Rol();
        rol.setIdRol(2L);
        rol.setNombre("NORMAL");
        
        
        UsuarioRol usuarioRol = new UsuarioRol();
        usuarioRol.setUsuario(usuario);
        usuarioRol.setRol(rol);
        return usuarioService.guardarUsuario(usuario, roles);
  
    }
    
    
    @GetMapping("/{userName}")
    public Usuario obtenerUsuario(@PathVariable("userName") String username){
        return usuarioService.obtenerUsuario(username);
     
    }
    
    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable("id") Long id){
        usuarioService.eliminarUsuario(id);
    }
    
    @GetMapping("/listausuarios")
    @ResponseBody
    public List <Usuario> listaUsuarios(){
        return usuarioService.listaUsuarios();
    }
   
}

