package com.slash.lash.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.slash.lash.model.SongsModel;
import com.slash.lash.repository.SongRepository;

@Service
public class SongService {

    private final SongRepository songRepository;

    public SongService(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public SongsModel createSong(SongsModel song) {
        return songRepository.save(song);
    }

    public SongsModel updateSong(SongsModel song) {
        return songRepository.save(song);
    }

    public void deleteSong(Long id) {
        songRepository.deleteById(id);
    }

    public SongsModel getSongById(Long id) {
        return songRepository.findById(id).orElse(null);
    }
    
    public List<SongsModel> getAllSongs() {
        return songRepository.findAll();
    }
}
