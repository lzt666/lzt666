package javaclass;

import java.util.Scanner;

public class ReverseRenMinbi {
    static String []UpperWrite={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String RMB=scanner.nextLine();
            String[]RMBS=RMB.split("\\.");
            if (RMBS[1].equals("00"))
                System.out.println("人民币"+convert(Double.parseDouble(RMB))+"元整");//输出格式
            else{
                String result=convert(Double.parseDouble(RMB));
                int jiao=Integer.parseInt(RMBS[1].charAt(0)+"");
                int fen=Integer.parseInt(RMBS[1].charAt(1)+"");
                String rest="";
                if (jiao==0){
                    rest=UpperWrite[fen]+"分";
                }else if (fen==0){
                    rest=UpperWrite[jiao]+"角";
                }else
                    rest=UpperWrite[jiao]+"角"+UpperWrite[fen]+"分";
                if (!result.equals("零")){
                    System.out.println("人民币"+result+"元"+rest);
                }else System.out.println("人民币"+rest);
            }
        }
    }

    private static String convert(double money) {
        String result = "";
        if (money < 10000) {
            if (money < 10) {
                result = UpperWrite[(int) money];
            } else if (money >= 10 && money < 100) {
                int ge = (int) money % 10;
                int shi = (int) money / 10 % 10;
                if (shi == 1) {
                    result = "拾" + UpperWrite[ge];
                } else
                    result = UpperWrite[shi] + "拾" + UpperWrite[ge];
            }
        else if (money >= 100 && money < 1000) {
            int bai = (int) money / 100 % 10;

            double rest = money - bai * 100;

            result = UpperWrite[bai] + "佰" + convert(rest);

        } else if (money >= 1000 && money < 10000) {

            int qian = (int) money / 1000 % 10;

            double rest = money - qian * 1000;

            result += UpperWrite[qian] + "仟" + convert(rest);

        }
    }
else if(money>=10000&&money<100000000) {

            int wanUp = (int) money / 10000;

            result += convert(wanUp) + "万";

            double rest = money - wanUp * 10000;

            result += convert(rest);
        }

return result;

}
    }

