package Day_12_02_2026;

public class RemoveHash {
	
	public static void main(String[] args) {
		
		String str="sashag#$%%%$%$#kfjkaf&**&^&^%&^%&^$%^&$";
		String clean=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(clean);
	}

}
