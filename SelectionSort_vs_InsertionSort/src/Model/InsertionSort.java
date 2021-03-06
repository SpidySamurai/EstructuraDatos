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
public class InsertionSort {

    public long[] getA() {
        return a;
    }
    private long[] a;
    private int nElems;

    public InsertionSort(int max) {
        a = new long[max];
        nElems = 0;
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

    public void insertionSort() {
        long startTime = System.nanoTime();

        int in, out;
        for (out = 1; out < nElems; out++) {
            long temp = a[out];
            in = out;
            while (in > 0 && a[in - 1] >= temp) {
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;
        }

        long endTime = System.nanoTime();
        long TiempoEje = endTime - startTime;

        final XYSeries Time2 = new XYSeries("Insertion Sort");
        Time2.add(TiempoEje, nElems);
        System.out.print(TiempoEje + "ns ");
        final XYSeriesCollection collection = new XYSeriesCollection();
        collection.addSeries(Time2);

    }

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
