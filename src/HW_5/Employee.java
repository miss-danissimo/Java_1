package HW_5;

public class Employee {

    private String name;
    private String patronymic;
    private String surname;
    private String position;

    private String email;
    private String phoneNumber;

    private int age;
    private int salary;


    public Employee(String name, String patronymic, String surname, String position, String email, String phoneNumber, int age, int
            salary) {
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void info() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Employee [" +
                "Name='" + name + ' ' +
                ", Patronymic='" + patronymic + ' ' +
                ", Surname='" + surname + ' ' +
                ", Position='" + position + ' ' +
                ", Email='" + email + ' ' +
                ", PhoneNumber='" + phoneNumber + ' ' +
                ", Age=" + age +
                ", Salary=" + salary +
                ']';
    }
}
