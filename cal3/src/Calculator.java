
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent; 

class Close extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent d) {
        System.exit(0);
    }
}

class cal implements ActionListener {

    Frame frame1 = new Frame();

    Button btn0 = new Button("0");
    Button btn1 = new Button("1");
    Button btn2 = new Button("2");
    Button btn3 = new Button("3");
    Button btn4 = new Button("4");
    Button btn5 = new Button("5");
    Button btn6 = new Button("6");
    Button btn7 = new Button("7");
    Button btn8 = new Button("8");
    Button btn9 = new Button("9");
    Button btnAdd = new Button("+");
    Button btnSubtract = new Button("-");
    Button btnMultiply = new Button("×");
    Button btnDivide = new Button("÷");
    Button btnEqual = new Button("=");
    Button btnClear = new Button("C");
    Button btnSqRt = new Button("SqRt");
    Button btnDot = new Button(".");
    Button btnNegativeMark = new Button("+/-");
    Button btnPercentage = new Button("%");

    Button btnCopy = new Button("Copy");
    Button btnPaste = new Button("Paste");

    Color darkButtonBack_for_numberPad = new Color(51, 51, 51);

    TextField result_textField = new TextField();

   
    String firstValue, secondValue, operator, copiedText;
    double firstDoubleValue, secondDoubleValue, Answer;
    int decimalCount = 0, zeroCount = 0;

    Panel pannel_north = new Panel();    
    Panel pannel_north_sub2 = new Panel();
    Panel pannel_center = new Panel();
    
