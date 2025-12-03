public class Exercise4_2 {

    public static void main(String[] args) {              // 1
        zippo("rattle", 13);                              // 2
    }

    public static void baffle(String blimp) {              // 5
        System.out.println(blimp);                        // 6
        zippo("ping", -5);                                // 7
    }

    public static void zippo(String quince, int flag) {   // 3 (ilk çağrıda)
        if (flag < 0) {                                   // 8 (ikinci çağrıda kontrol)
            System.out.println(quince + " zoop");         // 9
        } else {
            System.out.println("ik");                     // 4
            baffle(quince);                               // 5 (çağrı)
            System.out.println("boo-wa-ha-ha");           // 10
        }
    }
}
