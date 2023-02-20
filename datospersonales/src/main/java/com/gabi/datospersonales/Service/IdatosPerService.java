package com.gabi.datospersonales.Service;

import com.gabi.datospersonales.Entity.Datospersonales;
import java.util.List;
import org.springframework.http.ResponseEntity;

public interface IdatosPerService {
    
    public List <Datospersonales> listadatosPer();
    public void agregarDatos(Datospersonales datospersonales);
    public void borrarDatos(int id);
    public Datospersonales buscarxId(Datospersonales datospersonales, int id);
    public Datospersonales verxId( int id);
    public void actualizarDatos(Datospersonales datospersonales);
 
    
}
