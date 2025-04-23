import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 class EVoteSystem {

    private static Map<String, Integer> candidates = new HashMap<>();

    public static void main(String[] args) {
        initializeCandidates();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("E-Vote System");
            System.out.println("1. View Candidates");
            System.out.println("2. Vote");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayCandidates();
                    break;
                case 2:
                    vote(scanner);
                    break;
                case 3:
                    System.out.println("Exiting E-Vote System");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void initializeCandidates() {
        candidates.put("Candidate 1", 0);
        candidates.put("Candidate 2", 0);
        candidates.put("Candidate 3", 0);
    }

    private static void displayCandidates() {
        System.out.println("Candidates:");
        for (String candidate : candidates.keySet()) {
            System.out.println(candidate);
        }
    }

    private static void vote(Scanner scanner) {
        System.out.println("Enter the name of the candidate you want to vote for:");
        String candidateName = scanner.next();

        if (candidates.containsKey(candidateName)) {
            candidates.put(candidateName, candidates.get(candidateName) + 1);
            System.out.println("Vote for " + candidateName + " registered successfully.");
        } else {
            System.out.println("Invalid candidate name. Please enter a valid candidate name.");
        }
    }
}