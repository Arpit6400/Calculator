import java.applet.*;
import java.awt.event.*;

//import javax.swing.ImageIcon;
//import javax.swing.Icon;

import java.awt.*;
//import javax.swing.JLabel;
//import javax.swing.SwingConstants;


public class Calculator extends Applet implements ActionListener
{
	public Calculator() {
	}
//Label lblnatural = new Label("Calci");

TextField txtfield1 = new TextField(30);

//Icon icon=new ImageIcon("C://Users//arpit//Downloads//number-1.png");



Button abs = new Button("Abs");
Button X2 = new Button("X\u00b2");
Button X3 = new Button("X\u00b3");
Button log = new Button("log");
Button sqrt = new Button("\u221A");

Button sin = new Button("sin");
Button cos = new Button("cos");
Button tan = new Button("tan");
Button upon = new Button("1/X");
Button nfact = new Button("n!");

Button seven = new Button("7");
Button eight = new Button("8");
Button nine = new Button("9");
Button DEL = new Button("DEL");
Button AC = new Button("Clear");

Button four = new Button("4");
Button five = new Button("5");
Button six = new Button("6");
Button multiply = new Button("X");
Button subtract = new Button("-");

Button one = new Button("1");
Button two = new Button("2");
Button three = new Button("3");
Button plus = new Button("+");
Button dive = new Button("/");

Button zero = new Button("0");
Button equals = new Button("=/AC");
Button dot = new Button(".");
Button pie = new Button("\u03C0");


public void init()
{

    setLayout(null);
    resize(470,635);
    setBackground(Color.LIGHT_GRAY);// Background Color Changed in Whole Applet
    
    //Font myCasio= new Font("Serif",Font.BOLD,18);
    //Font myFX= new Font("Serif",Font.BOLD,18);
    //Font myNatural = new Font("Serif",Font.BOLD,15);
    //Font f1=new Font("TimesRoman", Font.BOLD, 18);
    //add(lblnatural);

    add(txtfield1);

    add(abs);
    add(X2);
    add(X3);
    add(log);
    add(sqrt);

    add(sin);
    add(cos);
    add(tan);
    add(upon);
    add(nfact);

    add(seven);
    add(eight);
    add(nine);
    add(DEL);
    add(AC);

    add(four);
    add(five);
    add(six);
    add(multiply);
    add(subtract);

    add(one);
    add(two);
    add(three);
    add(plus);
    add(dive);

    add(zero);
    add(equals);
    add(dot);
    add(pie);
    //lblnatural.setBounds(160,25,200,20);
    txtfield1.setBounds(10,49,446,120);
    txtfield1.setFont(new Font("TimesRoman", Font.BOLD, 30));

    abs.setBounds(10,176,85,70);
    abs.setBackground(Color.GRAY);
    abs.setFont(new Font("Times New Roman", Font.BOLD, 30));
    X2.setBounds(101,176,85,70);
    X2.setBackground(Color.GRAY);
    X2.setFont(new Font("Times New Roman", Font.BOLD, 30));
    X3.setBounds(192,176,85,70);
    X3.setBackground(Color.GRAY);
    X3.setFont(new Font("Times New Roman", Font.BOLD, 30));
    log.setBounds(280,176,85,70);
    log.setBackground(Color.GRAY);
    log.setFont(new Font("Times New Roman", Font.BOLD, 30));
    sqrt.setBounds(371,176,85,70);
    sqrt.setBackground(Color.GRAY);
    sqrt.setFont(new Font("Times New Roman", Font.BOLD, 30));

    sin.setBounds(10,252,85,70);
    sin.setBackground(Color.GRAY);
    sin.setFont(new Font("Times New Roman", Font.BOLD, 30));
    cos.setBounds(101,252,85,70);
    cos.setBackground(Color.GRAY);
    cos.setFont(new Font("Times New Roman", Font.BOLD, 30));
    tan.setBounds(192,252,85,70);
    tan.setBackground(Color.GRAY);
    tan.setFont(new Font("Times New Roman", Font.BOLD, 30));
    upon.setBounds(280,252,85,70);
    upon.setBackground(Color.GRAY);
    upon.setFont(new Font("Times New Roman", Font.BOLD, 30));
    nfact.setBounds(371,252,85,70);
    nfact.setBackground(Color.GRAY);
    nfact.setFont(new Font("Times New Roman", Font.BOLD, 30));

    seven.setBounds(10,328,85,70);
    seven.setBackground(Color.RED);
    seven.setFont(new Font("Times New Roman", Font.BOLD, 30));
    eight.setBounds(101,328,85,70);
    eight.setBackground(Color.RED);
    eight.setFont(new Font("Times New Roman", Font.BOLD, 30));
    nine.setBounds(192,328,85,70);
    nine.setBackground(Color.RED);
    nine.setFont(new Font("Times New Roman", Font.BOLD, 30));
    AC.setBounds(280,328,176,70);
    AC.setBackground(Color.CYAN);
    AC.setFont(new Font("Times New Roman", Font.BOLD, 30));

    four.setBounds(10,404,85,70);
    four.setBackground(Color.RED);
    four.setFont(new Font("Times New Roman", Font.BOLD, 30));
    five.setBounds(101,404,85,70);
    five.setBackground(Color.RED);
    five.setFont(new Font("Times New Roman", Font.BOLD, 30));
    six.setBounds(192,404,85,70);
    six.setBackground(Color.RED);
    six.setFont(new Font("Times New Roman", Font.BOLD, 30));
    multiply.setBounds(280,404,85,70);
    multiply.setBackground(Color.GREEN);
    multiply.setFont(new Font("Times New Roman", Font.BOLD, 30));
    subtract.setBounds(371,404,85,70);
    subtract.setBackground(Color.GREEN);
    subtract.setFont(new Font("Times New Roman", Font.BOLD, 30));

    one.setBounds(10,480,85,70);
    one.setBackground(Color.RED);
    one.setFont(new Font("Times New Roman", Font.BOLD, 30));
    two.setBounds(101,480,85,70);
    two.setBackground(Color.RED);
    two.setFont(new Font("Times New Roman", Font.BOLD, 30));
    three.setBounds(192,480,85,70);
    three.setBackground(Color.RED);
    three.setFont(new Font("Times New Roman", Font.BOLD, 30));
    plus.setBounds(280,480,85,70); 
    plus.setBackground(Color.GREEN);
    plus.setFont(new Font("Times New Roman", Font.BOLD, 30));
    dive.setBounds(371,480,85,70);
    dive.setBackground(Color.GREEN);
    dive.setFont(new Font("Times New Roman", Font.BOLD, 30));

    zero.setBounds(10,556,85,70);
    zero.setBackground(Color.RED);
    zero.setFont(new Font("Times New Roman", Font.BOLD, 30));
    equals.setBounds(101,556,176,70);
    equals.setBackground(Color.CYAN);
    equals.setFont(new Font("Times New Roman", Font.BOLD, 30));
    dot.setBounds(280,556,85,70);
    dot.setBackground(Color.MAGENTA);
    dot.setFont(new Font("Times New Roman", Font.BOLD, 30));
    pie.setBounds(371,556,85,70);
    pie.setBackground(Color.GRAY);
    pie.setFont(new Font("Times New Roman", Font.BOLD, 30));


    AC.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String backSpace = null;
            if(txtfield1.getText().length()>0) {
                StringBuilder str = new StringBuilder(txtfield1.getText());
                str.deleteCharAt(txtfield1.getText().length()-1);
                backSpace = str.toString();
                txtfield1.setText(backSpace);
            }
        }
    });
    equals.addActionListener(this);
    one.addActionListener(this);
    two.addActionListener(this);
    three.addActionListener(this);
    plus.addActionListener(this);
    dive.addActionListener(this);
    four.addActionListener(this);
    five.addActionListener(this);
    six.addActionListener(this);
    multiply.addActionListener(this);
    subtract.addActionListener(this);
    seven.addActionListener(this);
    eight.addActionListener(this);
    nine.addActionListener(this);
    sin.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            double a = Math.sin(Double.parseDouble(txtfield1.getText()));
            txtfield1.setText("");
            txtfield1.setText(txtfield1.getText() + a);
        }
    });
    cos.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            double a = Math.cos(Double.parseDouble(txtfield1.getText()));
            txtfield1.setText("");
            txtfield1.setText(txtfield1.getText() + a);
        }
    });
    tan.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            double a = Math.tan(Double.parseDouble(txtfield1.getText()));
            txtfield1.setText("");
            txtfield1.setText(txtfield1.getText() + a);
        }
    });
    upon.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            double a = (Double.parseDouble(txtfield1.getText()));
            a = 1/a;
            txtfield1.setText("");
            txtfield1.setText(txtfield1.getText() + a);
        }
    });
    nfact.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            double a = Double.parseDouble(txtfield1.getText());
            double fact = 1;
            while (a != 0) {
                fact = fact * a;
                a--;
            }
            txtfield1.setText("");
            txtfield1.setText(txtfield1.getText() + fact); 

        }
    });
    abs.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            double a = (Double.parseDouble(txtfield1.getText()));
            a=Math.abs(a);
            txtfield1.setText("");
            txtfield1.setText(txtfield1.getText() + a);
        }
    });
    X2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            double a = (Double.parseDouble(txtfield1.getText()));
            a = a * a;
            txtfield1.setText("");
            txtfield1.setText(txtfield1.getText() + a);
        }
    });
    X3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            double a = (Double.parseDouble(txtfield1.getText()));
            a = a * a * a;
            txtfield1.setText("");
            txtfield1.setText(txtfield1.getText() + a);
        }
    });
    log.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            double a = Math.log(Double.parseDouble(txtfield1.getText()));
            txtfield1.setText("");
            txtfield1.setText(txtfield1.getText() + a);
        }
    });
    sqrt.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            double a = Math.sqrt(Double.parseDouble(txtfield1.getText()));
            txtfield1.setText("");
            txtfield1.setText(txtfield1.getText() + a);
        }
    });
    zero.addActionListener(this);
    dot.addActionListener(this);
    pie.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            double a = (Double.parseDouble(txtfield1.getText()));
            a = a* Math.PI;
            txtfield1.setText("");
            txtfield1.setText(txtfield1.getText() + a);
        }
    });
    txtfield1.setEnabled(false);// if it is true it enables the Curser 
    
    Label lblNewLabel = new Label("       SCIENTIFIC CALCULATOR");
    lblNewLabel.setBackground(Color.LIGHT_GRAY);
   // lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
    lblNewLabel.setBounds(10, 10, 446, 33);
    add(lblNewLabel);
}
    String num1="";
    String op="";
    String num2="";
