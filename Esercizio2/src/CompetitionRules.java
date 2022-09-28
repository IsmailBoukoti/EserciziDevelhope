public class CompetitionRules {

    private static CompetitionRules competitionRules = new CompetitionRules();

    private String competitionRule1 = "Do not copy and paste from StackOverflow!";
    private String competitionRule2 = "Learn everyday!";
    private String competitionRule3 = "Be the best team!";

    private  CompetitionRules () {}


    public static CompetitionRules getInstance() {return competitionRules;};

    public String printRules(){
        return  competitionRule1 + " " + competitionRule2 + " " +  competitionRules.competitionRule3;
    }



}





