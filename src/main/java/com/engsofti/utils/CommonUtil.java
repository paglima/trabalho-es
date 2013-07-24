package com.engsofti.utils;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class CommonUtil {
	
	
	public static DateTime stringToDateTime(String dataHora){
		DateTimeFormatter formatDate = DateTimeFormat.forPattern("dd/MM/YYYY HH:mm:ss");
		DateTime data = formatDate.parseDateTime(dataHora);
		return data;
	}

}
