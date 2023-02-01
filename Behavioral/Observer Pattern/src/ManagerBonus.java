public class ManagerBonus extends Observer{
    public ManagerBonus(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Manager Bonus = " + this.subject.getSalary()*3 );
    }
}
