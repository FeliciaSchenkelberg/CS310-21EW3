package snhu.jukebox.playlist.tests;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import music.artist.*;
import snhu.jukebox.playlist.Song;

public class JukeboxTest {

	@Test
	public void testGetBeatlesAlbumSize() throws NoSuchFieldException, SecurityException {
		 TheBeatles theBeatlesBand = new TheBeatles();
		 ArrayList<Song> beatlesTracks = new ArrayList<Song>();
		 beatlesTracks = theBeatlesBand.getBeatlesSongs();
		 assertEquals(2, beatlesTracks.size());
	}
	
	@Test
	public void testGetImagineDragonsAlbumSize() throws NoSuchFieldException, SecurityException {
		 ImagineDragons imagineDragons = new ImagineDragons();
		 ArrayList<Song> imagineDragonsTracks = new ArrayList<Song>();
		 imagineDragonsTracks = imagineDragons.getImagineDragonsSongs();
		 assertEquals(3, imagineDragonsTracks.size());
	}
	
	@Test
	public void testGetAdelesAlbumSize() throws NoSuchFieldException, SecurityException {
		 Adele adele = new Adele();
		 ArrayList<Song> adelesTracks = new ArrayList<Song>();
		 adelesTracks = adele.getAdelesSongs();
		 assertEquals(3, adelesTracks.size());
	}
	
	// added test case for artist 'Shinedown'
	// NOTE: please update song size if added songs - KS
	// author(s): Katie Stapleton
	@Test
	public void testGetShinedownAlbumSize() throws NoSuchFieldException, SecurityException {
		 Shinedown shinedown = new Shinedown();
		 ArrayList<Song> shinedownTracks = new ArrayList<Song>();
		 shinedownTracks = shinedown.getShinedownSongs();
		 assertEquals(3, shinedownTracks.size());
	}
	
	// added test case for artist 'Disturbed'
	// NOTE: please update song size if added songs - KS
	// author(s): Katie Stapleton
	@Test
	public void testGetDisturbedAlbumSize() throws NoSuchFieldException, SecurityException {
		 Disturbed disturbed = new Disturbed();
		 ArrayList<Song> disturbedTracks = new ArrayList<Song>();
		 disturbedTracks = disturbed.getDisturbedSongs();
		 assertEquals(3, disturbedTracks.size());
	}
	
	@Test
	public void testGetNineInchNailsAlbumSize() throws NoSuchFieldException, SecurityException {
		 NineInchNails nineInchNails = new NineInchNails();
		 ArrayList<Song> nineInchNailsTracks = new ArrayList<Song>();
		 nineInchNailsTracks = nineInchNails.getNINSongs();
		 assertEquals(3, nineInchNailsTracks.size());
	}
	
	
}
