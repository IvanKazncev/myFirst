

public class main {
    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.goForward(-10);
        tank.printPosition();
        tank.goForward(70);
        tank.printPosition();
        tank.goBackward(100);
        tank.printPosition();


    }
}