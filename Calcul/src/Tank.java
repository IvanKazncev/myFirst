public class Tank {

    int position;
    void goForward(int goForward) {
       position = position + goForward;


    }
    public void printPosition() {
        System.out.println("The Tank in at " + position + " now");

    }

    public void goBackward(int Backward) {
        position = position - Backward;
    }
}





