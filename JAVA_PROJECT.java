import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataVisualization extends JFrame {
    private DefaultCategoryDataset dataset;
    private JTextField categoryField;
    private JTextField valueField;

    public DataVisualization() {
        setTitle("Data Visualization Tool");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        dataset = new DefaultCategoryDataset();
        JFreeChart chart = createChart();
        ChartPanel chartPanel = new ChartPanel(chart);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        categoryField = new JTextField(10);
        valueField = new JTextField(5);
        JButton addButton = new JButton("Add Data");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addData();
            }
        });

        inputPanel.add(new JLabel("Category:"));
        inputPanel.add(categoryField);
        inputPanel.add(new JLabel("Value:"));
        inputPanel.add(valueField);
        inputPanel.add(addButton);

        add(inputPanel, BorderLayout.NORTH);
        add(chartPanel, BorderLayout.CENTER);
    }

    private JFreeChart createChart() {
        return ChartFactory.createBarChart(
                "Sample Data Visualization", "Category", "Value", 
                dataset, PlotOrientation.VERTICAL, 
                true, true, false);
    }

    private void addData() {
        String category = categoryField.getText();
        String valueText = valueField.getText();
        try {
            double value = Double.parseDouble(valueText);
            dataset.addValue(value, "Series1", category);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for value.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DataVisualization app = new DataVisualization();
            app.setVisible(true);
        });
    }
}

