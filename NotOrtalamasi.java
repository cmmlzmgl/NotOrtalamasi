import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int fizikNot, matNot, kimyaNot, turkceNot, tarihNot, muzikNot;

        Scanner readGrade = new Scanner(System.in);

        System.out.print("Lütfen Öğrencinin Matematik Notunu Giriniz: ");
        matNot = readGrade.nextInt();

        System.out.print("Lütfen Öğrencinin Fizik Notunu Giriniz: ");
        fizikNot = readGrade.nextInt();

        System.out.print("Lütfen Öğrencinin Kimya Notunu Giriniz: ");
        kimyaNot = readGrade.nextInt();

        System.out.print("Lütfen Öğrencinin Türkçe Notunu Giriniz: ");
        turkceNot = readGrade.nextInt();

        System.out.print("Lütfen Öğrencinin Tarih Notunu Giriniz: ");
        tarihNot = readGrade.nextInt();

        System.out.print("Lütfen Öğrencinin Müzik Notunu Giriniz: ");
        muzikNot = readGrade.nextInt();

        int ort = (matNot + fizikNot + turkceNot + tarihNot + muzikNot + kimyaNot) / 6;
        System.out.print("Öğrencinin Not Ortalaması: " + ort);



    }
}
