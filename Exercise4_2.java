public class Exercise4_2 {

    public static void main(String[] args) {          // 1
        zippo("rattle", 13);                          // 2
    }

    public static void baffle(String blimp) {         // 5
        System.out.println(blimp);                    // 6
        zippo("ping", -5);                            // 7
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) {                               // 8
            System.out.println(quince + " zoop");     // 9
        } else {
            System.out.println("ik");                 // 3
            baffle(quince);                           // 4
            System.out.println("boo-wa-ha-ha");       // 10
        }
    }
}
