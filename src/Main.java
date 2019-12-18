

import java.lang.String;
import java.util.Scanner;

public class Main {

    static int number, index;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        EmployeeManager employeeManager = new EmployeeManager();

        employeeManager.NumbRabotnikov();

        employeeManager.arrayOfEmployee();


        System.out.println("\n\n Chto Vu xotite sdelat'? \n" +
                "1. Udalit rabotnika\n" + "2. Ispravit dannue rabotnika\n" + "3. Dobavit rabotnika\n");


        employeeManager.deistvie(index);
       // index=sc.nextInt();


    }
}
