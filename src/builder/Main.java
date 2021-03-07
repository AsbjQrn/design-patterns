package builder;

public class Main {
    public static void main(String args[]) {

        BankAccount bankAccount = new BankAccount.AccountBuilder("Asbjørn", "Skou")
                .setAccountNumber(1)
                .wantsNewsletter(true)
                .withEmail("Asbjoern_skou@hotmail.com").build();
    }
}
