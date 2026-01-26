/*
 8. GamerZone – High Score Ranking System (Quick Sort)
Story: 
	● A global multiplayer game needs to rank thousands of players in real-time based on their
	  scores after every match. The list is dynamic, large, and often unsorted. 
	● Quick Sort is used to reorder players quickly for leaderboards.
Concepts Involved:
	● Quick Sort
	● Sorting dynamic, large datasets
	● Performance-driven solution
*/
package com.day8.gamerzone;

public class GamerZoneApp {
	public static void main(String[] args) {
		LeaderboardManager manager = new LeaderboardManager();

		// Added example players after some matches (unsorted)
		Player[] leaderboard = {
		        new Player("NovaStrike", 12450, "Asia"),
		        new Player("EliteWolf", 9800, "Europe"),
		        new Player("CrimsonValkyrie", 15670, "NA"),
		        new Player("IronRonin", 14230, "Asia"),
		        new Player("FrostByte", 8750, "Europe"),
		        new Player("StormBreaker", 19840, "NA"),
		        new Player("CyberReaper", 11220, "SA"),
		        new Player("LunarPhantom", 16780, "Asia"),
		        new Player("NightSpecter", 13450, "Europe"),
		        new Player("InfernoLord", 14560, "NA")
		};


		System.out.println("Before sorting (unsorted scores):");
		manager.showTopPlayers(leaderboard, 10);
		System.out.println();

		// Sort using Quick Sort
		manager.sortLeaderboard(leaderboard);

		System.out.println("After Quick Sort - Global Leaderboard (Top 10):");
		manager.showTopPlayers(leaderboard, 10);

		System.out.println("\nTotal players ranked: " + leaderboard.length);
	}
}