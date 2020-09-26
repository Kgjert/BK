package bk.core;

public class BkCalculator {

	
	
	
	
	
	public double azimuth() {
		return ((-Math.atan2(y2-y1,x2-x1)*3200.0/Math.PI)+8000)%6400.0;
	}
	
	public double distance(){
		 if(Integer.toString(x1).length()==4 && Integer.toString(y1).length()==4 && 
				 Integer.toString(x2).length()==4 && Integer.toString(y2).length() == 4){
		 return Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)))*10;
		 }
	
	}
	
}
