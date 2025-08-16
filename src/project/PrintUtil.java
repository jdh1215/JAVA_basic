package project;

public class PrintUtil {

    public void jomusa(String name, String birthday, String bloodtype, String department, String diseasename, String price, String payment) {
        System.out.println(
                "┌───────────────────────┐\n" +
                "│\t조무사 병원\t        │\n" +
                "├───────────────────────┤\n" +
                "│ 이름 : "+ name +"\t\t    │\n" +
                "│ 생년월일 : "+ birthday +"\t│\n" +
                "│ 혈액형 : "+ bloodtype +"\t\t        │\n" +
                "├───────────────────────┤\n" +
                "│ 진료과 : "+ department+" \t\t│\n" +
                "│ 병명 : "+ diseasename + "\t\t\t│\n" +
                "├───────────────────────┤\n" +
                "│ 진료비 : "+ price +"\t\t|\n" +
                "│ 결제완료 : "+ payment +"\t\t    │\n" +
                "└───────────────────────┘"
        );
    }

    public void catholic(String name, String birthday, String bloodtype, String department, String diseasename, String price, String payment) {
        System.out.println(
                "\t가톨릭 병원\t\t\n" +
                        "--------------------------\n" +
                        " 이름 : "+ name +"\n" +
                        " 생년월일 : "+ birthday +"\n" +
                        " 혈액형 : "+ bloodtype +"\n" +
                        "----------진료정보-----------\n" +
                        " 진료과 : "+ department +"\n" +
                        " 병명 : "+ diseasename +"\n" +
                        "----------진료비용-----------\n" +
                        " 진료비 : "+ price +"\n" +
                        " 결제완료 : "+ payment +""
        );
    }

    public void coma(String name, String birthday, String bloodtype, String department, String diseasename, String price, String payment) {
        System.out.println(
                "[coma 병원]\n" +
                        "|> 이름 - "+ name + "|  혈액형 - "+bloodtype+"\n" +
                        "\t|> 생년월일 - "+ birthday +"\n" +
                        "[진료 정보]\n" +
                        "|> 진료과 - "+ department +"\n" +
                        "|> 병명 - "+ diseasename +"\n" +
                        "[진료 비용]\n" +
                        "|> 진료비 : "+ price +"\n" +
                        "|> 결제완료 : "+ payment +""
        );
    }
}
