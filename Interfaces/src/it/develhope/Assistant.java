package it.develhope;

public class Assistant extends CollegePerson implements LearningPerson, TeachingPerson {

    boolean isGoingToBeAPhD;

    public Assistant(String name,String surname, int id, boolean willBeAPhD){
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.isGoingToBeAPhD = willBeAPhD;

    }

    @Override
    public void studyAtHome() {
    }

    @Override
    public void teachToOtherPeople() {
    }
}
