package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Cassidy_Playlist { 										//creating my own playlist - CY
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>(); //linking AliGatie to playlist - CY
	ArrayList<Song> AliGatieTracks = new ArrayList<Song>();
    AliGatie AliGatieBand = new AliGatie();
	
    AliGatieTracks = AliGatieBand.getAliGatieSongs();					//calling AliGatieSongs from AliGatieBand - CY
	
	playlist.add(AliGatieTracks.get(0));								//calling first song from AliGatieTracks - CY
	playlist.add(AliGatieTracks.get(1));								//calling second song from AliGatieTracks - CY
	
	
    Maroon5 Maroon5Band = new Maroon5();								//linking Maroon5 to playlist - CY
	ArrayList<Song> Maroon5Tracks = new ArrayList<Song>();
    Maroon5Tracks = Maroon5Band.getMaroon5Songs();
	
	playlist.add(Maroon5Tracks.get(0));									//calling first song from Maroon5Tracks - CY
	playlist.add(Maroon5Tracks.get(1));									//calling second song from Maroon5Tracks - CY
	playlist.add(Maroon5Tracks.get(2));									//calling third song from Maroon5Tracks - CY
	
    Queen QueenBand = new Queen();										//linking QueenBand from another classmate to playlist - CY
	ArrayList<Song> QueenTracks = new ArrayList<Song>();
    QueenTracks = QueenBand.getQueenSongs();
	
	playlist.add(QueenTracks.get(0));									//calling first song from QueenTracks - CY

    return playlist;
	}
}
