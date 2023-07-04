public class Hello {
    public static void main(String[] args) {
        Car car  = new Car();
//        car.speed =1;
//        System.out.println(car.speed);
        car.setSpeed(13);
        System.out.println(car.getSpeed());
    }
}
