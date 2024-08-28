package com.revature.lists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
        List<String> teamA = new LinkedList<String>();

        teamA.add("Pratik");
        teamA.add("Abhijeet");
        teamA.add("Narayan");
        teamA.add("Charan");
        teamA.add("Ankit");
        teamA.add("Faizan");
        teamA.add("Manjeet");
        teamA.add("Pranav");
        teamA.add(1,"Tara");
        
        System.out.println("Team Members: " + teamA);
        
        teamA.remove("Pranav");
        teamA.remove(5);
        // teamA.removeFirst();
        // teamA.removeLast();
        
        System.out.println("After deleting: ");
        
        for(String s:teamA)
        {
        	System.out.println(s);
        }
        
        teamA.set(3,"Pattanshetti");
        
        System.out.println("Updated List: ");
        
        Iterator<String> iterator = teamA.iterator();

        System.out.println("Team Members:");
        while (iterator.hasNext()) {
            String member = iterator.next();
            System.out.println(member);
        }
    }

}
