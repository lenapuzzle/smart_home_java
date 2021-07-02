package SmartHome;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SmartHome {
  public static final String ADD_A_DEVICE = "Add a device";
  public static final String MANAGE_DEVICES = "Manage Devices";
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Device> devices = new ArrayList<Device>();
    Device testDevice = new SwitchableLight("test Name");
    devices.add(testDevice);
    List<String> options = new ArrayList<String>();
    options.add(ADD_A_DEVICE);
    options.add(MANAGE_DEVICES);
    System.out.println("Please select from the following options");
    int menuIndex = 1;
    for(String option: options){
      System.out.println(menuIndex+ ". " +option);
      menuIndex++;
    }
    String userInput = scanner.nextLine();
    int selectedOption = Integer.parseInt(userInput);
    String optionChoice = options.get(selectedOption -1);
    if (optionChoice.equals(ADD_A_DEVICE)){
      System.out.println("What is the name of your device?");
      String deviceName = scanner.nextLine();
      //create device using a class
      SwitchableLight light = new SwitchableLight(deviceName);
      //add to arraylist after created
      devices.add(light);
    }else if(optionChoice.equals(MANAGE_DEVICES)){
      int deviceMenuIndex = 1;
      for (Device device: devices){
        System.out.println(deviceMenuIndex+ ". " + device.name);
        deviceMenuIndex++;
      }
      String userChoice = scanner.nextLine();
      int deviceIndex = Integer.parseInt(userChoice);
    }
    System.out.println(devices);
    // end of main method
  }
}
