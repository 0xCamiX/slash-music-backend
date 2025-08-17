package com.slash.lash.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class ArtistSongId implements Serializable {
    private long artistId;
    private long songId;
}
