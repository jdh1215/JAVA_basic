package day12;

public class Day12Book {
    private String title;
    private String writer;
    private boolean isRented = false;

    public Day12Book(String title, String writer) {
        this.title = title;
        this.writer = writer;
    }

    public void rentBook() {
        if (isRented == false) {
            this.isRented = true;
            System.out.println(this.title + "이(가) 대여되었습니다.");
        } else {
            System.out.println(this.title + "은(는) 이미 대여중입니다.");
        }
    }




}
