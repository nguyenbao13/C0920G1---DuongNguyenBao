package bank_manager.models;

public class LimitedBook extends SavingBook {
    private String term;

    public LimitedBook(String term) {
        this.term = term;
    }

    public LimitedBook(String idBook, String idCustomer, String openDate, String startDate, String money, String interest, String term) {
        super(idBook, idCustomer, openDate, startDate, money, interest);
        this.term = term;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + term;
    }
}
