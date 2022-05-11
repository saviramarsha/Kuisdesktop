/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktop.db;

import desktop.model.VGACard;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DBHandler {
    public final Connection conn;

    public DBHandler(String driver) {
        this.conn = desktop.db.DBHelper.getConnection(driver);
    
}
    
    public void addVGACard (VGACard vga) {
        String insertvga = "INSERT INTO `tabel_vgacard`(`id`, `merek`, `jenis`, `harga`, `jumlah_fan`, `tgl_beli`)"
                + "VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement stmtInsert = conn.prepareStatement(insertvga);
            stmtInsert.setString(1, vga.getMerek());
            stmtInsert.setString(2, vga.getJenis());
            stmtInsert.setInt(3, vga.getHarga());
            stmtInsert.setInt(4, vga.getJumlahfan());
            stmtInsert.setString(5, vga.getTanggal());
            stmtInsert.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
}
