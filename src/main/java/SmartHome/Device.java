package SmartHome;

public abstract class Device {
  protected String name;
  protected boolean isPoweredOff = true;

  public Device(String name){
    this.name = name;
  }
}
