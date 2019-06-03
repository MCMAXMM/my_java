package com.dh.ch14.reflection;

import java.lang.reflect.*;
import java.util.Date;

public class MethodReflectionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="java.util.Date";

		try{
		Class c1=Class.forName(name);
		System.out.println("class"+name+"\n{");
		getMethods(c1);
		System.out.println("}");
		
		}
		catch(ClassNotFoundException e){
			System.out.println("check name of the class");
			
		}

	}

	public static void getMethods(Class c1) {
		// TODO Auto-generated method stub
		Method[] methods = c1.getDeclaredMethods();
		for(int i=0;i<methods.length;i++){
			Method method = methods[i];
			Class retType = method.getReturnType();
			String name = method.getName();
			System.out.println(""+Modifier.toString(method.getModifiers()));
			System.out.println(""+retType.getName()+""+name+"(");
			Class[] paramTypes = method.getParameterTypes();
			for(int j=0;j<paramTypes.length;j++){
				if(j>0){
					System.out.println(",");
				}
				System.out.println(paramTypes[j].getName());
			System.out.println(");");
			}
			
		}
	}
}
