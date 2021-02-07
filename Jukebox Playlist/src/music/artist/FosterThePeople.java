package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class FosterThePeople {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public FosterThePeople() {
    }
    
    public ArrayList<Song> getFosterThePeopleSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Imagination", "Foster The People");            //Create a song
         Song track2 = new Song("Waste", "Foster The People");       			//Create another song
         Song track3 = new Song("Pick U Up", "Foster The People");				//Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Foster The People
         this.albumTracks.add(track2);                                          //Add the second song to song list for Foster The People
         this.albumTracks.add(track3);                                          //Add the third song to song list for Foster The People
         return albumTracks;                                                    //Return the songs for Foster The People in the form of an ArrayList
    }
}
