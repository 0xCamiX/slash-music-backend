package com.slash.lash.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.slash.lash.model.ArtistsModel;
import com.slash.lash.repository.ArtistRespository;

@Service
public class ArtistService {
    private final ArtistRespository artistRespository;

    public ArtistService(ArtistRespository artistRespository) {
        this.artistRespository = artistRespository;
    }

    public ArtistsModel createArtist(ArtistsModel artist) {
        return artistRespository.save(artist);
    }

    public ArtistsModel updateArtist(ArtistsModel artist) {
        return artistRespository.save(artist);
    }

    public void deleteArtist(Long id) {
        artistRespository.deleteById(id);
    }
    
    public ArtistsModel getArtistById(Long id) {
        return artistRespository.findById(id).orElse(null);
    }

    public List<ArtistsModel> getAllArtists() {
        return artistRespository.findAll();
    }
}
