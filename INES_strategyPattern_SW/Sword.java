package INES_strategyPattern_SW;
public class Sword implements AttackMode
{
    @Override
    public void attack()
    {
        System.out.println("     Knight attacks with a sword!");
    }
}