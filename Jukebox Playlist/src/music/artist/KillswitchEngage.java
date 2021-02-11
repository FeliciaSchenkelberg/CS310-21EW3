package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class KillswitchEngage {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public KillswitchEngage() {
    }
    
    public ArrayList<Song> getKSESongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                 //Instantiate the album so we can populate it below
    	 Song track1 = new Song("The End Of Heartache", "Killswitch Engage"); //Create a song
         Song track2 = new Song("The Rose Of Sharyn", "Killswitch Engage");   //Create another song
         Song track3 = new Song("Signal Fire", "Killswitch Engage");          //Create a third song
         this.albumTracks.add(track1);                                        //Add the first song to song list
         this.albumTracks.add(track2);                                        //Add the second song to song list
         this.albumTracks.add(track3);                                        //Add the third song to song list
         return albumTracks;                                                  //Return the songs for Nine Inch Nails in the form of an ArrayList
    }
}