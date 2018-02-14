package bootsample.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import bootsample.model.Task;

public interface TaskRepository extends CrudRepository<Task, Serializable>{

}
