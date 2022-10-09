import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class littlepainter_2 extends JFrame implements MouseMotionListener,MouseListener,ActionListener
{
    int x1,x2,y1,y2;
    int lineX,lineY,lineX1,lineY1;
    int state=0;
    JButton btn1;
    JButton clear;
    JButton polygon;
    JButton line;
    JButton background;
    Color color=Color.BLACK;
    int x,y,dx,dy;
    JButton eraser;
   int polynum=3;
   JSlider scr;
   int scrnum=25;
   JPanel jpanel1;
   //JPanel jpanel8;
   Color colorB;
   littlepainter_2()
   {
        super("littlepainter_2");
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Container c=getContentPane();
        btn1=new JButton();
        btn1.setBounds(0, 0, 50, 30);
        btn1.setText("Draw");
        btn1.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        btn1.addActionListener(this);
        btn1.addMouseListener(this);
        btn1.addMouseMotionListener(this);
        btn1.setVisible(true);
        jpanel1=new JPanel(); 
        jpanel1.setBounds(30, 850, 200, 300);
        //jpanel1.setOpaque(false);      
        jpanel1.add(btn1);
        clear=new JButton();
        clear.setBounds(0, 0, 50, 30);
        clear.setText("Clear");
        clear.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        clear.addMouseListener(this);
        clear.setVisible(true);
        jpanel1.add(clear);
        polygon=new JButton();
        polygon.setBounds(0, 0, 50, 30);
        polygon.setText("Polygon");
        polygon.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        polygon.addActionListener(this);
        polygon.setVisible(true);
        polygon.addMouseListener(this);
        polygon.addMouseMotionListener(this);
        jpanel1.add(polygon);
        eraser=new JButton();
        eraser.setBounds(0, 0, 50, 30);
        eraser.setText("Eraser");
        eraser.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        eraser.addActionListener(this);
        eraser.addMouseListener(this);
        eraser.addMouseMotionListener(this);
        eraser.setVisible(true);
        jpanel1.add(eraser);
        scr =new JSlider(JSlider.HORIZONTAL,1,100,scrnum);
        jpanel1.add(scr);
        line=new JButton();
        line.setText("Line");
        line.setBounds(0, 0, 50, 30);
        line.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        line.addActionListener(this);
        line.addMouseListener(this);
        line.addMouseMotionListener(this);
        line.setVisible(true);
        jpanel1.add(line);
        background=new JButton();
        background.setText("background");
        background.setBounds(0, 0, 50, 30);
        background.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        background.addActionListener(this);
        background.addMouseListener(this);
        background.addMouseMotionListener(this);
        background.setVisible(true);
        jpanel1.add(background);
        //jpanel8=new JPanel();  
        //jpanel8.setOpaque(false);
        //jpanel8.setBounds(0, 0, 1800, 1000);
        //jpanel8.setBackground(new Color(236, 240, 241));
        jpanel1.setBackground(new Color(236,240,241));
        //c.add(jpanel8);
        c.add(jpanel1);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
   }
     class Poly extends JFrame implements ActionListener, MouseListener
     {
          JLabel jl1;
          JTextField jtf;
          JButton jb1,jb2;
          JPanel jp1;
          public Poly()
          {
             jl1 = new JLabel("Please enter the number of sides of the polygon:"); 
             jl1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		     jtf = new JTextField(10); 
             jtf.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		     jb1 = new JButton("Set!"); 
             jb1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		     jb2 = new JButton("clear"); 
             jb2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		     jp1 = new JPanel(); 
		     jp1.add(jl1); 
		     jp1.add(jtf); 
		     jp1.add(jb1);
		     jp1.add(jb2); 
		     add(jp1,BorderLayout.CENTER); 
		     jb1.addActionListener(this); 
		     jb2.addActionListener(this); 
             setSize(900,200); 
		     setTitle("Set Polygon's side"); 
		     setVisible(true); 		
          }
       public void getInt()
       {
            polynum=Integer.parseInt(jtf.getText());
       }
       public void actionPerformed(ActionEvent e)
        {   
            if(e.getSource()==jb1)
            {
                getInt();
            }
            else if(e.getSource()==jb2)
            {
                jtf.setText("");
                polynum=3;
            }
        }
            
        public void mouseClicked(MouseEvent evt){
                    
        }
        public void mouseEntered(MouseEvent evt){
        }   
        public void mouseExited(MouseEvent evt){
        } 
        public void mousePressed(MouseEvent evt){
        }
        public void mouseReleased(MouseEvent evt){
        }
   }
   public static void main(String args[])
   {
        littlepainter_2 painter=new littlepainter_2();
        painter.setSize(1800,1000);
   }
   public void mousePressed(MouseEvent e)
   {
       if(e.getSource()==btn1)
       {
           state=1;
       }
       else if(e.getSource()==clear)
       {
            Graphics g=getGraphics();
            update(g);
            //jpanel8.setOpaque(false);
            jpanel1.setBackground(new Color(236, 240, 241));
            state=0;
       }
       else if(e.getSource()==polygon)
       {
            state=2;
       }
       else if(e.getSource()==eraser)
       {
            state=3;
       }
       else if(e.getSource()==line)
       {
            state=4;
       }
       else if(e.getSource()==background)
       {
            state=5;
       }
       if(state==1)
       {
            x1=e.getX();   
            y1=e.getY();   
       }
       else if(state==2)
       {
          dx=e.getX();       
          dy=e.getY();
       }
       else if(state==3)
       {
          x1=e.getX();       
          y1=e.getY();
       }
       else if(state==4)
       {
            lineX=e.getX();
            lineY=e.getY();
       }
   }
     public void mouseDragged(MouseEvent e)
     {
          if(state==1)
          {
               Graphics g=getGraphics();
               x2=e.getX();              
               y2=e.getY();             
               g.setColor(color);
               g.fillOval(x2,y2,25,25);
               x1=x2;                  
               y1=y2;                 
          }
          else if(state==2)
          {
               Graphics g=getGraphics();
               x=e.getX();          
               y=e.getY();         
               g.setColor(color);  
               final int sizemax=80;
               if(polynum>=2 && polynum<=sizemax) 
               {
                    int[] X=new int[sizemax],Y=new int[sizemax]; 
                    int s=0,i;
                    double a;
                    final double PIDouble=Math.PI*2; 
                    for(a=0;a<PIDouble;a+=PIDouble/polynum)
                    {
                         X[s] = (int) (Math.round((100/2-1) * Math.cos(a)*Math.pow(10,0))/Math.pow(10,0)); 
                         Y[s] = (int) (Math.round((100/2-1) * Math.sin(a)*Math.pow(10,0))/Math.pow(10,0)); 
                         s++; 
                    }
                    for(i=0;i<polynum;i++)
                    {
                         if(i<polynum-1)
                         {
                              g.drawLine(X[i]+x, Y[i]+y, X[i+1]+x, Y[i+1]+y); 
                         }
                         else
                         {
                              g.drawLine(X[i]+x, Y[i]+y, X[0]+x, Y[0]+y);
                         }
                    }
               }
          }
          else if(state==3)
          {
               Graphics g=getGraphics();
               scrnum=(int)scr.getValue();
               x2=e.getX()-20;          
               y2=e.getY()-20;         
               g.setColor(new Color(236, 240, 241));  
               g.fillOval(x2,y2,scrnum,scrnum);
               x1=x2;                  
               y1=y2;        
          }
          else if(state==4)
          {
               Graphics g=getGraphics();
               lineX1=e.getX();              
               lineY1=e.getY();             
               g.setColor(color);
               g.drawLine(lineX, lineY, lineX1, lineY1);
          }
   }
   public void mouseMoved(MouseEvent e){}
   public void mouseReleased(MouseEvent e)
   {

   }
   public void mouseEntered(MouseEvent e){}
   public void mouseExited(MouseEvent e){}
   public void mouseClicked(MouseEvent e){}
   public void actionPerformed(ActionEvent e)
   {
        if(e.getSource()==btn1)
        {
            final JColorChooser jcc = new JColorChooser();
            color = jcc.showDialog(littlepainter_2.this,"choose color", color);
        }
        else if(e.getSource()==polygon)
        {
               final JColorChooser jcc = new JColorChooser();
               color = jcc.showDialog(littlepainter_2.this,"choose color", color);
               Poly poly=new Poly();
               poly.setDefaultCloseOperation(poly.DISPOSE_ON_CLOSE);
               poly.setVisible(true);            
        }
        else if(e.getSource()==line)
        {
               final JColorChooser jcc = new JColorChooser();
               color = jcc.showDialog(littlepainter_2.this,"choose color", color);            
        }
        else if(e.getSource()==background)
        {
          final JColorChooser jcc = new JColorChooser();
          colorB = jcc.showDialog(littlepainter_2.this,"choose color", colorB);
          //jpanel8.setOpaque(true);
          jpanel1.setBackground(colorB);
        }
   }
}