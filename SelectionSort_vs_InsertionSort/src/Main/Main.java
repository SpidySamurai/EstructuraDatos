/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Model.DeletingDuplicates;
import Model.Graficador;
import Model.SelectionSort;
import Model.InsertionSort;

import Model.UniquenessTesting;

import java.io.File;

import java.util.Random;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Juan D.M
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static final int ANCHO_GRAFICA = 400;

    public static final int ALTO_GRAFICA = 300;

    public static void main(String[] args) {
        Random objGenerator = new Random();

        SelectionSort listasordenSelect[] = new SelectionSort[10];
        InsertionSort listasinsertSelect[] = new InsertionSort[10];

        SelectionSort ordenSeleccion = new SelectionSort(10000);
        InsertionSort ordenInserccion = new InsertionSort(10000);

        System.out.print("CASO\t");
        System.out.print("SelectionSort\t");
        System.out.print("InsertionSort\t");

        for (int i = 0; i < listasordenSelect.length - 2; i++) {

            listasordenSelect[i] = new SelectionSort(10000);
            listasinsertSelect[i] = new InsertionSort(10000);

            for (int j = 0; j < 10000; j++) {
                int randomNumber = objGenerator.nextInt(10000);
                listasordenSelect[i].insert(randomNumber);
                listasinsertSelect[i].insert(randomNumber);
            }

            System.out.print("\n");

            System.out.print("CASO " + (i + 1) + "\t");

            //Realiza orden por seleccion
            listasordenSelect[i].selectionSort();
            System.out.print("\t");

            //Realiza orden por inserccion
            listasinsertSelect[i].insertionSort();
            System.out.println("\t");

            UniquenessTesting test = new UniquenessTesting();
            test.testUniqueness(listasordenSelect[i].getA());
            DeletingDuplicates test1 = new DeletingDuplicates();
            test1.testDeletingDuplicates(listasordenSelect[i].getA());

        }

        for (int i = 8; i < listasordenSelect.length; i++) {
            listasordenSelect[i] = new SelectionSort(10000);
            listasinsertSelect[i] = new InsertionSort(10000);

            for (int j = 0; j < 10000; j++) {
                int randomNumber = objGenerator.nextInt(10000);
                listasordenSelect[i].insert(j);
                listasinsertSelect[i].insert((10000 - j));
            }
            System.out.print("\n");
            System.out.print("CASO " + (i + 1) + "\t");

            //Realiza orden por seleccion
            listasordenSelect[i].selectionSort();
            System.out.print("\t");

            //Realiza orden por inserccion
            listasinsertSelect[i].insertionSort();
            System.out.println("\t");

            UniquenessTesting test = new UniquenessTesting();
            test.testUniqueness(listasordenSelect[i].getA());
            DeletingDuplicates test1 = new DeletingDuplicates();
            test1.testDeletingDuplicates(listasordenSelect[i].getA());

        }

        try {
            final Graficador prueba = new Graficador();
            XYSeriesCollection dataset = null;
            final JFreeChart grafica = prueba.crearGrafica(dataset);
            ChartUtilities.saveChartAsPNG(new File("tiempos-ordenamiento.png"), grafica, ANCHO_GRAFICA, ALTO_GRAFICA);
        } catch (Exception e) {
            e.printStackTrace();

        }

    }

}
