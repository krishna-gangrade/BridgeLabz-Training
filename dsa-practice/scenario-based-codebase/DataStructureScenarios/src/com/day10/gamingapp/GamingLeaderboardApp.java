
/*
2. AVL Tree
Story: Gaming App - Real-Time Leaderboard
	Gamers earn and lose points rapidly.
Scenarios:
	● 🔹 Scenario 1: Insert/Update Player — New players join or existing ones gain points.
	● 🔹 Scenario 2: Display Top Players — Return top 10 players in rank.
	● 🔹 Scenario 3: Remove Player — Handle user bans or exits efficiently.
*/

package com.day10.gamingapp;

public class GamingLeaderboardApp {

    public static void main(String[] args) {
        AVLLeaderboard leaderboard = new AVLLeaderboard();

        System.out.println("===============================================================");
        System.out.println("                    REAL-TIME GAMING LEADERBOARD");
        System.out.println("===============================================================");

     // Scenario 1: Players join / gain points
        leaderboard.insertOrUpdate(new Player("uid_901aa", "IronWolf",   13200, "EU"));
        leaderboard.insertOrUpdate(new Player("uid_772bb", "PixelStorm", 18950, "Asia"));
        leaderboard.insertOrUpdate(new Player("uid_663cc", "NovaBlade",  22100, "NA"));
        leaderboard.insertOrUpdate(new Player("uid_554dd", "EchoRider",  16750, "SA"));
        leaderboard.insertOrUpdate(new Player("uid_445ee", "Vortex",     19800, "EU"));

        System.out.println("Top 5 players after initial joins:");
        leaderboard.showTopPlayers(5);

        // Simulate score changes
        System.out.println("\nAfter some matches:");
        leaderboard.insertOrUpdate(new Player("uid_901aa", "IronWolf",   14800, "EU"));   // +1600
        leaderboard.insertOrUpdate(new Player("uid_772bb", "PixelStorm", 18100, "Asia")); // -850

        leaderboard.showTopPlayers(5);

        // Scenario 3: Remove player (banned)
        System.out.println("\nPlayer 'NovaBlade' banned → removed");
        leaderboard.remove("uid_663cc");

        System.out.println("\nUpdated leaderboard:");
        leaderboard.showTopPlayers(10);

        System.out.println("\nTotal active players: " + leaderboard.getPlayerCount());
        System.out.println("===============================================================");
    }
}
