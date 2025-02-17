import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction 
{
    private String type;   
    private double amount;
    private String timestamp;
    private static final DateTimeFormatter formattime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public Transaction(String type, double amount) 
    {
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now().format(formattime);
    }

    @Override
    public String toString()
    {
        return timestamp + " | " + type + " | $" + amount;
    }
}
