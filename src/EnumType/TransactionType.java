package EnumType;

public enum TransactionType {

    DEPOSIT(5),
    WITHDRAW(10),
    TRANSFER(15),
    PAYMENT(20),
    OTHER(100);


    private final int transactionCode;   // set edilmesi lazim

    private TransactionType (int code) {
        this.transactionCode=code;
    }

    public int getTransactionCode() {   // bu seklide set ediliyor....
        return transactionCode;
    }
}
