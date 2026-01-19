package com.day6.artexpo;

/*
9. ArtExpo – Sort Artists by Registration Time (Insertion Sort)
Story: 
	● At an art exhibition, artists register throughout the day. 
	● The system continuously adds each entry and maintains a sorted list by registration time for booth assignment. 
	● Insertion Sort fits well due to the incremental nature.
Key Concepts:
	● Real-time insertion
	● Nearly sorted data
	● Time-based ordering
*/

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

public class ArtExpoApp {
    public static void main(String[] args) {
		System.out.println("============== ArtExo Exhibition ==============\n");
		
		Exhibition exhibition = new Exhibition();
		
		// Added example artists
		List<Artist> artists = Arrays.asList(
				new Artist("A001", "Prashant Kumar Sharma", LocalTime.of(16, 01)),
				new Artist("A002", "Gautam Kumar", LocalTime.of(02, 41)),
				new Artist("A003", "Aryaman Kushwaha", LocalTime.of(23, 27)),
				new Artist("A004", "Pratham Kacher", LocalTime.of(05, 29)),
				new Artist("A005", "Krishna Gandrade", LocalTime.of(12, 35)),
				new Artist("A006", "Priyanshu Kumar", LocalTime.of(14, 58))
				); 
		
		for(int i = 0; i < artists.size(); i++) {
			Artist artist = artists.get(i);
			System.out.println(">> New Artist arrived: " + artist.getName());
			exhibition.addArtist(artist);
			exhibition.printArtists();
		}
		
		System.out.println("\n=========== Finished Artists Registration =============");
	}
}