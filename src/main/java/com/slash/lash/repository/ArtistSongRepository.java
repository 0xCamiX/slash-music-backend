package com.slash.lash.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.slash.lash.model.ArtistSongId;
import com.slash.lash.model.SongsModel;

@Repository
public interface ArtistSongRepository extends JpaRepository<ArtistSongId, Long> {

    /**
     * Find a song by a name, otherwhise returns an empty list
     * @param name the name of the song
     * @return a list of songs
     */
    @Query("SELECT s FROM SongsModel s WHERE s.name = :name")
    List<SongsModel> findByName(@Param("name") String name);

    /**
     * Find a song by a artist, otherwhise returns an empty list
     * @param artist the artist of the song
     * @return a list of songs
     */
    @Query("SELECT s FROM SongsModel s WHERE s.artist = :artist")
    List<SongsModel> findByArtist(@Param("artist") String artist);

    /**
     * Find a song by a album, otherwhise returns an empty list
     * @param album the album of the song
     * @return a list of songs
     */
    @Query("SELECT s FROM SongsModel s WHERE s.album = :album")
    List<SongsModel> findByAlbum(@Param("album") String album);

    /**
     * Find a song by a genre, otherwhise returns an empty list
     * @param genre the genre of the song
     * @return a list of songs
     */
    @Query("SELECT s FROM SongsModel s WHERE s.genre = :genre")
    List<SongsModel> findByGenre(@Param("genre") String genre);

    /**
     * Find a song by a duration, otherwhise returns an empty list
     * @param duration the duration of the song
     * @return a list of songs
     */
    @Query("SELECT s FROM SongsModel s WHERE s.duration = :duration")
    List<SongsModel> findByDuration(@Param("duration") Integer duration);

    /**
     * Find a song by a created_at, otherwhise returns an empty list
     * @param createdAt the created_at of the song
     * @return a list of songs
     */
    @Query("SELECT s FROM SongsModel s WHERE s.createdAt = :createdAt")
    List<SongsModel> findByCreatedAt(@Param("createdAt") LocalDateTime createdAt);

    /**
     * Find a song by a updated_at, otherwhise returns an empty list
     * @param updatedAt the updated_at of the song
     * @return a list of songs
     */
    @Query("SELECT s FROM SongsModel s WHERE s.updatedAt = :updatedAt")
    List<SongsModel> findByUpdatedAt(@Param("updatedAt") LocalDateTime updatedAt);

}
