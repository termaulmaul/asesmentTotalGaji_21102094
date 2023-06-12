package com.maulana_rafi.pbo.asesmentTotalGaji;

class AssistenPraktikum_2094 extends StudentStaff_2094 {
    private String mataKuliah_2094;
    private int jmlPertemuan_2094;

    public AssistenPraktikum_2094(String nim_2094, String nama_2094, double gajiPokok_2094, String mataKuliah_2094, int jmlPertemuan_2094) {
        super(nim_2094, nama_2094, gajiPokok_2094);
        this.mataKuliah_2094 = mataKuliah_2094;
        this.jmlPertemuan_2094 = jmlPertemuan_2094;
        System.out.println("****Data Mahasiswa Bekerja****");
        System.out.println("[Assisten Praktikum]");
        System.out.println("NIM : " + nim_2094);
        System.out.println("Nama : " + nama_2094);
        System.out.println("Gaji Pokok: " + gajiPokok_2094);
        System.out.println("Mata Kuliah : " + mataKuliah_2094);
        System.out.println("----------------------------");
        System.out.println("Total Gaji: " + this.hitungTotalGaji_2094());
    }

    public double hitungTotalGaji_2094() {
        return super.hitungTotalGaji_2094() + (double)(this.jmlPertemuan_2094 * 20000);
    }
}

