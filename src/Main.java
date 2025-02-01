import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    // ========================= NIVEAU DEBUTANT =========================

    // ========================= EXO 1 =========================
    public static int SaisiePositif() {
        int nbr;

        System.out.print("Entrer un nombre entier strictement positif : ");
        nbr = scanner.nextInt();

       while (nbr <= 0) {
           System.out.println("Le nombre choisi est null ou négatif");
           System.out.print("Veuillez entrer un nombre positif : ");
           nbr = scanner.nextInt();
       }

       return nbr;
    }

    // ========================= EXO 2 =========================
    public static boolean estPair(int valeur) {

        return valeur % 2 == 0;
    }

    public static void testEstPair() {
        boolean res = estPair(SaisiePositif());
        if (res){
            System.out.println("Le nombre choisi est pairs");
        } else {
            System.out.println("Le nombre choisi est impairs");
        }
    }

    // ========================= EXO 3 =========================
    public static boolean estStrictementPositif(int valeur) {
        return  valeur > 0;
    }

    public static void testEstStrictementPositif() {
        int res = SaisiePositif();

        if (estStrictementPositif(res)) {
            System.out.println("Le nombre choisi est strictement positif");
        } else {
            System.out.println("Le nombre choisi est null ou négatif");
        }
    }

    // ========================= EXO 4 =========================

    public static int posNeg(int nb1, int nb2) {
        if ((nb1 > 0 && nb2 > 0) || (nb1 < 0 && nb2 < 0)) {
            return 1;
        } else if (nb1 == 0 || nb2 == 0) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void testPosNeg() {
        System.out.println("Entrer deux entier pour connaitre le type du résultat d'un produit (positif, null, negatif) -> ");

        System.out.print("Premier entier : ");
        int entier1 = scanner.nextInt();
        System.out.print("Deuxième entier : ");
        int entier2 = scanner.nextInt();

        int res = posNeg(entier1, entier2);
        if (res == 1) {
            System.out.println("Le résultat du produit de (" + entier1 + " x " + entier2 + ") est positif");
        } else if( res == 0) {
            System.out.println("Le résultat du produit de (" + entier1 + "x" + entier2 + ") est null");
        } else {
            System.out.println("Le résultat du produit de (" + entier1 + "x" + entier2 + ") est négatif");
        }
    }

    // ========================= NIVEAU INTERMEDIAIRE =========================

    // ========================= EXO 1 =========================
    public static int sommeElements(int a, int b) {
        int sum = 0;
        if (a < b){
            for (int i = a; i <= b; i++) {
                sum += i;
            }
            return sum;

        } else if (a > b) {
            for (int i = b; i <= a; i++) {
                sum += i;
            }
            return sum;

        } else {
            return a;
        }
    }

    public static void testSommeElements() {
        System.out.println("Entrer deux entier pour connaitre leur somme -> ");
        System.out.print("Premier entier : ");
        int entier1 = scanner.nextInt();
        System.out.print("Deuxième entier : ");
        int entier2 = scanner.nextInt();

        System.out.println("la somme des entiers entre " + entier1 + " et " + entier2 +
                " est " + sommeElements(entier1, entier2) );
    }

    // ========================= EXO 2 =========================
    public static int factorielle(int n) {
        int resultat = 1;
        for (int i = 2; i <= n; i++) {
            resultat *= i;
        }
        return resultat;
    }

    public static void testFactorielle() {
        System.out.println("Entrer un entier pour avoir sa factorielle (ne pas dépasser le chiffre 12 pour ne pas avoir un overflow) -> ");
        System.out.print("Entier : ");
        int entier1 = scanner.nextInt();

        System.out.println("La factorielle du nombre " + entier1 + " est " + factorielle(entier1));
    }

    // ========================= EXO 3 =========================
    public static boolean nombrePremier(int n) {
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void testNombrePremier() {
        System.out.println("Entrer un nombre pour savoir si il est premier -> ");
        System.out.print("Votre nombre : ");
        int nbr = scanner.nextInt();

        if(nombrePremier(nbr)) {
            System.out.println("Le nombre " + nbr + " est premier");
        } else {
            System.out.println("Le nombre " + nbr + " n'est pas premier");
        }
    }

    // ========================= EXO 4 =========================
    public static boolean estBissextile(int annee) {
        if (annee % 4 == 0 && (annee % 100 != 0 || annee % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void testBissextile() {
        System.out.println("Entrer une année pour savoir si elle est bissextile -> ");
        System.out.print("L'année : ");
        int annee = scanner.nextInt();

        if (estBissextile(annee)) {
            System.out.println("L'année " + annee + " est bissextile");
        } else {
            System.out.println("L'année " + annee + " n'est pas bissextile");
        }

    }

    // ========================= EXO 5 =========================
    public static int puissance(int a, int n) {
        int resultat = 1;
        for (int i = 0; i < n; i++) {
            resultat *= a;
        }
        return resultat;
    }
    public static void testPuissance() {
        System.out.println("Entrer un nombre puis sa puissance pour connaitre le resultat-> ");
        System.out.print("Nombre : ");
        int nombre = scanner.nextInt();
        System.out.print("Puissance: ");
        int puissance = scanner.nextInt();

        System.out.println("Le nombre " + nombre + " a la puissance " + puissance +
                " est égale à " + puissance(nombre, puissance));
    }

    // ========================= EXO 6 =========================
    public static double valeurMaxTableau(double[] tableau) {
        double max = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > max) {
                max = tableau[i];
            }
        }
        return max;
    }

    public static void testValeurMaxTableau() {
        System.out.println("Entrer la taille du tableau pour avoir sa valeur maximal -> ");
        System.out.print("Taille : ");
        int taille = scanner.nextInt();
        double[] tableau = new double[taille];

        System.out.println("Entrer les nombres dans le tableau -> ");

        for (int i = 0 ; i < taille; i++) {
            System.out.print("Nombre " + i + " : ");
            tableau[i] = scanner.nextDouble();
        }

        System.out.println("Le nombre avec la plus grosse valeur de votre tableau est " +
                valeurMaxTableau(tableau));
    }

    // ========================= EXO 7 =========================
    public static int occurence(String texte, char lettre) {
        int compteur = 0;

        for (int i = 0; i < texte.length(); i++) {
            if (texte.charAt(i) == lettre) {
                compteur++;
            }
        }
        return compteur;
    }

    public static void testOccurence() {
        System.out.println("Entrer un mot puis la lettre pour connaitre sont occurence -> ");
        System.out.print("Mot : ");
        String mot = scanner.next();
        System.out.print("Lettre : ");
        char lettre = scanner.next().charAt(0);

        System.out.println("Dans le mot " + mot + ", il y a " + occurence(mot, lettre) +
                " fois de la lettre "+ lettre);
    }

    // ========================= NIVEAU AVANCÉ =========================

    // ========================= EXO 1 et 2 =========================
    // Exo 1
    public static void remplirTab(int[] tab) {
        System.out.println("Entrer les valeur a ajouter au tableau ->");

        for (int i = 0; i < tab.length; i++) {
            System.out.print("Valeur a ajouter " + i + " : ");
            tab[i] = scanner.nextInt();
        }
    }
    // Exo 2
    public static void afficherTab(int[] tab) {
        System.out.println("Le tableau contient -> ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + ", ");
        }
        System.out.println();
    }

    public static void testRemplirEtAfficherTab() {
        System.out.println("Entrer la taille du tableau pour le remplir et l'afficher -> ");
        System.out.print("Taille : ");
        int taille = scanner.nextInt();
        int[] tab = new int[taille];
        remplirTab(tab);
        afficherTab(tab);
    }

    // ========================= EXO 3 =========================
    public static int positionMax(int[] tab) {
        int valeurMax = tab[0], positionMax = 0;

        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > valeurMax) {
                valeurMax = tab[i];
                positionMax = i;
            }
        }
        return positionMax;
    }

    public static void testPositionMax() {
        System.out.println("Entrer la taille du tableau pour connaitre la postion de la valeur maximal-> ");
        System.out.print("Taille : ");
        int taille = scanner.nextInt();
        int[] tab = new int[taille];
        remplirTab(tab);

        System.out.println("La valeur max est a l'indice " + positionMax(tab) +
                " et donc a la position numero " + (positionMax(tab) + 1) + " dans la liste");
    }

    public static void permuterCases(int[] tab, int i, int j) {
        int stockage = tab[i];
        tab[i] = tab[j];
        tab[j] = stockage;
    }

    public static void testPermuterCases() {
        System.out.println("Entrer la taille du tableau pour voir la permutation entre deux nombres choisis -> ");
        System.out.print("Taille : ");
        int taille = scanner.nextInt();
        int[] tab = new int[taille];
        remplirTab(tab);

        System.out.println("Choisir la position des nombres a permuter -> ");
        System.out.print("Position du premier nombre : ");
        int nbr1 = scanner.nextInt();
        System.out.print("Position du deuxieme nombre : ");
        int nbr2 = scanner.nextInt();

        permuterCases(tab, (nbr1 - 1), (nbr2 - 1));

        System.out.println("Voici la liste apres la permutation des deux nombres : ");
        afficherTab(tab);
    }

    public static void trierTab(int[] tab) {
        for (int i = tab.length - 1; i > 0; i--) {

            int[] sousTab = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                sousTab[j] = tab[j];
            }

            int indiceMax = positionMax(sousTab);
            permuterCases(tab, indiceMax, i);
        }
    }

    public static void testTrierTab() {
        System.out.println("Entrer la taille du tableau pour pouvoir le trier avec le trie a bulle-> ");
        System.out.print("Taille : ");
        int taille = scanner.nextInt();
        int[] tab = new int[taille];
        remplirTab(tab);

        trierTab(tab);
        System.out.println("Voici la liste apres avoir était trié (avec le trie a bulle) : ");
        afficherTab(tab);
    }



    // ========================= EXO 4 =========================
    public static  String inverserChaine(String str) {
        String motInverser = "";
        int taille = str.length();

        for (int i = taille - 1; i >= 0; i--) {
            char lettre = str.charAt(i);
            motInverser = motInverser + lettre;
        }

        return motInverser;
    }

    public static void testInverserChaine() {
        System.out.println("Entrer un mot pour avoir sont inverse -> ");
        System.out.print("Mot : ");
        String mot = scanner.next();

        System.out.println("Le mot inverse de '" + mot + "' est '" + inverserChaine(mot) + "'");
    }

    public static boolean comparerChaines(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void testComparerChaines() {
        System.out.println("Entrer deux mot pour savoir si ils sont pareils -> ");
        System.out.print("Premier Mot : ");
        String mot1 = scanner.next();
        System.out.print("Deuxieme Mot : ");
        String mot2 = scanner.next();

        if (comparerChaines(mot1, mot2)) {
            System.out.println("Les mots '" + mot1 + "' et '" + mot2 + "' sont pareils");
        } else {
            System.out.println("Les mots '" + mot1 + "' et '" + mot2 + "' ne sont pas pareils");
        }

    }

    public static boolean verifPalindrome(String str) {
        String strInverse = inverserChaine(str);
        return comparerChaines(str, strInverse);
    }

    public static void testVerifPalindrome() {
        System.out.println("Entrer un mot pour savoir si il est palindrome -> ");
        System.out.print("Mot : ");
        String mot = scanner.next();

        if (verifPalindrome(mot)) {
            System.out.println("Le mot '" + mot + "' est Palindrome !");
        } else {
            System.out.println("Le mot '" + mot + "' n'est pas Palindrome");
        }

    }

    // =========================== MAIN =================================
    public static void main(String[] args) {

        int numLevel,numExo;
        System.out.print("CHOISISSEZ UN NIVEAU -> \n (débutant : 1; intermédiaire : 2; avancé: 3) : ");
        numLevel = scanner.nextInt();

        while (numLevel != -1) {
            switch (numLevel) {
                case 1:
                {
                    System.out.println();
                    System.out.println("--------- BIENVENUE DANS LE NIVEAU DÉBUTANT ---------");
                    System.out.println();
                    System.out.println();

                    System.out.print("Choisissez un numéro d'exercice de 1 à 4 : ");
                    numExo = scanner.nextInt();
                    System.out.println();

                    while (numExo != -1) {
                        switch (numExo) {
                            case 1: {
                                SaisiePositif();
                                break;
                            }
                            case 2: {
                                testEstPair();
                                break;
                            }
                            case 3: {
                                testEstStrictementPositif();
                                break;
                            }
                            case 4: {
                                testPosNeg();
                                break;
                            }
                            default:
                                System.out.println("Ce numéro d'exercice n'existe pas");
                        }
                        System.out.println();
                        System.out.println("Choisissez un nouveaux numéros d'exercice de 1 à 4 (taper -1 pour revenir au choix de level) : ");
                        System.out.print("Dernier exo choisi (exo numero " + numExo + ") : ");
                        numExo = scanner.nextInt();
                        System.out.println();
                    }

                    break;
                }
                case 2:
                {
                    System.out.println();
                    System.out.println("--------- BIENVENUE DANS LE NIVEAU INTERMÉDIAIRE ---------");
                    System.out.println();
                    System.out.println();

                    System.out.print("Choisissez un numéro d'exercice de 1 à 7 : ");
                    numExo = scanner.nextInt();
                    System.out.println();

                    while (numExo != -1) {
                        switch (numExo) {
                            case 1: {
                                testSommeElements();
                                break;
                            }
                            case 2: {
                                testFactorielle();
                                break;
                            }
                            case 3: {
                                testNombrePremier();
                                break;
                            }
                            case 4: {
                                testBissextile();
                                break;
                            }
                            case 5: {
                                testPuissance();
                                break;
                            }
                            case 6: {
                                testValeurMaxTableau();
                                break;
                            }
                            case 7: {
                                testOccurence();
                                break;
                            }

                            default:
                                System.out.println("Ce numéro d'exercice n'existe pas");
                        }
                        System.out.println();
                        System.out.println("Choisissez un nouveaux numéros d'exercice de 1 à 7 (taper -1 pour revenir au choix de level) -> ");
                        System.out.print("Dernier exo choisi (exo numero " + numExo + ") : ");
                        numExo = scanner.nextInt();
                        System.out.println();
                    }

                    break;
                }
                case 3:
                {
                    System.out.println();
                    System.out.println("--------- BIENVENUE DANS LE NIVEAU AVANCÉE ---------");
                    System.out.println();
                    System.out.println();

                    System.out.print("Choisissez un numéro d'exercice de 1 à 7 : ");
                    numExo = scanner.nextInt();
                    System.out.println();
                    while (numExo != -1) {
                        switch (numExo) {
                            case 1: {
                                testRemplirEtAfficherTab();
                                break;
                            }

                            case 2: {
                                testPositionMax();
                                break;
                            }
                            case 3: {
                                testPermuterCases();
                                break;
                            }
                            case 4: {
                                testTrierTab();
                                break;
                            }
                            case 5:
                            {
                                testInverserChaine();
                                break;
                            }
                            case 6:
                            {
                                testComparerChaines();
                                break;
                            }
                            case 7:
                            {
                                testVerifPalindrome();
                                break;
                            }
                            default:
                                System.out.println("Ce numéro d'exercice n'existe pas");
                        }
                        System.out.println();
                        System.out.println("Choisissez un nouveaux numéros d'exercice de 1 à 7 (taper -1 pour revenir au choix de level) : ");
                        System.out.print("Dernier exo choisi (exo numero " + numExo + ") : ");
                        numExo = scanner.nextInt();
                        System.out.println();
                    }

                    break;
                }
                default:
                    System.out.println("Ce numéro de niveau n'existe pas");
            }
            System.out.print("Choisissez un niveau \n (débutant : 1; intermédiaire : 2; avancé: 3) (taper -1 pour quitté) :");
            numLevel = scanner.nextInt();
        }
    }
}