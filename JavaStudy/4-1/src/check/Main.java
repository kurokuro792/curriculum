package check;

public class Main {
	
	private  static final String firstName ="黒木";
	private  static final String lastName ="沙織";

	
	private static void printName(String firstName, String lastName) {
		String fullName = firstName + lastName;
		System.out.println(fullName);
	}

	public String getName(String firstName, String lastName) {
		return firstName + lastName;
		
	}
	

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタ	
		Main main = new Main();
		main.getName(firstName, lastName);
		System.out.println("printNameメソッド →" + main.getName(firstName, lastName));
		
		
		
	
		
		 Pet Pet = new Pet("java吉", "hoge");
		 Pet.introduce();
		 
		 
		 Pet RobotPet = new RobotPet("R202", "ルーク");
		 Pet.introduce();
		 RobotPet.introduce ();
		 
	}
	
	
	}




