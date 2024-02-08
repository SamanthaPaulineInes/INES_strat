package stratPattern;
public class Order
{
    private Double orderAmount;
    private PaymentType paymentType;

    public Order(Double orderAmount, PaymentType paymentType)
    {
        this.orderAmount = orderAmount;
        this.paymentType = paymentType;
    }

    public String calculatePayment()
    {
        System.out.print("\nORDER DETAILS: ");
        return "\nYour order amount is " + orderAmount + paymentType.calculatePayment();
    }
}