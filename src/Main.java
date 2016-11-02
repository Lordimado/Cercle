
public class Main {
		public static void main(String [] args){
			Point O = new Point();
			int r=4;
			Cerle C1 = new Cerle(O,r);
			
			System.out.println("* Creer deux cercles different dans l'espace");
			System.out.println("- Le cercle c1 : Centre O"+O.toString()+"et Rayon r="+r+" P�rimetre ="+C1.perimetre()+" Son image C1-1"+O.imagePoint()+"et Rayon r="+r);
			
			Point B=new Point(5);
			int ra=3;
			Cerle C2 = new Cerle(B,ra);
			System.out.println("- Le cercle c2 : Centre B"+B.toString()+"et Rayon r="+ra+" P�rimetre ="+C2.perimetre()+" Son image C2-1"+B.imagePoint()+"et Rayon r="+ra);
			
		}
}
