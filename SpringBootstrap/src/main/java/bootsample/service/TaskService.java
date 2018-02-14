package bootsample.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bootsample.dao.TaskRepository;
import bootsample.model.Task;

@Service
@Transactional
public class TaskService {
	@Autowired
	private TaskRepository taskRepository;
	
	public List<Task> getAllTasks(){
		List<Task> tasks= new ArrayList<>();
		for(Task task:taskRepository.findAll()){
			tasks.add(task);
		}
		return tasks;
	}
}
