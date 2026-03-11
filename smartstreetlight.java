Import java.util.Scanner;
Class SmartStreetLight {
 Boolean isNight;
 Boolean motionDetected;
 // Method to check light condition
 Void checkLightCondition() {
 If (!isNight) {
 System.out.println(“Day time detected ”);
 System.out.println(“Street Lights are OFF”);
 } else {
 System.out.println(“Night time detected ”);
 controlLight();
 }
 }
 // Method to control street light based on motion
 Void controlLight() {
 If (motionDetected) {
 System.out.println(“Motion detected ”);
 System.out.println(“Street Light is ON (Full Brightness)”);
 } else {
 System.out.println(“No motion detected”);
 System.out.println(“Street Light is in DIM mode (Energy Saving)”);
 }
 }
}
Public class Main {
 Public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 SmartStreetLight light = new SmartStreetLight();
 System.out.println(“Enter time (day/night): “);
 String time = sc.next();
 System.out.println(“Is motion detected? (yes/no): “);
 String motion = sc.next();
 // Setting values
 Light.isNight = time.equalsIgnoreCase(“night”);
 Light.motionDetected = motion.equalsIgnoreCase(“yes”);
 // Check system
 Light.checkLightCondition();
 Sc.close();
 }
}