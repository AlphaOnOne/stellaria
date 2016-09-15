package stellaria.server;

public class Star {

	public Visitable[] orbitals;
	
	public Gate[] gates;
	
	public String name = "null";
	
	
	
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
			type = (int) Math.round(Math.random()*8);
			
			
			name = "";
			String[] initials = {"k","g","d","t","s","h","r","j","sh","th"};
			String[] medials = {"a","u","i","o"};
			String[] finals = {"","n","m","f","z","s","sh"};
			int syllables = 3;
			
			for(int i = 0;i<syllables;i++){
				name = name + initials[(int) Math.round(Math.random()*(initials.length-1))];
				name = name + medials[(int) Math.round(Math.random()*(medials.length-1))];
				name = name + finals[(int) Math.round(Math.random()*(finals.length-1))];
			}
			name=capitalize(name);
			
			
		}
		private String capitalize(final String line) {
			   return Character.toUpperCase(line.charAt(0)) + line.substring(1);
			}
	
	
}
