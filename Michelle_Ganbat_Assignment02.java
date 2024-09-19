import javax.swing.JOptionPane;

public class Michelle_Ganbat_Assignment02{
    public static void main(String[] args) {
        String firstName;
        char middleInitial;
        String lastName;
        int age;
        double grossAnnualPay;
        double taxRate;
        double netAnnualPay;

        firstName = JOptionPane.showInputDialog("Enter your first name.");
        middleInitial = JOptionPane.showInputDialog("Enter your middle initial.").charAt(0);
        lastName = JOptionPane.showInputDialog("Enter your last name.");
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age."));
        grossAnnualPay = Double.parseDouble(JOptionPane.showInputDialog("Enter your gross annual pay."));
        taxRate = Double.parseDouble(JOptionPane.showInputDialog("Enter your tax rate."));

        netAnnualPay = grossAnnualPay - (grossAnnualPay * taxRate);

        System.out.println("Hello " + firstName + " " + middleInitial + ". " + lastName + ",\n"
                + "You are " + age + " years old now.\n"
                + "It is amazing that you made $" + grossAnnualPay + " this year. With the tax \n"
                + "rate of " 
                + taxRate + ", you can take home $" + netAnnualPay + ".");
    }
}
