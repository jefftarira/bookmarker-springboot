package com.training.bookmarker.repository;

import com.training.bookmarker.entities.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookmarksRepository extends JpaRepository<Bookmark, Long> {

  @Override
  List<Bookmark> findAll();

  @Override
  Optional<Bookmark> findById(Long id);


}
