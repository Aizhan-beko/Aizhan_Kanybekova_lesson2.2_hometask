public class Treadmill extends Technique implements Printable{

    private String construction;
    private double enginePower;
    private int maxUserweight;

    public Treadmill(String name, int manufactured, String madeIn, String construction, double enginePower, int maxUserweight) {
        super(name, manufactured, madeIn);
        this.construction = construction;
        this.enginePower = enginePower;
        this.maxUserweight = maxUserweight;
    }


    public String getConstruction() {
        return construction;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public int getMaxUserweight() {
        return maxUserweight;

    }

    @Override
    public void print() {
        System.out.println("Name of model:" + getName() +
                "\n Year of Manufacture:" + getManufactured() +
                "\n Manufacturer country:" + getMadeIn());
        System.out.println("Type construction:" + construction+
                "\n Engine power in horsepower:"+enginePower +
                "\n Maximum user weight:" + maxUserweight);

    }
}
