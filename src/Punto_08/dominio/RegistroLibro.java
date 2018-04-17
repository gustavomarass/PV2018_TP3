/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto_08.dominio;

import java.util.ArrayList;

/**
 *
 * @author gustavo
 */
public class RegistroLibro {

    ArrayList<Libro> listaLibro;

    public RegistroLibro() {
        listaLibro = new ArrayList<>();
    }

    public void guardarLibro(Libro nlibro) {
        boolean encontrado = false;
        if (listaLibro.isEmpty()) {
            listaLibro.add(nlibro);
            System.out.println("-->GUARDADO CON EXITO<---");

        } else {
            for (int i = 0; i < listaLibro.size(); i++) {
                if (nlibro.getIsbn() == listaLibro.get(i).getIsbn()) {
                    encontrado = true;
                }
            }

            if (encontrado == false) {
                listaLibro.add(nlibro);
                System.out.println("-->GUARDADO CON EXITO<---");
            } else {
                System.out.println("-->!!!ERROR isbn REPETIDO!!!");
            }

        }

    }

    public void mostrarLibros() {
        System.out.println("___________________________________________________________________");
        System.out.printf("%-15s%-15s%-15s%-15s\n", "ISBN", "TITULO", "AUTOR", "PRECIO");
        for (int i = 0; i < listaLibro.size(); i++) {
            System.out.printf("%-15s%-15s%-15s%-15s\n", listaLibro.get(i).getIsbn(),
                    listaLibro.get(i).getTitulo(), listaLibro.get(i).getAutor().getNombre()+","+
                    listaLibro.get(i).getAutor().getApellido(),listaLibro.get(i).getPrecio());
        }
        System.out.println("____________________________________________________________________");
    }

    public ArrayList<Libro> getListaLibro() {
        return listaLibro;
    }

    public void setListaLibro(ArrayList<Libro> listaLibro) {
        this.listaLibro = listaLibro;
    }

}
