import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class SalesTax extends JFrame
{
   private JPanel panel;            // A panel to hold everything
   private JTextField totalSales;   // To get total sales
   private JButton calcButton;      // Calculates everything

   // Constants for tax rates

   
   // Constants for window size

   
   /**
      Constructor
   */

   public SalesTax()
   {
      // Set the title.
      setTitle("Monthly Sales Tax Reporter");

      // Specify what happens when the close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Build the panel that contains the other components.
      buildPanel();

      // Add the panel to the content pane.
      add(panel);

      // Size and display the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      setVisible(true);
   }

   /**
      The buildPanel method creates a panel containing
      other components.
   */

   private void buildPanel()
   {
 
   }

   /**
      CalcButtonListener is an action listener class for the
      calcbutton component.
   */

   private class CalcButtonListener implements ActionListener
   {
      /**
         actionPerformed method
         @param e An ActionEvent object.
      */

      public void actionPerformed(ActionEvent e)
      {
         double totalSalesAmount,
                countyTaxAmount,
                stateTaxAmount,
                totalTaxAmount;

         // Get the total sales.
         // Calculate
         // Display the results.
      }
   }
}
