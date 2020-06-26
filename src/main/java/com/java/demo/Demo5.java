package com.java.demo;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Demo5 {
	public static void main(String[] args) {
		try {
			//FileReader file = new FileReader("C:\\Users\\NAVEENKUMAR\\Desktop\\db.properties");
			Properties properties = System.getProperties();
			Set set = properties.entrySet();
			
			Iterator itr = set.iterator();
			properties.store(new FileWriter("fileInfo.properties"), "file info added");
			while (itr.hasNext()) {
				Map.Entry entry = (Map.Entry) itr.next();
				System.out.println(entry.getKey()+" = "+entry.getValue());
			}
			//System.out.println(properties.getProperty("user"));
			//System.out.println(properties.getProperty("password"));
			
		} catch (Exception e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
