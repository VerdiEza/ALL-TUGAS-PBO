package Tugas13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Kalkulator extends JFrame implements ActionListener{
    
    JTextField input1 = new JTextField();
    JTextField input2 = new JTextField();

    JButton tambah = new JButton("+");
    JButton kurang = new JButton("-");
    JButton bagi = new JButton("/");
    JButton perkalian = new JButton("*");
    JButton modulus = new JButton("mod");

    JLabel equal = new JLabel("\t\t=\t");
    JLabel hasil = new JLabel("Hasil");


    Kalkulator(){
        super("Kalkulator Sederhana");
        setSize(450,375);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
    
        //input panel
        FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
        JPanel panelinput = new JPanel(fl);
        panelinput.setBounds(0, 0, 450, 75);

        panelinput.add(input1);
        input1.setPreferredSize(new Dimension(150, 50));

        panelinput.add(input2);
        input2.setPreferredSize(new Dimension(150, 50));

        //label
        
        panelinput.add(equal);
        panelinput.add(hasil);

        add(panelinput);

        //button panel
        JPanel buttonpanel = new JPanel();
        buttonpanel.setLayout(new BoxLayout(buttonpanel, BoxLayout.Y_AXIS));
        buttonpanel.setBackground(Color.red);
        buttonpanel.setBounds(0,75, 300, 250);

        buttonpanel.add(tambah);
        buttonpanel.add(kurang);
        buttonpanel.add(perkalian);
        buttonpanel.add(bagi);
        buttonpanel.add(modulus);

        tambah.setMaximumSize(new Dimension(300,50));
        kurang.setMaximumSize(new Dimension(300,50));
        perkalian.setMaximumSize(new Dimension(300,50));
        bagi.setMaximumSize(new Dimension(300,50));
        modulus.setMaximumSize(new Dimension(300,50));
        
        add(buttonpanel);

        //register event source
        tambah.addActionListener(this);
        kurang.addActionListener(this);
        perkalian.addActionListener(this);
        bagi.addActionListener(this);
        modulus.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
        try {

            int x = Integer.parseInt(input1.getText());
            int y = Integer.parseInt(input2.getText());

            if(e.getActionCommand().equals("+")){
                hasil.setText(Integer.toString(x + y));
            }
            else if(e.getActionCommand().equals("-")){
                hasil.setText(Integer.toString(x - y));
            }
            else if(e.getActionCommand().equals("*")){
                hasil.setText(Integer.toString(x * y));
            }
            else if(e.getActionCommand().equals("/")){
                hasil.setText(Integer.toString(x / y));
            }
            else if(e.getActionCommand().equals("mod")){
                hasil.setText(Integer.toString(x % y));
            }
            
        } catch (Exception m) { 
            //TODO: handle masalah
            hasil.setText(m.getMessage());
            
            
        } 
        
    }
    public static void main(String[] args) {
        Kalkulator kl = new Kalkulator();
    }
}
