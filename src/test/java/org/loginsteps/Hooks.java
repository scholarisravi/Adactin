package org.loginsteps;

import java.util.Date;

import org.utilities.Baseclass;

public class Hooks extends Baseclass {
	
	private void BeforeRunner() {
		Date d = new Date();
				System.out.println(d);
	
	}
	
	private void AfterRunner() {
		closebrowser();
				Date d = new Date();
		System.out.println(d);
		
	}

}
