package com.syntax.class13JavaAdnvance2;

public class StringBuilderDemo1 {

	public static void main(String[] args) {
		//REVERSING WORDS 
		//STRING BUILDER IS MUTABLE, STORE VALUES WITHOUT REASSIGNING THE VALUE AND IS FAST COMPARE TO STRING 
		//STRING IS NOT MUTABLE ONCE STORED CAN NOT BE CHANGE, USE LESS MEMORY BUT IT TAKES LONGER TIME TO FIND THE VALUE STORE AND IT NEEDS TO REASSIGN VALUE 
		StringBuilder str=new StringBuilder("Hello");
		str.reverse();
		System.out.println(str);

		String s=new String("hahahah");
		System.out.println(s.toUpperCase());
		StringBuilder st=new StringBuilder("jajajajaj");
		System.out.println(st.reverse());
		//s.reverse();-->not possible with a normal string
		// String and StringBuilder both are classes that we can use to store and
		// manipulate characters
		// But String is immutable and String builder is mutable
		// when we make a lot of changes to a String it creates multiple copies inside
		// your memory and it can be very slow
		// because of this reason because for ervery change a new variable is created
	}

}
