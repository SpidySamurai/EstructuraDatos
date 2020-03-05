/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Color;
import java.io.File;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author LEFT4
 */
public class Graficador {

    private static Color COLOR1 = new Color(255, 128, 64);
    private static Color COLOR2 = new Color(28, 84, 140);
    private static Color Recuadros = new Color(31, 87, 4);
    private static Color FondoGrafica = Color.white;

    public JFreeChart crearGrafica(XYSeriesCollection dataset) {
        final JFreeChart chart = ChartFactory.createXYLineChart("Tiempos ordenamiento", "No. Elementosbf", "Tiempo (ns)",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                false,
                false
        );

        chart.setBackgroundPaint(FondoGrafica);

        final XYPlot plot = (XYPlot) chart.getPlot();
        configurarPlot(plot);

        final NumberAxis domainAxis = (NumberAxis) plot.getDomainAxis();
        configurarEjeX(domainAxis);

        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        configurarEjeY(rangeAxis);

        final XYLineAndShapeRenderer renderer = (XYLineAndShapeRenderer) plot.getRenderer();
        configurarRendered(renderer);

        return chart;
    }

    private void configurarPlot(XYPlot plot) {
        plot.setDomainGridlinePaint(Recuadros);
        plot.setRangeGridlinePaint(Recuadros);
    }

    private void configurarEjeX(NumberAxis domainAxis) {
        domainAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        domainAxis.setTickUnit(new NumberTickUnit(100));
    }

    private void configurarEjeY(NumberAxis rangeAxis) {
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        rangeAxis.setTickUnit(new NumberTickUnit(50));
        rangeAxis.setRange(0, 999);
    }

    private void configurarRendered(XYLineAndShapeRenderer renderer) {
        renderer.setSeriesShapesVisible(0, true);
        renderer.setSeriesShapesVisible(1, true);
        renderer.setSeriesPaint(0, COLOR1);
        renderer.setSeriesPaint(1, COLOR2);
    }
}
