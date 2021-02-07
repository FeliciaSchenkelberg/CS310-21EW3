package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class AugustBurnsRed {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public ImagineDragons() {
    }
    
    public ArrayList<Song> getImagineDragonsSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                           //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Meddler", "August Burns Red");         //Create a song
         Song track2 = new Song("Marianas Trench", "August Burns Red");      //Create another song
         Song track3 = new Song("Marathon", "August Burns Red");           //Create a third song
         this.albumTracks.add(track1);                                  //Add the first song to song list 
         this.albumTracks.add(track2);                                  //Add the second song to song list  
         this.albumTracks.add(track3);                                  //Add the third song to song list
         return albumTracks;                                            //Return the songs for in the form of an ArrayList
    }
}

