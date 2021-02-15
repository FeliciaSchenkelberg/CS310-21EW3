package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class Counterparts {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Counterparts() {
    }
    
    public ArrayList<Song> getCounterpartsSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                           //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Arms Like Teeth", "Counterparts");         //Create a song
         Song track2 = new Song("Ocean of Another", "Counterparts");      //Create another song
         Song track3 = new Song("Wings of Nightmares", "Counterparts");           //Create a third song
         this.albumTracks.add(track1);                                  //Add the first song to song list 
         this.albumTracks.add(track2);                                  //Add the second song to song list  
         this.albumTracks.add(track3);                                  //Add the third song to song list 
         return albumTracks;                                            //Return the songs in the form of an ArrayList
    }
}

