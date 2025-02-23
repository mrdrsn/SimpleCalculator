package simplecalculator;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame implements ActionListener {

    private JTextField firstNumberField;
    private JTextField secondNumberField;
    private JLabel resultLabel;

    public CalculatorGUI() {
        
        setTitle("Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        
        JLabel labelA = new JLabel("Введите число a:");
        labelA.setBounds(10, 10, 120, 25);
        add(labelA);

        firstNumberField = new JTextField();
        firstNumberField.setBounds(150, 10, 120, 25);
        add(firstNumberField);

        
        JLabel labelB = new JLabel("Введите число b:");
        labelB.setBounds(10, 40, 120, 25);
        add(labelB);

        secondNumberField = new JTextField();
        secondNumberField.setBounds(150, 40, 120, 25);
        add(secondNumberField);

        
        JButton addButton = new JButton("+");
        addButton.setBounds(10, 80, 50, 25);
        addButton.addActionListener(this);
        add(addButton);

        JButton subtractButton = new JButton("-");
        subtractButton.setBounds(70, 80, 50, 25);
        subtractButton.addActionListener(this);
        add(subtractButton);

        JButton multiplyButton = new JButton("*");
        multiplyButton.setBounds(130, 80, 50, 25);
        multiplyButton.addActionListener(this);
        add(multiplyButton);

        JButton divideButton = new JButton("/");
        divideButton.setBounds(190, 80, 50, 25);
        divideButton.addActionListener(this);
        add(divideButton);

        
        resultLabel = new JLabel("Результат:");
        resultLabel.setBounds(10, 120, 260, 25);
        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Calculator calc = new Calculator();
        try {
            
            double a = Double.parseDouble(firstNumberField.getText());
            double b = Double.parseDouble(secondNumberField.getText());

            double result = 0;
            String command = e.getActionCommand();

            switch (command) {
                case "+":
                    result = calc.add(a,b);
                    break;
                case "-":
                    result = calc.subtract(a,b);
                    break;
                case "*":
                    result = calc.multiply(a,b);
                    break;
                case "/":
                    if (b != 0) {
                        result = calc.divide(a,b);//в методе уже есть обработка нуля, но все же JOptionPane.showMessageDialog() красивее
                    } else {
                        JOptionPane.showMessageDialog(this, "Деление на ноль невозможно", "Ошибка", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    break;
                default:
                    break;
            }
            resultLabel.setText("Результат: " + result);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Введите корректные числа", "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
    }
}

