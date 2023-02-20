package com.gabi.datospersonales.Controller;

import com.gabi.datospersonales.Entity.Datospersonales;
import com.gabi.datospersonales.Service.ServiceDatosPersonales;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDatosPersonales {
    
    @Autowired
    ServiceDatosPersonales ServDatosPer;
    
   @GetMapping("/listadatosper")
   @ResponseBody
   public List<Datospersonales> datosPersonales(){
   return ServDatosPer.listadatosPer();
   }
   
   
   @PostMapping("/agregardatos")
   public void agregarDatos(@RequestBody Datospersonales datospersonales) {
   ServDatosPer.agregarDatos(datospersonales);
 
   
   }
   
   
   @DeleteMapping("/borrardatos/{id}")
   public void borrarDatos(@PathVariable int id) {
   ServDatosPer.borrarDatos(id);
    }
    
    
   
    @GetMapping("/buscardatosid/{id}")
    @ResponseBody
    public Datospersonales buscarDatosxId(@PathVariable int id) {
    return ServDatosPer.verxId(id);
           
    }
       
    
    
    @PutMapping ("/editardatos")
    public void actualizarDatos(@RequestBody Datospersonales datospersonales) {
   
    ServDatosPer.actualizarDatos(datospersonales);
    }
    
    @PutMapping ("/editardatos/{id}")
    public void actualizarDatosXId(@RequestBody Datospersonales datospersonales,@PathVariable int id) {
   
    Datospersonales datosper = ServDatosPer.buscarxId(datospersonales, id);
    
    ServDatosPer.actualizarDatos(datospersonales);
    }
}
