public class Speakers implements HomeTheaterComponent {
    public void on() {
        System.out.println("Speakers are on.");
    }

    public void off() {
        System.out.println("Speakers are off.");
    }

    public void setVolume(int level) {
        System.out.println("Speaker volume set to " + level);
    }
}
