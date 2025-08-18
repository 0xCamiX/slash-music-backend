package com.slash.lash.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.slash.lash.model.SongsModel;

@Repository
public interface SongRepository extends JpaRepository<SongsModel, Long> {

    /**
     * Find songs by name
     * @param name the name of the song
     * @return a list of songs
     */
    @Query("SELECT s FROM SongsModel s WHERE s.title = :name")
    List<SongsModel> findByTitle(@Param("name") String name);

    /**
     * Find songs by artist name
     * @param artist the artist name
     * @return a list of songs
     */
    @Query("SELECT s FROM SongsModel s WHERE s.artist = :artist")
    List<SongsModel> findByArtist(@Param("artist") String artist);

    /**
     * Find songs by album
     * @param album the album name
     * @return a list of songs
     */
    @Query("SELECT s FROM SongsModel s WHERE s.album = :album")
    List<SongsModel> findByAlbum(@Param("album") String album);

    /**
     * Find songs by genre
     * @param genre the genre
     * @return a list of songs
     */
    @Query("SELECT s FROM SongsModel s WHERE s.genre = :genre")
    List<SongsModel> findByGenre(@Param("genre") String genre);

    /**
     * Find songs by duration
     * @param duration the duration in seconds
     * @return a list of songs
     */
    @Query("SELECT s FROM SongsModel s WHERE s.duration = :duration")
    List<SongsModel> findByDuration(@Param("duration") Integer duration);

    /**
     * Find songs by creation date
     * @param createdAt the creation date
     * @return a list of songs
     */
    @Query("SELECT s FROM SongsModel s WHERE s.createdAt = :createdAt")
    List<SongsModel> findByCreatedAt(@Param("createdAt") LocalDateTime createdAt);

    /**
     * Find songs by update date
     * @param updatedAt the update date
     * @return a list of songs
     */
    @Query("SELECT s FROM SongsModel s WHERE s.updatedAt = :updatedAt")
    List<SongsModel> findByUpdatedAt(@Param("updatedAt") LocalDateTime updatedAt);
}
