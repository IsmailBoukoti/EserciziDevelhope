public class Programmer {
    public String name;
    public int age;
    public boolean wearsGlasses;

    public void drinkCoffe(){
        System.out.println("Espresso is the secret!");
    }

    public String printDetails(){
        return name + " is a " + age + " years old " + "programmer" ;
    }

    public String hasGlasses(){
       return "is " + name + " wearing glasses? " + wearsGlasses;
    }




}
