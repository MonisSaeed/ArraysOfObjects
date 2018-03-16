package StudentDatabaseApp;

public class StudentDatabaseApp {
	public String Name;
	public static int RollNo=0;
	public StudentDatabaseApp(String Name)
	{ 
		this.Name=Name;
	}
	public void SetRollNo()
	{
		RollNo++;
	}

}
