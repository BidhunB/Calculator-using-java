import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Calculator implements ActionListener {
    Button sim,sci; 
    Frame fm;
    Font myFon = new Font("Helvetica",Font.BOLD,20);
    JTextField ts1;
    Button bs11,bs12,bs13,bs14,bs21,bs22,bs23,bs24,bs31,bs32,
    bs33,bs34,bs41,bs42,bs43,bs44,bs51,bs52,bs53;
    Double r1,r2,r;
    int ch;
    Frame f1;
    //FRAME2 SIMPLE-----------
    JTextField t1;
    Button b11,b12,b13,b14,b21,b22,b23,b24,b31,b32,
    b33,b34,b41,b42,b43,b44,b51,b52,b53,b54,b61,b62,
    b63,b64,b71,b72,b73;
    Font myFont = new Font("Helvetica",Font.BOLD,30);
    Frame f2;
    int sch;
    Double sr1,sr2,sr;

    Calculator(){
//--------------------------main frame----------------------------
        fm=new Frame("calculator");
        fm.setVisible(true);
        fm.setSize(300,400);
        fm.setLayout(null);
        //label
        Label l1=new Label("Choose your calculator");
        l1.setBounds(30,50,300,50);
        l1.setFont(myFon);
        fm.add(l1);
        //button
        sim=new Button("Simple calculator");
        sim.setBounds(20,170,110,50);
        fm.add(sim);
        sim.addActionListener(this);

        sci=new Button("Scientific Calculator");
        sci.setBounds(160,170,110,50);
        fm.add(sci);
        sci.addActionListener(this);

//---------------------FRAME simple-------------------------------------
f1=new Frame("simple calculator");
        f1.setVisible(false);
        f1.setSize(300,500);
        f1.setLayout(null);;
        ts1=new JTextField();
        ts1.setBounds(15,50,270,80);
        ts1.setFont(myFont);
        ts1.setEditable(false);
        f1.add(ts1);
//row1
        bs11=new Button("ac");
        bs11.setBounds(20,170,50,50);
        f1.add(bs11);
        bs11.addActionListener(this);

        bs12=new Button("del");
        bs12.setBounds(90,170,50,50);
        f1.add(bs12);
        bs12.addActionListener(this);

        bs13=new Button("%");
        bs13.setBounds(155,170,50,50);
        bs13.addActionListener(this);
        f1.add(bs13);
        

        bs14=new Button("/");
        bs14.setBounds(220,170,50,50);
        bs14.addActionListener(this);
        f1.add(bs14);
//row2
        bs21=new Button("7");
        bs21.setBounds(20,240,50,50);
        f1.add(bs21);
        bs21.addActionListener(this);

        bs22=new Button("8");
        bs22.setBounds(90,240,50,50);
        f1.add(bs22);
        bs22.addActionListener(this);

        bs23=new Button("9");
        bs23.setBounds(155,240,50,50);
        bs23.addActionListener(this);
        f1.add(bs23);
        

        bs24=new Button("*");
        bs24.setBounds(220,240,50,50);
        bs24.addActionListener(this);
        f1.add(bs24);
//row3
        bs31=new Button("4");
        bs31.setBounds(20,310,50,50);
        f1.add(bs31);
        bs31.addActionListener(this);

        bs32=new Button("5");
        bs32.setBounds(90,310,50,50);
        f1.add(bs32);
        bs32.addActionListener(this);

        bs33=new Button("6");
        bs33.setBounds(155,310,50,50);
        bs33.addActionListener(this);
        f1.add(bs33);
        

        bs34=new Button("-");
        bs34.setBounds(220,310,50,50);
        bs34.addActionListener(this);
        f1.add(bs34);
//row4
        bs41=new Button("1");
        bs41.setBounds(20,375,50,50);
        f1.add(bs41);
        bs41.addActionListener(this);

        bs42=new Button("2");
        bs42.setBounds(90,375,50,50);
        f1.add(bs42);
        bs42.addActionListener(this);

        bs43=new Button("3");
        bs43.setBounds(155,375,50,50);
        bs43.addActionListener(this);
        f1.add(bs43);
        

        bs44=new Button("+");
        bs44.setBounds(220,375,50,50);
        bs44.addActionListener(this);
        f1.add(bs44);
//row5
        bs51=new Button("0");
        bs51.setBounds(20,435,50,50);
        f1.add(bs51);
        bs51.addActionListener(this);

        bs52=new Button(".");
        bs52.setBounds(90,435,50,50);
        f1.add(bs52);
        bs52.addActionListener(this);

        bs53=new Button("=");
        bs53.setBounds(155,435,115,50);
        bs53.addActionListener(this);
        f1.add(bs53);


//----------------------------Frame scientific----------------------------



f2=new Frame("Scientific calculator");
f2.setVisible(false);
f2.setSize(300,640);
f2.setLayout(null);;
t1=new JTextField();
t1.setBounds(15,50,270,80);
t1.setFont(myFont);
t1.setEditable(false);
//align
f2.add(t1);

//--------------scientici buttons-----------------
//row1
b11=new Button("x^3");
b11.setBounds(20,170,50,50);
f2.add(b11);
b11.addActionListener(this);

b12=new Button("sqrt");
b12.setBounds(90,170,50,50);
f2.add(b12);
b12.addActionListener(this);

b13=new Button("x^2");
b13.setBounds(155,170,50,50);
b13.addActionListener(this);
f2.add(b13);


b14=new Button("log");
b14.setBounds(220,170,50,50);
b14.addActionListener(this);
f2.add(b14);
//row2
b21=new Button("sin");
b21.setBounds(20,240,50,50);
f2.add(b21);
b21.addActionListener(this);

b22=new Button("cos");
b22.setBounds(90,240,50,50);
f2.add(b22);
b22.addActionListener(this);

b23=new Button("tan");
b23.setBounds(155,240,50,50);
b23.addActionListener(this);
f2.add(b23);


b24=new Button("pi");
b24.setBounds(220,240,50,50);
b24.addActionListener(this);
f2.add(b24);
//row3
b31=new Button("ac");
b31.setBounds(20,310,50,50);
f2.add(b31);
b31.addActionListener(this);

b32=new Button("del");
b32.setBounds(90,310,50,50);
f2.add(b32);
b32.addActionListener(this);

b33=new Button("%");
b33.setBounds(155,310,50,50);
b33.addActionListener(this);
f2.add(b33);


b34=new Button("/");
b34.setBounds(220,310,50,50);
b34.addActionListener(this);
f2.add(b34);
//row4
b41=new Button("7");
b41.setBounds(20,375,50,50);
f2.add(b41);
b41.addActionListener(this);

b42=new Button("8");
b42.setBounds(90,375,50,50);
f2.add(b42);
b42.addActionListener(this);

b43=new Button("9");
b43.setBounds(155,375,50,50);
b43.addActionListener(this);
f2.add(b43);


b44=new Button("*");
b44.setBounds(220,375,50,50);
b44.addActionListener(this);
f2.add(b44);
//row5
b51=new Button("4");
b51.setBounds(20,442,50,50);
f2.add(b51);
b51.addActionListener(this);

b52=new Button("5");
b52.setBounds(90,442,50,50);
f2.add(b52);
b52.addActionListener(this);

b53=new Button("6");
b53.setBounds(155,442,50,50);
b53.addActionListener(this);
f2.add(b53);  

b54=new Button("-");
b54.setBounds(220,442,50,50);
b54.addActionListener(this);
f2.add(b54);  
//row6
b61=new Button("1");
b61.setBounds(20,505,50,50);
f2.add(b61);
b61.addActionListener(this);

b62=new Button("2");
b62.setBounds(90,505,50,50);
f2.add(b62);
b62.addActionListener(this);

b63=new Button("3");
b63.setBounds(155,505,50,50);
b63.addActionListener(this);
f2.add(b63);  

b64=new Button("+");
b64.setBounds(220,505,50,50);
b64.addActionListener(this);
f2.add(b64);  
//row7
b71=new Button("0");
b71.setBounds(20,570,50,50);
f2.add(b71);
b71.addActionListener(this);

b72=new Button(".");
b72.setBounds(90,570,50,50);
f2.add(b72);
b72.addActionListener(this);

b73=new Button("=");
b73.setBounds(155,570,115,50);
b73.addActionListener(this);
f2.add(b73);

//----------------------------------ACTIONS-------------------------------

    }
    public void actionPerformed(ActionEvent ae){
        try{
//---------------------frame selection--------------


            if(ae.getSource()==sim){
                fm.setVisible(false);
                f1.setVisible(true);
                f2.setVisible(false);
            }
            if(ae.getSource()==sci){
                fm.setVisible(false);
                f1.setVisible(false);
                f2.setVisible(true);
                }
//------------------------simple buttons----------------
        if(ae.getSource()==bs21){
                ts1.setText(ts1.getText() + "7");
            }
            if (ae.getSource()==bs22){
                ts1.setText(ts1.getText()+"8");
            }
            if(ae.getSource()==bs23){
                ts1.setText(ts1.getText()+"9");
            }
            if(ae.getSource()==bs31){
                ts1.setText(ts1.getText()+"4");
            }
            if(ae.getSource()==bs32){
                ts1.setText(ts1.getText()+"5");
            }
            if(ae.getSource()==bs33){
                ts1.setText(ts1.getText()+"6");
            }
            if(ae.getSource()==bs41){
                ts1.setText(ts1.getText()+"1");
            }
            if(ae.getSource()==bs42){
                ts1.setText(ts1.getText()+"2");
            }
            if(ae.getSource()==bs43){
                ts1.setText(ts1.getText()+"3");
            }
            if(ae.getSource()==bs51){
                ts1.setText(ts1.getText()+"0");
            }
            if(ae.getSource()==bs52){
                ts1.setText(ts1.getText()+".");
            }
// -----------------simple calculator functions---------
        if(ae.getSource()==bs13){
                r1 = Double.parseDouble(ts1.getText());
                ts1.setText("");
                ch=1;
            }
            if(ae.getSource()==bs14){
                r1 = Double.parseDouble(ts1.getText());
                ts1.setText("");
                ch=2;
            }
            if(ae.getSource()==bs24){
                r1 = Double.parseDouble(ts1.getText());
                ts1.setText("");
                ch=3;
            }
            if(ae.getSource()==bs34){
                r1 = Double.parseDouble(ts1.getText());
                ts1.setText("");
                ch=4;
            }
            if(ae.getSource()==bs44){
                r1 = Double.parseDouble(ts1.getText());
                ts1.setText("");
                ch=5;
            }
//---------------simple calculator equals ---------------------
            if(ae.getSource()==bs53){
                r2 = Double.parseDouble(ts1.getText());
                switch (ch) {
                    case 1:
                        r= r1 % r2;
                        break;
                    case 2:
                        r= r1 / r2;
                        break;
                    case 3:
                        r= r1 * r2;
                        break;
                    case 4:
                        r= r1 - r2;
                        break;
                    case 5:
                        r= r1 + r2;
                        break;
                }
                ts1.setText(String.valueOf(r));
                r1=r;
            }
            if(ae.getSource()==bs11){
                ts1.setText("");
            }
            if(ae.getSource()==bs12){
                String str=ts1.getText();
                ts1.setText("");
                for(int i=0;i<str.length()-1;i++){
                 ts1.setText(ts1.getText()+str.charAt(i));
                }
            }

//--------------Scienticfic section-----------------------

//-------------sci buttons-----------------------

//---------------scientific button act--------------
if(ae.getSource()==b41){
        t1.setText(t1.getText() + "7");
    }
    if (ae.getSource()==b42){
        t1.setText(t1.getText()+"8");
    }
    if(ae.getSource()==b43){
        t1.setText(t1.getText()+"9");
    }
    if(ae.getSource()==b51){
        t1.setText(t1.getText()+"4");
    }
    if(ae.getSource()==b52){
        t1.setText(t1.getText()+"5");
    }
    if(ae.getSource()==b53){
        t1.setText(t1.getText()+"6");
    }
    if(ae.getSource()==b61){
        t1.setText(t1.getText()+"1");
    }
    if(ae.getSource()==b62){
        t1.setText(t1.getText()+"2");
    }
    if(ae.getSource()==b63){
        t1.setText(t1.getText()+"3");
    }
    if(ae.getSource()==b71){
        t1.setText(t1.getText()+"0");
    }
    if(ae.getSource()==b72){
        t1.setText(".");
    }
    if(ae.getSource()==b24){
        t1.setText("3.14159265");
    }

    //------sci operator actions--------
    if(ae.getSource()==b33){//%
        sr1 = Double.parseDouble(t1.getText());
        t1.setText("");
        sch=1;
    }
    if(ae.getSource()==b34){// /
        sr1 = Double.parseDouble(t1.getText());
        t1.setText("");
        sch=2;
    }
    if(ae.getSource()==b44){//* 
        sr1 = Double.parseDouble(t1.getText());
        t1.setText("");
        sch=3;
    }
    if(ae.getSource()==b54){// -
        sr1 = Double.parseDouble(t1.getText());
        t1.setText("");
        sch=4;
    }
    if(ae.getSource()==b64){//+
        sr1 = Double.parseDouble(t1.getText());
        t1.setText("");
        sch=5;
    }



    if(ae.getSource()==b11){//cube
        sr1 = Double.parseDouble(t1.getText());
        t1.setText("");
        sch=6;
    }
    if(ae.getSource()==b12){// sqrt
        sr1 = Double.parseDouble(t1.getText());
        t1.setText("");
        sch=7;
    }
    if(ae.getSource()==b13){// sq
        sr1 = Double.parseDouble(t1.getText());
        t1.setText("");
        sch=8;
    }
    if(ae.getSource()==b14){//log
        sr1 = Double.parseDouble(t1.getText());
        t1.setText("");
        sch=9;
    }
    if(ae.getSource()==b21){//sin
        sr1 = Double.parseDouble(t1.getText());
        t1.setText("");
        sch=10;
    }
    if(ae.getSource()==b22){//cos
        sr1 = Double.parseDouble(t1.getText());
        t1.setText("");
        sch=11;
    }
    if(ae.getSource()==b23){//tan
        sr1 = Double.parseDouble(t1.getText());
        ts1.setText("");
        sch=12;
    }





//----------del and ac for sci cal-------------

if(ae.getSource()==b31){
        t1.setText("");
    }
    if(ae.getSource()==b32){
        String str=t1.getText();
        t1.setText("");
        for(int i=0;i<str.length()-1;i++){
         t1.setText(t1.getText()+str.charAt(i));
        }
    }

    // ----------action for bacics---------
    //--------------------equal-----------
    if(ae.getSource()==b73){      
switch (sch) {
        case 1:
        sr2 = Double.parseDouble(t1.getText());
                sr= sr1 % sr2;
                break;
        case 2:
        sr2 = Double.parseDouble(t1.getText());
                sr= sr1 / sr2;
                break;
        case 3:
        sr2 = Double.parseDouble(t1.getText());
                sr= sr1 * sr2;
                break;
        case 4:
        sr2 = Double.parseDouble(t1.getText());
                sr= sr1 - sr2;
                break;
        case 5:
        sr2 = Double.parseDouble(t1.getText());
                sr= sr1 + sr2;
                break;
        case 6:
                sr=sr1*sr1*sr1;
                break;
        case 7:
                sr=Math.sqrt(sr1);
                break;
        case 8:
                sr=sr1*sr1;
                break;
        case 9:
                sr=Math.sqrt(sr1);
                break;
        case 10:
                sr=Math.sin(sr1);
                break;
        case 11:
                sr=Math.cos(sr1);
                break;
        case 12:
                sr=Math.tan(sr1);
                break;
}
        t1.setText(String.valueOf(sr));
        sr1=sr;
    }


        }
        catch(Exception e){
            JOptionPane.showMessageDialog(fm,"Please check the value","ERROR",JOptionPane.ERROR_MESSAGE );

        }
    }
    public static void main(String[] args) {
        Calculator ck = new Calculator();
    }
}
