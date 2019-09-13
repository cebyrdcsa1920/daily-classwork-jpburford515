public class PetRunner
{
    public static void main(String[] args)
    {
        Pet myPet = new Pet();
        myPet.eat(5.5);
        System.out.println(myPet.getWeight());
    }
}