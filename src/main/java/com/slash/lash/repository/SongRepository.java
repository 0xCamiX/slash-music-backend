package com.slash.lash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slash.lash.model.SongsModel;

@Repository
public interface SongRepository extends JpaRepository<SongsModel, Long> {

}
