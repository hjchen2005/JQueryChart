// Layouts of the query table
package JQGraphicModule;
import javax.swing.*;
import org.jfree.chart.*;
import org.jfree.data.*;
import java.awt.event.*;

public class Graph2 extends JFrame {
  public Graph2(){
    initComponents();
    this.setLocationRelativeTo(null);
    this.lineas.setVisible(false);
    this.pastel.setVisible(false);
    
    this.setVisible(true);
  }
  @SuppressWarnings("unchecked")
  // right click to the radio button Lineas -> event -> action -> action performed
  private void lActionPerformed(ActionEvent evt){
    lineas.setVisible(true);
    capas.setLayer(lineas,0,0);
    b.setSelected(false);
    p.setSelected(false);
  }
  
  private void bActionPerformed(ActionEvent evt){
    barras.setVisible(true);
    capas.setLayer(barras,0,0);
    b.setSelected(false);
    p.setSelected(false);
  }
  
  private void pActionPerformed(ActionEvent evt){
    pastel.setVisible(true);
    capas.setLayer(pastel,0,0);
    b.setSelected(false);
    p.setSelected(false);
  }
  
  // right click Graphicate JButton -> event-> action -> action performed
  private void jButton1ActionPerformed(ActionEvent evt){
    ChartPanel panel;
    JFreeChart chart = null;
    if (l.isSelected){
      // linear chart
    } else  {
        if (b.isSelected()){
          // bar chart
        } else {
          // pir chart
        }
    }
  }
  
  private JRadioButton b;
  private JPanel barras;
  private JLayeredPane capas;
  private JTable datos;
  private JButton jButton1;
  private JLabel jLable1;
  private JScrollPane jScrollPane;
  private JRadioButton l;
  private JPanel lineas;
  private JRadioButton p;
  private JPanel pastel;
}
