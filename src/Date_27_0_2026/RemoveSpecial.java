package Date_27_0_2026;


public class RemoveSpecial {

	public static void main(String[] args) {
		
		String str="Hello$%&^%&Java#";
		String clear=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(clear);
		
				
	}
}
