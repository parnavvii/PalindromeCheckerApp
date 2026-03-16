
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PalindromeCheckerApp extends JFrame implements ActionListener {

    JTextField inputField;
    JButton checkButton;
    JLabel resultLabel;

    public PalindromeCheckerApp() {

        setTitle("Palindrome Checker App");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Text Field
        inputField = new JTextField(20);

        // Button
        checkButton = new JButton("Check Palindrome");
        checkButton.addActionListener(this);

        // Result Label
        resultLabel = new JLabel("Enter text and press check");

        add(new JLabel("Enter Text:"));
        add(inputField);
        add(checkButton);
        add(resultLabel);

        setVisible(true);
    }

    // Palindrome checking logic
    public boolean isPalindrome(String text) {
        text = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equals(reversed);
    }

    // Button click event
    public void actionPerformed(ActionEvent e) {
        String input = inputField.getText();

        if (isPalindrome(input)) {
            resultLabel.setText("It is a Palindrome ✅");
        } else {
            resultLabel.setText("Not a Palindrome ❌");
        }
    }

    public static void main(String[] args) {
        new PalindromeCheckerApp();
    }
}