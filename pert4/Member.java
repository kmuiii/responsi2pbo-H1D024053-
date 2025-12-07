class Member extends Customer {
    // TODO: Tambahkan atribut tambahan
    int point;
    String level;

    // TODO: Buat constructor dengan super
    public Member(String nama, String id, int totalBelanja, int point, String level){
        super(nama, id, totalBelanja);
        this.point = point;
        this.level = level;
    }

    @Override
    void tampilkanInfo() {
        // TODO: panggil super, lalu tampilkan data tambahan
        super.tampilkanInfo();
        System.out.println("Point Reward: " + point + " | Level: " + level);
    }
}
