package INES_strategyPattern_SW;
public class Character
{
    private String type;
    private AttackMode attackMode;
    private DefendMode defendMode;

    public Character(String type, AttackMode attackMode, DefendMode defendMode)
    {
        this.type = type;
        this.attackMode = attackMode;
        this.defendMode = defendMode;
    }

    public void attack()
    {
        attackMode.attack();
    }
    public void defend()
    {
        defendMode.defend();
    }
}