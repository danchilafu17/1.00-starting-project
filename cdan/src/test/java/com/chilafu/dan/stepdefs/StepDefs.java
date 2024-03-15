package test.java.com.chilafu.dan.stepdefs;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class StepDefs {
    private Document document;
    private double debtorTotalAmount;
    private double sumOfCredits;
    private LocalDate transactionDate;

    @Given("I have parsed the XML document")
    public void parseXMLDocument() {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            document = builder.parse("your_xml_file.xml"); // Replace "your_xml_file.xml" with the path to your XML file
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("I extract the total amount of the debtor")
    public void extractDebtorTotalAmount() {
        NodeList debtorAmountList = document.getElementsByTagName("Dbtr");
        Element debtorElement = (Element) debtorAmountList.item(0);
        String debtorAmountStr = debtorElement.getElementsByTagName("InstdAmt").item(0).getTextContent();
        debtorTotalAmount = Double.parseDouble(debtorAmountStr);
    }

    @When("I calculate the sum of all credit amounts")
    public void calculateSumOfCredits() {
        NodeList creditList = document.getElementsByTagName("CdtTrfTxInf");
        sumOfCredits = 0.0;
        for (int i = 0; i < creditList.getLength(); i++) {
            Element creditElement = (Element) creditList.item(i);
            String creditAmountStr = creditElement.getElementsByTagName("InstdAmt").item(0).getTextContent();
            double creditAmount = Double.parseDouble(creditAmountStr);
            sumOfCredits += creditAmount;
        }
    }

    @When("I extract the transaction date")
    public void extractTransactionDate() {
        NodeList dateList = document.getElementsByTagName("ReqdExctnDt");
        Element dateElement = (Element) dateList.item(0);
        String dateStr = dateElement.getTextContent();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
        transactionDate = LocalDate.parse(dateStr, formatter);
    }

    @When("I extract all IBANs")
    public void extractIBANs() {
        NodeList ibanList = document.getElementsByTagName("IBAN");
        for (int i = 0; i < ibanList.getLength(); i++) {
            Element ibanElement = (Element) ibanList.item(i);
            String iban = ibanElement.getTextContent();
            // Validate IBAN here (not implemented in this example)
        }
    }

    @Then("the total amount should have at least 2 digits")
    public void verifyDebtorTotalAmountDigits() {
        // Assertion logic to check if debtorTotalAmount has at least 2 digits
        if (String.valueOf(debtorTotalAmount).indexOf('.') == -1) {
            // No decimal part, add .00
            assert false : "Debtor total amount does not have at least 2 digits.";
        } else if (String.valueOf(debtorTotalAmount).split("\\.")[1].length() < 2) {
            assert false : "Debtor total amount does not have at least 2 digits.";
        }
    }

    @Then("the debtor's amount should be equal to the sum of all credits")
    public void verifyDebtorAmountEqualsSumOfCredits() {
        // Assertion logic to check if debtorTotalAmount equals sumOfCredits
        assert debtorTotalAmount == sumOfCredits : "Debtor's amount is not equal to the sum of all credits.";
    }

    @Then("the transaction date should not be in the future")
    public void verifyTransactionDateNotInFuture() {
        // Assertion logic to check if transactionDate is not in the future
        assert !transactionDate.isAfter(LocalDate.now()) : "Transaction date is in the future.";
    }

    @Then("all IBANs should be valid")
    public void validateAllIBANs() {
        // Validation logic for all IBANs (not implemented in this example)
    }
}