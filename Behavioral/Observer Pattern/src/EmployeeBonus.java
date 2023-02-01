public class EmployeeBonus extends Observer{

    public EmployeeBonus(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Employee Salary = " + this.subject.getSalary()*2);
    }
}
