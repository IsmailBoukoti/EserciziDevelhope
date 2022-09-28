public class Main {
    public static void main(String[] args) {
    CompetitionRules competitionRules = CompetitionRules.getInstance();
        System.out.println(competitionRules.printRules());

    Team teamA = new Team();
        teamA.teamName = "Red Team";
            teamA.p1.name = "Ismail";
            teamA.p1.yearsOfExperience = 0;
            teamA.p1.programmingLanguage = "Java";

            teamA.p2.name = "Alex";
            teamA.p2.yearsOfExperience = 0;
            teamA.p2.programmingLanguage = "Javascript";

    Team teamB = new Team();
        teamB.teamName = "Blu Team";
            teamB.p1.name = "Luigi";
            teamB.p1.yearsOfExperience = 0;
            teamB.p1.programmingLanguage = "C++";

            teamB.p2.name = "Marco";
            teamB.p2.yearsOfExperience = 0;
            teamB.p2.programmingLanguage = "Python";

        System.out.println(teamA.printDetails());
        System.out.println(teamB.printDetails());

    }
}
