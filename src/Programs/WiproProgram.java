package Programs;

public class WiproProgram {

	public static void main(String[] args) {

		String str = "iloveabcdbecauseiworkwithabcq";
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (i <= str.length() - 3 && str.charAt(i) == 'a' && str.charAt(i + 1) == 'b' && str.charAt(i + 2) == 'c') {
				
				result=result+"Wipro";
				i=i+2;
				
			}else {
				result=result+str.charAt(i);
			}
		}
		System.out.println(result);
	}
}
