
public class Point {
		private double abcisse;
		private double ordonnee;

		public Point(){
			this.abcisse=0;
			this.ordonnee=0;
		}
		
		
		public Point(double abcisse){
			this.abcisse=abcisse;
			this.ordonnee=abcisse;
		}
		
		public Point(double abcisse,double ordonnee){
			this.abcisse=abcisse;
			this.ordonnee=ordonnee;
		}
		
	
		public double getAbcisse(){
			return abcisse;
		}
		
		public double getOrdonnee(){
			return ordonnee;
		}
		
		public void setAbcisse(double abcisse){
			this.abcisse=abcisse;
		}
		
		public void setOrdonnee(double ordonnee){
			this.ordonnee=ordonnee;
		}
		
		 public Point imagePoint() {
		        return new Point(-abcisse, ordonnee);
		  }
		
		public String toString(){
			return "("+this.abcisse+","+this.ordonnee+")";
		}
		
		
		
		
}
