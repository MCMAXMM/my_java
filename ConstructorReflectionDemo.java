package com.dh.ch14.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class ConstructorReflectionDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="java.util.Date";
		try{
		Class c1=Class.forName(name);
		System.out.println("class"+name+"{");
		getConstructors(c1);
		System.out.println("}");
		
		}
		catch(ClassNotFoundException e){
			System.out.println("check name of the class");
			
		}

	}

	public static void getConstructors(Class c1) {
		// TODO Auto-generated method stub
		 Constructor[] constructors = c1.getDeclaredConstructors();
		 for(int i=0;i<constructors.length;i++){
			 Constructor c=constructors[i];
			 String name=c.getName();
			 System.out.println(" "+Modifier.toString(c.getModifiers()));
			 System.out.println(""+name+"(");
			 Class[]paramTypes=c.getParameterTypes();
			 for(int j=0;j<paramTypes.length;j++){
				 if(j>0){
					 System.out.println(",");
				 }
				 System.out.println(paramTypes[j].getName());
			 }
			 System.out.println(");");
		 }
	}
	

}
