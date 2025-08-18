package com.slash.lash.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ArtistSongId implements Serializable {
    @Column(name = "artist_id")
    private long artistId;
    
    @Column(name = "song_id")
    private long songId;
}
