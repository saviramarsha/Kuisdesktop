
package desktop;

import desktop.db.DBHandler;
import desktop.model.VGACard;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 *
 * @author ASUS
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Button button;

    @FXML
    private DatePicker dp_beli;

    @FXML
    private RadioButton rd_gaming;

    @FXML
    private RadioButton rd_normal;
    
     @FXML
    private TextField tf_jumlah;

    @FXML
    private TextField tf_fan;

    @FXML
    private TextField tf_merek;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
    //    label.setText("Hello"+tf_merek.getText());
    System.out.println(tf_merek.getText());
        String jenis=" ";
        if (rd_gaming.isSelected())
            jenis=rd_gaming.getText();
        if (rd_normal.isSelected())
            jenis=rd_normal.getText();
    
    System.out.println(jenis);
    System.out.println(tf_fan.getText());
    System.out.println(tf_jumlah.getText());
     System.out.println(dp_beli.getValue().toString());
    
     VGACard vga = new VGACard(tf_merek.getText(),jenis,tf_fan.getText(),tf_jumlah.getText(),dp_beli.getValue().toString());
     DBHandler dh = new DBHandler("MYSQL");
     dh.addVGACard(vga);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
