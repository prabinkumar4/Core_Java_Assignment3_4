package assignment3_4;

import java.util.Scanner;

public class StudentResultProcesing extends Student {

	    public static void main(String[] args) {
	        Student student = new Student();
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter Student Name: "); // it will take student name from the user
	        String name = scanner.nextLine();
	        student.setName(name);
	        System.out.print("Enter Student roll number: ");
	        int rollNumber = scanner.nextInt();
	        student.setRollMumber(rollNumber);
	        System.out.print("Enter Student Phone number: ");
	        int phoneNumber = scanner.nextInt();
	        student.setPhoneNumber(phoneNumber);
	        
	        System.out.print("Enter Student Class Number: ");
	        int ClassNumber = scanner.nextInt();
	        student.setClassNumber(ClassNumber);
	      
	        System.out.print("Enter marks in physics: ");
	        int physics = scanner.nextInt();
	        student.setMarks1(physics);
	        System.out.print("Enter marks in chemistry: ");
	        int chemistry = scanner.nextInt();
	        student.setMarks2(chemistry);
	        System.out.print("Enter marks in maths: ");
	        int maths = scanner.nextInt();
	        student.setMarks3(maths);
	        System.out.println();
	        
	        System.out.println("Student detailes and his/her pass/fail status:");
	        System.out.println("Name: " + student.getName());
	        System.out.println("Roll Number: " + student.getRollNumber());
	        System.out.println("Phone Number: " + student.getPhoneNumber());
	        System.out.println("Class Nunber: " + student.getClassNumber());
	        System.out.println("Marks in Physics: " + student.getMarks1());
	        System.out.println("Marks in Chemistry: " + student.getMarks2());
	        System.out.println("Marks in Maths: " + student.getMarks3());
	        System.out.print("Average marks of student is: " + student.getAverage());
	       Student student1 = new Student();
	        student1.setStatus();
	     
	        
	    }
	}