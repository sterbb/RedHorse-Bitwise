import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class bitstring implements ActionListener{


    //gui elements
    Integer[] bits = {0,1};
    String[] operator = {"∨","∧","→","⊕","↔"};
    JFrame bitstringframe = new JFrame();
    JPanel line = new JPanel();
    JPanel line1 = new JPanel();
    JLabel bitstringimg = new JLabel();
    JLabel bitstringtxt = new JLabel();
    JButton calculatebtn = new JButton();
    JButton back = new JButton();
    JTextField result = new JTextField();
    JLabel bitstringimg2 = new JLabel();
    JLabel conclusion = new JLabel();


    JComboBox comboBox11 = new JComboBox(bits);
    JComboBox comboBox12 = new JComboBox(bits);
    JComboBox comboBox13 = new JComboBox(bits);
    JComboBox comboBox14 = new JComboBox(bits);
    JComboBox comboBox15 = new JComboBox(bits);
    JComboBox comboBox16 = new JComboBox(bits);
    JComboBox comboBox17 = new JComboBox(bits);
    JComboBox comboBox18 = new JComboBox(bits);
    JComboBox comboBox21 = new JComboBox(bits);
    JComboBox comboBox22 = new JComboBox(bits);
    JComboBox comboBox23 = new JComboBox(bits);
    JComboBox comboBox24 = new JComboBox(bits);
    JComboBox comboBox25 = new JComboBox(bits);
    JComboBox comboBox26 = new JComboBox(bits);
    JComboBox comboBox27 = new JComboBox(bits);
    JComboBox comboBox28 = new JComboBox(bits);
    JComboBox operation  = new JComboBox(operator);
    ImageIcon appicon = new ImageIcon("redhorse.png");



    bitstring(){
        //frame
        bitstringframe.setIconImage(appicon.getImage());
        bitstringframe.getContentPane().setBackground(new Color(107,7,0));
        bitstringframe.setSize(1300,1000);
        bitstringframe.setVisible(true);
        bitstringframe.setLayout(null);
        bitstringframe.setTitle("Bit String");
        bitstringframe.setResizable(false);

        //layout
        line.setBounds(0,200,1300,20);
        line.setBackground(Color.white);
        line1.setBounds(50,620,1200,10);
        line1.setBackground(Color.white);


        //title
        ImageIcon bitstringpng = new ImageIcon("bitstring.png");
        bitstringimg.setIcon(bitstringpng);
        bitstringimg.setBounds(50, 0, 200,200);
        bitstringtxt.setText("Bit String");
        bitstringtxt.setFont(new Font("Miandra GD", Font.BOLD,100));
        bitstringtxt.setForeground(Color.WHITE);
        bitstringtxt.setBounds(250,0,500,200);
        bitstringimg2.setIcon(bitstringpng);
        bitstringimg2.setBounds(890,0,200,200);




        //row 1
        //column8
        comboBox11.setFont(new Font("Miandra GD", Font.BOLD, 100));
        comboBox11.setForeground(new Color(107,7,0));
        comboBox11.setBackground(Color.white);
        comboBox11.setBounds(1150,300,100,100);
        comboBox11.setFocusable(false);
        comboBox11.addActionListener(this);
        bitstringframe.add(comboBox11);
        //column7
        comboBox12.setFont(new Font("Miandra GD", Font.BOLD, 100));
        comboBox12.setForeground(new Color(107,7,0));
        comboBox12.setBackground(Color.white);
        comboBox12.setBounds(1020,300,100,100);
        comboBox12.setFocusable(false);
        comboBox12.addActionListener(this);
        bitstringframe.add(comboBox12);
        //column6
        comboBox13.setFont(new Font("Miandra GD", Font.BOLD, 100));
        comboBox13.setForeground(new Color(107,7,0));
        comboBox13.setBackground(Color.white);
        comboBox13.setBounds(890,300,100,100);
        comboBox13.setFocusable(false);
        comboBox13.addActionListener(this);
        bitstringframe.add(comboBox13);
        //column5
        comboBox14.setFont(new Font("Miandra GD", Font.BOLD, 100));
        comboBox14.setForeground(new Color(107,7,0));
        comboBox14.setBackground(Color.white);
        comboBox14.setBounds(760,300,100,100);
        comboBox14.setFocusable(false);
        comboBox14.addActionListener(this);
        bitstringframe.add(comboBox14);
        //column4
        comboBox15.setFont(new Font("Miandra GD", Font.BOLD, 100));
        comboBox15.setForeground(new Color(107,7,0));
        comboBox15.setBackground(Color.white);
        comboBox15.setBounds(630,300,100,100);
        comboBox15.setFocusable(false);
        comboBox15.addActionListener(this);
        bitstringframe.add(comboBox15);

        //column3
        comboBox16.setFont(new Font("Miandra GD", Font.BOLD, 100));
        comboBox16.setForeground(new Color(107,7,0));
        comboBox16.setBackground(Color.white);
        comboBox16.setBounds(500,300,100,100);
        comboBox16.setFocusable(false);
        comboBox16.addActionListener(this);
        bitstringframe.add(comboBox16);
        //column2
        comboBox17.setFont(new Font("Miandra GD", Font.BOLD, 100));
        comboBox17.setForeground(new Color(107,7,0));
        comboBox17.setBackground(Color.white);
        comboBox17.setBounds(370,300,100,100);
        comboBox17.setFocusable(false);
        comboBox17.addActionListener(this);
        bitstringframe.add(comboBox17);
        //column1
        comboBox18.setFont(new Font("Miandra GD", Font.BOLD, 100));
        comboBox18.setForeground(new Color(107,7,0));
        comboBox18.setBackground(Color.white);
        comboBox18.setBounds(240,300,100,100);
        comboBox18.setFocusable(false);
        comboBox18.addActionListener(this);
        bitstringframe.add(comboBox18);






        // row 2
        //column8
        comboBox21.setFont(new Font("Miandra GD", Font.BOLD, 100));
        comboBox21.setForeground(new Color(107,7,0));
        comboBox21.setBackground(Color.white);
        comboBox21.setBounds(1150,500,100,100);
        comboBox21.setFocusable(false);
        comboBox21.addActionListener(this);
        bitstringframe.add(comboBox21);
        //column7
        comboBox22.setFont(new Font("Miandra GD", Font.BOLD, 100));
        comboBox22.setForeground(new Color(107,7,0));
        comboBox22.setBackground(Color.white);
        comboBox22.setBounds(1020,500,100,100);
        comboBox22.setFocusable(false);
        comboBox22.addActionListener(this);
        bitstringframe.add(comboBox22);
        //column6
        comboBox23.setFont(new Font("Miandra GD", Font.BOLD, 100));
        comboBox23.setForeground(new Color(107,7,0));
        comboBox23.setBackground(Color.white);
        comboBox23.setBounds(890,500,100,100);
        comboBox23.setFocusable(false);
        comboBox23.addActionListener(this);
        bitstringframe.add(comboBox23);
        //column5
        comboBox24.setFont(new Font("Miandra GD", Font.BOLD, 100));
        comboBox24.setForeground(new Color(107,7,0));
        comboBox24.setBackground(Color.white);
        comboBox24.setBounds(760,500,100,100);
        comboBox24.setFocusable(false);
        comboBox24.addActionListener(this);
        bitstringframe.add(comboBox24);
        //column4
        comboBox25.setFont(new Font("Miandra GD", Font.BOLD, 100));
        comboBox25.setForeground(new Color(107,7,0));
        comboBox25.setBackground(Color.white);
        comboBox25.setBounds(630,500,100,100);
        comboBox25.setFocusable(false);
        comboBox25.addActionListener(this);
        bitstringframe.add(comboBox25);

        //column3
        comboBox26.setFont(new Font("Miandra GD", Font.BOLD, 100));
        comboBox26.setForeground(new Color(107,7,0));
        comboBox26.setBackground(Color.white);
        comboBox26.setBounds(500,500,100,100);
        comboBox26.setFocusable(false);
        comboBox26.addActionListener(this);
        bitstringframe.add(comboBox26);
        //column2
        comboBox27.setFont(new Font("Miandra GD", Font.BOLD, 100));
        comboBox27.setForeground(new Color(107,7,0));
        comboBox27.setBackground(Color.white);
        comboBox27.setBounds(370,500,100,100);
        comboBox27.setFocusable(false);
        comboBox27.addActionListener(this);
        bitstringframe.add(comboBox27);
        //column1
        comboBox28.setFont(new Font("Miandra GD", Font.BOLD, 100));
        comboBox28.setForeground(new Color(107,7,0));
        comboBox28.setBackground(Color.white);
        comboBox28.setBounds(240,500,100,100);
        comboBox28.setFocusable(false);
        comboBox28.addActionListener(this);
        bitstringframe.add(comboBox28);

        //operation
        operation.setFont(new Font("Miandra GD", Font.BOLD, 80));
        operation.setForeground(new Color(107,7,0));
        operation.setBackground(Color.white);
        operation.setBounds(110,400,100,100);
        operation.setFocusable(false);
        operation.addActionListener(this);
        bitstringframe.add(operation);

        //back
        back.setBackground(Color.black);
        back.setFocusable(false);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Miandra GD", Font.BOLD, 80));
        back.setText("⌂");
        back.addActionListener(this);
        back.setBounds(50,830,200,100);
        back.setBorder(BorderFactory.createEmptyBorder());


        //result
        result.setBounds(50,640,1200,100);
        result.setFont(new Font("Miandra GD", Font.BOLD,100));
        result.setForeground(new Color(107,7,0));
        result.setHorizontalAlignment(SwingConstants.RIGHT);
        result.setEditable(false);

        //Buttons
        calculatebtn.setText("⏎");
        calculatebtn.setForeground(new Color(107,7,0));
        calculatebtn.setBackground(Color.white);
        calculatebtn.setBounds(1050,830,200,100);
        calculatebtn.addActionListener(this);
        calculatebtn.setFont(new Font("Miandra GD", Font.BOLD, 80));
        calculatebtn.setFocusable(false);
        calculatebtn.setBorder(BorderFactory.createEmptyBorder());

        conclusion.setText("∴");
        conclusion.setBounds(900,710,1000,100);
        conclusion.setForeground(Color.WHITE);
        conclusion.setFont(new Font("Miandra GD", Font.BOLD, 50));


        //frame elements
        bitstringframe.add(calculatebtn);
        bitstringframe.add(line);
        bitstringframe.add(line1);
        bitstringframe.add(bitstringimg);
        bitstringframe.add(bitstringtxt);
        bitstringframe.add(result);
        bitstringframe.add(back);
        bitstringframe.add(conclusion);



        //close application
        bitstringframe.addWindowListener(new WindowAdapter() {
            public void windowClosing (WindowEvent we){
                int confirm = JOptionPane.showConfirmDialog(bitstringframe, "Do you want to close the program?", "Close Program", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                if (confirm == JOptionPane.YES_OPTION) {
                    bitstringframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                } else {
                    bitstringframe.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
            }
        });



    }
        String bit1;
        String bit2;
        String bit3;
        String bit4;
        String bit5;
        String bit6;
        String bit7;
        String bit8;
        String bitwise;



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== calculatebtn){
            int operating = operation.getSelectedIndex();
            switch(operating) {
                //or operator
                case 0:
                    //start on the left
                    //1st column
                    if (comboBox18.getSelectedIndex() == 0 && comboBox28.getSelectedIndex() == 0) {
                        bit8 = "0";
                    } else {
                        bit8 = "1";
                    }
                    //2nd column
                    if (comboBox17.getSelectedIndex() == 0 && comboBox27.getSelectedIndex() == 0) {
                        bit7 = "0";
                    } else {
                        bit7 = "1";
                    }
                    //3rd column
                    if (comboBox16.getSelectedIndex() == 0 && comboBox26.getSelectedIndex() == 0) {
                        bit6 = "0";
                    } else {
                        bit6 = "1";
                    }
                    //4th column
                    if (comboBox15.getSelectedIndex() == 0 && comboBox25.getSelectedIndex() == 0) {
                        bit5 = "0";
                    } else {
                        bit5 = "1";
                    }
                    //5th column
                    if (comboBox14.getSelectedIndex() == 0 && comboBox24.getSelectedIndex() == 0) {
                        bit4 = "0";
                    } else {
                        bit4 = "1";
                    }
                    //6th column
                    if (comboBox13.getSelectedIndex() == 0 && comboBox23.getSelectedIndex() == 0) {
                        bit3 = "0";
                    } else {
                        bit3 = "1";
                    }
                    //7th column
                    if (comboBox12.getSelectedIndex() == 0 && comboBox22.getSelectedIndex() == 0) {
                        bit2 = "0";
                    } else {
                        bit2 = "1";
                    }
                    //8th column
                    if (comboBox11.getSelectedIndex() == 0 && comboBox21.getSelectedIndex() == 0) {
                        bit1 = "0";
                    } else {
                        bit1 = "1";
                    }

                    bitwise = bit8 + bit7 + bit6 + bit5 + bit4 + bit3 + bit2 + bit1;
                    result.setText(bitwise);
                    if(bitwise.equals("00000000")){
                        conclusion.setText("∴Contradiction");
                    }else if(bitwise.equals("11111111")){
                        conclusion.setText("∴Tautology");
                    }else{
                        conclusion.setText("∴Contingency");
                    }

                    break;

                //and operator
                case 1:
                    if (comboBox18.getSelectedIndex() == 1 && comboBox28.getSelectedIndex() == 1) {
                        bit8 = "1";
                    } else {
                        bit8 = "0";
                    }
                    if (comboBox17.getSelectedIndex() == 1 && comboBox27.getSelectedIndex() == 1) {
                        bit7 = "1";
                    } else {
                        bit7 = "0";
                    }
                    if (comboBox16.getSelectedIndex() == 1 && comboBox26.getSelectedIndex() == 1) {
                        bit6 = "1";
                    } else {
                        bit6 = "0";
                    }
                    if (comboBox15.getSelectedIndex() == 1 && comboBox25.getSelectedIndex() == 1) {
                        bit5 = "1";
                    } else {
                        bit5 = "0";
                    }
                    if (comboBox14.getSelectedIndex() == 1 && comboBox24.getSelectedIndex() == 1) {
                        bit4 = "1";
                    } else {
                        bit4 = "0";
                    }
                    if (comboBox13.getSelectedIndex() == 1 && comboBox23.getSelectedIndex() == 1) {
                        bit3 = "1";
                    } else {
                        bit3 = "0";
                    }
                    if (comboBox12.getSelectedIndex() == 1 && comboBox22.getSelectedIndex() == 1) {
                        bit2 = "1";
                    } else {
                        bit2 = "0";
                    }
                    if (comboBox11.getSelectedIndex() == 1 && comboBox21.getSelectedIndex() == 1) {
                        bit1 = "1";
                    } else {
                        bit1 = "0";
                    }

                    bitwise = bit8 + bit7 + bit6 + bit5 + bit4 + bit3 + bit2 + bit1;
                    result.setText(bitwise);
                    if(bitwise.equals("00000000")){
                        conclusion.setText("∴Contradiction");
                    }else if(bitwise.equals("11111111")){
                        conclusion.setText("∴Tautology");
                    }else{
                        conclusion.setText("∴Contingency");
                    }

                    break;

                //if operator
                case 2:
                    //1st column
                    if (comboBox18.getSelectedIndex() == 1 && comboBox28.getSelectedIndex() == 0) {
                        bit8 = "0";
                    } else {
                        bit8 = "1";
                    }
                    //2nd column
                    if (comboBox17.getSelectedIndex() == 1 && comboBox27.getSelectedIndex() == 0) {
                        bit7 = "0";
                    } else {
                        bit7 = "1";
                    }
                    //3rd column
                    if (comboBox16.getSelectedIndex() == 1 && comboBox26.getSelectedIndex() == 0) {
                        bit6 = "0";
                    } else {
                        bit6 = "1";
                    }
                    //4th column
                    if (comboBox15.getSelectedIndex() == 1 && comboBox25.getSelectedIndex() == 0) {
                        bit5 = "0";
                    } else {
                        bit5 = "1";
                    }
                    //5th column
                    if (comboBox14.getSelectedIndex() == 1 && comboBox24.getSelectedIndex() == 0) {
                        bit4 = "0";
                    } else {
                        bit4 = "1";
                    }
                    //6th column
                    if (comboBox13.getSelectedIndex() == 1 && comboBox23.getSelectedIndex() == 0) {
                        bit3 = "0";
                    } else {
                        bit3 = "1";
                    }
                    //7th column
                    if (comboBox12.getSelectedIndex() == 1 && comboBox22.getSelectedIndex() == 0) {
                        bit2 = "0";
                    } else {
                        bit2 = "1";
                    }
                    //8th column
                    if (comboBox11.getSelectedIndex() == 1 && comboBox21.getSelectedIndex() == 0) {
                        bit1 = "0";
                    } else {
                        bit1 = "1";
                    }


                    bitwise = bit8 + bit7 + bit6 + bit5 + bit4 + bit3 + bit2 + bit1;
                    result.setText(bitwise);
                    if(bitwise.equals("00000000")){
                        conclusion.setText("∴Contradiction");
                    }else if(bitwise.equals("11111111")){
                        conclusion.setText("∴Tautology");
                    }else{
                        conclusion.setText("∴Contingency");
                    }
                    break;

                //xor operator
                case 3:
                    //1st
                    if (comboBox18.getSelectedIndex() == 1 && comboBox28.getSelectedIndex() == 0 || comboBox18.getSelectedIndex() == 0 && comboBox28.getSelectedIndex() == 1) {
                        bit8 = "1";
                    } else {
                        bit8 = "0";
                    }
                    //2nd
                    if (comboBox17.getSelectedIndex() == 1 && comboBox27.getSelectedIndex() == 0 || comboBox17.getSelectedIndex() == 0 && comboBox27.getSelectedIndex() == 1) {
                        bit7 = "1";
                    } else {
                        bit7 = "0";
                    }
                    //3rd
                    if (comboBox16.getSelectedIndex() == 1 && comboBox26.getSelectedIndex() == 0 || comboBox16.getSelectedIndex() == 0 && comboBox26.getSelectedIndex() == 1) {
                        bit6 = "1";
                    } else {
                        bit6 = "0";
                    }
                    //4th
                    if (comboBox15.getSelectedIndex() == 1 && comboBox25.getSelectedIndex() == 0 || comboBox15.getSelectedIndex() == 0 && comboBox25.getSelectedIndex() == 1) {
                        bit5 = "1";
                    } else {
                        bit5 = "0";
                    }
                    //5th
                    if (comboBox14.getSelectedIndex() == 1 && comboBox24.getSelectedIndex() == 0 || comboBox14.getSelectedIndex() == 0 && comboBox24.getSelectedIndex() == 1) {
                        bit4 = "1";
                    } else {
                        bit4 = "0";
                    }
                    //6th
                    if (comboBox13.getSelectedIndex() == 1 && comboBox23.getSelectedIndex() == 0 || comboBox13.getSelectedIndex() == 0 && comboBox23.getSelectedIndex() == 1) {
                        bit3 = "1";
                    } else {
                        bit3 = "0";
                    }
                    //7th
                    if (comboBox12.getSelectedIndex() == 1 && comboBox22.getSelectedIndex() == 0 || comboBox12.getSelectedIndex() == 0 && comboBox22.getSelectedIndex() == 1) {
                        bit2 = "1";
                    } else {
                        bit2 = "0";
                    }
                    //8th
                    if (comboBox11.getSelectedIndex() == 1 && comboBox21.getSelectedIndex() == 0 || comboBox11.getSelectedIndex() == 0 && comboBox21.getSelectedIndex() == 1) {
                        bit1 = "1";
                    } else {
                        bit1 = "0";
                    }

                    bitwise = bit8 + bit7 + bit6 + bit5 + bit4 + bit3 + bit2 + bit1;
                    result.setText(bitwise);
                    if(bitwise.equals("00000000")){
                        conclusion.setText("∴Contradiction");
                    }else if(bitwise.equals("11111111")){
                        conclusion.setText("∴Tautology");
                    }else{
                        conclusion.setText("∴Contingency");
                    }
                    break;

                //Iff operator
                case 4:
                    //1st
                    if (comboBox18.getSelectedIndex() == 1 && comboBox28.getSelectedIndex() == 1 || comboBox18.getSelectedIndex() == 0 && comboBox28.getSelectedIndex() == 0) {
                        bit8 = "1";
                    } else {
                        bit8 = "0";
                    }
                    //2nd
                    if (comboBox17.getSelectedIndex() == 1 && comboBox27.getSelectedIndex() == 1 || comboBox17.getSelectedIndex() == 0 && comboBox27.getSelectedIndex() == 0) {
                        bit7 = "1";
                    } else {
                        bit7 = "0";
                    }
                    //3rd
                    if (comboBox16.getSelectedIndex() == 1 && comboBox26.getSelectedIndex() == 1 || comboBox16.getSelectedIndex() == 0 && comboBox26.getSelectedIndex() == 0) {
                        bit6 = "1";
                    } else {
                        bit6 = "0";
                    }
                    //4th
                    if (comboBox15.getSelectedIndex() == 1 && comboBox25.getSelectedIndex() == 1 || comboBox15.getSelectedIndex() == 0 && comboBox25.getSelectedIndex() == 0) {
                        bit5 = "1";
                    } else {
                        bit5 = "0";
                    }
                    //5th
                    if (comboBox14.getSelectedIndex() == 1 && comboBox24.getSelectedIndex() == 1 || comboBox14.getSelectedIndex() == 0 && comboBox24.getSelectedIndex() == 0) {
                        bit4 = "1";
                    } else {
                        bit4 = "0";
                    }
                    //6th
                    if (comboBox13.getSelectedIndex() == 1 && comboBox23.getSelectedIndex() == 1 || comboBox13.getSelectedIndex() == 0 && comboBox23.getSelectedIndex() == 0) {
                        bit3 = "1";
                    } else {
                        bit3 = "0";
                    }
                    //7th
                    if (comboBox12.getSelectedIndex() == 1 && comboBox22.getSelectedIndex() == 1 || comboBox12.getSelectedIndex() == 0 && comboBox22.getSelectedIndex() == 0) {
                        bit2 = "1";
                    } else {
                        bit2 = "0";
                    }
                    //8th
                    if (comboBox11.getSelectedIndex() == 1 && comboBox21.getSelectedIndex() == 1 || comboBox11.getSelectedIndex() == 0 && comboBox21.getSelectedIndex() == 0) {
                        bit1 = "1";
                    } else {
                        bit1 = "0";
                    }

                    bitwise = bit8 + bit7 + bit6 + bit5 + bit4 + bit3 + bit2 + bit1;
                    result.setText(bitwise);
                    if(bitwise.equals("00000000")){
                        conclusion.setText("∴Contradiction");
                    }else if(bitwise.equals("11111111")){
                        conclusion.setText("∴Tautology");
                    }else{
                        conclusion.setText("∴Contingency");
                    }
                    break;
            }

        }

        if (e.getSource() == back){
            bitstringframe.setVisible(false);
            menu Menu = new menu();
        }
    }


}

