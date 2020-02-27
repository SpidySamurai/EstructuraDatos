package model;

import java.util.LinkedList;

public abstract class SelectionSort {

    public static void sortPrecio(LinkedList<Equipo> a) {

        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < a.size() - 1; i++) {
            // Find the minimum element in unsorted array 
            int min_idx = i;
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(j).getPrecioPropuesto() < a.get(min_idx).getPrecioPropuesto()) {
                    min_idx = j;
                }
            }
            // Swap the found minimum element with the first 
            // element 
            Equipo temp = a.get(min_idx);
            a.remove(min_idx);
            a.add(min_idx, a.get(i));
//            a.get(min_idx) = a.get(i);
            a.remove(i);
            a.add(i, temp);
//            a.get(i) = temp;
         
        }
    }

    public static void sortTiempo(LinkedList<Equipo> a) {

        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < a.size() - 1; i++) {
            // Find the minimum element in unsorted array 
            int min_idx = i;
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(j).getTiempoRespuesta() < a.get(min_idx).getTiempoRespuesta()) {
                    min_idx = j;
                }
            }
            // Swap the found minimum element with the first 
            // element 
            Equipo temp = a.get(min_idx);
            a.remove(min_idx);
            a.add(min_idx, a.get(i));
//            a.get(min_idx) = a.get(i);
            a.remove(i);
            a.add(i, temp);
//            a.get(i) = temp;
       
        }
    }

    public static void sortNombre(LinkedList<Equipo> a) {

        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < a.size() - 1; i++) {
            // Find the minimum element in unsorted array 
            int min_idx = i;
            for (int j = i + 1; j < a.size(); j++) {
                if (0 > a.get(j).getNombreEquipo().compareTo(a.get(min_idx).getNombreEquipo())) {
                    min_idx = j;
                }
            }
            // Swap the found minimum element with the first 
            // element 
            Equipo temp = a.get(min_idx);
            a.remove(min_idx);
            a.add(min_idx, a.get(i));
//            a.get(min_idx) = a.get(i);
            a.remove(i);
            a.add(i, temp);
//            a.get(i) = temp;
        
        }
    }

}
