package com.gitproject;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerialTesting {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		
		/*Students student=new Students(100, "iqbal ali", "male");
		
		
		FileOutputStream file=new FileOutputStream("F:\\serializeObject\\objects");
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(file);
		objectOutputStream.writeObject(student);
		file.close();
		objectOutputStream.close();
		
		System.out.println("object is serialized...");*/
		
		
		FileInputStream fileInputStream=new FileInputStream("F:\\serializeObject\\objects");
		ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
		
		Students student=(Students) objectInputStream.readObject();
		
		System.out.println("object values are  "+student.getRollNumber()+" "+student.getName()+" "+student.getSex());
		
		
		
	}
}
