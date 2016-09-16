package stellaria.server;

public class StellariaServer {

	public static boolean verbose = false;
	
	
	public static void main(String[] args) {
		new StellariaServer().start(args);

	}
	
	public void start(String[] arg){
		
		for(int i=0;i<arg.length;i++){
			switch(arg[i]){
			  case "-v":
				verbose=true;  
				Messenger.print(Messenger.NOTIFICATION, "Starting in verbose mode.");
				break;
			  default:
				break;
			}
			
			Visualizer vis = new Visualizer();
			Cluster clus = new Cluster();
			clus.generate(15);
			vis.visualize(clus);
			
			
		}
	}

}
