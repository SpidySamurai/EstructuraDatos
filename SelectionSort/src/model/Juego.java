package model;

import java.util.LinkedList;

public abstract class Juego {

    public static void generarJuego(LinkedList<Equipo> a, LinkedList<Premio> b) {
        LinkedList<Equipo> c = new LinkedList<>();
        int dif;
        int i;
        int j;
        int z = 0;
//        while (true) {
//            i = 0;
            for (i = 0; i < b.size(); i++) {
                dif = 999;

                System.out.println("Ronda " + (i + 1));
                Randomizer.generarPrecio(a);
                Randomizer.generarTiempo(a);
                Randomizer.generarDif(a, b.get(i).getPrecioPremio());

                SelectionSort.sortPrecio(a);

                for (j = 0; j < a.size(); j++) {
                    if (dif >= a.get(j).getDifPrecio()) {
                        dif = a.get(j).getDifPrecio();
                    }

                }

                for (j = 0; j < a.size(); j++) {
                    if (dif == a.get(j).getDifPrecio()) {
                        c.add(a.get(j));
                    }
                }

                SelectionSort.sortTiempo(c);
                if (c.size() > 1) {
                    for (j = 0; j < c.size() - 1; j++) {
                        if (c.get(0).getTiempoRespuesta() != c.get(j+1).getTiempoRespuesta()) {
                            c.remove(c.get(j + 1));
                        }
                    }
                }

                SelectionSort.sortNombre(c);

//                Equipo.printEquipos(a);
                System.out.println("Equipo ganador: " + c.get(0).getNombreEquipo() + " con precio propuesto: " + c.get(0).getPrecioPropuesto() + " de " + b.get(i).getNombrePremio() + " $" + b.get(i).getPrecioPremio());
                c.remove();

            }
//            System.out.println("counter: " + z++);
//        }
    }

}
