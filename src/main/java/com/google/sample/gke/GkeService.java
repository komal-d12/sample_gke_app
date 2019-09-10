package com.google.sample.gke;

import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service
public class GkeService {

    public GkeService() {
        System.out.println("GkeService Constructor loaded");
    }

    public String greet() {
    	Calendar calendar = Calendar.getInstance();
    	StringBuffer strBuffer = new StringBuffer();
    	strBuffer.append("Hello from Sample GKE App. Current Time is: ");
    	strBuffer.append(calendar.get(Calendar.HOUR_OF_DAY));
    	strBuffer.append(":");
    	strBuffer.append(calendar.get(Calendar.MINUTE));
    	strBuffer.append(":");
    	strBuffer.append(calendar.get(Calendar.SECOND));
    	strBuffer.append(".");
    	System.out.println(strBuffer.toString());
        return "";
    }
}
