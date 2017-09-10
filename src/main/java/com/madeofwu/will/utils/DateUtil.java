package com.madeofwu.will.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
public static String ChangeDateDay(){
	
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
	Date currentTime = new Date();
	String time = simpleDateFormat.format(currentTime).toString();
	return time;
}
public static String ChangeDateSecond(){
	
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date currentTime = new Date();
	String time = simpleDateFormat.format(currentTime).toString();
	return time;
}
}
