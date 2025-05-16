public class LogicalOperatorOrExample {

    public static void main(String[] args) {

        boolean haveBike = true;
        boolean haveCar = true;

        //Both True
        if(haveBike || haveCar)
          System.out.println("You can Travel");
        else
            System.out.println("You cannot Travel");

        //One is False and other is True

        boolean teachingPassion = false;
        boolean videoMakingPassion = true;

    if(teachingPassion || videoMakingPassion)
        System.out.println("You can start earning");
    else
        System.out.println("You cannot start earning");

    }
}
