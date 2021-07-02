package SmartHome;

class SwitchableLight extends Device {
  protected String name;
  protected boolean isPoweredOff = true;
  protected boolean isSwitchedOff = true;

  public SwitchableLight(String name) {
    super(name);
  }
  public String getName() {
    return name;
  }
}
