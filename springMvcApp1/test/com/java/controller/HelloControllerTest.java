package com.java.controller;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
/*classes={MyBeanConfiguration.class}*/
@ContextConfiguration(locations={"file:WebContent/WEB-INF/spring-dispatcher-servlet.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class HelloControllerTest {

	private MockMvc mockMvc;
	@Autowired
	private HelloController controller;
	@Autowired
	private WebApplicationContext context;
	
	@Before
	public void setUp() throws Exception {
	/*Mockito.reset(mocks);*/
		mockMvc= MockMvcBuilders.webAppContextSetup(context).build();		
	}
	@Test
	public void test1() throws Exception {
		mockMvc.perform(get("/welcome")).
		andExpect(status().isOk()).
		andExpect(view().name("Hello"));			
	}


	@Test
	public void test() {
		ModelAndView mv= controller.getModelView();
		assertEquals("Hello",mv.getViewName() );
	}
	
}
