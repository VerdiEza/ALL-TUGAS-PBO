package sesi12;

import javax.swing.*;
import java.awt.*;

public class Kalkulator extends JFrame{
    
    JTextField txt = new JTextField(50);

    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton b0 = new JButton("0");
    JButton bEqual = new JButton("=");
    JButton bPlus = new JButton("+");
    JButton bMinus = new JButton("-");
    JButton bMultiply = new JButton("*");
    JButton bDivide = new JButton("/");
    JButton bPercent = new JButton("%");
    JButton bModulo = new JButton("Mod");
    JButton bExit = new JButton("Exit");
    

    Kalkulator(int sizex, int sizey){
        super("Kalkulator Ilmiah");
        setSize(sizex, sizey);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        getContentPane().setBackground(Color.BLUE);
        setLocationRelativeTo(null);

        FlowLayout fl = new FlowLayout();
        JPanel inputpanel = new JPanel();
        inputpanel.setLayout(fl);
        inputpanel.add(txt);
        add(inputpanel, BorderLayout.NORTH);

        GridLayout gl = new GridLayout(3, 5);
        JPanel buttonpanel = new JPanel();
        buttonpanel.setLayout(gl);

        buttonpanel.add(b1);
        buttonpanel.add(b2);
        buttonpanel.add(b3);
        buttonpanel.add(b4);
        buttonpanel.add(b5);
        buttonpanel.add(b6);
        buttonpanel.add(b7);
        buttonpanel.add(b8);
        buttonpanel.add(b9);
        buttonpanel.add(b0);
        buttonpanel.add(bEqual);
        buttonpanel.add(bPlus);
        buttonpanel.add(bMinus);
        buttonpanel.add(bMultiply);
        buttonpanel.add(bDivide);
        buttonpanel.add(bPercent);
        buttonpanel.add(bModulo);
        buttonpanel.add(bExit);

        
        add(buttonpanel, BorderLayout.CENTER);
        
    }

    public static void main(String[] args) {
        Kalkulator kal = new Kalkulator(350 , 250);
    }
}
