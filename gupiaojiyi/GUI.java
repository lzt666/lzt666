package gupiaojiyi;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GUI extends JFrame implements ActionListener {
    JLabel label=new JLabel("交易金额");
    JTextField jiaoyijin=new JTextField(20);
    JLabel label2=new JLabel("每股价格");
    JTextField singel_price=new JTextField(20);
    JLabel label3=new JLabel("交易股数");
    JTextField number=new JTextField(20);
    JButton btn1=new JButton("确定");
    JButton btn2=new JButton("清空");
    JLabel  sum=new JLabel("总手续费");
    JTextField result=new JTextField(20);

    GUI()
    {
        super("股票手续费计算系统");
        setSize(400,600);
        setLocation(300,300);
        FlowLayout flow=new FlowLayout();
        flow.setHgap(20);
        flow.setVgap(20);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        add(label);
        add(jiaoyijin);
        add(label2);
        add(singel_price);
        add(label3);
        add(number);
        add(btn1);
        add(btn2);
        add(sum);
        add(result);
        init();
        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }
    void init()
    {
        label.setBounds(20,20,60,60);
        jiaoyijin.setBounds(90,40,150,20);
        label2.setBounds(20,50,60,60);
        singel_price.setBounds(90, 70,150,20);
        label3.setBounds(20,100,60,60);
        number.setBounds(90, 120,150,20);
        btn1.setBounds(120, 300,80,30);
        btn2.setBounds(220, 300,80,30);
        sum.setBounds(20, 140,60,60);
        result.setBounds(90,160,150,20);



        label.setVisible(true);
        jiaoyijin.setVisible(true);
        label2.setVisible(true);
        singel_price.setVisible(true);
        label3.setVisible(true);
        number.setVisible(true);
        btn1.setVisible(true);
        btn2.setVisible(true);
        sum.setVisible(true);
        result.setVisible(true);
    }

    public void actionPerformed (ActionEvent e)
    {
        if(e.getSource()==btn1)
        {
            String a=jiaoyijin.getText();
            String b=number.getText();
            String c=singel_price.getText();
            double x=Double.parseDouble(a);
            int y=Integer.parseInt(b);
            double z=Double.parseDouble(c);
            jisuan customer=new jisuan(x,y,z);
            if(customer.shouxufees()==0)
            {
                JDialog cuowu=new JDialog(this);
                cuowu.setBounds(350,350,100,100);
                JTextArea cuowu_tishi=new JTextArea("输入有误请重新输入");
                cuowu.getContentPane().add(cuowu_tishi);
                cuowu.setVisible(true);
                cuowu.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            }
            if(customer.shouxufees()!=0)
            {
                String jieguo=String.valueOf(customer.shouxufees());
                result.setText(jieguo);
            }
        }
        if(e.getSource()==btn2)
        {
            jiaoyijin.setText("");
            number.setText("");
            singel_price.setText("");
            result.setText("");
        }
    }
}

