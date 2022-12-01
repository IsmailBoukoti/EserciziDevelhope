public class CustomNumber {
   public int number;

   public CustomNumber(){
       double randomNumber = Math.floor(Math.random()*(12-1+1)+1);
       this.number = (int)randomNumber;
   }
   public  void getMultiplicationTable(){
       for (int i = 12; i >=0 ; i--) {
           int product = number * i;
           System.out.println("The product of " + number + " and " + i + " is: " + product);
       }
   }
}

