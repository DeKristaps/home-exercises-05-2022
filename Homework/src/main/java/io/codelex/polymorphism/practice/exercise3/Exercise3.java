package io.codelex.polymorphism.practice.exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        Employee employee = new Employee("Ron", "Stone", "Rigas iela 21", 2213, "Teacher");
        Student student = new Student("Kristaps", "Denisovs", "Renges iela 1", 1123, 7.2);

        employee.display();
        student.display();

    }
}
