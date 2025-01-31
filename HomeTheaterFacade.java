class HomeTheaterFacade {
    private TV tv;
    private Speakers speakers;
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private Lights lights;

    public HomeTheaterFacade(TV tv, Speakers speakers, DVDPlayer dvdPlayer, Projector projector, Lights lights) {
        this.tv = tv;
        this.speakers = speakers;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie!");
        lights.dim(20);
        projector.on();
        projector.setResolution("1080p");
        tv.on();
        tv.setInputChannel("DVD");
        speakers.on();
        speakers.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater!");
        dvdPlayer.off();
        speakers.off();
        tv.off();
        projector.off();
        lights.on();
    }

    public void gamingMode() {
        System.out.println("Setting up gaming mode!");
        lights.dim(30);
        projector.on();
        projector.setResolution("4K");
        tv.on();
        tv.setInputChannel("HDMI");
        speakers.on();
        speakers.setVolume(8);
        System.out.println("Gaming mode is on.");
    }
}

