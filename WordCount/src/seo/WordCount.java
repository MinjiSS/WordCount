package seo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) throws FileNotFoundException {
	    HashMap map = new HashMap();

	    String path = WordCount.class.getResource("").getPath(); 
	    
	    Scanner input = new Scanner(new File(path + "test.txt"));
	    while (input.hasNext()) {
	      String word = input.next();
	      
	      if(map.containsKey(word)) {
	        Integer count = (Integer)map.get(word);
	        map.put(word, new Integer(count.intValue() + 1));
	      } else {
	        map.put(word, new Integer(1));
	      }
	    }
	    
	    ArrayList arraylist = new ArrayList(map.keySet());
	    Collections.sort(arraylist);
	    
	    for (int i = 0; i < arraylist.size(); i++) {
	      String key = (String)arraylist.get(i);
	      Integer count = (Integer)map.get(key);
	      System.out.println(key + " : " + count);
	    }

	}

}
