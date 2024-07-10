import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class truthtable implements ActionListener{

    JFrame propositionmenu = new JFrame();
    JFrame truthtableframe = new JFrame();
    ImageIcon appicon = new ImageIcon("redhorse.png");
    JButton home = new JButton();
    JButton home1 = new JButton();


    //proposition elements
    JButton pbutton1 = new JButton();
    JButton pbutton2= new JButton();
    JButton orbutton = new JButton();
    JButton andbutton = new JButton();
    JButton ifbutton = new JButton();
    JButton xorbutton = new JButton();
    JButton iffbutton = new JButton();
    JButton qbutton1 = new JButton();
    JButton qbutton2 = new JButton();
    JButton proceed = new JButton();
    JButton clear = new JButton();
    JLabel proposition = new JLabel("Conditional Proposition: ");
    String propositiontxt = "Conditional Proposition: ";
    JLabel proposition1 = new JLabel("Conditional Proposition: ");
    DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
    JLabel conclusion = new JLabel();








    //truthtablemenu elements

    //or operator
    //pvq
    Object pvqdata[][] = { {1,1,1}, {1,0,1}, {0,1,1} ,{0,0,0}};
    Object pvqheader[] = {"p","q","p∨q"};
    JTable pvqtable = new JTable(pvqdata,pvqheader);

    //-pvq
    Object notpvqdata[][] = { {1,1,0,1}, {1,0,0,0}, {0,1,1,1} ,{0,0,1,1}};
    Object notpvqheader[] = {"p","q","-p","-p∨q"};
    JTable notpvqtable = new JTable(notpvqdata,notpvqheader);

    //pv-q
    Object pvnotqdata[][] = { {1,1,0,1}, {1,0,1,1}, {0,1,0,0} ,{0,0,1,1}};
    Object pvnotqheader[] = {"p","q","-q","p∨-q"};
    JTable pvnotqtable = new JTable(pvnotqdata,pvnotqheader);

    //-pv-q
    Object notpvnotqdata[][] = { {1,1,0,0,0}, {1,0,0,1,1}, {0,1,1,0,1} ,{0,0,1,1,1}};
    Object notpvnotqheader[] = {"p","q","-p","-q","-p∨-q"};
    JTable notpvnotqtable = new JTable(notpvnotqdata,notpvnotqheader);

    //and operator
    //p^q
    Object pandqdata [][] = { {1,1,1}, {1,0,0}, {0,1,0}, {0,0,0}};
    Object pandqheader [] = {"p", "q", "p^q"};
    JTable pandqtable = new JTable(pandqdata,pandqheader);

    //-p^q
    Object notpandqdata [][] = { {1,1,0,0}, {1,0,0,0}, {0,1,1,1}, {0,0,1,0}};
    Object notpandqheader [] = {"p", "q", "-p", "-p^q"};
    JTable notpandqtable = new JTable(notpandqdata,notpandqheader);

    //p^-q
    Object pandnotqdata [][] = { {1,1,0,0}, {1,0,1,1}, {0,1,0,0}, {0,0,1,0}};
    Object pandnotqheader [] = {"p", "q", "-q", "p^-q"};
    JTable pandnotqtable = new JTable(pandnotqdata,pandnotqheader);

    //-p^-q
    Object notpandnotqdata [][] = { {1,1,0,0,0}, {1,0,0,1,0}, {0,1,1,0,0}, {0,0,1,1,1}};
    Object notpandnotqheader [] = {"p", "q", "-p", "-q", "-p^-q"};
    JTable notpandnotqtable = new JTable(notpandnotqdata,notpandnotqheader);

    //if operator
    //p→q
    Object pimpqdata [][] = { {1,1,1}, {1,0,0}, {0,1,1}, {0,0,1}};
    Object pimpqheader [] = {"p", "q", "p→q"};
    JTable pimpqtable = new JTable(pimpqdata, pimpqheader);

    //-p→q
    Object notpimpqdata [][] = { {1,1,0,1}, {1,0,0,1}, {0,1,1,1}, {0,0,1,0}};
    Object notpimpqheader [] = {"p", "q", "-p","-p→q"};
    JTable notpimpqtable = new JTable(notpimpqdata, notpimpqheader);

    //p→-q
    Object pimpnotqdata [][] = { {1,1,0,0}, {1,0,1,1}, {0,1,0,1}, {0,0,1,1}};
    Object pimpnotqheader [] = {"p", "q", "-q", "p→-q"};
    JTable pimpnotqtable = new JTable(pimpnotqdata, pimpnotqheader);

    //-p→-q
    Object notpimpnotqdata [][] = { {1,1,0,0,1}, {1,0,0,1,1}, {0,1,1,0,0}, {0,0,1,1,1}};
    Object notpimpnotqheader [] = {"p", "q", "-p", "-q", "-p→-q"};
    JTable notpimpnotqtable = new JTable(notpimpnotqdata, notpimpnotqheader);

    //xor operator
    //p⊕q
    Object pxorqdata [][] = { {1,1,0}, {1,0,1}, {0,1,1}, {0,0,0}};
    Object pxorqheader [] = {"p", "q", "p⊕q"};
    JTable pxorqtable = new JTable(pxorqdata, pxorqheader);

    //-p⊕q
    Object notpxorqdata [][] = { {1,1,0,1}, {1,0,0,0}, {0,1,1,0}, {0,0,1,1}};
    Object notpxorqheader [] = {"p", "q", "-p", "-p⊕q"};
    JTable notpxorqtable = new JTable(notpxorqdata, notpxorqheader);

    //p⊕-q
    Object pxornotqdata [][] = { {1,1,0,1}, {1,0,1,0}, {0,1,0,0}, {0,0,1,1}};
    Object pxornotqheader [] = {"p", "q", "-q", "p⊕-q"};
    JTable pxornotqtable = new JTable(pxornotqdata, pxornotqheader);

    //-p⊕-q
    Object notpxornotqdata [][] = { {1,1,0,0,0}, {1,0,0,1,1}, {0,1,1,0,1}, {0,0,1,1,0}};
    Object notpxornotqheader [] = {"p", "q", "-p", "-q", "-p⊕-q"};
    JTable notpxornotqtable = new JTable(notpxornotqdata, notpxornotqheader);

    //iff operator
    //p↔q
    Object piffqdata [][] = { {1,1,1}, {1,0,0}, {0,1,0}, {0,0,1}};
    Object piffqheader [] = {"p", "q", "p↔q"};
    JTable piffqtable = new JTable(piffqdata, piffqheader);

    //-p↔q
    Object notpiffqdata [][] = { {1,1,0,0}, {1,0,0,1}, {0,1,1,1}, {0,0,1,0}};
    Object notpiffqheader [] = {"p", "q", "-p", "-p↔q"};
    JTable notpiffqtable = new JTable(notpiffqdata, notpiffqheader);

    //p↔-q
    Object piffnotqdata [][] = { {1,1,0,0}, {1,0,1,1}, {0,1,0,1}, {0,0,1,0}};
    Object piffnotqheader [] = {"p", "q", "-q", "p↔-q"};
    JTable piffnotqtable = new JTable(piffnotqdata, piffnotqheader);


    //-p↔-q
    Object notpiffnotqdata [][] = { {1,1,0,0,1}, {1,0,0,1,0}, {0,1,1,0,0}, {0,0,1,1,1}};
    Object notpiffnotqheader [] = {"p", "q", "-p", "-q", "-p↔-q"};
    JTable notpiffnotqtable = new JTable(notpiffnotqdata, notpiffnotqheader);


    JButton back = new JButton();
    JPanel truth_table = new JPanel();




    truthtable(){

        // proposition
        propositionmenu.setIconImage(appicon.getImage());
        propositionmenu.getContentPane().setBackground(new Color(107,7,0));
        propositionmenu.setSize(600,570);
        propositionmenu.setVisible(true);
        propositionmenu.setLayout(null);
        propositionmenu.setTitle("Truth Table");
        propositionmenu.setResizable(false);





        //proposition menu layout
        proposition.setBounds(0,90,500,50);
        proposition.setFont(new Font("Miandra GD", Font.BOLD, 32));
        proposition.setForeground(Color.WHITE);



        pbutton1.setText("p");
        pbutton1.setForeground(new Color(107,7,0));
        pbutton1.setBackground(Color.white);
        pbutton1.setFont(new Font("Miandra GD", Font.BOLD, 30));
        pbutton1.setBounds(30,170,80,80);
        pbutton1.setFocusable(false);
        pbutton1.addActionListener(this);

        pbutton2.setText("-p");
        pbutton2.setForeground(new Color(107,7,0));
        pbutton2.setBackground(Color.white);
        pbutton2.setFont(new Font("Miandra GD", Font.BOLD, 30));
        pbutton2.setBounds(130,170,80,80);
        pbutton2.setFocusable(false);
        pbutton2.addActionListener(this);

        qbutton1.setText("q");
        qbutton1.setForeground(new Color(107,7,0));
        qbutton1.setBackground(Color.white);
        qbutton1.setFont(new Font("Miandra GD", Font.BOLD, 30));
        qbutton1.setBounds(30,300,80,80);
        qbutton1.setFocusable(false);
        qbutton1.setEnabled(false);
        qbutton1.addActionListener(this);

        qbutton2.setText("-q");
        qbutton2.setForeground(new Color(107,7,0));
        qbutton2.setBackground(Color.white);
        qbutton2.setFont(new Font("Miandra GD", Font.BOLD, 30));
        qbutton2.setBounds(130,300,80,80);
        qbutton2.setFocusable(false);
        qbutton2.setEnabled(false);
        qbutton2.addActionListener(this);

        orbutton.setText("∨");
        orbutton.setForeground(new Color(107,7,0));
        orbutton.setBackground(Color.white);
        orbutton.setFont(new Font("Miandra GD", Font.BOLD, 30));
        orbutton.setBounds(280,170,80,80);
        orbutton.setFocusable(false);
        orbutton.setEnabled(false);
        orbutton.addActionListener(this);

        andbutton.setText("∧");
        andbutton.setForeground(new Color(107,7,0));
        andbutton.setBackground(Color.white);
        andbutton.setFont(new Font("Miandra GD", Font.BOLD, 30));
        andbutton.setBounds(380,170,80,80);
        andbutton.setFocusable(false);
        andbutton.setEnabled(false);
        andbutton.addActionListener(this);

        ifbutton.setText("→");
        ifbutton.setForeground(new Color(107,7,0));
        ifbutton.setBackground(Color.white);
        ifbutton.setFont(new Font("Miandra GD", Font.BOLD, 30));
        ifbutton.setBounds(480,170,80,80);
        ifbutton.setFocusable(false);
        ifbutton.setEnabled(false);
        ifbutton.addActionListener(this);

        xorbutton.setText("⊕");
        xorbutton.setForeground(new Color(107,7,0));
        xorbutton.setBackground(Color.white);
        xorbutton.setFont(new Font("Miandra GD", Font.BOLD, 30));
        xorbutton.setBounds(330,300,80,80);
        xorbutton.setFocusable(false);
        xorbutton.setEnabled(false);
        xorbutton.addActionListener(this);

        iffbutton.setText("↔");
        iffbutton.setForeground(new Color(107,7,0));
        iffbutton.setBackground(Color.white);
        iffbutton.setFont(new Font("Miandra GD", Font.BOLD, 30));
        iffbutton.setBounds(430,300,80,80);
        iffbutton.setFocusable(false);
        iffbutton.setEnabled(false);
        iffbutton.addActionListener(this);

        home.setText("⌂");
        home.setFocusable(false);
        home.setBounds(15,10,100,70);
        home.setForeground(Color.WHITE);
        home.setBackground(Color.black);
        home.setFont(new Font("Miandra GD", Font.BOLD, 60));
        home.setBorder(BorderFactory.createEmptyBorder());
        home.addActionListener(this);



        proceed.setText("⏎");
        proceed.setFocusable(false);
        proceed.setBounds(450,440,100,70);
        proceed.setForeground(new Color(107,7,0));
        proceed.setBackground(Color.white);
        proceed.setFont(new Font("Miandra GD", Font.BOLD, 60));
        proceed.setBorder(BorderFactory.createEmptyBorder());
        proceed.addActionListener(this);

        clear.setText("⌫");
        clear.setFocusable(false);
        clear.setBounds(40,440,100,70);
        clear.setForeground(new Color(107,7,0));
        clear.setBackground(Color.white);
        clear.setFont(new Font("Miandra GD", Font.BOLD, 60));
        clear.setBorder(BorderFactory.createEmptyBorder());
        clear.addActionListener(this);



        //proposition elements
        propositionmenu.add(pbutton1);
        propositionmenu.add(pbutton2);
        propositionmenu.add(orbutton);
        propositionmenu.add(andbutton);
        propositionmenu.add(ifbutton);
        propositionmenu.add(xorbutton);
        propositionmenu.add(iffbutton);
        propositionmenu.add(qbutton1);
        propositionmenu.add(qbutton2);
        propositionmenu.add(proceed);
        propositionmenu.add(clear);
        propositionmenu.add(proposition);
        propositionmenu.add(home);


        //truth table layout
        truthtableframe.setIconImage(appicon.getImage());
        truthtableframe.getContentPane().setBackground(new Color(107,7,0));
        truthtableframe.setSize(1300,880);
        truthtableframe.setVisible(false);
        truthtableframe.setLayout(null);
        truthtableframe.setTitle("Truth Table");

        truth_table.setBounds(40,200,1200,500);
        truth_table.setBackground(Color.darkGray);


//pvq
        pvqtable.setSize(1200,500);
        pvqtable.setBounds(0,0,1200,500);
        pvqtable.setRowHeight(100);
        pvqtable.setFont(new Font("Miandra GD", Font.BOLD,100));
        pvqtable.getTableHeader().setFont(new Font("Miandra GD", Font.BOLD,76));
        pvqtable.setForeground(new Color(107,7,0));
        pvqtable.getTableHeader().setForeground(new Color(107,7,0));
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        pvqtable.setEnabled(false);

        //p∧q
        pandqtable.setSize(1200,500);
        pandqtable.setBounds(0,0,1200,500);
        pandqtable.setRowHeight(100);
        pandqtable.setFont(new Font("Miandra GD", Font.BOLD,100));
        pandqtable.getTableHeader().setFont(new Font("Miandra GD", Font.BOLD,76));
        pandqtable.setForeground(new Color(107,7,0));
        pandqtable.getTableHeader().setForeground(new Color(107,7,0));
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        pandqtable.setEnabled(false);

        //p→q
        pimpqtable.setSize(1200,500);
        pimpqtable.setBounds(0,0,1200,500);
        pimpqtable.setRowHeight(100);
        pimpqtable.setFont(new Font("Miandra GD", Font.BOLD,100));
        pimpqtable.getTableHeader().setFont(new Font("Miandra GD", Font.BOLD,76));
        pimpqtable.setForeground(new Color(107,7,0));
        pimpqtable.getTableHeader().setForeground(new Color(107,7,0));
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        pimpqtable.setEnabled(false);

        //p⊕q
        pxorqtable.setSize(1200,500);
        pxorqtable.setBounds(0,0,1200,500);
        pxorqtable.setRowHeight(100);
        pxorqtable.setFont(new Font("Miandra GD", Font.BOLD,100));
        pxorqtable.getTableHeader().setFont(new Font("Miandra GD", Font.BOLD,76));
        pxorqtable.setForeground(new Color(107,7,0));
        pxorqtable.getTableHeader().setForeground(new Color(107,7,0));
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        pxorqtable.setEnabled(false);
        //p↔q
        piffqtable.setSize(1200,500);
        piffqtable.setBounds(0,0,1200,500);
        piffqtable.setRowHeight(100);
        piffqtable.setFont(new Font("Miandra GD", Font.BOLD,100));
        piffqtable.getTableHeader().setFont(new Font("Miandra GD", Font.BOLD,76));
        piffqtable.setForeground(new Color(107,7,0));
        piffqtable.getTableHeader().setForeground(new Color(107,7,0));
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        piffqtable.setEnabled(false);

        //-pvq
        notpvqtable.setSize(1200,500);
        notpvqtable.setBounds(0,0,1200,500);
        notpvqtable.setRowHeight(100);
        notpvqtable.setFont(new Font("Miandra GD", Font.BOLD,100));
        notpvqtable.getTableHeader().setFont(new Font("Miandra GD", Font.BOLD,76));
        notpvqtable.setForeground(new Color(107,7,0));
        notpvqtable.getTableHeader().setForeground(new Color(107,7,0));
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        pvqtable.setEnabled(false);
        //-p∧q
        notpandqtable.setSize(1200,500);
        notpandqtable.setBounds(0,0,1200,500);
        notpandqtable.setRowHeight(100);
        notpandqtable.setFont(new Font("Miandra GD", Font.BOLD,100));
        notpandqtable.getTableHeader().setFont(new Font("Miandra GD", Font.BOLD,76));
        notpandqtable.setForeground(new Color(107,7,0));
        notpandqtable.getTableHeader().setForeground(new Color(107,7,0));
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        notpandqtable.setEnabled(false);

        //-p→q
        notpimpqtable.setSize(1200,500);
        notpimpqtable.setBounds(0,0,1200,500);
        notpimpqtable.setRowHeight(100);
        notpimpqtable.setFont(new Font("Miandra GD", Font.BOLD,100));
        notpimpqtable.getTableHeader().setFont(new Font("Miandra GD", Font.BOLD,76));
        notpimpqtable.setForeground(new Color(107,7,0));
        notpimpqtable.getTableHeader().setForeground(new Color(107,7,0));
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        notpimpqtable.setEnabled(false);
        //-p⊕q
        notpxorqtable.setSize(1200,500);
        notpxorqtable.setBounds(0,0,1200,500);
        notpxorqtable.setRowHeight(100);
        notpxorqtable.setFont(new Font("Miandra GD", Font.BOLD,100));
        notpxorqtable.getTableHeader().setFont(new Font("Miandra GD", Font.BOLD,76));
        notpxorqtable.setForeground(new Color(107,7,0));
        notpxorqtable.getTableHeader().setForeground(new Color(107,7,0));
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        notpxorqtable.setEnabled(false);
        //-p↔q
        notpiffqtable.setSize(1200,500);
        notpiffqtable.setBounds(0,0,1200,500);
        notpiffqtable.setRowHeight(100);
        notpiffqtable.setFont(new Font("Miandra GD", Font.BOLD,100));
        notpiffqtable.getTableHeader().setFont(new Font("Miandra GD", Font.BOLD,76));
        notpiffqtable.setForeground(new Color(107,7,0));
        notpiffqtable.getTableHeader().setForeground(new Color(107,7,0));
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        notpiffqtable.setEnabled(false);

        //pv-q
        pvnotqtable.setSize(1200,500);
        pvnotqtable.setBounds(0,0,1200,500);
        pvnotqtable.setRowHeight(100);
        pvnotqtable.setFont(new Font("Miandra GD", Font.BOLD,100));
        pvnotqtable.getTableHeader().setFont(new Font("Miandra GD", Font.BOLD,76));
        pvnotqtable.setForeground(new Color(107,7,0));
        pvnotqtable.getTableHeader().setForeground(new Color(107,7,0));
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        pvnotqtable.setEnabled(false);

        //p∧-q
        pandnotqtable.setSize(1200,500);
        pandnotqtable.setBounds(0,0,1200,500);
        pandnotqtable.setRowHeight(100);
        pandnotqtable.setFont(new Font("Miandra GD", Font.BOLD,100));
        pandnotqtable.getTableHeader().setFont(new Font("Miandra GD", Font.BOLD,76));
        pandnotqtable.setForeground(new Color(107,7,0));
        pandnotqtable.getTableHeader().setForeground(new Color(107,7,0));
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        pandnotqtable.setEnabled(false);

        //p→-q
        pimpnotqtable.setSize(1200,500);
        pimpnotqtable.setBounds(0,0,1200,500);
        pimpnotqtable.setRowHeight(100);
        pimpnotqtable.setFont(new Font("Miandra GD", Font.BOLD,100));
        pimpnotqtable.getTableHeader().setFont(new Font("Miandra GD", Font.BOLD,76));
        pimpnotqtable.setForeground(new Color(107,7,0));
        pimpnotqtable.getTableHeader().setForeground(new Color(107,7,0));
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        pimpnotqtable.setEnabled(false);
        //p⊕-q
        pxornotqtable.setSize(1200,500);
        pxornotqtable.setBounds(0,0,1200,500);
        pxornotqtable.setRowHeight(100);
        pxornotqtable.setFont(new Font("Miandra GD", Font.BOLD,100));
        pxornotqtable.getTableHeader().setFont(new Font("Miandra GD", Font.BOLD,76));
        pxornotqtable.setForeground(new Color(107,7,0));
        pxornotqtable.getTableHeader().setForeground(new Color(107,7,0));
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        pxornotqtable.setEnabled(false);
        //p↔-q
        piffnotqtable.setSize(1200,500);
        piffnotqtable.setBounds(0,0,1200,500);
        piffnotqtable.setRowHeight(100);
        piffnotqtable.setFont(new Font("Miandra GD", Font.BOLD,100));
        piffnotqtable.getTableHeader().setFont(new Font("Miandra GD", Font.BOLD,76));
        piffnotqtable.setForeground(new Color(107,7,0));
        piffnotqtable.getTableHeader().setForeground(new Color(107,7,0));
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        piffnotqtable.setEnabled(false);

        //-pv-q
        notpvnotqtable.setSize(1200,500);
        notpvnotqtable.setBounds(0,0,1200,500);
        notpvnotqtable.setRowHeight(100);
        notpvnotqtable.setFont(new Font("Miandra GD", Font.BOLD,100));
        notpvnotqtable.getTableHeader().setFont(new Font("Miandra GD", Font.BOLD,76));
        notpvnotqtable.setForeground(new Color(107,7,0));
        notpvnotqtable.getTableHeader().setForeground(new Color(107,7,0));
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        pvqtable.setEnabled(false);
        //-p∧-q
        notpandnotqtable.setSize(1200,500);
        notpandnotqtable.setBounds(0,0,1200,500);
        notpandnotqtable.setRowHeight(100);
        notpandnotqtable.setFont(new Font("Miandra GD", Font.BOLD,100));
        notpandnotqtable.getTableHeader().setFont(new Font("Miandra GD", Font.BOLD,76));
        notpandnotqtable.setForeground(new Color(107,7,0));
        notpandnotqtable.getTableHeader().setForeground(new Color(107,7,0));
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        notpandnotqtable.setEnabled(false);

        //-p→-q
        notpimpnotqtable.setSize(1200,500);
        notpimpnotqtable.setBounds(0,0,1200,500);
        notpimpnotqtable.setRowHeight(100);
        notpimpnotqtable.setFont(new Font("Miandra GD", Font.BOLD,100));
        notpimpnotqtable.getTableHeader().setFont(new Font("Miandra GD", Font.BOLD,76));
        notpimpnotqtable.setForeground(new Color(107,7,0));
        notpimpnotqtable.getTableHeader().setForeground(new Color(107,7,0));
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        notpimpnotqtable.setEnabled(false);

        //-p⊕-q
        notpxornotqtable.setSize(1200,500);
        notpxornotqtable.setBounds(0,0,1200,500);
        notpxornotqtable.setRowHeight(100);
        notpxornotqtable.setFont(new Font("Miandra GD", Font.BOLD,100));
        notpxornotqtable.getTableHeader().setFont(new Font("Miandra GD", Font.BOLD,76));
        notpxornotqtable.setForeground(new Color(107,7,0));
        notpxornotqtable.getTableHeader().setForeground(new Color(107,7,0));
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        notpxornotqtable.setEnabled(false);

        //-p↔-q
        notpiffnotqtable.setSize(1200,500);
        notpiffnotqtable.setBounds(0,0,1200,500);
        notpiffnotqtable.setRowHeight(100);
        notpiffnotqtable.setFont(new Font("Miandra GD", Font.BOLD,100));
        notpiffnotqtable.getTableHeader().setFont(new Font("Miandra GD", Font.BOLD,76));
        notpiffnotqtable.setForeground(new Color(107,7,0));
        notpiffnotqtable.getTableHeader().setForeground(new Color(107,7,0));
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        notpiffnotqtable.setEnabled(false);





        //truth table elements
        back.setBounds(50,720,100,80);
        back.setFont(new Font("Miandra GD", Font.BOLD, 60));
        back.setForeground(new Color(107,7,0));
        back.setText("⬅");
        back.setBackground(Color.white);
        back.setFocusable(false);
        back.addActionListener(this);

        conclusion.setText("∴");
        conclusion.setForeground(Color.WHITE);
        conclusion.setFont(new Font("Miandra GD", Font.BOLD, 70));
        conclusion.setBounds(700,720,1000,100);

        home1.setText("⌂");
        home1.setFocusable(false);
        home1.setBounds(15,10,100,70);
        home1.setForeground(Color.WHITE);
        home1.setBackground(Color.black);
        home1.setFont(new Font("Miandra GD", Font.BOLD, 60));
        home1.setBorder(BorderFactory.createEmptyBorder());
        home1.addActionListener(this);

        proposition1.setBounds(0,90,1000,50);
        proposition1.setFont(new Font("Miandra GD", Font.BOLD, 50));
        proposition1.setForeground(Color.WHITE);


        truthtableframe.add(truth_table);
        truthtableframe.add(home1);
        truthtableframe.add(back);
        truthtableframe.add(proposition1);
        truthtableframe.add(truth_table);
        truthtableframe.add(conclusion);
        truthtableframe.setResizable(false);
        truth_table.setLayout(new BorderLayout());





        propositionmenu.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                int confirm = JOptionPane.showConfirmDialog(propositionmenu, "Do you want to close the program?", "Close Program", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                if (confirm == JOptionPane.YES_OPTION) {
                    propositionmenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                } else {
                    propositionmenu.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
            }
        });

        truthtableframe.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                int confirm = JOptionPane.showConfirmDialog(truthtableframe, "Do you want to close the program?", "Close Program", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                if (confirm == JOptionPane.YES_OPTION) {
                    truthtableframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                } else {
                    truthtableframe.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
            }
        });

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == home){
            truthtableframe.setVisible(false);
            propositionmenu.setVisible(false);
            menu Menu = new menu();
        }
        if(e.getSource() == home1){
            truthtableframe.setVisible(false);
            propositionmenu.setVisible(false);
            menu Menu = new menu();
        }


        //Action Event of proposition menu

        if(e.getSource() == clear){
            propositiontxt = "Conditional Proposition: ";
            proposition.setText(propositiontxt);
            proposition1.setText(propositiontxt);
            pbutton1.setEnabled(true);
            pbutton2.setEnabled(true);
            orbutton.setEnabled(false);
            andbutton.setEnabled(false);
            ifbutton.setEnabled(false);
            xorbutton.setEnabled(false);
            iffbutton.setEnabled(false);
            qbutton1.setEnabled(false);
            qbutton2.setEnabled(false);

        };

        if(e.getSource() == pbutton1){
            pbutton1.setEnabled(false);
            pbutton2.setEnabled(false);
            orbutton.setEnabled(true);
            andbutton.setEnabled(true);
            ifbutton.setEnabled(true);
            xorbutton.setEnabled(true);
            iffbutton.setEnabled(true);
            qbutton1.setEnabled(false);
            qbutton2.setEnabled(false);
            propositiontxt = propositiontxt + "p";
            proposition.setText(propositiontxt);

        }
        if(e.getSource() == pbutton2){
            pbutton1.setEnabled(false);
            pbutton2.setEnabled(false);
            orbutton.setEnabled(true);
            andbutton.setEnabled(true);
            ifbutton.setEnabled(true);
            xorbutton.setEnabled(true);
            iffbutton.setEnabled(true);
            qbutton1.setEnabled(false);
            qbutton2.setEnabled(false);
            propositiontxt = propositiontxt + "-p";
            proposition.setText(propositiontxt);

        }

        if(e.getSource() == orbutton){
                pbutton1.setEnabled(false);
                pbutton2.setEnabled(false);
                orbutton.setEnabled(false);
                andbutton.setEnabled(false);
                ifbutton.setEnabled(false);
                xorbutton.setEnabled(false);
                iffbutton.setEnabled(false);
                qbutton1.setEnabled(true);
                qbutton2.setEnabled(true);
                propositiontxt = propositiontxt + "∨";
                proposition.setText(propositiontxt);

        }
        if(e.getSource() == andbutton){
                pbutton1.setEnabled(false);
                pbutton2.setEnabled(false);
                orbutton.setEnabled(false);
                andbutton.setEnabled(false);
                ifbutton.setEnabled(false);
                xorbutton.setEnabled(false);
                iffbutton.setEnabled(false);
                qbutton1.setEnabled(true);
                qbutton2.setEnabled(true);
                propositiontxt = propositiontxt + "∧";
                proposition.setText(propositiontxt);

        }
        if(e.getSource() == ifbutton){
                pbutton1.setEnabled(false);
                pbutton2.setEnabled(false);
                orbutton.setEnabled(false);
                andbutton.setEnabled(false);
                ifbutton.setEnabled(false);
                xorbutton.setEnabled(false);
                iffbutton.setEnabled(false);
                qbutton1.setEnabled(true);
                qbutton2.setEnabled(true);
                propositiontxt = propositiontxt + "→";
                proposition.setText(propositiontxt);

        }
        if(e.getSource() == xorbutton){
                pbutton1.setEnabled(false);
                pbutton2.setEnabled(false);
                orbutton.setEnabled(false);
                andbutton.setEnabled(false);
                ifbutton.setEnabled(false);
                xorbutton.setEnabled(false);
                iffbutton.setEnabled(false);
                qbutton1.setEnabled(true);
                qbutton2.setEnabled(true);
                propositiontxt = propositiontxt + "⊕";
                proposition.setText(propositiontxt);

        }
        if(e.getSource() == iffbutton){
                pbutton1.setEnabled(false);
                pbutton2.setEnabled(false);
                orbutton.setEnabled(false);
                andbutton.setEnabled(false);
                ifbutton.setEnabled(false);
                xorbutton.setEnabled(false);
                iffbutton.setEnabled(false);
                qbutton1.setEnabled(true);
                qbutton2.setEnabled(true);
                propositiontxt = propositiontxt + "↔";
                proposition.setText(propositiontxt);

        }


        if(e.getSource() == qbutton1){
            pbutton1.setEnabled(false);
            pbutton2.setEnabled(false);
            orbutton.setEnabled(false);
            andbutton.setEnabled(false);
            ifbutton.setEnabled(false);
            xorbutton.setEnabled(false);
            iffbutton.setEnabled(false);
            qbutton1.setEnabled(false);
            qbutton2.setEnabled(false);
            propositiontxt = propositiontxt + "q";
            proposition.setText(propositiontxt);

        }
        if(e.getSource() == qbutton2){
            pbutton1.setEnabled(false);
            pbutton2.setEnabled(false);
            orbutton.setEnabled(false);
            andbutton.setEnabled(false);
            ifbutton.setEnabled(false);
            xorbutton.setEnabled(false);
            iffbutton.setEnabled(false);
            qbutton1.setEnabled(false);
            qbutton2.setEnabled(false);
            propositiontxt = propositiontxt + "-q";
            proposition.setText(propositiontxt);

        }


        //trutable output 
        if(e.getSource() == proceed){
            String output= "";
            if(proposition.getText().contains("-q") == true || proposition.getText().contains("q") == true){
                truthtableframe.setVisible(true);
                propositionmenu.setVisible(false);
                proposition1.setText(propositiontxt);


                //p∨q
                if(proposition1.getText().contains("Conditional Proposition: p∨q") == true ){
                    truth_table.add(pvqtable.getTableHeader(),BorderLayout.NORTH);
                    truth_table.add(pvqtable, BorderLayout.CENTER);
                    for(int x=0; x<3; x++) {
                        pvqtable.getColumnModel().getColumn(x).setCellRenderer(centerRender);

                    }
                  output = pvqdata[0][2].toString()+pvqdata[1][2].toString()+pvqdata[2][2].toString()+pvqdata[3][2].toString();
                }
                //-p∨q
                else if(proposition1.getText().contains("Conditional Proposition: -p∨q") == true){
                    truth_table.add(notpvqtable.getTableHeader(),BorderLayout.NORTH);
                    truth_table.add(notpvqtable, BorderLayout.CENTER);
                    for(int x=0; x<4; x++) {
                        notpvqtable.getColumnModel().getColumn(x).setCellRenderer(centerRender);
                    }
                    output = notpvqdata[0][3].toString()+notpvqdata[1][3].toString()+notpvqdata[2][3].toString()+notpvqdata[3][3].toString();
                }
                //p∨-q
                else if(proposition1.getText().contains("Conditional Proposition: p∨-q")){
                    truth_table.add(pvnotqtable.getTableHeader(),BorderLayout.NORTH);
                    truth_table.add(pvnotqtable, BorderLayout.CENTER);
                    for(int x=0; x<4; x++) {
                        pvnotqtable.getColumnModel().getColumn(x).setCellRenderer(centerRender);
                    }
                    output = pvnotqdata[0][3].toString()+pvnotqdata[1][3].toString()+pvnotqdata[2][3].toString()+pvnotqdata[3][3].toString();
                }
                //-p∨-q
                else if(proposition1.getText().contains("Conditional Proposition: -p∨-q")){
                    System.out.println("tae");
                    truth_table.add(notpvnotqtable.getTableHeader(),BorderLayout.NORTH); //last edit
                    truth_table.add(notpvnotqtable, BorderLayout.CENTER);
                    for(int x=0; x<5; x++) {
                        notpvnotqtable.getColumnModel().getColumn(x).setCellRenderer(centerRender);
                    }
                    output = notpvnotqdata[0][4].toString()+notpvnotqdata[1][4].toString()+notpvnotqdata[2][4].toString()+notpvnotqdata[3][4].toString();
                }
                //p∧q
                else if (proposition1.getText().contains("Conditional Proposition: p∧q")) {
                    truth_table.add(pandqtable.getTableHeader(), BorderLayout.NORTH);
                    truth_table.add(pandqtable, BorderLayout.CENTER);
                    for (int x = 0; x < 3; x++) {
                        pandqtable.getColumnModel().getColumn(x).setCellRenderer(centerRender);
                    }
                    output = pandqdata[0][2].toString()+pandqdata[1][2].toString()+pandqdata[2][2].toString()+pandqdata[3][2].toString();
                }
                //-p∧q
                else if(proposition1.getText().contains("Conditional Proposition: -p∧q")){
                    truth_table.add(notpandqtable.getTableHeader(),BorderLayout.NORTH);
                    truth_table.add(notpandqtable, BorderLayout.CENTER);
                    for(int x=0; x<4; x++) {
                        notpandqtable.getColumnModel().getColumn(x).setCellRenderer(centerRender);
                    }
                    output = notpandqdata[0][3].toString()+notpandqdata[1][3].toString()+notpandqdata[2][3].toString()+notpandqdata[3][3].toString();
                }
                //p∧-q
                else if(proposition1.getText().contains("Conditional Proposition: p∧-q")){
                    truth_table.add(pandnotqtable.getTableHeader(),BorderLayout.NORTH);
                    truth_table.add(pandnotqtable, BorderLayout.CENTER);
                    for(int x=0; x<4; x++) {
                        pandnotqtable.getColumnModel().getColumn(x).setCellRenderer(centerRender);
                    }
                    output = pandnotqdata[0][3].toString()+pandnotqdata[1][3].toString()+pandnotqdata[2][3].toString()+pandnotqdata[3][3].toString();
                }
                //-p∧-q
                else if(proposition1.getText().contains("Conditional Proposition: -p∧-q")){
                    truth_table.add(notpandnotqtable.getTableHeader(),BorderLayout.NORTH); //last edit
                    truth_table.add(notpandnotqtable, BorderLayout.CENTER);
                    for(int x=0; x<5; x++) {
                        notpandnotqtable.getColumnModel().getColumn(x).setCellRenderer(centerRender);
                    }
                    output = notpandnotqdata[0][4].toString()+notpandnotqdata[1][4].toString()+notpandnotqdata[2][4].toString()+notpandnotqdata[3][4].toString();
                }
                //p→q
                else if (proposition1.getText().contains("Conditional Proposition: p→q")) {
                    truth_table.add(pimpqtable.getTableHeader(), BorderLayout.NORTH);
                    truth_table.add(pimpqtable, BorderLayout.CENTER);
                    for (int x = 0; x < 3; x++) {
                        pimpqtable.getColumnModel().getColumn(x).setCellRenderer(centerRender);
                    }
                    output = pimpqdata[0][2].toString()+pimpqdata[1][2].toString()+pimpqdata[2][2].toString()+pimpqdata[3][2].toString();
                }
                //-p→q
                else if(proposition1.getText().contains("Conditional Proposition: -p→q")){
                    truth_table.add(notpimpqtable.getTableHeader(),BorderLayout.NORTH);
                    truth_table.add(notpimpqtable, BorderLayout.CENTER);
                    for(int x=0; x<4; x++) {
                        notpimpqtable.getColumnModel().getColumn(x).setCellRenderer(centerRender);
                    }
                    output = notpimpqdata[0][3].toString()+notpimpqdata[1][3].toString()+notpimpqdata[2][3].toString()+notpimpqdata[3][3].toString();
                }
                //p→-q
                else if(proposition1.getText().contains("Conditional Proposition: p→-q")){
                    truth_table.add(pimpnotqtable.getTableHeader(),BorderLayout.NORTH);
                    truth_table.add(pimpnotqtable, BorderLayout.CENTER);
                    for(int x=0; x<4; x++) {
                        pimpnotqtable.getColumnModel().getColumn(x).setCellRenderer(centerRender);
                    }
                    output = pimpnotqdata[0][3].toString()+pimpnotqdata[1][3].toString()+pimpnotqdata[2][3].toString()+pimpnotqdata[3][3].toString();
                }
                //-p→-q
                else if(proposition1.getText().contains("Conditional Proposition: -p→-q")){
                    truth_table.add(notpimpnotqtable.getTableHeader(),BorderLayout.NORTH); //last edit
                    truth_table.add(notpimpnotqtable, BorderLayout.CENTER);
                    for(int x=0; x<5; x++) {
                        notpimpnotqtable.getColumnModel().getColumn(x).setCellRenderer(centerRender);
                    }
                    output = notpimpnotqdata[0][4].toString()+notpimpnotqdata[1][4].toString()+notpimpnotqdata[2][4].toString()+notpimpnotqdata[3][4].toString();
                }
                //p⊕q
                else if (proposition1.getText().contains("Conditional Proposition: p⊕q")) {
                    truth_table.add(pxorqtable.getTableHeader(), BorderLayout.NORTH);
                    truth_table.add(pxorqtable, BorderLayout.CENTER);
                    for (int x = 0; x < 3; x++) {
                        pxorqtable.getColumnModel().getColumn(x).setCellRenderer(centerRender);
                    }
                    output = pxorqdata[0][2].toString()+pxorqdata[1][2].toString()+pxorqdata[2][2].toString()+pxorqdata[3][2].toString();
                }
                //-p⊕q
                else if(proposition1.getText().contains("Conditional Proposition: -p⊕q")){
                    truth_table.add(notpxorqtable.getTableHeader(),BorderLayout.NORTH);
                    truth_table.add(notpxorqtable, BorderLayout.CENTER);
                    for(int x=0; x<4; x++) {
                        notpxorqtable.getColumnModel().getColumn(x).setCellRenderer(centerRender);
                    }
                    output = notpxorqdata[0][3].toString()+notpxorqdata[1][3].toString()+notpxorqdata[2][3].toString()+notpxorqdata[3][3].toString();
                }
                //p⊕-q
                else if(proposition1.getText().contains("Conditional Proposition: p⊕-q")){
                    truth_table.add(pxornotqtable.getTableHeader(),BorderLayout.NORTH);
                    truth_table.add(pxornotqtable, BorderLayout.CENTER);
                    for(int x=0; x<4; x++) {
                        pxornotqtable.getColumnModel().getColumn(x).setCellRenderer(centerRender);
                    }
                    output = pxornotqdata[0][3].toString()+pxornotqdata[1][3].toString()+pxornotqdata[2][3].toString()+pxornotqdata[3][3].toString();
                }
                //-p⊕-q
                else if(proposition1.getText().contains("Conditional Proposition: -p⊕-q")){
                    truth_table.add(notpxornotqtable.getTableHeader(),BorderLayout.NORTH); //last edit
                    truth_table.add(notpxornotqtable, BorderLayout.CENTER);
                    for(int x=0; x<5; x++) {
                        notpxornotqtable.getColumnModel().getColumn(x).setCellRenderer(centerRender);
                    }
                    output = notpxornotqdata[0][4].toString()+notpxornotqdata[1][4].toString()+notpxornotqdata[2][4].toString()+notpxornotqdata[3][4].toString();
                }
                //p↔q
                else if (proposition1.getText().contains("Conditional Proposition: p↔q")) {
                    truth_table.add(piffqtable.getTableHeader(), BorderLayout.NORTH);
                    truth_table.add(piffqtable, BorderLayout.CENTER);
                    for (int x = 0; x < 3; x++) {
                        piffqtable.getColumnModel().getColumn(x).setCellRenderer(centerRender);
                    }
                    output = piffqdata[0][2].toString()+piffqdata[1][2].toString()+piffqdata[2][2].toString()+piffqdata[3][2].toString();
                }//-p↔q
                else if(proposition1.getText().contains("Conditional Proposition: -p↔q")){
                    truth_table.add(notpiffqtable.getTableHeader(),BorderLayout.NORTH);
                    truth_table.add(notpiffqtable, BorderLayout.CENTER);
                    for(int x=0; x<4; x++) {
                        notpiffqtable.getColumnModel().getColumn(x).setCellRenderer(centerRender);
                    }
                    output = notpiffqdata[0][3].toString()+notpiffqdata[1][3].toString()+notpiffqdata[2][3].toString()+notpiffqdata[3][3].toString();
                }
                //p↔-q
                else if(proposition1.getText().contains("Conditional Proposition: p↔-q")){
                    truth_table.add(piffnotqtable.getTableHeader(),BorderLayout.NORTH);
                    truth_table.add(piffnotqtable, BorderLayout.CENTER);
                    for(int x=0; x<4; x++) {
                        piffnotqtable.getColumnModel().getColumn(x).setCellRenderer(centerRender);
                    }
                    output = piffnotqdata[0][3].toString()+piffnotqdata[1][3].toString()+piffnotqdata[2][3].toString()+piffnotqdata[3][3].toString();
                }
                //-p↔-q
                else if(proposition1.getText().contains("Conditional Proposition: -p↔-q")){
                    truth_table.add(notpiffnotqtable.getTableHeader(),BorderLayout.NORTH); //last edit
                    truth_table.add(notpiffnotqtable, BorderLayout.CENTER);
                    for(int x=0; x<5; x++) {
                        notpiffnotqtable.getColumnModel().getColumn(x).setCellRenderer(centerRender);
                    }
                    output = notpiffnotqdata[0][4].toString()+notpiffnotqdata[1][4].toString()+notpiffnotqdata[2][4].toString()+notpiffnotqdata[3][4].toString();
                }

                if (output.contains("1111")){
                    conclusion.setText("∴Tautology");
                }else if(output.contains("0000")){
                    conclusion.setText("∴Contradiction");
                }else{
                    conclusion.setText("∴Contingency");
                }



            }else{
                    JOptionPane.showMessageDialog(null,"Please complete the proposition.","Warning",JOptionPane.WARNING_MESSAGE);
            }
        }

        if(e.getSource()==back){
            propositiontxt = "Conditional Proposition: ";
            proposition1.setText(propositiontxt);
            proposition.setText(propositiontxt);
            truthtableframe.setVisible(false);
            propositionmenu.setVisible(true);
            truth_table.removeAll();
            pbutton1.setEnabled(true);
            pbutton2.setEnabled(true);
            orbutton.setEnabled(false);
            andbutton.setEnabled(false);
            ifbutton.setEnabled(false);
            xorbutton.setEnabled(false);
            iffbutton.setEnabled(false);
            qbutton1.setEnabled(false);
            qbutton2.setEnabled(false);




        }

    }





}

