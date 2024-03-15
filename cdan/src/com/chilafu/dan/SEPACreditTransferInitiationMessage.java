package com.chilafu.dan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Document")
public class SEPACreditTransferInitiationMessage {

    private CustomerCreditTransferInitiation customerCreditTransferInitiation;

    @XmlElement(name = "CstmrCdtTrfInitn")
    public CustomerCreditTransferInitiation getCustomerCreditTransferInitiation() {
        return customerCreditTransferInitiation;
    }

    public void setCustomerCreditTransferInitiation(CustomerCreditTransferInitiation customerCreditTransferInitiation) {
        this.customerCreditTransferInitiation = customerCreditTransferInitiation;
    }
}

class CustomerCreditTransferInitiation {

    private GroupHeader groupHeader;
    private PaymentInformation paymentInformation;

    @XmlElement(name = "GrpHdr")
    public GroupHeader getGroupHeader() {
        return groupHeader;
    }

    public void setGroupHeader(GroupHeader groupHeader) {
        this.groupHeader = groupHeader;
    }

    @XmlElement(name = "PmtInf")
    public PaymentInformation getPaymentInformation() {
        return paymentInformation;
    }

    public void setPaymentInformation(PaymentInformation paymentInformation) {
        this.paymentInformation = paymentInformation;
    }
}

class GroupHeader {

    private String messageId;
    private String creationDateTime;
    private int numberOfTransactions;
    private double controlSum;
    private InitiatingParty initiatingParty;

    @XmlElement(name = "MsgId")
    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    @XmlElement(name = "CreDtTm")
    public String getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    @XmlElement(name = "NbOfTxs")
    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public void setNumberOfTransactions(int numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }

    @XmlElement(name = "CtrlSum")
    public double getControlSum() {
        return controlSum;
    }

    public void setControlSum(double controlSum) {
        this.controlSum = controlSum;
    }

    @XmlElement(name = "InitgPty")
    public InitiatingParty getInitiatingParty() {
        return initiatingParty;
    }

    public void setInitiatingParty(InitiatingParty initiatingParty) {
        this.initiatingParty = initiatingParty;
    }
}

class InitiatingParty {
    private String name;

    @XmlElement(name = "Nm")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class PaymentInformation {

    private String paymentInformationId;
    private String paymentMethod;
    private boolean batchBooking;
    private int numberOfTransactions;
    private double controlSum;
    private PaymentTypeInformation paymentTypeInformation;
    private String requestedExecutionDate;
    private Debtor debtor;
    private DebtorAccount debtorAccount;
    private DebtorAgent debtorAgent;
    private String chargeBearer;
    private List<CreditTransferTransactionInformation> creditTransferTransactionInformationList;

    @XmlElement(name = "PmtInfId")
    public String getPaymentInformationId() {
        return paymentInformationId;
    }

    public void setPaymentInformationId(String paymentInformationId) {
        this.paymentInformationId = paymentInformationId;
    }

    @XmlElement(name = "PmtMtd")
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @XmlElement(name = "BtchBookg")
    public boolean isBatchBooking() {
        return batchBooking;
    }

    public void setBatchBooking(boolean batchBooking) {
        this.batchBooking = batchBooking;
    }

    @XmlElement(name = "NbOfTxs")
    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public void setNumberOfTransactions(int numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }

    @XmlElement(name = "CtrlSum")
    public double getControlSum() {
        return controlSum;
    }

    public void setControlSum(double controlSum) {
        this.controlSum = controlSum;
    }

    @XmlElement(name = "PmtTpInf")
    public PaymentTypeInformation getPaymentTypeInformation() {
        return paymentTypeInformation;
    }

    public void setPaymentTypeInformation(PaymentTypeInformation paymentTypeInformation) {
        this.paymentTypeInformation = paymentTypeInformation;
    }

    @XmlElement(name = "ReqdExctnDt")
    public String getRequestedExecutionDate() {
        return requestedExecutionDate;
    }

    public void setRequestedExecutionDate(String requestedExecutionDate) {
        this.requestedExecutionDate = requestedExecutionDate;
    }

    @XmlElement(name = "Dbtr")
    public Debtor getDebtor() {
        return debtor;
    }

    public void setDebtor(Debtor debtor) {
        this.debtor = debtor;
    }

    @XmlElement(name = "DbtrAcct")
    public DebtorAccount getDebtorAccount() {
        return debtorAccount;
    }

    public void setDebtorAccount(DebtorAccount debtorAccount) {
        this.debtorAccount = debtorAccount;
    }

    @XmlElement(name = "DbtrAgt")
    public DebtorAgent getDebtorAgent() {
        return debtorAgent;
    }

    public void setDebtorAgent(DebtorAgent debtorAgent) {
        this.debtorAgent = debtorAgent;
    }

    @XmlElement(name = "ChrgBr")
    public String getChargeBearer() {
        return chargeBearer;
    }

    public void setChargeBearer(String chargeBearer) {
        this.chargeBearer = chargeBearer;
    }

    @XmlElement(name = "CdtTrfTxInf")
    public List<CreditTransferTransactionInformation> getCreditTransferTransactionInformationList() {
        return creditTransferTransactionInformationList;
    }

    public void setCreditTransferTransactionInformationList(List<CreditTransferTransactionInformation> creditTransferTransactionInformationList) {
        this.creditTransferTransactionInformationList = creditTransferTransactionInformationList;
    }
}

class PaymentTypeInformation {
    private ServiceLevel serviceLevel;

