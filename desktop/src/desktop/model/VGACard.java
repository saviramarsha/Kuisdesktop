/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktop.model;

/**
 *
 * @author ASUS
 */
public class VGACard {
    
    private int harga,jumlahfan;
    private String merek,jenis,tanggal;
    
    public VGACard(int id, int harga, int jumlahfan, String merek, String jenis, String tanggal) {
        
        this.harga = harga;
        this.jenis = jenis;
        this.jumlahfan = jumlahfan;
        this.merek = merek;
        this.tanggal = tanggal;
    }
    
    public VGACard() {
        
    }

    public VGACard(String text, String jenis, String text0, String text1, String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJumlahfan() {
        return jumlahfan;
    }

    public void setJumlahfan(int jumlahfan) {
        this.jumlahfan = jumlahfan;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    
    
}

