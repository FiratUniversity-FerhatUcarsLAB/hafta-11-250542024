public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();
        // Yorum: getNumber() 42 döndürür ama bunu kullanmazsak hiçbir çıktı oluşmaz.
        // Dönen değer boşa gider.

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);
        // Yorum: sayHello() void olduğu için toplama işlemine giremez.
        // Derleme hatası: "bad operand type void for + operator"
    }
}
