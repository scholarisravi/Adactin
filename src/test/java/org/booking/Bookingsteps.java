package org.booking;

import org.utilities.Baseclass;
import org.utilities.Pojoclass;

public class Bookingsteps extends Baseclass {
	
	private void bookingclick() {
		Pojoclass pj= new Pojoclass();
		
		click(pj.getRadio());
		click(pj.getContinue());

	}

}
