package creational.builder;

public class Main {
    public static void main(String args[]) {

        BankAccount bankAccount = new BankAccount.AccountBuilder("Asbjørn", "Skou")
                .withAccountNumber(1)
                .wantsNewsletter(true)
                .withEmail("Asbjoern_skou@hotmail.com").build();
    }
}
