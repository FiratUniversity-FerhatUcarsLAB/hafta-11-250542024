public class Exercise4_1 {

    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println("American format: " + day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println("European format: " + day + " " + date + " " + month + " " + year);
    }

    public static void main(String[] args) {

        // Örnek tarih bilgileri
        String day = "Monday";
        int date = 18;
        String month = "November";
        int year = 2025;

        // Metotları test et
        printAmerican(day, date, month, year);
        printEuropean(day, date, month, year);
    }
}
