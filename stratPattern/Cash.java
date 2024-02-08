package stratPattern;
public class Cash implements PaymentType
{
    public String calculatePayment()
    {
        String output = "";

        output += "\nPayment is Cash.\n";
        output += "No incentives.\n\n";

        return output;
    }
}