package com.springboot.romanapp;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.setup.MockMvcBuilders;



@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(value = RomanController.class)
class RomanappApplicationTest {
	
	@InjectMocks
	private RomanController romancontroller;

	
	@Autowired
	 private MockMvc mockMvc;


	
	@Before
	public void setUp() throws Exception {
		mockMvc = MockMvcBuilders.standaloneSetup(romancontroller)
				.build();
		
	}

		@Test
		void test10() throws Exception {
			
			 mockMvc.perform(get("/roman")
					 .param("nbr", "10"))
		             .andExpect(content().string("X"));
			/*mockMvc.perform(
					MockMvcRequestBuilders.get("/roman").param("nbr", "10"))
			.andExpect(MockMvcResultMatchers.status().isOk())
			.andExpect(MockMvcResultMatchers.content().string("X"));*/
			
			
		}
		
		@Test
		void test1() throws Exception {
			
			 mockMvc.perform(get("/roman")
					 .param("nbr", "1"))
		             .andExpect(content().string("I"));	
			
		}
		
		@Test
		void test3999() throws Exception {
			
			 mockMvc.perform(get("/roman")
					 .param("nbr", "3999"))
		             .andExpect(content().string("MMMCMXCIX"));	
			
		}
		
		@Test
		void test5000() throws Exception {
			
			 mockMvc.perform(get("/roman")
					 .param("nbr", "5000"))
		             .andExpect(content().string("MMMMM"));	
			
		}
		
		
	

}
