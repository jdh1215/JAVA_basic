package project;

public class PrintUtil {

    public void jomusa(Reservation reservation) {
        if (reservation.getDiseasename().equals("진우")) {
            reservation.setDiseasename("고도비만");
        }
        System.out.println(
                "┌───────────────────────┐\n" +
                "│\t조무사 병원\t        │\n" +
                "├───────────────────────┤\n" +
                "│ 이름 : "+ reservation.getName() +"\t\t    │\n" +
                "│ 생년월일 : "+ reservation.getBirthday() +"\t│\n" +
                "│ 혈액형 : "+ reservation.getBloodtype() +"\t\t        │\n" +
                "├───────────────────────┤\n" +
                "│ 진료과 : "+ reservation.getDepartment()+" \t\t│\n" +
                "│ 병명 : "+ reservation.getDiseasename() + "\t\t\t│\n" +
                "├───────────────────────┤\n" +
                "│ 진료비 : "+ reservation.getPrice() +"원\t\t|\n" +
                "│ 결제완료 : "+reservation.getPayment() +"\t\t    │\n" +
                "└───────────────────────┘"
        );
    }


    public void catholic(Reservation reservation) {
        if (reservation.getDiseasename().equals("진우")) {
            reservation.setDiseasename("고도비만");
        }
        System.out.println(
                "\t가톨릭 병원\t\t\n" +
                        "--------------------------\n" +
                        " 이름 : "+ reservation.getName() +"\n" +
                        " 생년월일 : "+ reservation.getBirthday() +"\n" +
                        " 혈액형 : "+ reservation.getBloodtype() +"\n" +
                        "----------진료정보-----------\n" +
                        " 진료과 : "+ reservation.getDepartment() +"\n" +
                        " 병명 : "+ reservation.getDiseasename() +"\n" +
                        "----------진료비용-----------\n" +
                        " 진료비 : "+ reservation.getPrice() +"원\n" +
                        " 결제완료 : "+ reservation.getPayment() +""
        );
    }

    public void coma(Reservation reservation) {
        if (reservation.getDiseasename().equals("진우")) {
            reservation.setDiseasename("고도비만");
        }
        System.out.println(
                "[coma 병원]\n" +
                        "|> 이름 - "+ reservation.getName() + "|  혈액형 - "+reservation.getBloodtype()+"\n" +
                        "\t|> 생년월일 - "+ reservation.getBirthday() +"\n" +
                        "[진료 정보]\n" +
                        "|> 진료과 - "+ reservation.getDepartment() +"\n" +
                        "|> 병명 - "+ reservation.getDiseasename() +"\n" +
                        "[진료 비용]\n" +
                        "|> 진료비 : "+ reservation.getPrice() +"원\n" +
                        "|> 결제완료 : "+ reservation.getPayment() +""
        );
    }
}
