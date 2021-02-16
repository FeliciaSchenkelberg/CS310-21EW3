package snhu.jukebox.playlist;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;


public class Esi_Playlist {

	public LinkedList<PlayableSong> StudentPlaylist() {
		// TODO Auto-generated method stub
		LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
			ArrayList<Song> FosterTPTracks = new ArrayList<Song>();
		    FosterThePeople ftp = new FosterThePeople();
			
		    FosterTPTracks = ftp.getFTPSongs(); //getting FTP songs from FosterTPTracks
			
			playlist.add(FosterTPTracks.get(0)); //Requesting first song from FosterTP Tracks
			playlist.add(FosterTPTracks.get(1)); //Requesting second song from FosterTP Tracks
			playlist.add(FosterTPTracks.get(2)); //Requesting third song from FosterTP Tracks
			
		    KingsOfLeon KingsOfLeonBand = new KingsOfLeon();
			ArrayList<Song> KingsOfLeonTracks = new ArrayList<Song>();
		    KingsOfLeonTracks = KingsOfLeonBand.getKOLSongs();
			
			playlist.add(KingsOfLeonTracks.get(0)); //Requesting first song from KingsOfLeon Tracks
			playlist.add(KingsOfLeonTracks.get(1)); //Requesting second song from KingsOfLeon Tracks
		
			
		    return playlist;
			}
		
	}