    cal() {

       
        frame1.addWindowListener(new Close());
        frame1.setBackground(Color.WHITE);
        frame1.setBounds(700, 200, 400, 600);
        frame1.setTitle("Calculator");
        frame1.setResizable(false);

        
        Font Segoe_UI_15 = new Font("Segoe UI", Font.PLAIN, 15);

        
        MenuBar menuBar = new MenuBar();
        menuBar.setFont(Segoe_UI_15);

      
        Menu edit_menu = new Menu("Edit");
        Menu help_menu = new Menu("Help");

      
        MenuItem Edit_menu_item_copy = new MenuItem("Copy");
        MenuItem Edit_menu_item_paste = new MenuItem("Paste");
        MenuItem help_menu_item_onlineSupport = new MenuItem("Online support");
        MenuItem help_menu_item_checkForUpdates = new MenuItem("Check for updates");
        MenuItem help_menu_item_about = new MenuItem("About");

       
        edit_menu.add(Edit_menu_item_copy);
        edit_menu.add(Edit_menu_item_paste);
        help_menu.add(help_menu_item_onlineSupport);
        help_menu.add(help_menu_item_checkForUpdates);
        help_menu.add(help_menu_item_about);

        menuBar.add(edit_menu);
        menuBar.add(help_menu);

        
        frame1.setMenuBar(menuBar);

       
        Font Segoe_UI_24 = new Font("Segoe UI", 0, 24);
        Font Ebrima_24 = new Font("Ebrima", 0, 24);
        Font Segoe_UI_20 = new Font("Segoe UI", 0, 20);
        Font times_36 = new Font("Times New Roman", 0, 36);
        Font times_48 = new Font("Times New Roman", 0, 48);

        
        btn0.setFont(Segoe_UI_24);
        btn1.setFont(Segoe_UI_24);
        btn2.setFont(Segoe_UI_24);
        btn3.setFont(Segoe_UI_24);
        btn4.setFont(Segoe_UI_24);
        btn5.setFont(Segoe_UI_24);
        btn6.setFont(Segoe_UI_24);
        btn7.setFont(Segoe_UI_24);
        btn8.setFont(Segoe_UI_24);
        btn9.setFont(Segoe_UI_24);
        btnEqual.setFont(times_36);
        btnAdd.setFont(times_36);
        btnSubtract.setFont(times_48);
        btnNegativeMark.setFont(Segoe_UI_24);
        btnSqRt.setFont(Segoe_UI_20);
        btnDivide.setFont(times_36);
        btnClear.setFont(Segoe_UI_24);
        btnPercentage.setFont(Ebrima_24);
        btnDot.setFont(times_36);
        btnMultiply.setFont(times_36);

        btnCopy.setFont(Segoe_UI_20);
        btnPaste.setFont(Segoe_UI_20);
        
        Color numberBtnColor = new Color(240,240,240);
        Color operatorBtnColor = new Color(204,204,255);

        btn0.setBackground(numberBtnColor);
        btn1.setBackground(numberBtnColor);
        btn2.setBackground(numberBtnColor);
        btn3.setBackground(numberBtnColor);
        btn4.setBackground(numberBtnColor);
        btn5.setBackground(numberBtnColor);
        btn6.setBackground(numberBtnColor);
        btn7.setBackground(numberBtnColor);
        btn8.setBackground(numberBtnColor);
        btn9.setBackground(numberBtnColor);
        btnDot.setBackground(numberBtnColor);
        btnNegativeMark.setBackground(numberBtnColor);
        btnEqual.setBackground(Color.darkGray);
        btnAdd.setBackground(operatorBtnColor);
        btnSubtract.setBackground(operatorBtnColor);
        btnSqRt.setBackground(operatorBtnColor);
        btnDivide.setBackground(operatorBtnColor);
        btnPercentage.setBackground(operatorBtnColor);
        btnClear.setBackground(operatorBtnColor);
        btnMultiply.setBackground(operatorBtnColor);


        btn0.setForeground(Color.black);
        btn1.setForeground(Color.black);
       
        GridLayout grid_sub1 = new GridLayout(1, 2, 10, 3);

        btn2.setForeground(Color.black);
        btn3.setForeground(Color.black);
        btn4.setForeground(Color.black);
        btn5.setForeground(Color.black);
        btn6.setForeground(Color.black);
        btn7.setForeground(Color.black);
        btn8.setForeground(Color.black);
        btn9.setForeground(Color.black);
        btnDot.setForeground(Color.black);
        btnNegativeMark.setForeground(Color.black);
        btnEqual.setForeground(Color.WHITE);
        btnAdd.setForeground(Color.black);
        btnSubtract.setForeground(Color.black);
        btnSqRt.setForeground(Color.black);
        btnDivide.setForeground(Color.black);
        btnPercentage.setForeground(Color.black);
        btnClear.setForeground(Color.black);
        btnMultiply.setForeground(Color.black);

        
        Font segeo_55 = new Font("Segoe UI", Font.PLAIN, 55);
        
        Color panelBackColor = new Color(240,240,240);
        
        result_textField.setFont(segeo_55);
        result_textField.setEditable(false);
        result_textField.setBackground(panelBackColor);
        result_textField.setForeground(Color.black);
        result_textField.setPreferredSize(new Dimension(370, 70));
        result_textField.setText(" 0");
        result_textField.setFocusable(false);

        
        GridLayout grid_centerPanel = new GridLayout(5, 4, 3, 3);
        FlowLayout flow1 = new FlowLayout(FlowLayout.CENTER, 0, 5);
        pannel_north.setLayout(flow1);
        pannel_center.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pannel_north.setCursor(new Cursor(Cursor.HAND_CURSOR));

        pannel_north_sub2.add(result_textField);

        pannel_north.add(pannel_north_sub2);        
        pannel_center.setLayout(grid_centerPanel);

        
        pannel_north.setBackground(operatorBtnColor);
        pannel_center.setBackground(Color.WHITE);   
        pannel_north_sub2.setBackground(panelBackColor);

        pannel_north.setPreferredSize(new Dimension(300, 90));
       
        pannel_center.add(btnClear);
        pannel_center.add(btnPercentage);
        pannel_center.add(btnSqRt);
        pannel_center.add(btnDivide);
        pannel_center.add(btn7);
        pannel_center.add(btn8);
        pannel_center.add(btn9);
        pannel_center.add(btnMultiply);
        pannel_center.add(btn4);
        pannel_center.add(btn5);
        pannel_center.add(btn6);
        pannel_center.add(btnSubtract);
        pannel_center.add(btn1);
        pannel_center.add(btn2);
        pannel_center.add(btn3);
        pannel_center.add(btnAdd);
        pannel_center.add(btnNegativeMark);
        pannel_center.add(btn0);
        pannel_center.add(btnDot);
        pannel_center.add(btnEqual);

        frame1.add(pannel_north, BorderLayout.NORTH);
        frame1.add(pannel_center, BorderLayout.CENTER);
       

        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnDot.addActionListener(this);
        btnNegativeMark.addActionListener(this);
        btnEqual.addActionListener(this);
        btnAdd.addActionListener(this);
        btnSubtract.addActionListener(this);
        btnMultiply.addActionListener(this);
        btnDivide.addActionListener(this);
        btnSqRt.addActionListener(this);
        btnPercentage.addActionListener(this);
        btnClear.addActionListener(this);

        btnCopy.addActionListener(this);
        btnPaste.addActionListener(this);

        frame1.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        Object object1 = ae.getSource();

        if (object1.equals(btn0) & zeroCount != 0) {
            result_textField.setText(result_textField.getText() + btn0.getLabel());

        } else if (object1.equals(btn1)) {
            result_textField.setText(zeroCount == 0 ? (" " + btn1.getLabel()) : (result_textField.getText() + btn1.getLabel()));
            zeroCount++;
        } else if (object1.equals(btn2)) {
            result_textField.setText(zeroCount == 0 ? (" " + btn2.getLabel()) : result_textField.getText() + btn2.getLabel());
            zeroCount++;
        } else if (object1.equals(btn3)) {
            result_textField.setText(zeroCount == 0 ? (" " + btn3.getLabel()) : result_textField.getText() + btn3.getLabel());
            zeroCount++;
        } else if (object1.equals(btn4)) {
            result_textField.setText(zeroCount == 0 ? (" " + btn4.getLabel()) : result_textField.getText() + btn4.getLabel());
            zeroCount++;
        } else if (object1.equals(btn5)) {
            result_textField.setText(zeroCount == 0 ? (" " + btn5.getLabel()) : result_textField.getText() + btn5.getLabel());
            zeroCount++;
        } else if (object1.equals(btn6)) {
            result_textField.setText(zeroCount == 0 ? (" " + btn6.getLabel()) : result_textField.getText() + btn6.getLabel());
            zeroCount++;
        } else if (object1.equals(btn7)) {
            result_textField.setText(zeroCount == 0 ? (" " + btn7.getLabel()) : result_textField.getText() + btn7.getLabel());
            zeroCount++;
        } else if (object1.equals(btn8)) {
            result_textField.setText(zeroCount == 0 ? (" " + btn8.getLabel()) : result_textField.getText() + btn8.getLabel());
            zeroCount++;
        } else if (object1.equals(btn9)) {
            result_textField.setText(zeroCount == 0 ? (" " + btn9.getLabel()) : result_textField.getText() + btn9.getLabel());
            zeroCount++;
        } else if (object1.equals(btnDot) & decimalCount == 0) {
            decimalCount++;
            zeroCount++;
            result_textField.setText(result_textField.getText() + btnDot.getLabel());

        } else if (object1.equals(btnAdd)) {
            if (firstValue == null) {
                firstValue = result_textField.getText();

            } else {
                secondValue = result_textField.getText();

                firstDoubleValue = Double.parseDouble(firstValue);
                secondDoubleValue = Double.parseDouble(secondValue);

                Answer = firstDoubleValue + secondDoubleValue;
                firstValue = "" + Answer;

            }
            result_textField.setText(" ");
            operator = btnAdd.getLabel();
            decimalCount = 0;

        } else if (object1.equals(btnSubtract)) {
            if (firstValue == null) {
                firstValue = result_textField.getText();
            } else {
                secondValue = result_textField.getText();

                firstDoubleValue = Double.parseDouble(firstValue);
                secondDoubleValue = Double.parseDouble(secondValue);
                Answer = firstDoubleValue - secondDoubleValue;
                firstValue = "" + Answer;
            }
            result_textField.setText(" ");
            operator = btnSubtract.getLabel();
            decimalCount = 0;

        } else if (object1.equals(btnMultiply)) {
            if (firstValue == null) {
                firstValue = result_textField.getText();
            } else {
                secondValue = result_textField.getText();

                firstDoubleValue = Double.parseDouble(firstValue);
                secondDoubleValue = Double.parseDouble(secondValue);
                Answer = firstDoubleValue * secondDoubleValue;
                firstValue = "" + Answer;
            }
            result_textField.setText(" ");
            operator = btnMultiply.getLabel();
            decimalCount = 0;

        } else if (object1.equals(btnDivide)) {
            if (firstValue == null) {
                firstValue = result_textField.getText();
            } else {
                secondValue = result_textField.getText();

                firstDoubleValue = Double.parseDouble(firstValue);
                secondDoubleValue = Double.parseDouble(secondValue);
                Answer = firstDoubleValue / secondDoubleValue;
                firstValue = "" + Answer;
            }
            result_textField.setText(" ");
            operator = btnDivide.getLabel();
            decimalCount = 0;

        } else if (object1.equals(btnSqRt)) {
            firstValue = result_textField.getText();
            firstDoubleValue = Double.parseDouble(firstValue);
            Answer = Math.sqrt(firstDoubleValue);
            result_textField.setText(" " + Answer);

        } else if (object1.equals(btnPercentage)) {
            secondValue = result_textField.getText();

            firstDoubleValue = Double.parseDouble(firstValue);
            secondDoubleValue = Double.parseDouble(secondValue);

            if (operator == "÷") {
                Answer = (firstDoubleValue / secondDoubleValue) * 100;
                result_textField.setText(" " + Answer);
            }
            firstValue = null;
            decimalCount = 0;
        } else if (object1.equals(btnNegativeMark)) {
            if (zeroCount != 0 & Double.parseDouble(result_textField.getText()) > 0) {
                firstDoubleValue = Double.parseDouble(result_textField.getText());
                result_textField.setText(" -" + firstDoubleValue);
            }
        } else if (object1.equals(btnEqual)) {
            secondValue = result_textField.getText();

            firstDoubleValue = Double.parseDouble(firstValue);
            secondDoubleValue = Double.parseDouble(secondValue);

            if (operator == "+") {
                Answer = firstDoubleValue + secondDoubleValue;
                result_textField.setText(" " + Answer);
            } else if (operator == "-") {
                Answer = firstDoubleValue - secondDoubleValue;
                result_textField.setText(" " + Answer);
            } else if (operator == "×") {
                Answer = firstDoubleValue * secondDoubleValue;
                result_textField.setText(" " + Answer);
            } else if (operator == "÷") {
                Answer = firstDoubleValue / secondDoubleValue;
                result_textField.setText(" " + Answer);
            }

            firstValue = null;
            decimalCount = 0;
        } else if (object1.equals(btnClear)) {
            result_textField.setText(" 0");
            firstValue = null;
            secondValue = null;
            firstDoubleValue = 0;
            secondDoubleValue = 0;
            Answer = 0;
            decimalCount = 0;
            zeroCount = 0;
        } 

        
        throw new UnsupportedOperationException("Not supported yet.");
        
    }

}

public class Calculator {

    public static void main(String[] args) {
       new cal();
    }
}
