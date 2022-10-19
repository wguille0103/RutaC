/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rutac.controladores;

import com.rutac.modelo.Municipio;
import com.rutac.servicios.IMunicipioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author Wilman Parra
 */
@RestController
@RequestMapping("/municipio")
public class MunicipioController {
    
    @Autowired
    private IMunicipioService municipioService;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<Municipio> listarMunicipiosPorCodDepartamento(@PathVariable int  id) {
        return municipioService.listarMunicipiosPorCodDepartamento(id);
    }
    
}
