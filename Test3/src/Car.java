public class Car {
    public static void build() {
        System.out.println("Bild new car");
    }

    public static void buy() {
        System.out.println("Buy this car");

    }
    public static void carSpeed() {
        int minSpeed = 0;
        int maxSpeed = 2;
        int midSpeed = 2;
        int overSpeed = midSpeed + maxSpeed;
        System.out.println("Speed" + " " +  overSpeed);
             if (overSpeed > 6) {
                 System.out.println("brakeLong = 10");
             } else if (overSpeed < 5) {

                 System.out.println("brakeLong = 5");

             }


    }

    }






