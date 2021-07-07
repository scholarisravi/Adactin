package org.fill;

import org.utilities.Baseclass;
import org.utilities.Pojoclass;

public class Fillingform extends Baseclass{
	
	private void fill() {
		Pojoclass pj = new Pojoclass();
		fill(pj.getFirstname(), "Ravishankar");
		
	}

}
