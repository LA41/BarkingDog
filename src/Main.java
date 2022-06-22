public class Main {
    public static void main(String[] args) {
        //check if need to wake up when dog doesn't bark
        boolean i = BarkingDog.shouldWakeUp(false, 6);
        System.out.println(i);
        //check if need to wake up when dog barks between 10 pm - 8 am
        i = BarkingDog.shouldWakeUp(true, 2);
        System.out.println(i);
        //check if need to wake up when dog barks between 8 am - 10 pm (inclusively)
        i = BarkingDog.shouldWakeUp(true, 15);
        System.out.println(i);
        //check if need to wake up when hour is a negative
        i = BarkingDog.shouldWakeUp(true, -1);
        System.out.println(i);
    }
}
