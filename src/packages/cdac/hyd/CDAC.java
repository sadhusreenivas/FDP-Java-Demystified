package packages.cdac.hyd;

import packages.polytech.*; // implicit => Poly
import packages.iti.ITI; // explicit import

public class CDAC { // main

	public static void main(String[] args) {
		
      Poly poly = new Poly(100);
      System.out.println(poly); // poly.toString()
      
      ITI iti = new ITI(50);
      System.out.println(iti);
      
      // FQN
      packages.engg.cs.Engg engg = new packages.engg.cs.Engg(60);
      System.out.println(engg);
		
	}

}
