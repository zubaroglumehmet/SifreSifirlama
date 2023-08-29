import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, Password, YeniSifre, cevap;

        Scanner inp = new Scanner(System.in);
        System.out.println("Kullanici Adini Giriniz");
        userName = inp.nextLine();
        System.out.println("Sifreniz");
        Password = inp.nextLine();

        if (userName.equals("Mehmet") && Password.equals("Zubar1234"))
        {
            System.out.println("Giris Yaptiniz");
        } else {

            System.out.println("Bilgileriniz Hatali ");
            System.out.print("Sifrenizi Degistirmek Ister misiniz(E or H)");
            cevap = inp.nextLine();
        }
            if (cevap.equals("E"))
            {
                System.out.println("Yeni Sifrenizi Giriniz");
                YeniSifre = inp.nextLine();
            }


            if (!YeniSifre.equals(Password))
            {
                System.out.println("Yeni Sifre Basariyla Olusturuldu");
            }
            else {

                System.out.println("Yeni Sifre Eski Sifreyle Ayni Olamaz");
            }
        }
    }






