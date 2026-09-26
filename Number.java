public class Number {
    public static void main(String[] args) {

        int number = 405;
        //if(number % 2 ==0) {
           // System.out.println("The number is even");
       // } else {
           // System.out.println("The number is odd");
      //  }
 
      // Let's use the ternary operator

      String EVENorODD = (number % 2 ==0) ? "EVEN" : "ODD";

System.out.println("The number is " + EVENorODD);

}
}
