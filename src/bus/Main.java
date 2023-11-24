package bus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean masih = true;
        while (masih) {
            Scanner input = new Scanner(System.in);
            System.out.print("Pilih Bus : ");
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

                // Set Penumpang
                System.out.print("Masukkan penumpang : ");
                int pnp = input.nextInt();
                bus.setPenumpang(pnp);
                bus.setSisaTempatDuduk(bus.getSisaTempatDuduk() - pnp);

                // Menampilkan data bus
                bus.display();

                System.out.print("Tambahkan penumpang? y/n : ");
                String tambahkan = input.next();
                masih = tambahkan.equalsIgnoreCase("y");

            } else {
                System.out.println("Bus tidak ada");
            }

        }
    }
}