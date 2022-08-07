package Mustafa_Murat_Coskun;

public class C01_String_Method {
    public static void main(String[] args) {
        String s1= "Mustafa";
        String s3= "Mustafa";
        String s2= new String("Mustafa");

        System.out.println(s2.length());

        System.out.println("0.Indeks: "+ s2.charAt(0));
        System.out.println("5. Indeks: "+ s2.charAt(5));
        System.out.println("5.Indeksİ: "+s2.charAt(s2.length()-1));

        System.out.println(s2.startsWith("Mus"));
        System.out.println(s2.endsWith("afa"));


        //s1 ve s3 aynı yeri gösteriyor mu diye soruyoruz. aynı yeri geösteriyor.s2 farklı bir yeri gösteriyor.
        if(s2==s3){

        }else System.out.println("s2 ve s3 ün bellekteki yeri farklı ");

        if(s2.equals(s3)){
            System.out.println("s2 ve s3 bellekteki yerleri farklı ama içerikleri aynı.");
        }
    }
}
