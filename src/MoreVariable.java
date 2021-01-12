public class MoreVariable {
    public static void main(String[] args) {
        String myName, myEye, myTeeth, myHair;
        int myAge, myHeight, myWeight;

        myName = " Mohamed G";
        myAge = 30;
        myHeight = 187;
        myWeight = 100;
        myEye = "brown";
        myTeeth = "white";
        myHair = " Black";

        System.out.println("let's talk about " + myName + ".");
        System.out.println("He's " + myHeight + "cm tall");
        System.out.println("He's " + myWeight + "kg heavy");
        System.out.println("Actually, that's not too heavy");
        System.out.println("He's got " + myEye + " eyes and " + myHair + "hair");
        System.out.println("His teeth  are usually " + myTeeth + "depending on the coffee. ");

        // This line is tricky; try to get it exactly right.
        System.out.println( "If I add " + myAge + ", " + myHeight + ", and " + myWeight
                + " I get " + (myAge + myHeight + myWeight) + "." );

    }
}
