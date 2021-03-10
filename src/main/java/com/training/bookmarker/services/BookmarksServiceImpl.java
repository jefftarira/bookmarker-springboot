package com.training.bookmarker.services;

import com.training.bookmarker.entities.Bookmark;
import com.training.bookmarker.repository.BookmarksRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class BookmarksServiceImpl implements BookmarksService {

  private final BookmarksRepository bookmarksRepository;

  @Override
  public List<Bookmark> getAll() {
    return bookmarksRepository.findAll();
  }

  @Override
  public Bookmark get(Long id) {
    return bookmarksRepository
            .findById(id)
            .orElseThrow(() -> new IllegalStateException("bookmark not found"));
  }

  @Override
  @Transactional
  public Bookmark create(Bookmark bookmark) {
    bookmark.setCreated(LocalDateTime.now());
    return bookmarksRepository.save(bookmark);
  }

  @Override
  public Bookmark update(Bookmark bookmark) {
    return null;
  }

  @Override
  public Bookmark delete(Bookmark bookmark) {
    return null;
  }
}
