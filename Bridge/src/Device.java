public interface Device {
    public boolean isEnabled();
    public void enable();
    public void disable();
    public int getVolume();
    public void setVolume(int percente);
    public int getChannel();
    public void setChannel(int channel);
}
