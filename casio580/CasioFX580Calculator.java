import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CasioFX580Calculator extends JFrame implements ActionListener {
    private JTextField display;
    private StringBuilder currentInput;
    private double result;
    private String lastCommand;
    private boolean startNewNumber;

    public CasioFX580Calculator() {
        currentInput = new StringBuilder();
        result = 0;
        lastCommand = "=";
        startNewNumber = true;

        // Thiết lập giao diện người dùng
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 6, 5, 5));

        String[] buttons = {
            "MODE", "COMPLEX", "BASE-N", "MATRIX", "VECTOR", "STAT",
            "SHIFT", "ALPHA", "ENG", "(", ")", "DEL",
            "x^2", "√", "1/x", "log", "ln", "e^x",
            "7", "8", "9", "÷", "sin", "cos",
            "4", "5", "6", "×", "tan", "Ans",
            "1", "2", "3", "-", "EXP", "=",
            "0", ".", "(-)", "+", "π", "Rand",
            "AC"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 20));
            button.setBackground(Color.LIGHT_GRAY);
            button.setForeground(Color.BLACK);

            if (text.matches("[0-9]") || text.equals(".")) {
                button.setBackground(Color.WHITE);
            } else if (text.matches("[+\\-×÷=]")) {
                button.setBackground(Color.ORANGE);
            } else if (text.equals("AC") || text.equals("DEL")) {
                button.setBackground(Color.RED);
                button.setForeground(Color.WHITE);
            } else if (text.equals("Ans") || text.equals("EXP") || text.equals("(-)") || text.equals("π") || text.equals("Rand")) {
                button.setBackground(Color.GREEN);
                button.setForeground(Color.BLACK);
            }

            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
        setTitle("Casio fx-580 Calculator");
        setSize(500, 700);  // Thay đổi kích thước để chứa các nút bấm
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("AC")) {
            currentInput.setLength(0);
            result = 0;
            lastCommand = "=";
            display.setText("");
        } else if ("0123456789.".contains(command)) {
            if (startNewNumber) {
                display.setText(command);
                startNewNumber = false;
            } else {
                display.setText(display.getText() + command);
            }
        } else if (command.equals("=")) {
            calculate(Double.parseDouble(display.getText()));
            lastCommand = "=";
            startNewNumber = true;
        } else if (command.equals("x^2")) {
            display.setText("" + Math.pow(Double.parseDouble(display.getText()), 2));
            startNewNumber = true;
        } else if (command.equals("√")) {
            display.setText("" + Math.sqrt(Double.parseDouble(display.getText())));
            startNewNumber = true;
        } else if (command.equals("1/x")) {
            display.setText("" + (1 / Double.parseDouble(display.getText())));
            startNewNumber = true;
        } else if (command.equals("sin")) {
            display.setText("" + Math.sin(Math.toRadians(Double.parseDouble(display.getText()))));
            startNewNumber = true;
        } else if (command.equals("cos")) {
            display.setText("" + Math.cos(Math.toRadians(Double.parseDouble(display.getText()))));
            startNewNumber = true;
        } else if (command.equals("tan")) {
            display.setText("" + Math.tan(Math.toRadians(Double.parseDouble(display.getText()))));
            startNewNumber = true;
        } else if (command.equals("log")) {
            display.setText("" + Math.log10(Double.parseDouble(display.getText())));
            startNewNumber = true;
        } else if (command.equals("ln")) {
            display.setText("" + Math.log(Double.parseDouble(display.getText())));
            startNewNumber = true;
        } else if (command.equals("EXP")) {
            display.setText("" + Math.exp(Double.parseDouble(display.getText())));
            startNewNumber = true;
        } else if (command.equals("Ans")) {
            display.setText("" + result);
            startNewNumber = false;
        } else if (command.equals("DEL")) {
            String text = display.getText();
            if (!text.isEmpty()) {
                display.setText(text.substring(0, text.length() - 1));
            }
        } else if (command.equals("π")) {
            display.setText("" + Math.PI);
            startNewNumber = false;
        } else if (command.equals("Rand")) {
            display.setText("" + Math.random());
            startNewNumber = false;
        } else if (command.equals("(-)")) {
            display.setText("" + (-1 * Double.parseDouble(display.getText())));
            startNewNumber = false;
        } else {
            if (startNewNumber) {
                lastCommand = command;
            } else {
                calculate(Double.parseDouble(display.getText()));
                lastCommand = command;
                startNewNumber = true;
            }
        }
    }

    private void calculate(double x) {
        if (lastCommand.equals("+")) {
            result += x;
        } else if (lastCommand.equals("-")) {
            result -= x;
        } else if (lastCommand.equals("×")) {
            result *= x;
        } else if (lastCommand.equals("÷")) {
            result /= x;
        } else if (lastCommand.equals("=")) {
            result = x;
        }
        display.setText("" + result);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CasioFX580Calculator calc = new CasioFX580Calculator();
            calc.setVisible(true);
        });
    }
}
