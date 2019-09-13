import java.awt.Color;

public class Pet
{
    private String species;
    private Color color;
    private int age;
    private int legs;
    private double weight;

    public Pet()
    {
        species = "cockerspaniel";
        color = Color.YELLOW;
        age = 17;
        legs = 4;
        weight = 20;
    }

    public Pet(String species, Color color, int age, int legs)
    {
        this.species = species;
        this.color = color;
        this.age = age;
        this.legs = legs;
        this.weight = weight;
    }

    public void eat(double foodInPounds)
    {
        weight += foodInPounds;
    }

    public double getWeight()
    {
        return weight;
    }
}



