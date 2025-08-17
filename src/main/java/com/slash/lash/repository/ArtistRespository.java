package com.slash.lash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slash.lash.model.ArtistsModel;

@Repository
public interface ArtistRespository extends JpaRepository<ArtistsModel, Long> {

}
