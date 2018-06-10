/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginpage;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

/**
 *
 * @author aja;y
 */
class abc extends Frame {
    class A implements ActionListener{

    
   @Override
   public void actionPerformed(ActionEvent e) {
       String s1=tf1.getText();
       String s2=tf2.getText();
       if(s1.matches("Ajay") && s2.matches("123")){
           l3.setText("login success");
           
       }
       else{
           l3.setText("login failed");
       }
       
    
      
     
      
    }
    
}

   
       Button b;
       TextField tf1,tf2;
       Panel p;
       Label l1,l2,l3;
       
       
        abc(){
           setSize(500,600);
           setLayout(null);
           setBackground(Color.WHITE);
           p=new Panel();
           p.setLayout(null);
           p.setBackground(Color.BLUE);
           p.setBounds(80,80,400,450);
           add(p);
           l1=new Label("enter user id");
           p.add(l1);
           l1.setBounds(30,30,100,20);
           l1.setForeground(Color.YELLOW);
          
            l2=new Label("enter password");
            p.add(l2);
           l2.setBounds(30,50,100,60);
           l2.setForeground(Color.YELLOW);
           tf1=new TextField();
          
           p.add(tf1);
           tf1.setBounds(150,30,200,30);
           tf2=new TextField();
           
           p.add(tf2);
           tf2.setBounds(150,70,200,30);
           l3=new Label("---------");
           p.add(l3);
           l3.setBounds(120,250,100,100);
           l3.setForeground(Color.YELLOW);
           b=new Button("LOGIN");
           b.setBounds(120,120,100,100);
           b.setForeground(Color.YELLOW);
           b.addActionListener(new A());
           
           p.add(b);
           
          }
     }

class demo implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
      System.exit(0);
       
    }

    @Override
    public void windowClosed(WindowEvent e) {
         System.out.println("windowClosed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
         System.out.println("windowIconified");}

    @Override
    public void windowDeiconified(WindowEvent e) {
          System.out.println("windowDeiconified");}


    @Override
    public void windowActivated(WindowEvent e) {
          System.out.println("windowClosing");}


    @Override
    public void windowDeactivated(WindowEvent e) {
         System.out.println("windowClosing");}

    
    
}
class LoginPage{
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        abc g=new abc();
        g.setVisible(true);
        demo d=new demo();
        g.addWindowListener(d);
        
      
        
        
    }
    
}
