package bootsample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import bootsample.service.TaskService;

@Controller
public class SampleRestController {
	@Autowired
	private TaskService service;
	
	@GetMapping("/home")
	public String hello(){
		return "Hello World";
	}
	
	@GetMapping("/all-tasks")
	public String getAllTasks(){
		return service.getAllTasks().toString();
	}
}
