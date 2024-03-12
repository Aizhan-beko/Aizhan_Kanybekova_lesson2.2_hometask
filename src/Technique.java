public  abstract class Technique implements Printable {
    private String name;
    private int manufactured;
    private String madeIn;

    public String getName() {
        return name;
    }

    public int getManufactured() {
        return manufactured;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public Technique(String name, int manufactured, String madeIn) {
        this.name = name;
        this.manufactured = manufactured;
        this.madeIn = madeIn;


    }
}



