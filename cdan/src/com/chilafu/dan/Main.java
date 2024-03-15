package com.chilafu.dan;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        try {
            File xmlFile = new File("C:\\Users\\Dan\\Desktop\\1.00-starting-project\\cdan\\src\\test\\resources\\sepa_message.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(SEPACreditTransferInitiationMessage.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            SEPACreditTransferInitiationMessage sepaMessage = (SEPACreditTransferInitiationMessage) jaxbUnmarshaller.unmarshal(xmlFile);

            System.out.println("Message ID: " + sepaMessage.getCustomerCreditTransferInitiation().getGroupHeader().getMessageId());
            System.out.println("Creation Date Time: " + sepaMessage.getCustomerCreditTransferInitiation().getGroupHeader().getCreationDateTime());
            System.out.println("Number of Transactions: " + sepaMessage.getCustomerCreditTransferInitiation().getGroupHeader().getNumberOfTransactions());
            System.out.println("Control Sum: " + sepaMessage.getCustomerCreditTransferInitiation().getGroupHeader().getControlSum());
            System.out.println("Initiating Party: " + sepaMessage.getCustomerCreditTransferInitiation().getGroupHeader().getInitiatingParty().getName());
            System.out.println("Payment Information: " + sepaMessage.getCustomerCreditTransferInitiation().getPaymentInformation().getPaymentInformationId());

                    } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
