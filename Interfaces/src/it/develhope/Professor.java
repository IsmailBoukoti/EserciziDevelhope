package it.develhope;

public class Professor extends CollegePerson implements TeachingPerson{

    String teachingSubject;

    public Professor(String name, String surname, int id, String teachingSubject){
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.teachingSubject = teachingSubject;
    }

    @Override
    public void teachToOtherPeople() {
    }
}
