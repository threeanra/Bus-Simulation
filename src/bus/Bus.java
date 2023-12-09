package bus;

public class Bus {
    private String id;
    private int penumpang;
    private int kapasitas;
    private String namaBus;
    private int sisaTempatDuduk;

    public Bus(String id, int kapasitas, String namaBus) {
        // 1, 30, "Damri", 30
        this.id = id;
        this.kapasitas = kapasitas;
        this.namaBus = namaBus;
        this.sisaTempatDuduk = kapasitas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamaBus() {
        return this.namaBus;
    }

    void setPenumpang(int penumpang) {
        this.penumpang = penumpang;
    }

    void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public int getPenumpang() {
        return this.penumpang;
    }

    public int getKapasitas() {
        return this.kapasitas;
    }

    public int getSisaTempatDuduk() {
        return sisaTempatDuduk;
    }

    public void setSisaTempatDuduk(int sisaTempatDuduk) {
        this.sisaTempatDuduk = sisaTempatDuduk;
    }

    void display() {
        System.out.println("\nNama Bus                          : " + this.namaBus);
        System.out.println("Kapasitas Bus                     : " + this.kapasitas);
        System.out.println("Jumlah Penumpang                  : " + this.penumpang);
        System.out.println("Sisa tempat duduk                 : " + this.sisaTempatDuduk);
    }
}