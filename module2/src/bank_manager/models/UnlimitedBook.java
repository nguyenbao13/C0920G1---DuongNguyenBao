package bank_manager.models;

public class UnlimitedBook extends SavingBook {
    public UnlimitedBook() {
    }

    public UnlimitedBook(String idBook, String idCustomer, String openDate, String startDate, String money, String interest) {
        super(idBook, idCustomer, openDate, startDate, money, interest);
    }

    @Override
    public String toString() {
        return idBook + ", " + idCustomer +", "+ openDate + ", " + startDate + ", " + money +", "+ interest;
    }
}
