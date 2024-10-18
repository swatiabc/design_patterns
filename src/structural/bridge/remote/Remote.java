package structural.bridge.remote;

public interface Remote {
    public boolean isEnabled();
    public void enable();
    public void disable();
    public int getVolume();
    public void setVolume(int volume);
}
