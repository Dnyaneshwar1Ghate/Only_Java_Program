package AllProgram;

public class INTtoBiNAry {
	
	public static void main(String[] args) {
		
		int num = 10;
		String binary = Integer.toBinaryString(num);   
		int decimal = Integer.parseInt(binary, 2);   
		System.out.println(binary);
		System.err.println(decimal);
	}

}
