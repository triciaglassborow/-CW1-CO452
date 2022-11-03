package CW1;
import java.util.ArrayList;

import helpers.*;


public class SongApp
 {

    public static void main(String[] args)
    {
        ArrayList<Song> storedSongs = initialiseSongs();

    }
    private static ArrayList initialiseSongs()
    {
        // created an array called storedSongs
        ArrayList<Song> storedSongs = new ArrayList<Song>();
        // creating an object
        Song manUp = new Song("Man Up", "Hailee Steinfeld", 1000);
        Song work = new Song("Work", "The Saturdays", 250);
        Song girls = new Song("girls", "girl in red", 5000);
        Song numb = new Song("Numb To The Feeling", "Chase Atlantic", 6500);
        Song cant = new Song("CANT HAVE IT", "JKER", 300);
        // adding songs to the array list
        storedSongs.add(manUp);
        storedSongs.add(work);
        storedSongs.add(girls);
        storedSongs.add(numb);
        storedSongs.add(cant);
        // returns the array list
        return storedSongs;
    }

    public static void printList()
    {
        
    }

    public static void userinput()
    {
        String name = InputReader.getString("Enter your name > ");
        System.out.println("Hello " + name);

    }
    
}