public class HomeTheaterTest {
    public static void main(String[] args) {
        TV tv = new TV();
        Speakers speakers = new Speakers();
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        Lights lights = new Lights();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, speakers, dvdPlayer, projector, lights);

        homeTheater.watchMovie("Avengers: Endgame");
        System.out.println("----------------------------------------------------------");

        homeTheater.endMovie();
        System.out.println("----------------------------------------------------------");

        homeTheater.gamingMode();
    }
}
