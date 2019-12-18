


public class Employee {

    private String name;
    private String surname;
    private int age;
    private String birthday;
    private String address;
    private String gender;
    private double salary;
    private String position;
    private String description;




    public Employee(String name, String surname, int age, String birthday, String address, String gender, double salary, String position) {
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.birthday=birthday;
        this.address=address;
        this.gender=gender;
        this.salary=salary;
        this.position=position;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString(){   //String name, String surname, int age, String birthday, String address, String gender, double salary, String position
        return ("name \t" + getName() + "\n"
                + "surname \t" +  getSurname() + "\n"
                + " age \t" + this.age + "\n"
                + "Birthday \t" + this.birthday + "\n"
                + "address \t" + this.address + "\n"
                +"gender \t" + this.gender + "\n"
                + "salary \t" + this.salary+ "\n"
                + "position \t" + this.position );

    }

}
