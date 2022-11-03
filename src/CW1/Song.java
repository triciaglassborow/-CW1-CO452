package CW1;

public class Song
 {
    private String songTitle;
    private String artistName;
    private int playCount;
    

//constructor
    public Song(String songTitle, String artistName, int playCount) 
    {
        this.songTitle = songTitle;
        this.artistName = artistName;
        this.playCount = playCount;
    }

    public void print()
    {
        System.out.println("\nSong title: " + songTitle + " Artist: " 
            + artistName + " Play count: " + playCount);
    }

    // get PlayCount
    public int getPlayCount()
    {
        return playCount;
    }
}

