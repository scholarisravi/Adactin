package org.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void generatejvm(String Json) {
 
		File file = new File(System.getProperty("user.dir") + "\\AdactinCucumber\\report");
		Configuration con = new Configuration(file, "Adactinhotel");
		con.addClassifications("Platform", "Windows10");
		con.addClassifications("Browsername", "GoogleChrome");
		con.addClassifications("BrowserVersion", "91.0");
		con.addClassifications("Sprint number", "24");
		
		List<String>list = new ArrayList<String>();
		list.add(Json);
		
		ReportBuilder r = new ReportBuilder(list,con);
		r.generateReports();	

	}

}
