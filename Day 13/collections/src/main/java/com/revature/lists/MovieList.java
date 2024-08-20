package com.revature.lists;
import java.util.*;

public class MovieList {
	public static void main(String args[])
	{
		ArrayList <Movie> movies=new ArrayList<Movie>();
	
		movies.add(new Movie("Money Heist", 8.3, 2015));
		movies.add(new Movie("Mirzapur", 8.7, 1977));
		movies.add(new Movie("The Family Man", 8.8, 1980));
		movies.add(new Movie("Kota Factory", 8.4, 1983));
		movies.add(new Movie("Patal Lok", 7.9, 2020));
		
		Collections.sort(movies);
		System.out.println(movies);
		
		System.out.println("Movies after sorting : ");
		for (Movie movie: movies)
		{
			System.out.println(movie.getName() + " " +
							movie.getRating() + " " +
							movie.getYear());
		}
	}

}
