package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        // creo array con invitati
        String[] invitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        // // stampo per verificare array-debug
        // for (int i = 0; i < invitati.length; i++) {
        // System.out.println(invitati[i]);
        // }

        // definisco scanner
        Scanner input = new Scanner(System.in);
        String inputGuest = input.nextLine().trim().replaceAll("\\s+", " ");
        // System.out.println(inputGuest);

        // -------------------METODO FOR--------------------------------------------
        // // inizializzo la variabile isInvited
        // boolean isInvited = false;
        // // ciclo l'array e verifico se è presente nell'array il guest inserito
        // for (int i = 0; i < invitati.length; i++) {
        // if (inputGuest.toLowerCase().equals(invitati[i].toLowerCase())) {
        // isInvited = true;
        // }
        // }

        // ------------------------METODO WHILE-------------------
        // inizializzo la variabile isInvited
        boolean isInvited = false;
        int i = 0;
        while (i < invitati.length && !isInvited) {
            if (inputGuest.toLowerCase().equals(invitati[i].toLowerCase())) {
                isInvited = true;
            }
            i++;
        }

        // Stampo risultato se invitato o meno
        if (isInvited) {
            System.out.println(inputGuest + " e' invitato alla festa");
        } else {
            System.out.println(inputGuest + " non e' invitato alla festa");
        }

        // chiudo scanner
        input.close();
    }
}
