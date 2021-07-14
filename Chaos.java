import java.util.Random;

public class Chaos{
	
	public static void main(String[] args){
		
		Random random = new Random();
		int result = 0;
		
		double[] vertX = {0.05, 0.5, 0.95};
		double[] vertY = {0.05, 0.8851646544,0.05};
		
		StdDraw.setXscale(0, 1);
		StdDraw.setYscale(0, 1);
		StdDraw.setCanvasSize(900, 900);
		drawTriangle();
		StdDraw.setPenColor(StdDraw.RED);
		
		double X; double Y;
		
		X = 0.05 + Math.random() * (0.95 - 0.05);
		
		if(X < 0.5) {
			Y = 0.05 + Math.random() * (X-0.05)*Math.tan(Math.PI / 3);
		}else {
			Y = 0.05 + Math.random() * (0.95-X)*Math.tan(Math.PI / 3);
		}
		
		StdDraw.filledCircle(X, Y, 0.0000001);
		
		// the initial dot is drawn. Now we need to do each algorithm
		
		
		while(true) {
			
		result = random.nextInt(3);
		
		switch(result) {
		 
		case 0 :
			StdDraw.setPenColor(StdDraw.RED);
			break;
			
		case 1 :
			StdDraw.setPenColor(StdDraw.GREEN);
			break;
			
		case 2 :
			StdDraw.setPenColor(StdDraw.BLUE);
			break;
		
		}
		
		X = (X + vertX[result]) / 2;
		Y = (Y + vertY[result]) / 2;
		StdDraw.filledCircle(X, Y, 0.001);
		
		}
		
	}
	
	public static void drawTriangle() {
		StdDraw.line(0.05, 0.05, 0.5, 0.8851646544);
		StdDraw.line(0.5, 0.8851646544, 0.95, 0.05);
		StdDraw.line(0.05, 0.05, 0.95, 0.05); 
	}
	
}