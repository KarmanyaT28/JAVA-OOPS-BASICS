public class Hello {
    public static void main(String[] args) {
        Car car = new Car("closed","on","seated",10);

//        car.setDoors("closed");
//        car.setDriver("seated");
//        car.setEngine("on");
//        car.setSpeed(10);
        System.out.println(car.run());
    }
}
