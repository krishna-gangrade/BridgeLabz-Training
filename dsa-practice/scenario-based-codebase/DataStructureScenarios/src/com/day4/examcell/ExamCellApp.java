/*
5. ExamCell – Student Rank Generator (Merge Sort)
Story: 
	● An online exam system collects scores from multiple test centers. 
	● To publish a state-level rank list, student scores are merged and 
	● sorted using Merge Sort, ensuring performance and accuracy.
Key Concepts:
	● Merging pre-sorted center-wise scores
	● Sorting across centers
	● High efficiency for big data
*/

package com.day4.examcell;

import java.util.Arrays;
import java.util.List;

public class ExamCellApp {
 public static void main(String[] args) {
     ExamCell examCell = new ExamCell();

     System.out.println("==================== ExamCell – State Level Rank Generator ====================");
     System.out.println("Merging & sorting scores from all test centers using Merge Sort\n");

     // Added three test centers
     // each already sorted internally (by roll no or local rank)
     List<Score> centerIndore = Arrays.asList(
         new Score("MP01A001", "Krishna Gangrade",489, "Khandwa-01"),
         new Score("MP01A002", "Deepraj Singh", 412, "Khandwa-01"),
         new Score("MP01A003", "Sachin Raghuwanshi", 378, "Khandwa-01"),
         new Score("MP01A004", "Prateek Amrawanshi", 445, "Khandwa-01")
     );

     List<Score> centerBhopal = Arrays.asList(
         new Score("JH02B001", "Ankit Singh",  420, "PALAMU-02"),
         new Score("JH02B002", "Adya Aprajita",  398, "PALAMU-02"),
         new Score("JH02B003", "Manisha Tirkey", 456, "PALAMU-02"),
         new Score("JH02B004", "Alisha Tirkey",   389, "PALAMU-02")
     );

     List<Score> centerJabalpur = Arrays.asList(
         new Score("JH03C001", "Pratham Kumar",  432, "RANCHI-03"),
         new Score("JH03C002", "Pratham Kacher",  467, "RANCHI-03"),
         new Score("JH03C003", "Aryaman Kushwaha",  401, "RANCHI-03"),
         new Score("JH03C004", "Adarsh Anand",  415, "RANCHI-03")
     );

     System.out.println("Receiving sorted score lists from centers...");

     examCell.addCenterScores(centerIndore);
     examCell.addCenterScores(centerBhopal);
     examCell.addCenterScores(centerJabalpur);

     System.out.println("\nTotal students collected: " + examCell.getTotalStudents());
     System.out.println("Generating state-wide merit list using Merge Sort...");

     // Perform merge sort - highest marks first
     examCell.generateStateRankList();

     // Show top ranks
     examCell.displayTopRanks(10);
     System.out.println("Rank list published successfully.");
 }
}