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

    public void print(int listNumber)
    {
        System.out.println("\n" + (listNumber+1) + " Song title: " + songTitle + " Artist: " 
            + artistName + " Play count: " + playCount);
    }

    // get PlayCount
    public int getPlayCount()
    {
        return playCount;
    }

    // get songtitle
    public String getSongTitle()
    {
        return songTitle;
    }
}

