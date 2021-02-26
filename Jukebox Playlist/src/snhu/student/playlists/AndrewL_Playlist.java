package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class AndrewL_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> allmanTracks = new ArrayList<Song>();
    TheAllmanBrothers theAllmanBrothersBand = new TheAllmanBrothers();
	
    allmanTracks = theAllmanBrothersBand.getAllmanBrothersSongs();
	
	playlist.add(allmanTracks.get(0));
	playlist.add(allmanTracks.get(1));
	playlist.add(allmanTracks.get(2));
	
    SystemOfADown systemBand = new SystemOfADown();
	ArrayList<Song> systemTracks = new ArrayList<Song>();
    systemTracks = systemBand.getSystemSongs();
	
	playlist.add(systemTracks.get(0));
	playlist.add(systemTracks.get(1));
	
    Queen queenBand = new Queen();
	ArrayList<Song> queenTracks = new ArrayList<Song>();
    queenTracks = queenBand.getQueenSongs();
	
	playlist.add(queenTracks.get(0));
	playlist.add(queenTracks.get(1));
	playlist.add(queenTracks.get(2));
	
    return playlist;
	}
}
