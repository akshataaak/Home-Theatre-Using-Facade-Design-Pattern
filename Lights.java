public class Lights implements HomeTheaterComponent {
    public void on() {
        System.out.println("Lights are on.");
    }

    public void off() {
        System.out.println("Lights are off.");
    }

    public void dim(int level) {
        System.out.println("Lights dimmed to " + level + "%.");
    }
}