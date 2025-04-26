package day15;

public  abstract class Teacher {
    protected String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("제 이름은 " + name + "입니다.");
    }

    public abstract void teachSubject();
}
