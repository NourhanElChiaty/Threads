
public class printThread implements Runnable {
   Thread thread;
   String name1;
   String email1;
   int age1;
   String faculty1;
   String phone1;
   Grades  grades;
  public printThread(String name,String email,int age,String faculty,String phone,Grades grades) {
	 name1=name;
	 email1=email;
	 age1=age;
	 faculty1=faculty;
	 phone1=phone;
	 this.grades=grades;
	   thread = new Thread(this);
	   thread.start();
   }
   
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Student.printResults(name1, email1, age1, faculty1, phone1,grades);
	}

	


} 


