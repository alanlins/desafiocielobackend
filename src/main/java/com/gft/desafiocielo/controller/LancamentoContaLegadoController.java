package com.gft.desafiocielo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.gft.desafiocielo.model.LancamentoContaLegado;
import com.gft.desafiocielo.service.LancamentoContaLegadoService;

@RestController
public class LancamentoContaLegadoController {
	
	@Autowired
	LancamentoContaLegadoService service;
	
	@CrossOrigin
	@RequestMapping(value = "/extract", method = RequestMethod.GET)
    public ResponseEntity<Object> extract() throws IOException {
        
		ResponseEntity<Object> ret = null;
		LancamentoContaLegado lancamento = new LancamentoContaLegado();
		
		try {
			lancamento = service.extract();
			ret = new ResponseEntity<Object>(lancamento, HttpStatus.OK);
		} catch (JsonParseException e) {
			ret = this.exception();
		} catch (JsonMappingException e) {
			ret = this.exception();
		} catch (IOException e) {
			ret = this.exception();
		}
		
		return ret;
        
    }
	
	protected ResponseEntity<Object> exception() {
		String error = "Service error. Please contact the support team.";
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
}
