package com.cisco.ledlights;

import java.util.Scanner;

public class LightsApplication {
    public static void main(String[] args) {

        boolean switchBoolean = false;
        Lights lt = new Lights();
        int counter = 1;

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter one the following [1,2, 00 to exit] value");
            String str = sc.nextLine().replaceAll(" ","");
            String strCheck = "1 2 00";
            int input = -1;
            if (strCheck.contains(str)) input = Integer.parseInt(str);
            else {
                System.out.println("No match found, try again..");
            }
            if (input == 00) break;
            //1st button: one click

            if (input == 1 && counter == 1) {
                counter++;
                lt.setLedSwitchVal(true);
                Colors.setLedRedVal(true);
                System.out.println(lt.toString());
            }
            //1st button: two click
            else if (input == 1 && counter == 2) {
                counter++;
                Flashes.setLedFlashVal(true);
                System.out.println(lt.toString());

            }
            //1st button: Three click
            else if (input == 1 && counter == 3) {
                counter++;
                lt.ledOff();
                System.out.println("    lED On/Off= " + lt.isLedSwitchVal());
                counter = 1;

            }
            //2nd button: toggle
            else if (input == 2) {
                if (lt.isLedSwitchVal()) {
                    switchBoolean = Colors.ledRedVal;
                    switchBoolean = !switchBoolean;
                    Colors.setLedRedVal(switchBoolean);
                    System.out.println(lt.toString());
                }
            } else {
                System.out.println(
                        "\nTo emulate Led button clicks{" +
                                "Press 1 for button 1 click,  " +
                                "Press 2 for button 2 Toggle"
                );
            }
        }
    }
}
