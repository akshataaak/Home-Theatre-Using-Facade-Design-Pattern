public class TV implements HomeTheaterComponent {
    public void on() {
        System.out.println("TV is on.");
    }

    public void off() {
        System.out.println("TV is off.");
    }

    public void setInputChannel(String input) {
        System.out.println("TV channel set to " + input + " input.");
    }
}