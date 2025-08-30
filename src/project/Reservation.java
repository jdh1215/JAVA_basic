package project;

public class Reservation {
    private String name;
    private String birthday;
    private String bloodtype;
    private String Department;
    private String diseasename;
    private String payment;
    private  int price;

    public Reservation(String name, String birthday, String bloodtype, String department, String diseasename, String payment , int price) {
        this.name = name;
        this.birthday = birthday;
        this.bloodtype = bloodtype;
        Department = department;
        this.diseasename = diseasename;
        this.payment = payment;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getDiseasename() {
        return diseasename;
    }

    public void setDiseasename(String diseasename) {
        this.diseasename = diseasename;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
