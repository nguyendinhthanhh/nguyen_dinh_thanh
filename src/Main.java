
import java.util.Scanner;
import javax.xml.transform.Source;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tdinh
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MusicLibrary musicLibrary = new MusicLibrary();
        int choice;

        do {
            System.out.println("MENU");
            System.out.println("1.Add Song");
            System.out.println("2.Deleted By Song Name");
            System.out.println("3.Display list");
            System.out.println("4.Exit");
            System.out.print("Input: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: {
                    System.out.print("Enter Song Name: ");
                    String songName = sc.nextLine();
                    System.out.print("Enter Artis: ");
                    String artisName = sc.nextLine();

                    Song newSong = new Song(songName, artisName);
                    musicLibrary.addSong(newSong);
                    break;
                }

                case 2: {
                    System.out.print("Enter Song Name: ");
                    String songNamee = sc.nextLine();
//                    Song song = new Song(songNamee);
//                    System.out.println(""+ musicLibrary.deletedByName(song));
                    musicLibrary.deltedSong(songNamee);
                    break;
                }
                
                case 3: {
                    musicLibrary.displayList();
                    break;
                }
                

            }
        } while (choice != 4);
        System.out.println("Good Bye");

    }

}
