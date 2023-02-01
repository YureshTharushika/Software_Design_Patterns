public class Main {
    public static void main(String[] args) {

        Subject subject = new Subject();

        new ManagerBonus(subject);
        new EmployeeBonus(subject);

        subject.setSalary(10000);
    }
}
