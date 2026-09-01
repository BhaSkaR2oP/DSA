import java.util.Scanner;

public class Switch {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine();

        switch(fruit){
            case "Mango":
                System.out.println("King of Fruit");
                break;
            case "Apple":
                System.out.println("A sweet red Fruit");
                break;
            case "Orange":
                System.out.println("A sour round fruit");
                break;
            case "Grapes":
                System.out.println("A sour small fruit");
                break;
            default:
                System.out.println("INVALID FRUIT");

        }
    }
}