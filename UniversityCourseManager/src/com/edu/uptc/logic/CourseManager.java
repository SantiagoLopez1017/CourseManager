package com.edu.uptc.logic;
import java.util.*;

public class CourseManager {

	private Map<String, List<Course>> studentCourses;

	public CourseManager() {
		studentCourses = new HashMap<>();
	}
	
	public void addCourses(String studentCode, String name, int credits, int group) {
		Course course= new Course(name, credits, group);
		studentCourses.putIfAbsent(studentCode, new ArrayList<>());
		studentCourses.get(studentCode).add(course);
		
	}
	
	public void deleteCourses(String studentCode, String courseName) {
		List<Course> courses = studentCourses.get(studentCode);
		if(courses !=null) {
			boolean removed = courses.removeIf(c -> c.getName().equalsIgnoreCase(courseName));
			if(removed) {
				System.out.println("El curso fue eliminado con exito");
			}else {
				System.out.println("El curso que se queria eliminar no se encontraba almacenado");
			}
		}else {
			System.out.println("El Estudiante no tiene cursos inscritos, o no se encuentra registrado en el sistema");
		}
	}
	
	public void showCourses(String studentCode) {
		List<Course> courses= studentCourses.get(studentCode);
		if(courses!= null && !courses.isEmpty()) {
			System.out.println("Los cursos que tiene el estudioante "+ studentCode+ " son: ");
			for(Course c: courses) {
				System.out.println(c);
			}
		}else {
			System.out.println("El estudiante no tiene ningun curso inscrito");
		}
	}
	
	
	}
