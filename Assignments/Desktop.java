package week5.Assignments;

public class Desktop extends Computer {
	public  void desktop() {
		
		System.out.println("Desktop");
	}
		public static void main(String[] args) {
			Desktop obj=new Desktop();
			obj.computerModel();
			obj.desktop();
		}
}
