package com.einfochips;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.contains;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;



@SpringBootTest
@AutoConfigureMockMvc
class TestingSpringBootApplicationTests {

	@Autowired
	MockMvc mm;
	
	/*
	 * @Test void testController() throws Exception {
	 * mm.perform(get("/home")).andExpect(status().isOk()); }
	 * 
	 * @Test void testController2() throws Exception {
	 * mm.perform(get("/index")).andExpect(status().isNotFound()); }
	 */
	@Test
	void checkValue() throws Exception
	{
		 mm.perform(post("/home"))
         .andExpect(content().string(containsString("Hello home page")));
	}
	
	@Test
	void checkValue2() throws Exception
	{
		 mm.perform(get("/home"))
         .andExpect(content().string(containsString("Hello")));
	}
}
