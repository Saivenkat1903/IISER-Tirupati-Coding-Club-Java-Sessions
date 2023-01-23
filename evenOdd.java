public class evenOdd {
    public static void main(String[] args) {
        int num = 421;

        int condition = num%2;
        System.out.println(condition);

        if(num%2 == 0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
}
