package stratPattern;
public class OrderDemo
{
    public static void main(String[] args)
    {
        Order order = new Order(1200.0, new Cash());

        System.out.print(order.calculatePayment());
    }
}