/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rutac.repositorio;

import com.rutac.modelo.Preferencias;
import javax.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Wilman Parra
 */
public interface PreferenciasDao extends JpaRepository<Preferencias, Id> {
    
}
