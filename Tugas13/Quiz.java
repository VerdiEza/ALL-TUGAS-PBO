package Tugas13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Quiz extends JFrame implements ActionListener {
    
    int x,y;
    JTextField input3 = new JTextField();
    JLabel ket = new JLabel();
    JPanel dsp;

    Quiz(){
        super("Quiz dadakan");
        setSize(450, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        
        //display panel
        FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
        dsp = new JPanel(fl);
        dsp.setBounds(0, 0, 450, 75);
        dsp.setOpaque(false);

        setRandom();
        
        JLabel icon = new JLabel("=");
        dsp.add(icon);

        dsp.add(input3);
        input3.setPreferredSize(new Dimension(125, 50));
        add(dsp);
        
        //check
        JPanel btnpanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        btnpanel.setBounds(0, 75, 450, 75);
        btnpanel.setOpaque(false);;
        
        JButton check = new JButton("Check");
        check.setPreferredSize(new Dimension(250,30));
        btnpanel.add(check);

        add(btnpanel);

        ket.setBounds(20, 125, 450, 30);
        add(ket);

        //regist
        check.addActionListener(this);

        setVisible(true);
    }

    public void setRandom(){

        Random rand = new Random();
        x = rand.nextInt(10);
        y = rand.nextInt(10);

        JTextField input1 = new JTextField();
        input1.setText(Integer.toString(x));
        dsp.add(input1);
        input1.setPreferredSize(new Dimension(125, 50));
        input1.setEditable(false);

        JTextField input2 = new JTextField();
        input2.setText(Integer.toString(y));
        dsp.add(input2);
        input2.setPreferredSize(new Dimension(125, 50));
        input2.setEditable(false);
    }

    public static void main(String[] args) {
        Quiz edlink = new Quiz();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        try {

            int hasil = Integer.parseInt(input3.getText());
            
            if(x + y == hasil){
                getContentPane().setBackground(Color.green);
                ket.setText("Selamat jawaban anda benar!!!");
            }
            else{
                getContentPane().setBackground(Color.red);
                ket.setText("Maaf, Jawaban anda salah!!!");

            }
            
        } catch (Exception p) {
            //TODO: handle persoalan
            System.out.println(p.getMessage());
        }
        
    }
    
}
