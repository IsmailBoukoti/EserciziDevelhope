package it.develhope;

public class Test {
    public static void main(String[] args) {
        Professor professor = new Professor("Mario","Rossi", 456, "Programming");
        Student student = new Student("Luca", "Bianchi", 647,2022);
        Assistant assistant = new Assistant("Lucia", "Verdi", 326,true);

        professor.goToCollege();
        student.goToCollege();
        assistant.goToCollege();

        professor.teachToOtherPeople();
        student.studyAtHome();
        assistant.studyAtHome();
        assistant.teachToOtherPeople();

    }
}
