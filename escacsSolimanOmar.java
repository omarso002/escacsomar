package com.mycompany.bucles;

public class escacsSolimanOmar {

    public static void main(String[] args) {

        int accio;
        int numpeça;
        int posfil;
        int poscol;
        boolean entrar = true;
        final char MOV = '*';
        char peça = 0;
        final char BUIT = '_';

        // CREAR TAULER
        System.out.println("Quantes columnes te el tauler? ");
        final int COL = Teclat.lligInt();
        System.out.println("Quantes files te el tauler? ");
        final int FIL = Teclat.lligInt();

        char tauler[][] = new char[COL + 1][FIL + 1];

        for (int col = 0; col < tauler.length; col++) {

            for (int fil = 0; fil < tauler[col].length; fil++) {
                tauler[col][fil] = BUIT;
            }
        }
        do {

            // MOSTRAR TAULER
            System.out.print(" ");
            for (int c = 1; c <= COL; c++) {
                System.out.print(c);
                System.out.print(" ");
            }
            System.out.println("");

            for (int fil = 1; fil < tauler[0].length; fil++) {

                System.out.print(fil);
                for (int col = 1; col < tauler.length; col++) {

                    System.out.print(tauler[col][fil]);
                    System.out.print(" ");

                }
                System.out.println(fil);
            }
            System.out.print(" ");
            for (int c = 1; c <= COL; c++) {
                System.out.print(c);
                System.out.print(" ");

            }

            System.out.println("");

            System.out.println("1. Posar una peça");
            System.out.println("2. Mostrar els moviments d'una peça");
            System.out.println("3. Esborrar moviments");
            System.out.println("4. Esborrar tauler");
            System.out.println("5. Eixir");

            do {
                System.out.println("Que vols fer? ");
                accio = Teclat.lligInt();
            } while ((accio < 1) || (accio > 5));

            switch (accio) {

                case 1: //Posar peça

                    do {
                        System.out.println("""
                                       Que peça vols posar? 
                                       1. Torre 
                                       2. Alfil 
                                       3. Dama
                                       4. Rei
                                       5. Cavall""");
                        numpeça = Teclat.lligInt();
                    } while ((numpeça < 1) || (numpeça > 5));

                    if (numpeça == 1) {
                        peça = 'T';
                    } else {
                        if (numpeça == 2) {
                            peça = 'A';
                        } else {
                            if (numpeça == 3) {
                                peça = 'D';
                            } else {
                                if (numpeça == 4) {
                                    peça = 'R';
                                } else {
                                    if (numpeça == 5) {
                                        peça = 'C';
                                    }
                                }
                            }
                        }
                    }

                    System.out.println("En quina fila vols colocar la peça?");
                    posfil = Teclat.lligInt();
                    System.out.println("");
                    System.out.println("En quina columnma vols colocar la peça?");
                    poscol = Teclat.lligInt();

                    tauler[poscol][posfil] = peça;

                    break;

                case 2: //Mostrar els moviments

                    System.out.println("En quina fila esta la peça?");
                    posfil = Teclat.lligInt();
                    System.out.println("En quina columna esta la peça?");
                    poscol = Teclat.lligInt();

                    System.out.println("");

                    switch (tauler[poscol][posfil]) {

                        case 'T': //Torre

                            System.out.println(tauler[poscol][posfil]);
                            // Dreta
                            for (int c = poscol + 1; c <= COL; c++) {
                                if (tauler[c][posfil] != MOV && tauler[c][posfil] != BUIT) {
                                    break;
                                }
                                tauler[c][posfil] = MOV;

                            }
                            // Esquerra
                            for (int c = poscol - 1; c >= 0; c--) {
                                if (tauler[c][posfil] != MOV && tauler[c][posfil] != BUIT) {
                                    break;
                                }
                                tauler[c][posfil] = MOV;

                            }
                            // Baix
                            for (int f = posfil + 1; f <= FIL; f++) {
                                if (tauler[poscol][f] != MOV && tauler[poscol][f] != BUIT) {
                                    break;
                                }
                                tauler[poscol][f] = MOV;

                            }
                            // Dalt
                            for (int f = posfil - 1; f >= 0; f--) {
                                if (tauler[poscol][f] != MOV && tauler[poscol][f] != BUIT) {
                                    break;
                                }
                                tauler[poscol][f] = MOV;

                            }

                            break;

                        case 'A': // Alfil

                            System.out.println(tauler[poscol][posfil]);

                            // Dreta-Dalt
                            for (int c = poscol + 1, f = posfil - 1; f >= 1 && c <= COL; c++, f--) {
                                if (tauler[c][f] != MOV && tauler[c][f] != BUIT) {
                                    break;
                                }
                                tauler[c][f] = MOV;

                            }
                            // Dreta-Baix
                            for (int c = poscol + 1, f = posfil + 1; f <= FIL && c <= COL; c++, f++) {
                                if (tauler[c][f] != MOV && tauler[c][f] != BUIT) {
                                    break;
                                }
                                tauler[c][f] = MOV;

                            }
                            // Esquerra-Dalt
                            for (int c = poscol - 1, f = posfil - 1; f >= 1 && c >= 1; c--, f--) {
                                if (tauler[c][f] != MOV && tauler[c][f] != BUIT) {
                                    break;
                                }
                                tauler[c][f] = MOV;

                            }
                            // Esquerra-Baix
                            for (int c = poscol - 1, f = posfil + 1; f <= FIL && c >= 1; c--, f++) {
                                if (tauler[c][f] != MOV && tauler[c][f] != BUIT) {
                                    break;
                                }
                                tauler[c][f] = MOV;

                            }
                            break;

                        case 'D': // Dama
                            System.out.println(tauler[poscol][posfil]);
                            // Rectes

                            // Dreta
                            for (int c = poscol + 1; c <= COL; c++) {
                                if (tauler[c][posfil] != MOV && tauler[c][posfil] != BUIT) {
                                    break;
                                }
                                tauler[c][posfil] = MOV;

                            }
                            // Esquerra
                            for (int c = poscol - 1; c >= 0; c--) {
                                if (tauler[c][posfil] != MOV && tauler[c][posfil] != BUIT) {
                                    break;
                                }
                                tauler[c][posfil] = MOV;

                            }
                            // Baix
                            for (int f = posfil + 1; f <= FIL; f++) {
                                if (tauler[poscol][f] != MOV && tauler[poscol][f] != BUIT) {
                                    break;
                                }
                                tauler[poscol][f] = MOV;

                            }
                            // Dalt
                            for (int f = posfil - 1; f >= 0; f--) {
                                if (tauler[poscol][f] != MOV && tauler[poscol][f] != BUIT) {
                                    break;
                                }
                                tauler[poscol][f] = MOV;

                            }

                            // Diagonals
                            // Dreta-Dalt
                            for (int c = poscol + 1, f = posfil - 1; f >= 1 && c <= COL; c++, f--) {
                                if (tauler[c][f] != MOV && tauler[c][f] != BUIT) {
                                    break;
                                }
                                tauler[c][f] = MOV;

                            }
                            // Dreta-Baix
                            for (int c = poscol + 1, f = posfil + 1; f <= FIL && c <= COL; c++, f++) {
                                if (tauler[c][f] != MOV && tauler[c][f] != BUIT) {
                                    break;
                                }
                                tauler[c][f] = MOV;

                            }
                            // Esquerra-Dalt
                            for (int c = poscol - 1, f = posfil - 1; f >= 1 && c >= 1; c--, f--) {
                                if (tauler[c][f] != MOV && tauler[c][f] != BUIT) {
                                    break;
                                }
                                tauler[c][f] = MOV;

                            }
                            // Esquerra-Baix
                            for (int c = poscol - 1, f = posfil + 1; f <= FIL && c >= 1; c--, f++) {
                                if (tauler[c][f] != MOV && tauler[c][f] != BUIT) {
                                    break;
                                }
                                tauler[c][f] = MOV;

                            }
                            break; 

                        case 'R': // Rei

                            // Dalt
                            if (posfil - 1 >= 1 && tauler[poscol][posfil - 1] == BUIT) {
                                tauler[poscol][posfil - 1] = MOV;
                            }

                            // Dreta
                            if (poscol + 1 <= COL && tauler[poscol + 1][posfil] == BUIT) {
                                tauler[poscol + 1][posfil] = MOV;
                            }

                            // Baix
                            if (posfil + 1 <= FIL && tauler[poscol][posfil + 1] == BUIT) {
                                tauler[poscol][posfil + 1] = MOV;
                            }

                            // Esquerra
                            if (poscol - 1 >= 1 && tauler[poscol - 1][posfil] == BUIT) {
                                tauler[poscol - 1][posfil] = MOV;
                            }

                            // Dalt-Dreta
                            if (poscol + 1 <= COL && posfil - 1 >= 1 && tauler[poscol + 1][posfil - 1] == BUIT) {
                                tauler[poscol + 1][posfil - 1] = MOV;
                            }

                            // Baix-Dreta
                            if (posfil + 1 <= FIL && poscol + 1 <= COL && tauler[poscol + 1][posfil + 1] == BUIT) {
                                tauler[poscol + 1][posfil + 1] = MOV;
                            }

                            // Baix-Esquerra
                            if (posfil + 1 <= FIL && poscol - 1 >= 1 && tauler[poscol - 1][posfil + 1] == BUIT) {
                                tauler[poscol - 1][posfil + 1] = MOV;
                            }

                            // Dalt-Esquerra
                            if (poscol - 1 >= 1 && posfil - 1 >= 1 && tauler[poscol - 1][posfil - 1] == BUIT) {
                                tauler[poscol - 1][posfil - 1] = MOV;
                            }
                            break;

                        case 'C': // Cavall

                            // Dalt-Dreta
                            if (poscol + 1 <= COL && posfil - 2 >= 1 && tauler[poscol + 1][posfil - 2] == BUIT) {
                                tauler[poscol + 1][posfil - 2] = MOV;
                            }
                            if (poscol + 2 <= COL && posfil - 1 >= 1 && tauler[poscol + 2][posfil - 1] == BUIT) {
                                tauler[poscol + 2][posfil - 1] = MOV;
                            }

                            // Baix-Dreta
                            if (poscol + 1 <= COL && posfil + 2 <= FIL && tauler[poscol + 1][posfil + 2] == BUIT) {
                                tauler[poscol + 1][posfil + 2] = MOV;
                            }
                            if (poscol + 2 <= COL && posfil + 1 <= FIL && tauler[poscol + 2][posfil + 1] == BUIT) {
                                tauler[poscol + 2][posfil + 1] = MOV;
                            }

                            // Baix-Esquerra
                            if (poscol - 1 >= 1 && posfil + 2 <= FIL && tauler[poscol - 1][posfil + 2] == BUIT) {
                                tauler[poscol - 1][posfil + 2] = MOV;
                            }
                            if (poscol - 2 >= 1 && posfil + 1 <= FIL && tauler[poscol - 2][posfil + 1] == BUIT) {
                                tauler[poscol - 2][posfil + 1] = MOV;
                            }

                            // Dalt-Esquerra
                            if (poscol - 1 >= 1 && posfil - 2 >= 1 && tauler[poscol - 1][posfil - 2] == BUIT) {
                                tauler[poscol - 1][posfil - 2] = MOV;
                            }
                            if (poscol - 2 >= 1 && posfil - 1 >= 1 && tauler[poscol - 2][posfil - 1] == BUIT) {
                                tauler[poscol - 2][posfil - 1] = MOV;
                            }

                            break;

                    }
                    System.out.println("");
                    break;

                case 3: // Esborrar moviments
                    int movimentsborrats = 0;
                    for (int col = 0; col < tauler.length; col++) {

                        for (int fil = 0; fil < tauler[col].length; fil++) {
                            if (tauler[col][fil] == '*' && tauler[col][fil] != 'T' && tauler[col][fil] != 'A' && tauler[col][fil] != 'R' && tauler[col][fil] != 'D' && tauler[col][fil] != 'C') {
                                tauler[col][fil] = BUIT;
                                movimentsborrats += 1;
                                 
                            }
                        }
                    }
                    break;

                case 4: // Esborrar tauler
                    for (int col = 0; col < tauler.length; col++) {

                        for (int fil = 0; fil < tauler[col].length; fil++) {
                            tauler[col][fil] = BUIT;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Segur que vols eixir?");
                    char eixir = Teclat.lligChar();
                    if (eixir == 's' || eixir == 'S') {
                        entrar = false;
                    } 
                    
                    

            }

        } while (entrar);

    }

}
