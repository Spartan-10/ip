package com.ip.JavaBasic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

public static void main(String[] args) {
//	List<Integer> list = Arrays.asList(4,4,1,3); 
//	
//	int max = Collections.max(list);
//	int min = Collections.min(list);
//	
//	
//	int a = (int) list.stream().filter(c -> c== max).count();
	
	String time = "07:05:45PM";
    String tArr[] = time.split(":");
    String AmPm = tArr[2].substring(2,4);
    int hh,mm,ss;
    hh = Integer.parseInt(tArr[0]);
    mm = Integer.parseInt(tArr[1]);
    ss = Integer.parseInt(tArr[2].substring(0,2));
    
    String checkPM = "PM",checkAM ="AM";
    int h = hh;
    if(AmPm.equals(checkAM) && hh==12)
    	h=0;
    else if(AmPm.equals(checkPM)&& hh<12)
    	h+=12;
    
    String s =String.format("%02d:%02d:%02d",h,mm,ss);
	System.out.println(s);
}
}
