public class Main {

    public static Technique createObject(String className) {

        switch (className) {

            case "Television":
                return new Television("Samsung UE50BU8000UXCE", 2022, "Vietnam", 50, "4K UHD");
            case "Fridge":
                return new Fridge("BEKO CNKL 7321 EC0W ", 2020, "Turkey", "A+", 17);
            case "Treadmill":
                return new Treadmill("NordicTrack T7.0 ", 2023, "U.S.A", "foldable design", 2.5, 150);
            default:
        }

        return null;
    }

        public static void main(String[] args) {

                Technique object2 = createObject("Television");
                Technique object3 = createObject("Fridge");
                Technique object4 = createObject("Treadmill");

                ((Printable)object2).print();
                System.out.println();
                ((Printable)object3).print();
                System.out.println();
                ((Printable)object4).print();
                System.out.println();

                Printable [] objects = {object2, object3, object4};
                for (Printable object : objects){
                    object.print();
                    System.out.println();
                }

            }
    }
