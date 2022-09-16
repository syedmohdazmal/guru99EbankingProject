package org.testng.annotations;

public class DataProvider {
	
	
	public Object[][] setData()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="azmal@rediffmail.com";
		data[0][1]="azmal1234";
		data[1][0]="syedmohd@rediffmail.com";
		data[1][1]="syedmohd908776";
		data[2][0]="zeenath@rediffmail.com";
		data[2][1]="zeenath908776";
	
		return data;

}}
