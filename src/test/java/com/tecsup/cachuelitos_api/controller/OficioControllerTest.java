package com.tecsup.cachuelitos_api.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tecsup.cachuelitos_api.entity.Oficio;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class OficioControllerTest {
	
	private static final ObjectMapper om = new ObjectMapper();
	
	@Autowired
	private MockMvc mockMvc;
		
	 @Test
	 public void testCreateOficio() throws Exception {
			
	    	String OFICIO_NAME = "Pintor de casas";
			
			Oficio newOficio=new Oficio(OFICIO_NAME);
		
		    mockMvc.perform(post("/api/oficio")
		            .content(om.writeValueAsString(newOficio))
		            .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON))
		            .andDo(print())
		            .andExpect(status().isCreated())
		            //.andExpect(jsonPath("$.id", is(1)))
		            .andExpect(jsonPath("$.nombreOficio", is(OFICIO_NAME)));
		}
}
