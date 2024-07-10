import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class menu {

    menu() {
        //GUI
        JFrame frame = new JFrame();

        //icon
        ImageIcon appicon = new ImageIcon("redhorse.png");
        frame.setIconImage(appicon.getImage());
        frame.getContentPane().setBackground(Color.white);

        //logo and text
        JPanel title = new JPanel();
        title.setBackground(Color.white);
        ImageIcon redhorse = new ImageIcon("redhorse.png");
        JLabel bitwise = new JLabel("BITWISE");
        JLabel operation = new JLabel("OPERATION");
        bitwise.setFont(new Font("Miandra GD", Font.BOLD, 70));
        bitwise.setForeground(new Color(107, 7, 0));
        operation.setForeground(new Color(107, 7, 0));
        operation.setFont(new Font("Miandra GD", Font.BOLD, 70));
        ImageIcon titlepng = new ImageIcon("redhorsetitle.png");
        title.setLayout(new FlowLayout(FlowLayout.CENTER));
        bitwise.setIcon(titlepng);
        bitwise.setVerticalTextPosition(JLabel.CENTER);
        operation.setVerticalAlignment(JLabel.BOTTOM);
        operation.setVerticalTextPosition(JLabel.BOTTOM);


        //Options
        JButton bitstring = new JButton();
        bitstring.setFocusable(false);
        bitstring.setBackground(new Color(107, 7, 0));
        bitstring.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == bitstring) {
                    frame.setVisible(false);
                    bitstring Bitstring = new bitstring();
                }
            }
        });

        JLabel bitstringtxt = new JLabel("Bit String");
        bitstringtxt.setForeground(Color.white);
        bitstringtxt.setFont(new

                Font("Miandra GD", Font.BOLD, 100));
        ImageIcon bitstringpng = new ImageIcon("bitstring.png");
        bitstringtxt.setIcon(bitstringpng);
        bitstringtxt.setIconTextGap(150);


        JButton truthtable = new JButton();
        truthtable.setFocusable(false);
        truthtable.setBackground(new

                Color(107, 7, 0));
        truthtable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == truthtable) {
                    frame.setVisible(false);
                    truthtable Truthtable = new truthtable();

                }
            }
        });

        JLabel truthtabletxt = new JLabel("Truth Table");
        ImageIcon truthtablepng = new ImageIcon("truthtable.png");
        truthtabletxt.setForeground(Color.WHITE);
        truthtabletxt.setFont(new Font("Miandra GD", Font.BOLD, 100));
        truthtabletxt.setIcon(truthtablepng);
        truthtabletxt.setIconTextGap(100);


        //gui layout
        frame.setSize(950, 800);
        frame.setTitle("Bitwise Operation");
        frame.setLayout(new GridLayout(3, 0));
        frame.setVisible(true);
        frame.add(title);
        frame.add(truthtable);
        frame.add(bitstring);
        title.add(bitwise);
        title.add(operation);
        truthtable.add(truthtabletxt);
        bitstring.add(bitstringtxt);
        frame.setResizable(false);


        //closing the program
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                int confirm = JOptionPane.showConfirmDialog(frame, "Do you want to close the program?", "Close Program", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                if (confirm == JOptionPane.YES_OPTION) {
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                } else {
                    frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
            }
        });


    }
}