public void actionPerformed(ActionEvent e) 
    {
        String button = e.getActionCommand();
        char ch = button.charAt(0);
	if(ch>='0' && ch<='9'|| ch=='.') 
	{ 
	    if (!op.equals("")) 
		num2 = num2 + button; 
	    else
		num1 = num1 + button;   
	    txtfield1.setText(num1+op+num2); 
	} 
	else if(ch=='C') 
	{ 
	    num1 = op = num2 = ""; 
	    txtfield1.setText(""); 
	}
	else if (ch =='=') 
	{ 
	    if(!num1.equals("") && !num2.equals(""))
	    {
		double temp;
		double n1=Double.parseDouble(num1);
		double n2=Double.parseDouble(num2);
		if(n2==0 && op.equals("/"))
		{
		    txtfield1.setText(num1+op+num2+" = Zero Division Error");
		    num1 = op = num2 = "";
		}
		else
		{
		    if (op.equals("+")) 
		        temp = n1 + n2; 
		    else if (op.equals("-")) 
		        temp = n1 - n2; 
		    else if (op.equals("/")) 
	  	        temp = n1/n2; 
		    else
		        temp = n1*n2; 
		    txtfield1.setText(num1+op+num2+" = "+temp); 
		    num1 = Double.toString(temp);
		    op = num2 = ""; 
	        }
            }
	    else
	    {
		num1 = op = num2 = ""; 
		txtfield1.setText("");
	    }
        } 
	else 
	{ 
	    if (op.equals("") || num2.equals("")) 
		op = button; 
	    else 
	    { 
		double temp;
		double n1=Double.parseDouble(num1);
		double n2=Double.parseDouble(num2);
		if(n2==0 && op.equals("/"))
		{
		    txtfield1.setText(num1+op+num2+" = Zero Division Error");
		    num1 = op = num2 = "";
		}
		else
		{
		    if (op.equals("+")) 
		        temp = n1 + n2; 
		    else if (op.equals("-")) 
		        temp = n1 - n2; 
		    else if (op.equals("/")) 
	  	        temp = n1/n2; 
		    else
		        temp = n1*n2; 
		    num1 = Double.toString(temp); 
		    op = button; 
		    num2 = ""; 
	        }
            }
	    txtfield1.setText(num1+op+num2);
        }

       
    }
}

/*
<applet code = Calculator.class width=600 height=600>
</applet>
*/