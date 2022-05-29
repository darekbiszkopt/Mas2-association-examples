import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final String bankName;
    private final List<Client> clients = new ArrayList<>();


    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }
    public void addClient(Client client) {
        this.clients.add(client);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", clients=" + clients +
                '}';
    }
}
