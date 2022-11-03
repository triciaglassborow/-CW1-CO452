package CW1;
import java.util.ArrayList;

import helpers.*;


public class SongApp
 {

    public static void main(String[] args)
    {
        //creating an array list
        ArrayList<Song> storedSongs = initialiseSongs();
        // calling the printList method
        printList(storedSongs);
        // printing the songs over said playcount
        printListOverPlayCount(storedSongs);


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

    public static void printList(ArrayList<Song> songsList)
    {
        //for each song in the array it will print out the info of the song
        for (Song song : songsList) 
        {
            song.print();
        }
    }
    
    public static void printListOverPlayCount(ArrayList<Song> playCountList)
    {
        //getting user to input what they want the min play count to be
        int minPlayCount = InputReader.getInt("what is the minimum play count needed for a song to be played:  ");
        //comparing each songs playCount with the min play count given
        for (Song song : playCountList)
        {
            if (minPlayCount < song.getPlayCount())
            song.print(); //if song play count is pver min play count, it prints the song
        }
    }
    public static void userinput()
    {
        String name = InputReader.getString("Enter your name > ");
        System.out.println("Hello " + name);

    }
    
}