package week10.day1;

import java.util.Arrays;
import java.util.Stack;

import org.junit.Test;

public class SlimplifyPath {
	
	@Test
	public void example1()
	{
		String path="/home/";
		findSimplePath(path);
	}

	private String findSimplePath(String path) {
		// TODO Auto-generated method stub
		
		   Stack<String> st = new Stack<>();
	        StringBuilder sb = new StringBuilder();
	        String[] p =path.split("/");
	        System.out.println(Arrays.toString(p));
	        for(int i=0;i<p.length;i++){
	            if(!st.isEmpty()  && p[i].equals("..")) st.pop();
	            else if(!p[i].equals("") && !p[i].equals(".") && !p[i].equals(".."))
	                st.push(p[i]);
	        }
	        
	        
	        if(st.isEmpty()) return "/";
	        String res="";
	          while(!st.empty())
	            res="/"+st.pop()+res;
	        
	        return res;
		
	}

}
