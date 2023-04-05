package com.project.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Student;
import com.project.exception.ResourseNotFound;
import com.project.repository.StudentRepository;

@RestController
public class EmployeeController {
	@Autowired
	public StudentRepository repository;
	
	@GetMapping("/students")
	public List<Student> getAllStudent(){
		return repository.findAll();
		
	}
	
	@PostMapping("/students")
	public Student saveStudent(@RequestBody Student student) {
		return repository.save(student);
	}
	
	@GetMapping("/students/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable int id){
		Student student=repository.findById(id).orElseThrow(() -> new ResourseNotFound("No Record found with this ID "+id));
		return ResponseEntity.ok(student);
	}
	
	@PutMapping("students/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable int id,@RequestBody Student student)
	{
		Student student2=repository.findById(id).orElseThrow(() -> new ResourseNotFound("No Record found by this ID "+id));
		student2.setRoll(student.getRoll());
		student2.setName(student.getName());
		student2.setGender(student.getGender());
		student2.setMarks(student.getMarks());
		Student updateStudent =repository.save(student2);
		return ResponseEntity.ok(updateStudent);
	}
	
	@DeleteMapping("students/{id}")
	public ResponseEntity<Map<String,Boolean>> deleteStudent(@PathVariable int id){
		Student student=repository.findById(id).orElseThrow(() -> new ResourseNotFound("No Record Found by this id "+id));
		repository.delete(student);
		Map<String, Boolean> response=new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
