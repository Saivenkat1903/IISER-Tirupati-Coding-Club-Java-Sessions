public class evenOdd { 
    public static void main(String[] args) {
        int num = 421;

        int condition = num%2;          //modulo function in Java is denoted by % , it gives the remainder when divieded by something
        System.out.println(condition); 

        if(num%2 == 0){                                 //== is the syntax to check if 2 numbers are equal to each other
            System.out.println("Number is even");       //This line of code only runs if above condition evaluates to True
        }else{
            System.out.println("Number is odd");       //This line of code runs if the above "if" statement evalutates to false 
        }
    }
}
