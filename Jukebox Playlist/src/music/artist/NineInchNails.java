package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class NineInchNails {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public NineInchNails() {
    }
    
    public ArrayList<Song> getNINSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                           //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Head Like A Hole", "Nine Inch Nails"); //Create a song
         Song track2 = new Song("Down In It", "Nine Inch Nails");       //Create another song
         Song track3 = new Song("Kinda I Want To", "Nine Inch Nails");  //Create a third song
         this.albumTracks.add(track1);                                  //Add the first song to song list
         this.albumTracks.add(track2);                                  //Add the second song to song list
         this.albumTracks.add(track3);                                  //Add the third song to song list
         return albumTracks;                                            //Return the songs for Nine Inch Nails in the form of an ArrayList
    }
}