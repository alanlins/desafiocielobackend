package com.gft.desafiocielo.service;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gft.desafiocielo.model.LancamentoContaLegado;

@Service
public class LancamentoContaLegadoService {

	
	public LancamentoContaLegado extract() throws IOException {
        
		ObjectMapper objectMapper = new ObjectMapper();
		LancamentoContaLegado lancamento = new LancamentoContaLegado();
		try {
			lancamento = objectMapper.readValue(new File("src/main/resources/json/lancamento-conta-legado.json"), LancamentoContaLegado.class);
		} catch (JsonParseException e) {
			throw e;
		} catch (JsonMappingException e) {
			throw e;
		} catch (IOException e) {
			throw e;
		}
		
		return lancamento;
        
    }
}
