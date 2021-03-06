/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author A13003988
 */
public class SelectionSort {

    private long[] a;
    private int nElems;

    public SelectionSort(int max) {
        a = new long[max];
        nElems = 0;
    }

    public long[] getA() {
        return a;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.print(a[j] + "\n");
        }
        System.out.println(" ");
    }

    public void selectionSort() {
        long startTime = System.nanoTime();

        int out, in, min;
        for (out = 0; out < nElems - 1; out++) {
            min = out;
            for (in = out + 1; in < nElems; in++) {
                if (a[in] < a[min]) {
                    min = in;
                }
            }
            swap(out, min);
        }

        long endTime = System.nanoTime();
        long TiempoEje = endTime - startTime;

        final XYSeries Time1 = new XYSeries("Selection Sort");
        Time1.add(TiempoEje, nElems);
        System.out.print(TiempoEje + "ns ");
        final XYSeriesCollection collection = new XYSeriesCollection();

        collection.addSeries(Time1);
    }

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public void setA(int j,int parametro) {
        this.a[j] = parametro;
    }

}
