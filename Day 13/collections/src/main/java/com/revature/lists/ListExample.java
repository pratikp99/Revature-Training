package com.revature.lists;
import java.util.*;

public class ListExample 
{
    public static void main(String[] args) {
        List<String> teamA = new ArrayList<>();

        teamA.add("Pratik");
        teamA.add("Abhijeet");
        teamA.add("Narayan");
        teamA.add("Charan");
        teamA.add("Ankit");
        teamA.add("Faizan");
        teamA.add("Manjeet");
        teamA.add("Pranav");
        
        System.out.println("Team Members: " + teamA);
        
        teamA.remove("Pranav");
        teamA.remove(5);
        
        System.out.println("After deleting: ");
        
        for(String s:teamA)
        {
        	System.out.println(s);
        }
        
        teamA.add("Raghav");
        
        System.out.println("Updated List: ");
        
        Iterator<String> iterator = teamA.iterator();

        System.out.println("Team Members:");
        while (iterator.hasNext()) {
            String member = iterator.next();
            System.out.println(member);
        }
    }
}
