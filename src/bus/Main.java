package bus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean masih = true;

        System.out.println("Selamat Datang di Terminal Singgala");
        System.out.println("====================================\n");

        while (masih) {
            Scanner input = new Scanner(System.in);

            System.out.println("Bus yang tersedia");
            System.out.println("1. Damri");
            System.out.println("2. Karina");
            System.out.println("3. Primajasa\n");

            System.out.print("Pilih Bus                         : ");
            String b = input.next();
            Bus bus = Constant.LIST_BUS.stream()
                    .filter(f -> f.getId().equals(b))
                    .findFirst()
                    .orElse(null);

            if (bus != null) {
                if (bus.getSisaTempatDuduk() <= 0) {
                    System.out.println("tempat duduk penuh");
                    continue;
                }

                // Set Penumpang (dengan metode setter enkapsulasi
                System.out.print("Berapa Tiket yang ingin dibeli    : ");
                int pnp = input.nextInt();
                bus.setPenumpang(pnp);
                bus.setSisaTempatDuduk(bus.getSisaTempatDuduk() - pnp);

                // Menampilkan data bus
                bus.display();

                System.out.print("Ingin memesan tiket lagi? (y)/n   : ");
                String tambahkan = input.next();
                masih = tambahkan.equalsIgnoreCase("y");
            } else {
                System.out.println("Bus tidak ada");
                break;
            }
            System.out.println("\nTerima kasih sudah memesan tiket, semoga selamat sampai tujuan !");
        }
    }
}