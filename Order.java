public class Order
{
    private Double orderAmount;
    private String paymentType;

    public Order(Double orderAmount, String paymentType)
    {
        this.orderAmount = orderAmount;
        this.paymentType = paymentType;
    }
    public String calculatePyament()
    {
        String output = "";

        if (paymentType.equals("Gcash"))
        {
            output += "Payment is Gcash.\n";
            output += "Energy for trees: 10 points.\n\n";
        }
        else if (paymentType.equals("Maya"))
        {
            output += "Payment is PayMaya.\n";
            output += "You will receive additional 1% interest on Savings.\n\n";
        }
        else
        {
            output += "Payment is Cash.\n";
            output += "No incentives.\n\n";
        }

        System.out.print("\nORDER DETAILS:\n");
        
        return "Your order amount is " + orderAmount + "\n" + output;
    }
}