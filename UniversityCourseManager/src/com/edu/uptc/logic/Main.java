package com.edu.uptc.logic;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		CourseManager courseManager = new CourseManager();
		boolean bandera= true;
		
		while(bandera) {
			System.out.println("-----------MENU----------");
			System.out.println("Gestion de cursos de universidad");
			System.out.println("1. Agregar curso");
			System.out.println("2. Consultar curso");
			System.out.println("3. Eliminar curso");
			System.out.println("4. Salir");
			System.out.println("ingrese la opcion a realizar");
			int option= sc.nextInt();
			switch(option) {
			case 1:
				System.out.println("Ingrese su codigo estudiantil");
				String studentCode= sc.next();
				System.out.println("ingrese el nombre del curso");
				String name=sc.next();
				System.out.println("ingrese la cantidad de creditos del curso");
				int credits = sc.nextInt();
				System.out.println("ingrese el grupo del curso");
				int group= sc.nextInt();
				courseManager.addCourses(studentCode,name, credits, group);
				System.out.println("curso agregado con exito");
				break;
			case 2:
				System.out.println("ingrese el codigo del estudiante del que desea conocer sus cursos inscritos");
				studentCode= sc.next();
				courseManager.showCourses(studentCode);
				break;
			case 3:
				System.out.println("Ingrese el codigo del estudiante del que desea eliminar los cursos");
				studentCode= sc.next();
				System.out.println("ingrese el nombre del curso que desea eliminar");
				String courseName= sc.next();
				courseManager.deleteCourses(studentCode, courseName);
				break;
			case 4:
				System.out.println("saliendo del sistema");
				bandera=false;
				break;
			default:
				System.out.println("opcion invalida");
				
		}
		
		}
	}
}
