public class Person {
    int age;
    public Person (){
        double randomAge = Math.floor(Math.random()*(80-5+1)+5);
        this.age = (int)randomAge;
    }
    public String getLifeStage(){
        String lifeStage = "";
        if (age<=12) {
            lifeStage = "Child";
        } else if (age>=13 && age<=19) {
            lifeStage = "Teen";
        } else if (age>=20 && age <=59) {
            lifeStage = "Adult";
        }else{
            lifeStage = "Senior Adult";
        }
        return lifeStage ;
    }
}
