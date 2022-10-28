import  javax.swing.*;      
import  java.awt.*;           

public  class  Flags{
      public  static  void  main(String[]  args){
            JFrame  theGUI  =  new  JFrame();
            theGUI.setTitle("Poland Flag");
            theGUI.setSize(300,  200);
            theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel  panel1  =  new  JPanel();  
            panel1.setBackground(Color.white);
            JPanel  panel2  =  new  JPanel();  
            panel2.setBackground(Color.red);
            Container  pane  =  theGUI.getContentPane();
            pane.setLayout(new  GridLayout(2,  1));
            pane.add(panel1);
            pane.add(panel2);
            theGUI.setVisible(true);
      }
}