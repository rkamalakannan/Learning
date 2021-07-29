package com.example.demo;

import java.math.BigInteger;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@SpringBootApplication

@Entity
public class tAS {
    @Id
    BigInteger id;

    String description;

    BigInteger priority;

    public Task() {
    }

    public Task(BigInteger id, String description, BigInteger priority) {
        this.id = id;
        this.description = description;
        this.priority = priority;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigInteger getPriority() {
        return priority;
    }

    public void setPriority(BigInteger priority) {
        this.priority = priority;
    }

    @Autowired
    TaskRepository taskRepository;

    @PutMapping("/tasks/{id}")
    public ResponseEntity<Task> putMappingMethod(@RequestBody Task task, @PathVariable Long id) {
        // task.setDescription(task.getDescription());
        // task.setPriority(task.getPriority());

        
        // String description = taskRepository.getById(id).getDescription();
        // BigInteger priority = taskRepository.getById(id).getId();


        if (taskRepository.findById(id) != null) {

            return new ResponseEntity(task , HttpStatus.OK);
        }

        else if(taskRepository.findById(id) == null){
            return new ResponseEntity("Cannot find task with given id", HttpStatus.NOT_FOUND);
        }

        else if (task.getDescription()==null){
        return new ResponseEntity("Task description is required", HttpStatus.BAD_REQUEST);
        }

        else{
            return null;
        }
    }

    @Repository
    public interface TaskRepository extends JpaRepository<Task, Long> {
    }

    public static void main(String[] args) {
        SpringApplication.run(Task.class, args);
    }

}
