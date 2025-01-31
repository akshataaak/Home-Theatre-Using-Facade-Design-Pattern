public class Projector implements HomeTheaterComponent {
    public void on() {
        System.out.println("Projector is on.");
    }

    public void off() {
        System.out.println("Projector is off.");
    }

    public void setResolution(String resolution) {
        System.out.println("Projector resolution set to " + resolution);
    }
}