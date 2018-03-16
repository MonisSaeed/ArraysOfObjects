package StudentDatabaseApp;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDatabaseApp[] Students=new StudentDatabaseApp[10];
		for(int i=0;i<Students.length;i++) {
			 Students[i]=new StudentDatabaseApp("Monis"+i);
			 Students[i].SetRollNo();
			 System.out.println( Students[i].Name+Students[i].RollNo);
		}
		

	}

}
