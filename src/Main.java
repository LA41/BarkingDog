public class Main {
    public static void main(String[] args) {
        //check if need to wake up when dog doesn't bark
        boolean noBarkingResult = BarkingDog.shouldWakeUp(false, 6);
        System.out.println(noBarkingResult);
        //check if need to wake up when dog barks between 10 pm - 8 am
        boolean nightBarkingResult = BarkingDog.shouldWakeUp(true, 2);
        System.out.println(nightBarkingResult);
        //check if need to wake up when dog barks between 8 am - 10 pm (inclusively)
        boolean daytimeBarkingResult = BarkingDog.shouldWakeUp(true, 15);
        System.out.println(daytimeBarkingResult);
        //check if need to wake up when hour is a negative
        boolean negativeTimeBarking = BarkingDog.shouldWakeUp(true, -1);
        System.out.println(negativeTimeBarking);
    }
}
