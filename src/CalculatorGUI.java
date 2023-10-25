import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI implements ActionListener {

    private JFrame mainFrame;
    private JPanel panel;

    private JLabel label;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private int nClicks = 0;

public Calculator myCalculator = new Calculator();

    public static void main(String[] args) {
        CalculatorGUI myCalculator = new CalculatorGUI();



    }

    public CalculatorGUI() {
        mainFrame = new JFrame();
        panel = new JPanel();

//        int answer = 0;

        label = new JLabel("Answer: ");

        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        button10 = new JButton("0");
        button11 = new JButton ("+");
        button12 = new JButton ("-");
        button13 = new JButton ("x");
        button14 = new JButton ("/");
        button15 = new JButton ("=");
        button16 = new JButton ("C");

//
//
//
//
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button10.addActionListener(this);
        button11.addActionListener(this);
        button12.addActionListener(this);
        button13.addActionListener(this);
        button14.addActionListener(this);
        button15.addActionListener(this);
        button16.addActionListener(this);





        mainFrame.setSize(1000, 1000);
//        label.setSize(500,500);
        int borderSize = 50;

        panel.setLayout(new GridLayout(4, 4));
        panel.add(button11);
        panel.add(button12);
        panel.add(button13);
        panel.add(button14);
        panel.add(button15);
        panel.add(button16);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button10);

        mainFrame.add(panel);
        mainFrame.add(label, BorderLayout.NORTH);

        //mainFrame.pack();
        mainFrame.setVisible(true);
    }



//    public void actionPerformed(ActionEvent e) {
//        System.out.println("button clicked");
//        nClicks++;
//
//
//    }

    int oi = 0, ni = 0, i = 0;

    public int stringToInt(String s){

        String b = s.substring(8);
        int c = Integer.parseInt(b);
        return c;
    }



    int c = 0, d = 0, op = 0;

    @Override

    public void actionPerformed(ActionEvent e) {

        Object buttonClicked = e.getSource();

//        String a = label.toString();
//        String b = a.substring(8);
//        int c = Integer.parseInt(b);

        String a, b;
        
        if (buttonClicked == button1) {
            label.setText(label.getText() + "1");
        }
        if (buttonClicked == button2) {
            label.setText(label.getText() + "2");
        }
        if (buttonClicked == button3) {
            label.setText(label.getText() + "3");
        }
        if (buttonClicked == button4) {
            label.setText(label.getText() + "4");
        }
        if (buttonClicked == button5) {
            label.setText(label.getText() + "5");
        }
        if (buttonClicked == button6) {
            label.setText(label.getText() + "6");
        }
        if (buttonClicked == button7) {
            label.setText(label.getText() + "7");
        }
        if (buttonClicked == button8) {
            label.setText(label.getText() + "8");
        }
        if (buttonClicked == button9) {
            label.setText(label.getText() + "9");
        }
        if (buttonClicked == button10) {
            label.setText(label.getText() + "0");
        }
        if (buttonClicked == button11) {
//            a = label.toString();
//            b = a.substring(8);
            c = stringToInt(label.getText());
            label.setText("Answer: ");
            op = 1;
        }
        if (buttonClicked == button12) {
//            a = label.toString();
//            b = a.substring(8);
            c = stringToInt(label.getText());
            label.setText("Answer: ");
            op = 2;
        }
        if (buttonClicked == button13) {
//            a = label.toString();
//            b = a.substring(8);
            c = stringToInt(label.getText());
            label.setText("Answer: ");
            op = 3;
        }
        if (buttonClicked == button14) {
//            a = label.toString();
//            b = a.substring(8);
            c = stringToInt(label.getText());
            label.setText("Answer: ");
            op = 4;
        }
        if (buttonClicked == button15) {
            a = label.toString();
            b = a.substring(8);
            d = stringToInt(label.getText());
//            System.out.println(c + " | " + d + " | " + op);
            int n = 0;
            if (op == 1){
                n = c + d;
            } else if (op == 2){
                n = c - d;
            } else if (op == 3){
                n = c * d;
            } else if (op == 4){
                n = c / d;
            }
            label.setText("Answer: " + n);
        }
        if (buttonClicked == button16){
            c = 0;
            d = 0;
            op = 0;
            label.setText("Answer: ");
        }
        // after equal sign is clicked
    }
}