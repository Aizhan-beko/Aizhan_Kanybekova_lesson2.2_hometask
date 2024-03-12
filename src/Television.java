public class Television extends Technique implements Printable{

    private int screenDiagonal;
    private String screenResolution;

    public Television(String name, int manufactured, String madeIn, int screenDiagonal, String screenResolution) {
        super(name, manufactured, madeIn);
        this.screenDiagonal = screenDiagonal;
        this.screenResolution = screenResolution;
    }

    public int getScreenDiagonal() {
        return screenDiagonal;
    }

    public String getScreenResolution() {
        return screenResolution;

    }

    @Override
    public void print() {
        System.out.println("Name of model:" + getName() +
                           "\n Year of Manufacture:" + getManufactured() +
                           "\n Manufacturer country:" + getMadeIn());
        System.out.println("Diagonal of screen:" + screenDiagonal+
                           "\n Screen resolution:" + screenResolution);

    }
}
