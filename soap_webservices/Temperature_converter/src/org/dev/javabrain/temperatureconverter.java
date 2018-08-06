package org.dev.javabrain;

import https.www_w3schools_com.xml.TempConvert;
import https.www_w3schools_com.xml.TempConvertSoap;

public class temperatureconverter {

	public static void main(String[] args)
	{
	
		TempConvert tconv = new TempConvert();
		TempConvertSoap tconsoap=tconv.getTempConvertSoap();
		String res=tconsoap.celsiusToFahrenheit("95");
		System.out.println("temperature in fahrenheit scale is "+res);
		
	}

}
