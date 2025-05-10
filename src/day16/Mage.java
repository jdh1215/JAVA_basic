package day16;

public class Mage implements Attackable,Healable{
    @Override
    public void attack() {
        System.out.println("홯하");
    }

    @Override
    public void heal() {
        System.out.println("치유줄게");
    }
}
