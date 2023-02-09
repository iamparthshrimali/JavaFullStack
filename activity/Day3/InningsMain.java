import java.util.Scanner;

class Innings {
    private String teamName;
    private String inningsName;
    private int runs;

    public Innings(String teamName, String inningsName, int runs) {
        this.teamName = teamName;
        this.inningsName = inningsName;
        this.runs = runs;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setInnigsName(String inningsName) {
        this.inningsName = inningsName;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public int getRuns() {
        return this.runs;
    }

    public String getInnigsName() {
        return this.inningsName;
    }

    public void displayInningsDetails() {
        System.out.println("Name: " + this.teamName);
        System.out.println("Scored : " + this.runs);
        if (this.inningsName.toLowerCase().equals("first"))
            System.out.println("Need " + (this.runs + 1) + " to win ");
        else
            System.out.println("Match ended");

    }
}

public class InningsMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the team name: ");
        String teamName = sc.nextLine();
        System.out.println("Enter session: ");
        String innigsName = sc.nextLine();
        if((!innigsName.toLowerCase().equals("first")) && (!innigsName.toLowerCase().equals("second")))
        {
            System.out.println("Invalid input, session can be first or second only");
            return;
        }
        System.out.println("Enter runs :");
        int runs = sc.nextInt();

        Innings innings = new Innings(teamName, innigsName.toLowerCase(), runs);

        innings.displayInningsDetails();
    }

}
