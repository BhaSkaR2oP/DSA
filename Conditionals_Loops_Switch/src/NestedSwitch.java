import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employye ID:");
        int EmpID=sc.nextInt();
        System.out.print("Enter Department:");
        String dept=sc.next();

        switch(EmpID){
            case 1-> System.out.println("Bhaskar");
            case 2-> System.out.println("Rahul");
            case 3->{
                System.out.println("Employee No. 3");
                    switch(dept){
                        case "IT"-> System.out.println("IT Department");
                        case "SDE"-> System.out.println("Software Department");
                        default-> System.out.println("Invalid Department");
                }
            }
            default -> System.out.println("Invalid Employee ID");
        }
    }
}