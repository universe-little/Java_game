import java.awt.*;
import java.awt.event.*;

class chess extends Frame implements ActionListener{
    static chess ch=new chess();
    static Button chessO=new Button("O");
    static Button chessX=new Button("X");
    static Button but1=new Button();
    static Button but2=new Button();
    static Button but3=new Button();
    static Button but4=new Button();
    static Button but5=new Button();
    static Button but6=new Button();
    static Button but7=new Button();
    static Button but8=new Button();
    static Button but9=new Button();
    static Button restart=new Button("restart");
    static Label la=new Label("play the chess~");
    static Label la1=new Label("choose:");
    static int k=1;
    static int a=0;
    static int b=0;
    static int count1=0;
    public static void main(String args[])
    {
        ch.setTitle("chess");
        ch.setLayout(null);
        ch.setSize(700, 700);
        chessO.setBounds(300, 150, 80, 50);
        ch.add(chessO);
        chessO.setFont(new Font("Calibri", Font.BOLD, 30));
        chessX.setBounds(400, 150, 80, 50);
        ch.add(chessX);
        chessX.setFont(new Font("Calibri", Font.BOLD, 30));
        but1.setBounds(200, 250, 100, 100);
        ch.add(but1);
        but2.setBounds(300, 250, 100, 100);
        ch.add(but2);
        but3.setBounds(400, 250, 100, 100);
        ch.add(but3);
        but4.setBounds(200, 350, 100, 100);
        ch.add(but4);
        but5.setBounds(300, 350, 100, 100);
        ch.add(but5);
        but6.setBounds(400, 350, 100, 100);
        ch.add(but6);
        but7.setBounds(200, 450, 100, 100);
        ch.add(but7);
        but8.setBounds(300, 450, 100, 100);
        ch.add(but8);
        but9.setBounds(400, 450, 100, 100);
        ch.add(but9); 
        restart.setBounds(300, 600, 100, 50);
        ch.add(restart); 
        
        restart.setFont(new Font("Calibri", Font.BOLD, 25));
        restart.setForeground(Color.GREEN);
        restart.setBackground(Color.BLUE);
        la.setFont(new Font("Calibri", Font.BOLD, 50));
        la.setForeground(Color.CYAN);
        la.setBounds(150, 50,400,80);
        la1.setFont(new Font("Calibri", Font.BOLD, 25));
        la1.setForeground(Color.BLUE);
        la1.setBounds(180, 150,100,50);
        //la.setBackground(Color.BLUE);
        la.setAlignment(Label.CENTER);
        ch.add(la);
        ch.add(la1);
        
        chessO.addActionListener(ch);
        chessX.addActionListener(ch);
        but1.addActionListener(ch);
        but2.addActionListener(ch);
        but3.addActionListener(ch);
        but4.addActionListener(ch);
        but5.addActionListener(ch);
        but6.addActionListener(ch);
        but7.addActionListener(ch);
        but8.addActionListener(ch);
        but9.addActionListener(ch);
        restart.addActionListener(ch);

        ch.addWindowListener(
            new WindowAdapter(){
                public void windowClosing(WindowEvent e){
                    System.exit(0);
                }
        });
        ch.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {   
        Button btn=(Button)e.getSource();
        if(a==0 && b==0)
        {
            if(btn==chessO)
            {
                k=1;
                a++;
            }
            else if(btn==chessX)
            {
                k=0;
                a++;
            }
        }
        else if(a>0 && b==0)
        {
            count1++;
            if(btn==but1)
            {
                if(k==1)
                {
                    but1.setLabel("O");
                    but1.setFont(new Font("Calibri", Font.BOLD, 50));
                    k=0;
                }
                else
                {
                    but1.setLabel("X");
                    but1.setFont(new Font("Calibri", Font.BOLD, 50));
                    k=1;
                }
                if(but1.getLabel().equals(but2.getLabel())&&but1.getLabel().equals(but3.getLabel()))
                {
                    la.setText(but1.getLabel() + " Win~");
                    b++;
                }
                else if(but1.getLabel().equals(but5.getLabel())&&but1.getLabel().equals(but9.getLabel()))
                {
                    la.setText(but1.getLabel() + " Win~");
                    b++;
                }
                else if(but1.getLabel().equals(but4.getLabel())&&but1.getLabel().equals(but7.getLabel()))
                {
                    la.setText(but1.getLabel() + " Win~");
                    b++;
                }
                else if(count1==9)
                {
                    la.setText(" play again~");
                    b++;
                }
            }
            else if(btn==but2)
            {
                if(k==1)
                {
                    but2.setLabel("O");
                    but2.setFont(new Font("Calibri", Font.BOLD, 50));
                    k=0;
                }
                else
                {
                    but2.setLabel("X");
                    but2.setFont(new Font("Calibri", Font.BOLD, 50));
                    k=1;
                }
                if(but2.getLabel().equals(but1.getLabel())&&but2.getLabel().equals(but3.getLabel()))
                {
                    la.setText(but2.getLabel() + " Win~");
                    b++;
                }
                else if(but2.getLabel().equals(but5.getLabel())&&but2.getLabel().equals(but8.getLabel()))
                {
                    la.setText(but2.getLabel() + " Win~");
                    b++;
                }
                else if(count1==9)
                {
                    la.setText(" play again~");
                    b++;
                }
            }
            else if(btn==but3)
            {
                if(k==1)
                {
                    but3.setLabel("O");
                    but3.setFont(new Font("Calibri", Font.BOLD, 50));
                    k=0;
                }
                else
                {
                    but3.setLabel("X");
                    but3.setFont(new Font("Calibri", Font.BOLD, 50));
                    k=1;
                }
                if(but3.getLabel().equals(but2.getLabel())&&but3.getLabel().equals(but1.getLabel()))
                {
                    la.setText(but3.getLabel() + " Win~");
                    b++;
                }
                else if(but3.getLabel().equals(but5.getLabel())&&but3.getLabel().equals(but9.getLabel()))
                {
                    la.setText(but3.getLabel() + " Win~");
                    b++;
                }
                else if(but3.getLabel().equals(but6.getLabel())&&but3.getLabel().equals(but9.getLabel()))
                {
                    la.setText(but3.getLabel() + " Win~");
                    b++;
                }
                else if(count1==9)
                {
                    la.setText(" play again~");
                    b++;
                }
            }
            else if(btn==but4)
            {
                if(k==1)
                {
                    but4.setLabel("O");
                    but4.setFont(new Font("Calibri", Font.BOLD, 50));
                    k=0;
                }
                else
                {
                    but4.setLabel("X");
                    but4.setFont(new Font("Calibri", Font.BOLD, 50));
                    k=1;
                }
                if(but4.getLabel().equals(but1.getLabel())&&but4.getLabel().equals(but7.getLabel()))
                {
                    la.setText(but4.getLabel() + " Win~");
                    b++;
                }
                else if(but4.getLabel().equals(but5.getLabel())&&but4.getLabel().equals(but6.getLabel()))
                {
                    la.setText(but4.getLabel() + " Win~");
                    b++;
                }
                else if(count1==9)
                {
                    la.setText(" play again~");
                    b++;
                }
            }
            else if(btn==but5)
            {
                if(k==1)
                {
                    but5.setLabel("O");
                    but5.setFont(new Font("Calibri", Font.BOLD, 50));
                    k=0;
                }
                else
                {
                    but5.setLabel("X");
                    but5.setFont(new Font("Calibri", Font.BOLD, 50));
                    k=1;
                }
                if(but5.getLabel().equals(but1.getLabel())&&but5.getLabel().equals(but9.getLabel()))
                {
                    la.setText(but5.getLabel() + " Win~");
                    b++;
                }
                else if(but5.getLabel().equals(but2.getLabel())&&but5.getLabel().equals(but8.getLabel()))
                {
                    la.setText(but5.getLabel() + " Win~");
                    b++;
                }
                else if(but5.getLabel().equals(but3.getLabel())&&but5.getLabel().equals(but7.getLabel()))
                {
                    la.setText(but5.getLabel() + " Win~");
                    b++;
                }
                else if(but5.getLabel().equals(but4.getLabel())&&but5.getLabel().equals(but6.getLabel()))
                {
                    la.setText(but5.getLabel() + " Win~");
                    b++;
                }
                else if(count1==9)
                {
                    la.setText(" play again~");
                    b++;
                }
            }
            else if(btn==but6)
            {
                if(k==1)
                {
                    but6.setLabel("O");
                    but6.setFont(new Font("Calibri", Font.BOLD, 50));
                    k=0;
                }
                else
                {
                    but6.setLabel("X");
                    but6.setFont(new Font("Calibri", Font.BOLD, 50));
                    k=1;
                }
                if(but6.getLabel().equals(but3.getLabel())&&but6.getLabel().equals(but9.getLabel()))
                {
                    la.setText(but6.getLabel() + " Win~");
                    b++;
                }
                else if(but6.getLabel().equals(but5.getLabel())&&but6.getLabel().equals(but4.getLabel()))
                {
                    la.setText(but6.getLabel() + " Win~");
                    b++;
                }
                else if(count1==9)
                {
                    la.setText(" play again~");
                    b++;
                }
            }
            else if(btn==but7)
            {
                if(k==1)
                {
                    but7.setLabel("O");
                    but7.setFont(new Font("Calibri", Font.BOLD, 50));
                    k=0;
                }
                else
                {
                    but7.setLabel("X");
                    but7.setFont(new Font("Calibri", Font.BOLD, 50));
                    k=1;
                }
                if(but7.getLabel().equals(but1.getLabel())&&but7.getLabel().equals(but4.getLabel()))
                {
                    la.setText(but7.getLabel() + " Win~");
                    b++;
                }
                else if(but7.getLabel().equals(but8.getLabel())&&but7.getLabel().equals(but9.getLabel()))
                {
                    la.setText(but7.getLabel() + " Win~");
                    b++;
                }
                else if(but7.getLabel().equals(but5.getLabel())&&but7.getLabel().equals(but3.getLabel()))
                {
                    la.setText(but7.getLabel() + " Win~");
                    b++;
                }
                else if(count1==9)
                {
                    la.setText(" play again~");
                    b++;
                }
            }
            else if(btn==but8)
            {
                if(k==1)
                {
                    but8.setLabel("O");
                    but8.setFont(new Font("Calibri", Font.BOLD, 50));
                    k=0;
                }
                else
                {
                    but8.setLabel("X");
                    but8.setFont(new Font("Calibri", Font.BOLD, 50));
                    k=1;
                }
                if(but8.getLabel().equals(but2.getLabel())&&but8.getLabel().equals(but5.getLabel()))
                {
                    la.setText(but8.getLabel() + " Win~");
                    b++;
                }
                else if(but8.getLabel().equals(but7.getLabel())&&but8.getLabel().equals(but9.getLabel()))
                {
                    la.setText(but8.getLabel() + " Win~");
                    b++;
                }
                else if(count1==9)
                {
                    la.setText(" play again~");
                    b++;
                }
            }
            else if(btn==but9)
            {
                if(k==1)
                {
                    but9.setLabel("O");
                    but9.setFont(new Font("Calibri", Font.BOLD, 50));
                    k=0;
                }
                else
                {
                    but9.setLabel("X");
                    but9.setFont(new Font("Calibri", Font.BOLD, 50));
                    k=1;
                }
                if(but9.getLabel().equals(but3.getLabel())&&but9.getLabel().equals(but6.getLabel()))
                {
                    la.setText(but9.getLabel() + " Win~");
                    b++;
                }
                else if(but9.getLabel().equals(but8.getLabel())&&but9.getLabel().equals(but7.getLabel()))
                {
                    la.setText(but9.getLabel() + " Win~");
                    b++;
                }
                else if(but9.getLabel().equals(but5.getLabel())&&but9.getLabel().equals(but1.getLabel()))
                {  
                    la.setText(but9.getLabel() + " Win~");
                    b++;
                }
                else if(count1==9)
                {
                    la.setText(" play again~");
                    b++;
                }
            }
            else if(btn==restart)
            {
                but1.setLabel("");
                but2.setLabel("");
                but3.setLabel("");
                but4.setLabel("");
                but5.setLabel("");
                but6.setLabel("");
                but7.setLabel("");
                but8.setLabel("");
                but9.setLabel("");
                la.setText("play the chess~");
                count1=0;
                a=0;
                b=0;
            }
        }
        else if(btn==restart)
        {
            but1.setLabel("");
            but2.setLabel("");
            but3.setLabel("");
            but4.setLabel("");
            but5.setLabel("");
            but6.setLabel("");
            but7.setLabel("");
            but8.setLabel("");
            but9.setLabel("");
            la.setText("play the chess~");
            count1=0;
            a=0;
            b=0;
        }
    }
        
}