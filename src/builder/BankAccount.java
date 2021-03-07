package builder;

public class BankAccount {

    private String fornavn;
    private String efternavn;
    private boolean newletter;
    private String email;
    private int accountNumber;

    private BankAccount(AccountBuilder accountBuilder) {
        this.fornavn = accountBuilder.getFornavn();
        this.efternavn = accountBuilder.getEfternavn();
        this.newletter = accountBuilder.isNewletter();
        this.email = accountBuilder.getEmail();
        this.accountNumber = accountBuilder.getAccountNumber();
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public boolean isNewletter() {
        return newletter;
    }

    public String getEmail() {
        return email;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public static class AccountBuilder {

        String fornavn;
        String efternavn;
        boolean newletter;
        String email;
        private int accountNumber;

        public AccountBuilder(String fornavn, String efternavn) {
            this.fornavn = fornavn;
            this.efternavn = efternavn;
        }
        
        AccountBuilder setAccountNumber(int accountNumber){
            this.accountNumber = accountNumber; 
            return this;
        }

        AccountBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        AccountBuilder wantsNewsletter(boolean newletter) {
            this.newletter = newletter;
            return this;
        }

        private String getFornavn() {
            return fornavn;
        }

        private String getEfternavn() {
            return efternavn;
        }

        private boolean isNewletter() {
            return newletter;
        }

        private String getEmail() {
            return email;
        }

        private int getAccountNumber() {
            return accountNumber;
        }

        BankAccount build(){
            return new BankAccount(this);
        }
    }

}
