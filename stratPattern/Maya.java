package stratPattern;
public class Maya implements PaymentType
{
    public String calculatePayment()
    {
        String output = "";

        output += "\nPayment is PayMaya.\n";
        output += "You will receive additional 1% interest on Savings.\n\n";

        return output;
    }
}