public class Exercise4_6_Multadd {

    /**
     * Verilen a, b ve c değerleri için a*b + c işlemini hesaplar.
     * Bu işlem, bir çarpma ve bir toplama işlemini birleştirir (Multadd).
     * @param a Çarpmanın ilk çarpanı.
     * @param b Çarpmanın ikinci çarpanı.
     * @param c Toplanacak değer.
     * @return a * b + c işleminin sonucu.
     */
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    /**
     * Verilen x değeri için x * e^(-x) + kök(1 - e^(-x)) ifadesini hesaplar.
     * Burada e, doğal logaritmanın tabanıdır.
     * @param x Hesaplamada kullanılacak değer.
     * @return x * Math.exp(-x) + Math.sqrt(1 - Math.exp(-x)) işleminin sonucu.
     */
    public static double expSum(double x) {
        // İfade: x * e^(-x) + kök(1 - e^(-x))
        double term1 = multadd(x, Math.exp(-x), 0.0); // Aslında direkt x * Math.exp(-x)
        double term2 = Math.sqrt(1 - Math.exp(-x));
        
        // Formül: term1 + term2
        return multadd(1.0, term1, term2); // Aslında direkt term1 + term2
        
        // Not: multadd metodu kullanmak zorunlu olmasa da 
        // görev tanımına (birleştirilmiş çarpma ve toplama) uymak için kullanılmıştır.
        // Daha sade hali: return x * Math.exp(-x) + Math.sqrt(1 - Math.exp(-x));
    }

    public static void main(String[] args) {
        // Basit multadd testi
        System.out.println("--- multadd Basit Test ---");
        double testResult = multadd(2.0, 3.0, 4.0); // Beklenen: 2*3 + 4 = 10.0
        System.out.println("2 * 3 + 4 = " + testResult);
        System.out.println();

        // 1. Matematiksel İfade: sin(π/4) + cos(π/4)/2
        // İfadeyi multadd(a, b, c) formatında yazmak için: a*b + c
        // İfade: sin(π/4) + (1/2) * cos(π/4)
        // İfade: a = 1.0, b = sin(π/4), c = (1/2) * cos(π/4) olarak multadd kullanılamaz.
        // Ancak: sin(π/4) + (1/2) * cos(π/4) ifadesini iki parçaya ayırıp 
        // multadd'ı a*b+c şeklinde kullanabiliriz.
        
        double pi_over_4 = Math.PI / 4.0;
        
        // Parça 1: cos(π/4) / 2 = 0.5 * cos(π/4)
        double term_cos = multadd(0.5, Math.cos(pi_over_4), 0.0); 
        
        // Nihai ifade: sin(π/4) + term_cos
        // multadd'ı toplama için kullanıyoruz: a=1.0, b=sin(π/4), c=term_cos
        double result1 = multadd(1.0, Math.sin(pi_over_4), term_cos);

        System.out.println("--- İfade 1: sin(π/4) + cos(π/4)/2 ---");
        System.out.println("Hesaplanan Değer: " + result1);
        System.out.println();
        
        // 2. Matematiksel İfade: log(10) + log(20)
        // Java'da Math.log() doğal logaritmayı (ln) hesaplar. 
        // Soruda log10 + log20 (bunun doğal logaritma olduğu varsayılmıştır, 
        // aksi belirtilmediği sürece Math.log() kullanılır).
        
        // multadd'ı toplama için kullanıyoruz: a=1.0, b=log(10), c=log(20)
        double result2 = multadd(1.0, Math.log(10.0), Math.log(20.0));

        System.out.println("--- İfade 2: log(10) + log(20) ---");
        System.out.println("Hesaplanan Değer: " + result2);
        System.out.println();
        
        // expSum Testi
        System.out.println("--- expSum Test (x=1.0) ---");
        double x_val = 1.0;
        double expSumResult = expSum(x_val);
        System.out.println("x = " + x_val + " için expSum: " + expSumResult);
        
        // expSum Testi
        System.out.println("\n--- expSum Test (x=2.5) ---");
        double x_val_2 = 2.5;
        double expSumResult_2 = expSum(x_val_2);
        System.out.println("x = " + x_val_2 + " için expSum: " + expSumResult_2);
    }
}
