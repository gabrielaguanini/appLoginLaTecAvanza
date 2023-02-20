package com.gabi.datospersonales.Service;

import com.gabi.datospersonales.Entity.Datospersonales;
import com.gabi.datospersonales.Repository.IdatosPerRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ServiceDatosPersonales implements IdatosPerService {
    
    
    @Autowired
    IdatosPerRepository idatosperRepo;

    @Override
    public List<Datospersonales> listadatosPer() {
        return idatosperRepo.findAll();
    }

    @Override
    public void agregarDatos(Datospersonales datospersonales) {
       idatosperRepo.save(datospersonales);
    }

  
    @Override
    public void borrarDatos(int id) {
        idatosperRepo.deleteById(id);
    }


    @Override
    public Datospersonales buscarxId(Datospersonales datospersonales, int id){
       return idatosperRepo.findById(id).orElse(null);
    }
    
    
    @Override
    public void actualizarDatos(Datospersonales datospersonales){
      idatosperRepo.save(datospersonales);
    }
  
   
    @Override
       public Datospersonales verxId( int id){
         return idatosperRepo.findById(id).orElse(null);
    }

   
    
}
