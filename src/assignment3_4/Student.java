package assignment3_4;

public class Student {

	// variables declaration.
    
    private String name;
    private int rollNumber;
    private int phoneNumber;
    private int ClassNumber;
    private int physics;
    private int chemistry;
    private int maths;

    // set name of the student
    public void setName(String s) {
        name = s;
    }

   // it will return name of the student
    public String getName() {
        return name;
    }

    public void setRollMumber(int r) {
        if (r > 0) {
            rollNumber = r;
        } else {
            rollNumber = 1;
        }
    }

    public int getRollNumber() {
        return rollNumber;
    }
    
    
    public void setPhoneNumber(int p) {
        if (p > 0) {
            phoneNumber = p;
        } else {
            phoneNumber = 1;
        }
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setClassNumber(int c) {
        if (c > 0) {
        	ClassNumber = c;
        } else {
        	ClassNumber = 0;
        }
    }

    public int getClassNumber() {
        return ClassNumber;
    }
    
// set the marks in physics
    public void setMarks1(int m) {
        if (m >= 0 && m <= 100) {
            physics = m;
        } else {
            physics = 0;
        }
    }

    public int getMarks1() {
        return physics;
    }

 // set the marks in chemistry
    public void setMarks2(int m) {
        if ((m >= 0) && (m <= 100)) {
            chemistry = m;
        } else {
            chemistry = 0;
        }
    }

    public int getMarks2() {
        return chemistry;
    }

    
 // set the marks in maths
    public void setMarks3(int m) {
        if ((m >= 0) && m <= 100) {
            maths = m;
        } else {
            maths = 0;
        }
    }

    public int getMarks3() {
        return maths;
    }

    
   // return average of the physics , chemistry and maths 
    public double getAverage() {
        return (physics+ chemistry + maths) / 3.0;
    }
    
   //return the pass/ fail status as per average marks of student
    public void setStatus() {
        if ((getAverage() >= 30) && getAverage() <= 100) {
        	
            System.out.print("	Pass");
            
        } else
        
        {
        	System.out.print("  Fail");
        }
    }
    
    public void  printDetails() {
        
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Class Name: " + ClassNumber);
        System.out.println("Marks in first subject: " + physics);
        System.out.println("Marks in second subject: " + chemistry);
        System.out.println("Marks in third subject: " + maths);
        System.out.println("Average: " + getAverage());
       
        
    }
}


