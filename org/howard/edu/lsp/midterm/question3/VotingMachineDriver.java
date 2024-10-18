package org.howard.edu.lsp.midterm.question3;

public class VotingMachineDriver {
    public static void main(String[] args) {
        VotingMachine vm = new VotingMachine();

        // Adding candidates
        vm.addCandidate("Alsobrooks");
        vm.castVote("Alsobrooks");

        // Adding more candidates and casting votes
        vm.addCandidate("Hogan");
        vm.castVote("Hogan");
        vm.castVote("Hogan");

        // Displaying results
        System.out.println(vm.toString());
    }
}