    @XmlElement(name = "SvcLvl")
    public ServiceLevel getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(ServiceLevel serviceLevel) {
        this.serviceLevel = serviceLevel;
    }
}

class ServiceLevel {
    private String code;

    @XmlElement(name = "Cd")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

class Debtor {
    private String name;

    @XmlElement(name = "Nm")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class DebtorAccount {
    private String iban;

    @XmlElement(name = "IBAN")
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
}

class DebtorAgent {
    private FinancialInstitutionIdentification financialInstitutionIdentification;

    @XmlElement(name = "FinInstnId")
    public FinancialInstitutionIdentification getFinancialInstitutionIdentification() {
        return financialInstitutionIdentification;
    }

    public void setFinancialInstitutionIdentification(FinancialInstitutionIdentification financialInstitutionIdentification) {
        this.financialInstitutionIdentification = financialInstitutionIdentification;
    }
}

class FinancialInstitutionIdentification {
    private String bic;

    @XmlElement(name = "BIC")
    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }
}

class CreditTransferTransactionInformation {
    private PaymentIdentification paymentIdentification;
    private Amount amount;
    private DebtorAgent creditorAgent;
    private Creditor creditor;
    private CreditorAccount creditorAccount;
    private RemittanceInformation remittanceInformation;

    @XmlElement(name = "PmtId")
    public PaymentIdentification getPaymentIdentification() {
        return paymentIdentification;
    }

    public void setPaymentIdentification(PaymentIdentification paymentIdentification) {
        this.paymentIdentification = paymentIdentification;
    }

    @XmlElement(name = "Amt")
    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    @XmlElement(name = "CdtrAgt")
    public DebtorAgent getCreditorAgent() {
        return creditorAgent;
    }

    public void setCreditorAgent(DebtorAgent creditorAgent) {
        this.creditorAgent = creditorAgent;
    }

    @XmlElement(name = "Cdtr")
    public Creditor getCreditor() {
        return creditor;
    }

    public void setCreditor(Creditor creditor) {
        this.creditor = creditor;
    }

    @XmlElement(name = "CdtrAcct")
    public CreditorAccount getCreditorAccount() {
        return creditorAccount;
    }

    public void setCreditorAccount(CreditorAccount creditorAccount) {
        this.creditorAccount = creditorAccount;
    }

    @XmlElement(name = "RmtInf")
    public RemittanceInformation getRemittanceInformation() {
        return remittanceInformation;
    }

    public void setRemittanceInformation(RemittanceInformation remittanceInformation) {
        this.remittanceInformation = remittanceInformation;
    }
}

class PaymentIdentification {
    private String endToEndId;

    @XmlElement(name = "EndToEndId")
    public String getEndToEndId() {
        return endToEndId;
    }

    public void setEndToEndId(String endToEndId) {
        this.endToEndId = endToEndId;
    }
}

class Amount {
    private String currency;
    private double amountValue;

    @XmlElement(name = "InstdAmt")
    public double getAmountValue() {
        return amountValue;
    }

    public void setAmountValue(double amountValue) {
        this.amountValue = amountValue;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}

class Creditor {
    private String name;

    @XmlElement(name = "Nm")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class CreditorAccount {
    private String iban;

    @XmlElement(name = "IBAN")
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
}

class RemittanceInformation {
    private String unstructured;

    @XmlElement(name = "Ustrd")
    public String getUnstructured() {
        return unstructured;
    }

    public void setUnstructured(String unstructured) {
        this.unstructured = unstructured;
}
}