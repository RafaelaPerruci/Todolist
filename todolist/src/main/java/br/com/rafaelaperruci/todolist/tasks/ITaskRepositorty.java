package br.com.rafaelaperruci.todolist.tasks;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface ITaskRepositorty extends JpaRepository<TaskModel, UUID>{ 
    List<TaskModel> findByIdUser(UUID idUser); 
    TaskModel findByIdAndIdUser(UUID id, UUID idUser);
    
}
