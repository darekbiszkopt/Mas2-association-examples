import java.util.ArrayList;
import java.util.List;

public class Client {
    private final String name;
    private final List<Bank> banks = new ArrayList<>();
    public static String toString;
    public Client(String name) {
        this.name = name;
    }

    public void addBank(Bank bank) {
        if (!banks.contains(bank)) {
            banks.add(bank);
            bank.addClient(this);
        }
    }

    @Override
    public String toString() {
        toString = "Client: " + name + " has bank accounts: [ ";
        banks.forEach(bank -> {
            toString += " | " + bank.getBankName() + " | ";
        });
        return toString + " ]";
    }
}