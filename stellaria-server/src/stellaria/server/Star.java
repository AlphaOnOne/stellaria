package stellaria.server;

public class Star {

	public Visitable[] orbitals;
	
	public Gate[] gates;
	
	
	
	public FloatCoord pos;
	
	
	public int type;
		public static final int STAR_YELLOWDWARF = 0;
		public static final int STAR_REDDWARF = 1;
		public static final int STAR_REDGIANT = 2;
		public static final int STAR_BLUEGIANT = 3;
		public static final int STAR_SUPERGIANT = 4;
		public static final int STAR_WHITEDWARF = 5;
		public static final int STAR_BROWNDWARF = 6;
		public static final int STAR_PULSAR = 7;
		public static final int STAR_BINARY = 8;
	
	
		
		public void generate(){
			
		}
	
	
}
