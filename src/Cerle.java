
public class Cerle {
	
	private Point centre;
	private double Rayon;
	
	public Cerle(Point centre){
		this.centre=centre;
		this.centre=new Point();
	}
	
	public Cerle(Point centre,double Rayon){
		this.centre=centre;
		this.Rayon=Rayon;
	}
	
	public Point getCentre(){
		return centre;
	}
	
	public double getRayon(){
		return Rayon;
	}
	
	public void setCentre(Point centre){
		this.centre=centre;
	}
	
	public void setRayon(double Rayon){
		this.Rayon=Rayon;
	}
	public double arrondir(double A,double B){
		return (double)((int)(A*Math.pow(10,B)+.5))/Math.pow(10, B);
	}
	
	public double perimetre(){
		return arrondir(2*Math.PI*this.Rayon,2);
	}
	
	public Cerle Symetrie(){
		return new Cerle(centre.imagePoint(),Rayon);
	}
	
	
	
}
