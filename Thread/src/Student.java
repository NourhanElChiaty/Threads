

public class Student {
   String name;
   String email;
   int age;
   String faculty;
   String phone;
   Grades []grades;
   
   
public Student(String name, String email, int age, String faculty, String phone) {
	super();
	this.name = name;
	this.email = email;
	this.age = age;
	this.faculty = faculty;
	this.phone = phone;
	
	
}
public Student(String name, String email, int age, String faculty, String phone,Grades[]grades) {
	super();
	this.name = name;
	this.email = email;
	this.age = age;
	this.faculty = faculty;
	this.phone = phone;
	this.grades=grades;
	
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public String getFaculty() {
	return faculty;
}


public void setFaculty(String faculty) {
	this.faculty = faculty;
}


public String getPhone() {
	return phone;
}


public void setPhone(String phone) {
	this.phone = phone;
}


public synchronized static void printResults(String name,String email,int age,String faculty,String phone,Grades grades) {
	 	System.out.println(name);
	 	try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(email);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(age);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(faculty);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(phone);
		
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(grades.subject);
		System.out.println(grades.mark);
		}

}


