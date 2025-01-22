package Factory;

import Factory.components.Button;

import java.util.Scanner;

public class client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the platform");
        String platform = scanner.nextLine();

//        Platform platformInstance = null;
//        if(platform.equals("Android")){
//            platformInstance = new Android();
//        } else if(platform.equals("IOS")){
//            platformInstance = new IOS();
//        }
        Platform platformInstance = PlatformFactory.getPlatformByName(platform);

//        on the basis of platform, we need to create the button
        UIComponentFactory uiComponentFactory = platformInstance.createUIComponentFactory();
        Button button= uiComponentFactory.createButton();
        button.click();
    }
}
