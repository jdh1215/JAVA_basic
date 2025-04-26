package day15;

public class Chef extends Employee{
    public Chef(String name, String role) {
        super(name, role);
    }

    @Override
    public void performDuties(){
        System.out.println(getName() + "이(가) 요리합니다.");
    }
}
