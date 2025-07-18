import java.util.Scanner;

public class ConditionalDemoIfElseIf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your score on the exam: ");
        double score = sc.nextDouble();

        double firstTierScoreMin = 90.0;
        double secondTierScoreMin = 80.0;

        if (score >= firstTierScoreMin) {
            System.out.println("You scored in the first tier.");
        } else if (score >= secondTierScoreMin) {
            System.out.println("You scored in the second tier.");
        } else {
            System.out.println("Low grade. You did not score in the top two tiers :(");
        }
        sc.close();
    }
}
