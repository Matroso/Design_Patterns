public class Radio implements Device {
    private boolean enbl;
    private int chnnl;
    private int vlm;

    public Radio() {
        enbl = false;
        chnnl = 1;
        vlm = 20;
    }

    @Override
    public boolean isEnabled() {
        return enbl;
    }

    @Override
    public void enable() {
        enbl = true;
    }

    @Override
    public void disable() {
        enbl = true;
    }

    @Override
    public int getVolume() {
        return vlm;
    }

    @Override
    public void setVolume(int percente) {
        vlm = percente;
    }

    @Override
    public int getChannel() {
        return chnnl;
    }

    @Override
    public void setChannel(int channel) {
        chnnl = channel;
    }
}
