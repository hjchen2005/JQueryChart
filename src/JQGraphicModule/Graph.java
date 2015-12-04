import javax.swing.JFrame;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;

public class Graph extend JFrame{
  public Graph{
    super ("JQuery Graph");
    JDBCCategoryDataset dataSet = new JDBCCategoryDataset();
    dataSet.setValue("A", new Integer(75));
    dataSet.setValue("B", new Integer(10));
    dataSet.setValue("C",new Integer(10));
    
    JFreeChart chart = ChartFactory.createBarChart(
      "Graph","","",dataSet,PlotOrientation.VERTICAL,true,true,false);
    )
    this.pack();
  }
}
