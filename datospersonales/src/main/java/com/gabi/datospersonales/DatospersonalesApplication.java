package com.gabi.datospersonales;

import com.gabi.datospersonales.Security.Entity.Rol;
import com.gabi.datospersonales.Security.Entity.Usuario;
import com.gabi.datospersonales.Security.Entity.UsuarioRol;
import com.gabi.datospersonales.Security.Service.UsuarioService;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class DatospersonalesApplication implements CommandLineRunner{
    
    @Autowired
    private UsuarioService usuarioService;
    
    @Autowired
    private BCryptPasswordEncoder bcryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(DatospersonalesApplication.class, args);
	}
 @Override
    public void run(String... args) throws Exception {
   /*   Usuario usuario = new Usuario();
        
   //INSTANCIA DE CLASE USUARIO
   
    usuario.setUsername("Gabriela");
    usuario.setPassword(bcryptPasswordEncoder.encode("Clavedesol440"));
    usuario.setNombre("Gabriela");
    usuario.setApellido("Fernanda");
    usuario.setEmail("gabriela.guanini@gmail.com");
    usuario.setTelefono("4573-0621");
    usuario.setPerfil("gabifoto.jog");
    
   //INSTANCIA DE CLASE ROL  
   
    Rol rol = new Rol();    
    rol.setIdRol(1L);
    rol.setNombre("ADMIN");
   
   //INSTANCIA DE CLASE UsuarioRol    
   
    Set<UsuarioRol> usuarioRoles = new HashSet<>();
    UsuarioRol usuarioRol = new UsuarioRol();
    usuarioRol.setRol(rol); 
    usuarioRol.setUsuario(usuario);
    usuarioRoles.add(usuarioRol);
    
    //GUARDAR USUARIO EN DATABASE
    
    Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario, usuarioRoles);
    System.out.println(usuarioGuardado.getUsername());    
    
    } 
  
}*/
    }
}







