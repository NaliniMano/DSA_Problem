package week7.class_day1;

import java.util.Stack;

public class LogFolder {
	
	public void example1()
	{ String[] logs= {"d1/","d2/","./","d3/","../","d31/"};
	 minOperations(logs);
	}
	
	
	 public int minOperations(String[] logs) {
		 
		 Stack<String> st =new Stack();
	        for(String k : logs)
	        {
	            if(k.equals("../") )
	            {  
	                if(!st.isEmpty())
	                  st.pop();
	            }else if (k.equals("./"))
	            {
	                continue;
	            }else
	            {
	                st.push(k);
	            }

	        }
	        
	        return st.size();
	 }

}
