package id.ac.unand.fti.si.pbo;

public class App {
    public static void main(String[] args) {

        // Membuat objek
        Member member1 = new MemberReguler();
        Member member2 = new MemberSilver();
        Member member3 = new MemberGold();
        Member member4 = new MemberPlatinum();

        //menghitung total bayar member
        int totalBayarReguler = member1.hitungTotalBayar(1000000);
        int totalBayarSilver = member2.hitungTotalBayar(3500000);
        int totalBayarGold = member3.hitungTotalBayar(7000000);
        int totalBayarPlatinum = member4.hitungTotalBayar(1500000);

        //menampilkan data struk member
        System.out.println("________________________________________");
        System.out.println("Total bayar member reguler: " + totalBayarReguler);
        System.out.println("________________________________________");
        System.out.println("Total bayar member silver: " + totalBayarSilver);
        System.out.println("________________________________________");
        System.out.println("Total bayar member reguler: " + totalBayarGold);
        System.out.println("________________________________________");
        System.out.println("Total bayar member silver: " + totalBayarPlatinum);
        
    }
}
