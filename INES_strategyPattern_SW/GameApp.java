package INES_strategyPattern_SW;
public class GameApp
{
    public static void main(String[] args)
    {
        Character knight = new Character("Knight", new Sword(), new Shield());
        Character wizard = new Character("Wizard", new Spell(), new Barrier());
        Character archer = new Character("Archer", new Arrow(), new Ashield());

        System.out.print("\n\nCHARACTER GAME DETAILS:\n");

        System.out.print("\nKNIGHT:\n");
        System.out.print("   Attack:\n");
        knight.attack();
        System.out.print("   Defense:\n");
        knight.defend();

        System.out.print("\nWIZARD:\n");
        System.out.print("   Attack:\n");
        wizard.attack();
        System.out.print("   Defense:\n");
        wizard.defend();

        System.out.print("\nARCHER:\n");
        System.out.print("   Attack:\n");
        archer.attack();
        System.out.print("   Defense:\n");
        archer.defend();

        System.out.print("\n\n");
    }
}