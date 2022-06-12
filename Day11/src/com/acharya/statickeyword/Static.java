//Program using static
package com.acharya.statickeyword;

public class Static {
	int rollno;
	String name;
	static String college = "AIT";
	Static(int r,String n){
		rollno = r;
		name = n;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
    public static void main(String args[]){
    	Static s1 = new Static(111,"Vikas");
    	Static s2 = new Static(112,"Sanjay");
    	s1.display();
    	s2.display();
    	
    	
    }

}
