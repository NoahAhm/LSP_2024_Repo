package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;

public class VotingMachine {
    // Store candidates and their vote counts
    private Map<String, Integer> candidates;

    // Constructor to initialize the VotingMachine
    public VotingMachine() {
        candidates = new HashMap<>();
    }

    /**
     * Add a candidate to the voting machine.
     * @param name The name of the candidate.
     */
    public void addCandidate(String name) {
        if (!candidates.containsKey(name)) {
            candidates.put(name, 0);  // Add candidate with 0 votes initially
        } else {
            System.out.println("Candidate already exists.");
        }
    }

    /**
     * Cast a vote to the candidate with the given name.
     * @param name The name of the candidate.
     */
    public void castVote(String name) {
        if (candidates.containsKey(name)) {
            int currentVotes = candidates.get(name);
            candidates.put(name, currentVotes + 1);  // Increment vote count
        } else {
            System.out.println("Candidate not found.");
        }
    }

    /**
     * Returns a string representation of the voting results.
     * @return A string displaying each candidate and their vote count.
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            result.append("Candidate: ").append(entry.getKey())
                  .append(", Votes: ").append(entry.getValue()).append("\n");
        }
        return result.toString();
    }
}

/**
 * chaGPT to name variables and javadoc
 * StackOverflow to design addCandinate and castVote
 */
