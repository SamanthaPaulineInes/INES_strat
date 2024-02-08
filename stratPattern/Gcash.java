package stratPattern;
public class Gcash implements PaymentType
{
    public String calculatePayment()
    {
        String output = "";

        output += "\nPayment is Gcash.\n";
        output += "Energy for trees: 10 points.\n\n";

        return output;
    }
}