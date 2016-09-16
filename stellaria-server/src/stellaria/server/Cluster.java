package stellaria.server;

import java.util.Random;

public class Cluster {

	public final float minDistance = 0.2f;
	
	public Star[] stars;
	
	
	
	
	public void generate(int size){
		Random rand = new Random();
		//generate the clusters stars
		stars[size] = new Star();
		for(int i = 0;i<size;i++){
			stars[i].generate();
			stars[i].pos = new FloatCoord((1.0f - -1.0f) * rand.nextFloat() + -1.0f,(1.0f - -1.0f) * rand.nextFloat() + -1.0f);
				for(int p = 0;p<size;p++){
					if(p==i){
						continue;
					}
					if(stars[p].pos == null){
						continue;
					}
					
					
					//Please excuse this bullshit line
					//its the distance formula, so dont
					//touch it, it ain't gonna change
					//DEAR ORACLE: IMPLEMENT ^ FOR FLOATS
					if(Math.sqrt(
						Math.pow((stars[p].pos.x-stars[i].pos.x),2)
						+
						Math.pow((stars[p].pos.y-stars[i].pos.y),2))
					<minDistance){
						i--;
						continue;
					}
				}
			
		}
		
		
		
		
		
	}
}
