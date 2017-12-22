package com.fazlaysapaylas.utils;

import java.util.ResourceBundle;

public class ResourceManager {
	
	  private static final ResourceBundle messages = ResourceBundle.getBundle("com.fazlaysapaylas.utils.MessagesBundle");
	 // public static Enumeration bundleKeys = labels.getKeys();
	  
	  public ResourceManager(){
		  
	  }
	  
	  public static String getStringValue(String key){		  
		  return messages.getString(key);		  
	  }
	  
	  
//	  public static void main(String[] args) {
//		  while (bundleKeys.hasMoreElements()) {
//			    String key = (String)bundleKeys.nextElement();
//			    String value = messages.getString(key);
//			    System.out.println("key = " + key + ", " + "value = " + value);
//			}
//	}

}
