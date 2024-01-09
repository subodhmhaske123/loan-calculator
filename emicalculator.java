import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class calculator extends JFrame
{
Container c;
JLabel labHeader,homeLoan,loanTenure,interestRate,loanEmi,emi;
JTextField inputAmount,inputTenure,inputRate;
JButton btnEmi,btnLoan,btnInterest;

calculator()
{
c = getContentPane();
Font h = new Font("Calibri",Font.BOLD,40);
Font f = new Font("Calibri",Font.PLAIN,25);

Panel panel = new Panel();
panel.setBounds(0,25,600,50);
panel.setBackground(Color.gray);
labHeader = new JLabel("EMI Calculator");
labHeader.setFont(h);
panel.add(labHeader);
c.add(panel);

homeLoan = new JLabel("Home Loan Amount");
homeLoan.setBounds(20,100,250,30);
homeLoan.setFont(f);
c.add(homeLoan);

inputAmount = new JTextField(40);
inputAmount.setFont(f);
inputAmount.setBounds(286,100,250,30);
c.add(inputAmount);

JLabel symbol = new JLabel("₹");
symbol.setBounds(540,100,25,25);
symbol.setFont(new Font("Arial",Font.BOLD,28));
symbol.setOpaque(true);
symbol.setBackground(Color.lightGray);
symbol.setForeground(Color.black);
symbol.setHorizontalAlignment(JLabel.CENTER);
c.add(symbol);


JLabel symbol1 = new JLabel("Yr");
symbol1.setBounds(540,180,25,25);
symbol1.setFont(new Font("Arial",Font.BOLD,24));
symbol1.setOpaque(true);
symbol1.setBackground(Color.lightGray);
symbol1.setForeground(Color.black);
symbol1.setHorizontalAlignment(JLabel.CENTER);
c.add(symbol1);

JLabel symbol2 = new JLabel("%");
symbol2.setBounds(540,260,25,25);
symbol2.setFont(new Font("Arial",Font.BOLD,28));
symbol2.setOpaque(true);
symbol2.setBackground(Color.lightGray);
symbol2.setForeground(Color.black);
symbol2.setHorizontalAlignment(JLabel.CENTER);
c.add(symbol2);


loanTenure = new JLabel("Loan Tenure");
loanTenure.setBounds(20,180,250,30);
loanTenure.setFont(f);
c.add(loanTenure);

interestRate = new JLabel("Interest Rate");
interestRate.setBounds(20,260,250,30);
interestRate.setFont(f);
c.add(interestRate);

inputTenure = new JTextField(40);
inputTenure.setFont(f);
inputTenure.setBounds(286,180,250,30);
c.add(inputTenure);

inputRate = new JTextField(40);
inputRate.setFont(f);
inputRate.setBounds(286,260,250,30);
c.add(inputRate);

loanEmi = new JLabel("Calculate");
loanEmi.setBounds(250,440,150,50);
loanEmi.setFont(f);
c.add(loanEmi);

btnEmi = new JButton("EMI");
btnEmi.setBounds(20,480,150,40);
btnEmi.setMargin(new Insets(0, 0, 0, 0));
btnEmi.setFont(f);
c.add(btnEmi);
btnLoan = new JButton("Total Loan");
btnLoan.setBounds(220,480,150,40);
btnLoan.setMargin(new Insets(0, 0, 0, 0));
btnLoan.setFont(f);
c.add(btnLoan);
btnInterest = new JButton("Interest");
btnInterest.setBounds(398,480,150,40);
btnInterest.setMargin(new Insets(0, 0, 0, 0));
btnInterest.setFont(f);
c.add(btnInterest);

setLayout(null);
setVisible(true);
setSize(600,600);
setLocationRelativeTo(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);
ActionListener a = (ae) ->
{

if(inputAmount.getText().equals("") || inputRate.getText().equals("") || inputTenure.getText().equals(""))
{JOptionPane.showMessageDialog(c,"Please Fill All Fields to Calculate EMI");}
else{
try{
double principle = Double.parseDouble(inputAmount.getText());
double rate = Double.parseDouble(inputRate.getText());
double rate1 = rate/100;
double tenure = Double.parseDouble(inputTenure.getText());
if(principle <= 0 || rate <= 0 || tenure <= 0){JOptionPane.showMessageDialog(c,"Amount Should not be negative");}else{
double months = tenure * 12;
double res = principle * rate1 * tenure;
double z = ( res + principle )/ months;

JOptionPane.showMessageDialog(c,"Your Emi is " + z);

}
}catch(Exception m)
{
JOptionPane.showMessageDialog(c,"Please Enter Integers Only");
}
}
};btnEmi.addActionListener(a);

ActionListener b = (ae) ->
{

if(inputAmount.getText().equals("") || inputRate.getText().equals("") || inputTenure.getText().equals(""))
{JOptionPane.showMessageDialog(c,"Please Fill All Fields to Calculate EMI");}
else{
try{
double principle = Double.parseDouble(inputAmount.getText());
double rate = Double.parseDouble(inputRate.getText());
double rate1 = rate/100;
double tenure = Double.parseDouble(inputTenure.getText());
if(principle <= 0 || rate <= 0 || tenure <= 0){JOptionPane.showMessageDialog(c,"Amount Should not be negative");}else{
double months = tenure * 12;
double res = principle * rate1 * tenure;
double z = principle + res;

JOptionPane.showMessageDialog(c,"Your Total Amount to repay is " + z);
/*inputAmount.setText("");
inputRate.setText("");
inputTenure.setText("");*/
}
}catch(Exception e)
{
JOptionPane.showMessageDialog(c,"Please Enter Integers Only");
}
}
};btnLoan.addActionListener(b);

ActionListener d = (ae) ->
{

if(inputAmount.getText().equals("") || inputRate.getText().equals("") || inputTenure.getText().equals(""))
{JOptionPane.showMessageDialog(c,"Please Fill All Fields to Calculate EMI");}
else{
try{
double principle = Double.parseDouble(inputAmount.getText());
double rate = Double.parseDouble(inputRate.getText());
double rate1 = rate/100;
double tenure = Double.parseDouble(inputTenure.getText());
if(principle <= 0 || rate <= 0 || tenure <= 0){JOptionPane.showMessageDialog(c,"Amount Should not be negative");}else{
double months = tenure * 12;
double res = principle * rate1 * tenure;

JOptionPane.showMessageDialog(c,"Your Total Interest is " + res);

}
}catch(Exception n)
{
JOptionPane.showMessageDialog(c,"Please Enter Integers Only");
}
}
};btnInterest.addActionListener(d);
}
}



class emicalculator
{
public static void main(String args[])
{
new calculator();
}
}