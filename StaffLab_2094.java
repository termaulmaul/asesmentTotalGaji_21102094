package com.maulana_rafi.pbo.asesmentTotalGaji;

class StaffLab_2094 extends StudentStaff_2094 {
    private String namaLab_2094;
    private int jamKerja_2094;

    public StaffLab_2094(String nama_2094, String nim_2094, double gajiPokok_2094, String namaLab_2094, int jamKerja_2094) {
        super(nama_2094, nim_2094, gajiPokok_2094);
        this.namaLab_2094 = namaLab_2094;
        this.jamKerja_2094 = jamKerja_2094;
        System.out.println("");
        System.out.println("[Staff Lab]");
        System.out.println("NIM : " + nim_2094);
        System.out.println("Nama : " + nama_2094);
        System.out.println("Gaji Pokok: " + gajiPokok_2094);
        System.out.println("Jam Kerja : " + jamKerja_2094);
        System.out.println("----------------------------");
        System.out.println("Total Gaji: " + this.hitungTotalGaji_2094());
    }

    public double hitungTotalGaji_2094() {
        return super.hitungTotalGaji_2094() + (double)(this.jamKerja_2094 * 30000);
    }
}
