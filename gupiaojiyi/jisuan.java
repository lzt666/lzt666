package gupiaojiyi;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class jisuan {
    String tishi="";
    double jiaoyijin;
    double single_fees;
    int jiaoyishu;
    double base_fees;
    double add_fees;
    double total_fees;
    public jisuan()
    {
        this.jiaoyijin=0.0;
        this.jiaoyishu=0;
        this.single_fees=0.0;

        this.base_fees=0.0;
        this.add_fees=0;
        this.total_fees=0.0;

    }

    public jisuan(double jiaoyijin,int jiaoyishu,double single_fees)
    {
        this.jiaoyijin=jiaoyijin;
        this.jiaoyishu=jiaoyishu;
        this.single_fees=single_fees;

        this.base_fees=0.0;
        this.add_fees=0;
        this.total_fees=0.0;

    }
    double shouxufees()
    {
        if(jiaoyijin<0||jiaoyishu<0||single_fees<0)
            return 0;
        //tishi="输入数据有误请重新输入";
        //
        if(jiaoyijin<1000)
            base_fees=jiaoyijin*0.084;
        else if(jiaoyijin>=1000&&jiaoyijin<=10000)
            base_fees=jiaoyijin*0.05+34;
        else
            base_fees=jiaoyijin*0.04+134;
        //
        if(single_fees<14&&jiaoyishu%100!=0)
            add_fees=base_fees*0.09;
        else if(single_fees<14&&jiaoyishu%100==0)
            add_fees=base_fees*0.05;
        else if(single_fees>=14&&single_fees<=25&&jiaoyishu%100==0)
            add_fees=base_fees*0.02;
        else if(single_fees>=14&&single_fees<=25&&jiaoyishu%100!=0)
            add_fees=base_fees*0.06;
        else if(single_fees>25&&jiaoyishu%100==0)
            add_fees=base_fees*0.01;
        else if(single_fees>25&&jiaoyishu%100!=0)
            add_fees=base_fees*0.04;
        total_fees=base_fees+add_fees;
        return total_fees;
    }
}
