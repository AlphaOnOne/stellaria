package stellaria.server;

public class Messenger {

	
	
	public static final int ERROR = 0;
	public static final int NOTIFICATION = 1;
	public static final int VERBOSE = 2;
	
	
	
	public static void print(int flag,String mes){
		switch(flag){
		  case 0:
			  System.out.println("[ERROR] "+mes);
			  break;
		  case 1:
			  System.out.println("[NOTIFY] "+mes);
			  break;
		  case 2:
			  System.out.println("[DEBUG] " +mes);
		}
		
	}
}
