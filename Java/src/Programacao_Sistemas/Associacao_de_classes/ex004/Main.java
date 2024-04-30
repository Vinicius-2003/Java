package Programacao_Sistemas.Associacao_de_classes.ex004;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Starting the scanner to read
        Scanner s = new Scanner(System.in);

        //Inicializing variables
        Heart heart = new Heart();
        Lungs lungs = new Lungs();
        HumanBeing person = new HumanBeing(heart, lungs);

        System.out.println("-=-=-=Collecting information-=-=-=-\n");
        //Collecting data
        System.out.println("What's your name ? :");
        String name = s.nextLine();
        person.setName(name);

        System.out.println("How old are you ? :");
        int age = s.nextInt();
        person.setAge(age);

        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");

        System.out.println("What's your average heart beat ? :");
        int average_heart = s.nextInt();
        heart.setBpm(average_heart);

        System.out.println("What's your lungs capability ? :");
        int lungs_volume = s.nextInt();
        lungs.setVolume(lungs_volume);


        person.showData();

    }
}
