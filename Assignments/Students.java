package week5.Assignments;

public class Students {
	public void getStudentInfo(int id) 
	{
		System.out.println(id);
	}
	
		public void getStudentInfo(int id,String name) 
		{
	      System.out.println(id+"  "+name);
		}
		public void getStudentInfo(String email,long phoneNumber) 
		{
	      System.out.println(email+"  "+phoneNumber);
		}
		public static void main(String[] args) 
		{
			Students s1=new Students();
			s1.getStudentInfo(25);
			s1.getStudentInfo(25,"Nithis");
			s1.getStudentInfo("nithis5678@gmail.com",9754632877l);
			
		}
}
