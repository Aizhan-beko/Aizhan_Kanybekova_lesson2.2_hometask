public class Fridge extends Technique implements Printable{
    private String energyClass;
    private int temperatureStorage;

    public Fridge(String name, int manufactured, String madeIn, String energyClass, int temperatureStorage) {
        super(name, manufactured, madeIn);
        this.energyClass = energyClass;
        this.temperatureStorage = temperatureStorage;

}

    public String getEnergyClass() {
        return energyClass;
    }

    public int getTemperatureStorage() {
        return temperatureStorage;

    }


    @Override
    public void print() {
        System.out.println("Name of model:" + getName() +
                "\n Year of Manufacture:" + getManufactured() +
                "\n Manufacturer country:" + getMadeIn());
        System.out.println("Energy class:"+ energyClass+
        "\n Temperature storage:" + temperatureStorage);

    }
}
