public class Remote {
    protected Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower(){
        if (device.isEnabled()){
            device.disable();
            System.out.println("Устройство выключено");
        }else{
            device.enable();
            System.out.println("Устройство включено");
        }
    }

    public void volumeDown(){
        device.setVolume(device.getVolume() - 10);
    }

    public void volumeUp(){
        device.setVolume(device.getVolume() + 10);
    }

    public void channelDown(){
        device.setChannel(device.getChannel() - 1);
    }

    public void channelUp(){
        device.setChannel(device.getChannel() + 1);
    }
}
