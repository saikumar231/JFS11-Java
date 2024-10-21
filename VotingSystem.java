package com.codegnan.day31;

import java.util.Scanner;

interface VoteCounter {
    int[] countVotes(String[] candidates, int[] votes);
    int determineWinner(int[] voteCounts);
}

class ElectionSystem implements VoteCounter {
    public int[] countVotes(String[] candidates, int[] votes) {
        int[] voteCounts = new int[candidates.length];
        for (int i = 0; i < candidates.length; i++) {
            voteCounts[i] = votes[i];
        }
        return voteCounts;
    }

    public int determineWinner(int[] voteCounts) {
        int maxVotes = voteCounts[0];
        int winnerIndex = 0;
        for (int i = 1; i < voteCounts.length; i++) {
            if (voteCounts[i] > maxVotes) {
                maxVotes = voteCounts[i];
                winnerIndex = i;
            }
        }

        // Check for ties
        int countMaxVotes = 0;
        for (int i = 0; i < voteCounts.length; i++) {
            if (voteCounts[i] == maxVotes) {
                countMaxVotes++;
            }
        }

        if (countMaxVotes > 1) {
            return -1; // Indicate a tie
        } else {
            return winnerIndex;
        }
    }
}

public class VotingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElectionSystem electionSystem = new ElectionSystem();

        System.out.print("Enter the number of candidates: ");
        int numCandidates = scanner.nextInt();

        String[] candidates = new String[numCandidates];
        int[] votes = new int[numCandidates];

        for (int i = 0; i < numCandidates; i++) {
            System.out.print("Enter the name of candidate " + (i + 1) + ": ");
            candidates[i] = scanner.next();
        }
        for (int i = 0; i < numCandidates; i++) {
            System.out.print("Enter votes for candidate " + candidates[i] + ": ");
            votes[i] = scanner.nextInt();
        }

        
        int[] voteCounts = electionSystem.countVotes(candidates, votes);

        System.out.println("\nVote Counts:");
        for (int i = 0; i < numCandidates; i++) {
            System.out.println(candidates[i] + ": " + voteCounts[i]);
        }

        int winnerIndex = electionSystem.determineWinner(voteCounts);
        if (winnerIndex == -1) {
            System.out.println("It's a tie!");
        } else {
            System.out.println("Winner: " + candidates[winnerIndex]);
        }

        scanner.close();
    }
}
