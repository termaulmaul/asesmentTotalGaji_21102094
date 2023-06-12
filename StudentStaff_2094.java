package com.maulana_rafi.pbo.asesmentTotalGaji;

class StudentStaff_2094 {
    protected String nama_2094;
    protected String nim_2094;
    protected double gajiPokok_2094;

    public StudentStaff_2094(String nama_2094, String nim_2094, double gajiPokok_2094) {
        this.nim_2094 = nim_2094;
        this.nama_2094 = nama_2094;
        this.gajiPokok_2094 = gajiPokok_2094;
    }

    public double hitungTotalGaji_2094() {
        return this.gajiPokok_2094;
    }
}
