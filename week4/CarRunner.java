public class CarRunner
{
    public static void main(String[] args)
    {
        Car myMustang = new Car();
        //System.out.println(myMustang);
        myMustang.drive(5.5);
        System.out.println(myMustang.getAmountOfGas());
        myMustang.drive(100.5);
        System.out.println(myMustang.getAmountOfGas());
        myMustang.fillUpGasTank(9);
        System.out.println(myMustang.getAmountOfGas());
        Car myMinivan = new Car();
    }
}
