package org.example.csc311_assignmentlab02;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField loanAmount; //created a text field for loan amount
    @FXML
    private TextField interestRate; // created a text field for interest rate
    @FXML
    private TextField numYears; //created a text field for number of years
    @FXML
    private TextField paymentMonthly; //created a text field for monthly payment
    @FXML
    private TextField totalPayment; //created a text field for total payment

    @FXML
    //created a method to calculate the monthly and total payment using the loan amount, interest rate, and number of years
    protected void onCalculateButtonClick() {
        double loanAmt = Double.parseDouble(loanAmount.getText()); //converted the loan amount to double
        double interestRt = Double.parseDouble(interestRate.getText()) / 100 / 12; //calculate interest rate
        double numYrs = Double.parseDouble(numYears.getText()) * 12; //calculate number of years
        double monthlyPayment = (double) (loanAmt * interestRt * Math.pow(1 + interestRt, numYrs) / (Math.pow(1 + interestRt, numYrs) - 1)); //calculate monthly payment
        double totalPay = monthlyPayment * numYrs; //calculate total payment
        paymentMonthly.setText(String.format("$%.2f", monthlyPayment)); //display monthly payment
        totalPayment.setText(String.format("$%.2f", totalPay)); //display total payment
    }
}