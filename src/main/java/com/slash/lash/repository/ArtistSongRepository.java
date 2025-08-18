package com.slash.lash.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slash.lash.model.ArtistSong;
import com.slash.lash.model.ArtistSongId;

@Repository
public interface ArtistSongRepository extends JpaRepository<ArtistSong, ArtistSongId> {

    /**
     * Find all artist-song relationships by artist ID
     * @param artistId the ID of the artist
     * @return a list of artist-song relationships
     */
    List<ArtistSong> findByArtist_Id(long artistId);

    /**
     * Find all artist-song relationships by song ID
     * @param songId the ID of the song
     * @return a list of artist-song relationships
     */
    List<ArtistSong> findBySong_Id(long songId);

    /**
     * Check if a relationship exists between an artist and a song
     * @param artistId the ID of the artist
     * @param songId the ID of the song
     * @return true if the relationship exists, false otherwise
     */
    boolean existsByArtist_IdAndSong_Id(long artistId, long songId);
}
