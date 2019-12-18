

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeManager {


    static Scanner sc = new Scanner(System.in);

    static public int number;
    private Object String;
    static Employee emplArr[];

    public void arrayOfEmployee()
    {
        emplArr = new Employee[number];

        for (int i = 0; i < emplArr.length; i++)
        {
      //      String name, String surname, int age, String birthday, String address, String gender, double salary, String position
            emplArr[i] = new Employee(setName(), setSurname(), setAge(), setBirthday(),
                    setAddress(), setGender(), setSalary(), setPosition());
        }

        for (Employee element : emplArr) {
            System.out.println("\n\n  Employee info sozdanux--\n" + element);
        }
    }


    public int NumbRabotnikov() {
        System.out.println("Vvedite kolichestvo rabotnikov-");
       int number = sc.nextInt();
       this.number = number;
      return number;

    }

    public String setName() {
        System.out.println("Vvedite imya rabotnika-");
        sc.nextLine();
        String text = sc.nextLine();
        return text;
    }

    public String setSurname() {
        System.out.println("Vvedite familiy' rabotnika-");
        String text1 = sc.nextLine();
        return text1;
    }

    public int setAge() {
        System.out.println("Vvedite vozrast rabotnika-");
        int age = 0 ;
        int i = 0;
        String line = sc.nextLine();
        while (!line.equals(age) &  i <=3) {
            try {
                age = 1;
                System.out.println("Vvedite civrami while 1");
                age = sc.nextInt();
                System.out.println("Poputka");

            } catch (InputMismatchException ref) {
                System.out.println("Oshibka vvoda, Vu ne pravilno vvodite vozrast");
                System.out.println("Vvedite civrami");

            i++;
//            while (line.equals(String)) {
                System.out.println("Vvedite civrami while 2");
              // age = 0;
//
//            }
            }
        }
     return age;
   }


    public String setBirthday() {
        System.out.println("Vvedite Birthday rabotnika-");
        sc.nextLine();
        String birthday=sc.nextLine();
        return birthday;
    }


    public String setAddress() {
        System.out.println("Vvedite address rabotnika-");
      //  sc.nextLine();
        String address = sc.nextLine();
        return address;
    }

    public String setGender() {
        System.out.println("Vvedite pol rabotnika-");
        String sex = sc.nextLine();
        return sex;
    }

    public Double setSalary() {
        System.out.println("Vvedite zarplaty rabotnika-");
        double salary = sc.nextDouble();
        return salary;
    }

    public String setPosition() {
        System.out.println("Vvedite pozitiyy' rabotnika-");
        sc.nextLine();
        String position = sc.nextLine();
        return position;
    }

    public void deistvie(int index)
    {
        index=sc.nextInt();
        switch (index)
        {
            case 1:
                delete();
                break;
            case 2:
                correct();
                break;
            case 3:
                addEmpl();
            default:

        }

    }

    private void addEmpl() {
       int newQuantoty= emplArr.length+1;
       Employee emplArrTemp[] = new Employee[newQuantoty];
       int i;
       for( i=0; i<=emplArrTemp.length; i++){
           for(int j=0; j<=emplArr.length; j++){
               emplArrTemp[i]=emplArr[j];
           }
           emplArrTemp[emplArrTemp.length]=new Employee(setName(), setSurname(), setAge(), setBirthday(),
                   setAddress(), setGender(), setSalary(), setPosition());
       }

    }

    private void correct() {
    }

    private void delete() {

       for (Employee element : emplArr ) {
            System.out.println("\n Employee info pered udaleniem--\n" + element);
       }
        System.out.println("Kogo vu xotite udalit?");
        int index = sc.nextInt();
        this.emplArr[index]=null;

        for (Employee element : emplArr ) {
            System.out.println("Employee info posle ydaleniya--\n" + element);
        }

    }


}