package de.qcademy.java.kurs;

import java.util.ArrayList;
import java.util.List;
    public class LocalList<A> {
        /**

         * Dieses Array soll verwendet werden, um Elemente der
         Liste zu speichern.
         */
        private final A[] speicher;
        private int size;
        /**
         * Durch diesen Konstruktor soll eine Leere(leerer
         Speicher) Liste erzeugt werden.
         */
        public LocalList() {
            speicher = (A[]) new Object[10];
            size = 0;
        }
        /**
         * Diese Methode soll die Länge der Liste zurückgeben.
         */
        public int size(){
            return size;
        }

        /**
         * Diese Methode soll true zurückgeben when die Liste leer
         ist, ansonsten false.
         */
        public boolean isEmpty() {
           return size == 0;
        }

        /**
         * Diese Methode soll überprüfen, ob ein als Parameter
         übergebenes
         * Object in der Liste enthalten ist.
         * Das Ergebnis soll als boolean zurückgegeben werden.
         */
        public boolean contains(Object o) {
         for (int i = 0; i < speicher.length; i++) {
            if (speicher[i].equals(o)) {
                return true;
            }
        }
    return false;
    }
        /**
         * Diese Methode soll ein als Parameter übergebenes Object
         in der Liste hinzufügen.
         * True wird zurückgegeben wenn das Hinzufügen erfolgreich
         war.
         */
        public boolean add(A a){
          if (size == 0) {
          speicher[size] = a;
          size++;
          return true;
    }
    if (size < speicher.length) {
      for (int i = 0; i < speicher.length; i++) {
        if (Objects.isNull(speicher[i])) {
          speicher[i] = a;
          size++;
          return true;
        }
      }
      return true;
    }
    return false;
  }
        /**
         * Diese Methode soll ein Object aus der Liste löschen.
         * True wird zurückgegeben wenn das Löschen erfolgreich
         war.
         */
        public boolean remove(Object o){
           if (size == 0) {
             return false;
           }

    for (int i = 0; i < speicher.length; i++) {
      if (speicher[i].equals(o)) {
        speicher[i] = null;
        size--;
        return true;
      }
    }

    return false;
  }


        /**
         * Diese Methode soll überprüfen, ob als Parameter
         übergebene Objekte(ll)
         * in der Liste enthalten ist.
         * True wird zurückgegeben, ob alle übergebene Objekte in
         der Liste enthalten sind
         */
        public boolean containsAll(LocalList<A> localList){
            if (size == 0) {
                return false;
            }
            if (size < localList.size) {
                return false;
            }
            for (int i = 0; i < speicher.length; i++) {
                if (!localList.contains(speicher[i])) {
                    return false;
                }
            }
            return true;
        }

        /**
         * Diese Methode soll als Parameter übergebene Objekte in
         der Liste hinzufügen.
         * True wird zurückgegeben, wenn das Hinzufügen erfolgreich
         war.
         */
        public boolean addAll(LocalList<A> ll) {
            if (size == speicher.length) {
                return false;
            }

            if (speicher.length < LocalList.size()) {
                return false;
            }

            for (int i = 0; i < LocalList.size(); i++) {
                this.add(LocalList.get(i));
            }

            return true;
        }


        /**
         * Diese Methode soll Objekte an der stelle index in der
         Liste hinzufügen.
         * true wird zurückgegeben, wenn das Hinzufügen erfolgreich
         war.
         */
        public boolean addAll(int index, LocalList<A> LocalList) {
            if (size == speicher.length) {
                return false;
            }

            if (size < index) {
                return false;
            }
            if (size < LocalList.size() || size < index + LocalList.size() ) {
                return false;
            }

            for (int i = index; i < LocalList.size(); i++) {
                speicher[i] = LocalList.get(i);
                size++;
            }

            return true;
        }

        /**
         * Diese Methode soll Objekte aus der Liste löschen.
         * True wird zurückgegeben, wenn das Löschen erfolgreich
         war.
         */
        public boolean removeAll(LocalList<A> LocalList) {
            if (size == 0) {
                return false;
            }

            if (size < LocalList.size()) {
                return false;
            }

            for (int i = 0; i < LocalList.size(); i++) {
                remove(LocalList.get(i));
            }

            return true;
        }


        /**
         * Diese Methode soll den internen Speicher zurücksetzen.
         */
        public void clear() {
            if (size == 0) {
                return;
            }

            for (int i = 0; i < speicher.length; i++) {
                speicher[i] = null;
            }
            size = 0;
        }
        /**
         * Diese Methode soll das Element an der Stelle index
         zurückgeben.
         */
        public A get(int index) {
            return speicher[index];
        }


        /**
         * Diese Methode soll das Element an der Stelle index
         löschen.
         */
        public A remove(int index)  {
            A a = speicher[index];
            speicher[index] = null;
            size--;

            return a;
        }

        /**
         * Diese Methode gibt eine Teilliste zurück.
         * Diese Teilliste soll Elemente von der Stelle a bis
         b(exklusiv) enthalten.
         */
        public LocalList<A> subList(int a, int b) {
            if (size == 0) {
                return new LocalList<>();
            }

            if (size < a) {
                return null;
            }

            if (size < b) {
                return null;
            }
            LocalList<A> LocalList = new LocalList<>();
            for (int i = a; i < b; i++) {
                LocalList.add(speicher[i]);
            }

            return LocalList;
        }
    }

