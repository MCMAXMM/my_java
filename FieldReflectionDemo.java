package com.dh.ch14.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldReflectionDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="java.util.Date";

		try{
		Class c1=Class.forName(name);
		System.out.println("class"+name+"\n{");
		getFields(c1);
		System.out.println("}");	
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
			
		}

	}

	public static void getFields(Class c1) {
		// TODO Auto-generated method stub
		Field[] fields = c1.getDeclaredFields();
		for(int i=0; i<fields.length;i++){
			Field field=fields[i];
			Class type=field.getType();
			String name=field.getName();
			System.out.println(""+Modifier.toString(field.getModifiers()));
			System.out.println(""+type.getName()+""+name+";");
		}
	}
}
