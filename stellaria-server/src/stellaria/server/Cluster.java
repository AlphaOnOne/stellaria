package stellaria.server;

import java.util.Random;

public class Cluster {

	public final float maxDistance = 0.1f;
	
	public Star[] stars;
	
	
	
	
	public void generate(int size){
		Random rand = new Random();
		//generate the clusters stars
		stars = new Star[size];
		for(int i = 0;i<size;i++){
			stars[i] = new Star();
			stars[i].generate();
			stars[i].pos = new FloatCoord((float) Math.random(),(float) Math.random());

				}
			
		}
		
		
		
		
		
	}