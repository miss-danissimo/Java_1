package HW_5;

public class HW_5 {
    private static final int EMPLOYEES_COUNT = 5;
    private static final int MIN_AGE = 40;


    public static void main(String[] args) {

        Employee[] employees = new Employee[EMPLOYEES_COUNT];
        employees[0] = new Employee("Ivan", "Ivanovich", "Ivanov", "Tester", "ivanov@mail.ru", "+7123456789", 25, 370000);
        employees[1] = new Employee("Petr", "Petrovich", "Petrov", "Analyst", "petrov@mail.com", "+3456234098", 49, 430000);
        employees[2] = new Employee("Anna", "Petrovna", "Petrova", "Analyst", "petrova@mail.com", "+3456234097", 39, 410000);
        employees[3] = new Employee("Mike", "Nelson", "Good", "Software Engineer", "good@gmail.com", "+5456234341", 28, 480000);
        employees[4] = new Employee("Hank", "Sergeevich", "Popov", "Software Engineer", "popov@gmail.com", "+6456234931", 57, 290000);

        for (Employee employee : employees) {
            if (employee.getAge() > MIN_AGE) employee.info();
        }

    }
}
