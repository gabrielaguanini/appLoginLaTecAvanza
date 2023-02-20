
package com.gabi.datospersonales.Repository;

import com.gabi.datospersonales.Entity.Datospersonales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdatosPerRepository extends JpaRepository<Datospersonales, Integer> {
    
}
