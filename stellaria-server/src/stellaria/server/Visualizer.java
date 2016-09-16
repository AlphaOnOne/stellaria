package stellaria.server;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Visualizer extends JPanel {

	
	JFrame frame;
	
	
	public Star targetStar;
	public Planet targetPlanet;
	public Cluster targetCluster;
	
	
	public int mode = 0;
		public final int MODE_STAR = 0;
		public final int MODE_PLANET = 1;
		public final int MODE_CLUSTER = 2;
	
	public void visualize(Star star){
		mode = MODE_STAR;
		targetStar = star;
		
	}
	
	public void visualize(Planet planet){
		mode = MODE_PLANET;
		targetPlanet = planet;
		
	}
	
	public void visualize(Cluster cluster){
		mode = MODE_CLUSTER;
		targetCluster = cluster;
	}
	
	public void paintComponent(Graphics g) {
        super.paintComponent(g);       
        
        switch(mode){
        	case MODE_STAR:
        	  
        	  break;
        	case MODE_PLANET:
        	  
        	  break;
        	case MODE_CLUSTER:
        		for(int i = 0;i<targetCluster.stars.length;i++){
        			//another horrific line
        			g.fillOval((int)((targetCluster.stars[i].pos.x)*800), (int)((targetCluster.stars[i].pos.y)*800), 10, 10);
        			g.drawString(targetCluster.stars[i].name, (int)((targetCluster.stars[i].pos.x)*800), (int)((targetCluster.stars[i].pos.y)*800));
        			g.drawString(Integer.toString(targetCluster.stars[i].type), (int)((targetCluster.stars[i].pos.x)*800), (int)((targetCluster.stars[i].pos.y)*800+20));
        		}
        	  break;
        }
    }  
	
	public Visualizer(){
		frame = new JFrame("Visualizer");
		frame.setSize(800,800);
		frame.getContentPane().add(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
