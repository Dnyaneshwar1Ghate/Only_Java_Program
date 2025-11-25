package Basic;

public class SingletonClass {
	
	public static void main(String[] args) {
		
		Singleton singleton=Singleton.getInstance();
		
		System.out.println("Singleton instance "+singleton);
	}
	

}

class Singleton
{
	private static Singleton instance ;
	private Singleton() {
		
	}
	public static Singleton getInstance()
	{
		if(instance ==null)
		{
			instance=new Singleton();
		}
		return instance;
		
	}
	
}