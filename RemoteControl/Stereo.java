public class Stereo {
    public void on() {
        System.out.println("Stereo is on");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

    public void setCd() {
        System.out.println("Stereo is set to CD");
    }

    public void setDvd() {
        System.out.println("Stereo is set to DVD");
    }

    public void setRadio() {
        System.out.println("Stereo is set to radio");
    }

    public void setVolume(Integer volume) {
        System.out.println("Stereo volume set to " + volume.toString());
    }
}
