package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class TestFelicia_Playlist {

	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> beatlesTracks = new ArrayList<Song>();
	TheBeatles theBeatles = new TheBeatles();
	beatlesTracks = theBeatles.getBeatlesSongs();
	
	playlist.add(beatlesTracks.get(0));
	playlist.add(beatlesTracks.get(1));
	
	ArrayList<Song> queenTracks = new ArrayList<Song>();
	Queen queen = new Queen();
	queenTracks = queen.getQueenSongs();
	
	playlist.add(queenTracks.get(0));
	playlist.add(queenTracks.get(1));
	playlist.add(queenTracks.get(2));
	
	
	ArrayList<Song> adeleTracks = new ArrayList<Song>();
	Adele adele = new Adele();
	adeleTracks = adele.getAdelesSongs();
	
	playlist.add(adeleTracks.get(0));
	playlist.add(adeleTracks.get(1));
	playlist.add(adeleTracks.get(2));
	
	
	return playlist;
	}
}