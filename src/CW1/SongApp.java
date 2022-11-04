package CW1;
import java.util.ArrayList;

import helpers.*;

/**
 * Song App has the following features:
 * Add a new song to the list of songs
 * Remove a song from the list of songs
 * Print a list of all the songs stored
 * Print a list of songs over a given number of plays 
 * Made by Patricia Glassborow
 * Last Update: 03/11/2022
 */

public class SongApp
 {

    public static void main(String[] args)
    {
        //clears the terminal
        
        //creating an array list
        ArrayList<Song> storedSongs = initialiseSongs();
        // calling the printList method
        printList(storedSongs);
        // creating variable
        char userInput;
        // asking user if they want to add a song
        userInput = InputReader.getChar("do you want to add a song? y/n ");
        // when they say yes it will run getNewSong
        while (userInput == 'y')
        {
            // adds new song
            storedSongs.add(getNewSong());
            printList(storedSongs);
            userInput = InputReader.getChar("do you want to add a song? y/n ");
        }
        
        //removes song
        storedSongs.remove(getSongToRemove(storedSongs));
        // printing the songs over said playcount
        printListOverPlayCount(storedSongs);
        

        
    }
    private static ArrayList<Song> initialiseSongs()
    {
        System.out.println("\ninitialising Songs");
        // created an array called storedSongs
        ArrayList<Song> storedSongs = new ArrayList<Song>();
        // creating an object
        Song manUp = new Song("Man Up", "Hailee Steinfeld", 4754000);
        Song work = new Song("Work", "The Saturdays", 4188000);
        Song girls = new Song("girls", "girl in red", 224776000);
        Song numb = new Song("Numb To The Feeling", "Chase Atlantic", 38259000);
        Song cant = new Song("CANT HAVE IT", "JKER", 7536000);
        Song heartless = new Song("Heartless", "The Weeknd", 575902000);
        Song summertime = new Song("Summertime Sadness", "Lana Del Rey", 665304000);
        Song roof = new Song("OUT THE ROOF", "Chase Atlantic", 19627000);
        Song softcore = new Song("Softcore", "The Neighbourhood", 389105000);
        Song watch = new Song("watch", "Billie Eilish", 417783000);





        // adding songs to the array list
        storedSongs.add(manUp);
        storedSongs.add(work);
        storedSongs.add(girls);
        storedSongs.add(numb);
        storedSongs.add(cant);
        storedSongs.add(heartless);
        storedSongs.add(summertime);
        storedSongs.add(roof);
        storedSongs.add(softcore);
        storedSongs.add(watch);

        // returns the array list
        return storedSongs;
    }

    public static void printList(ArrayList<Song> songsList)
    {
        System.out.println("\nlist of songs: ");
        //for each song in the array it will print out the info of the song
        for (Song song : songsList) 
        {
            song.print();
        }
    }
    
    public static void printListOverPlayCount(ArrayList<Song> playCountList)
    {
        System.out.println("\ncomparing play counts");
        //getting user to input what they want the min play count to be
        int minPlayCount = InputReader.getInt("what is the minimum play count needed for a song to be played:  ");
        //comparing each songs playCount with the min play count given
        for (Song song : playCountList)
        {
            if (minPlayCount < song.getPlayCount())
            song.print(); //if song play count is pver min play count, it prints the song
        }

    }
    public static Song getNewSong()
    {
        System.out.println("\nadding new song");
        // created temp variables
        String tempSongName, tempArtist;
        int tempPlayCount;
        //assigning values to the variables
        tempSongName = InputReader.getString("Name of the new song: ");
        tempArtist = InputReader.getString("Name of the new song's artist: ");
        tempPlayCount = InputReader.getInt("New song's play count: ");
        //returning new song based on user input
        System.out.println("\nnew song added");
        return new Song(tempSongName, tempArtist, tempPlayCount);
    }

    public static Song getSongToRemove(ArrayList<Song> songsList)
    {
        System.out.println("\nremoving song");
        //getting user to input the song they want removed
        String removeSong = InputReader.getString("name of the song you want to remove: ");
        // making the input all lower case
        removeSong.toLowerCase();
        // going through the whole array
        for (Song song : songsList )
        {
            // get the object songTitle, then make it all lower case, 
            // compare it to the input, if true then it returns 1
            if (song.getSongTitle().toLowerCase().compareTo(removeSong) == 1)
            {
                System.out.println("\nsong removed");
                return song; //returns the matched song
            }
        }
        System.out.println("\nno song found to remove");
        return null; // if none of the songs match it returns nothing
    }
    
}