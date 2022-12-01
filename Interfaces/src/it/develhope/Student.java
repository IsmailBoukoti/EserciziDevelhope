package it.develhope;

public class Student extends CollegePerson implements LearningPerson{

    int academicYear;

    public Student(String name, String surname, int collegeId, int academicYear){
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
        this.academicYear = academicYear;

    }

    @Override
    public void studyAtHome() {}
}
