package com.training.bookmarker.services;

import com.training.bookmarker.models.Bookmark;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

@Service
public class DummyBookmarkService implements BookmarksService {
  private final List<Bookmark> bookmarks = new ArrayList<>();


  public DummyBookmarkService() {
    this.bookmarks.addAll(
            LongStream.range(0, 100)
                    .mapToObj(i -> new Bookmark(i, (long) 1, "Title " + i, "Description " + i,
                            "http://gooole.com.ec/" + i, LocalDateTime.now(), LocalDateTime.now()))
                    .collect(Collectors.toList())
    );
  }

  public List<Bookmark> getAll() {
    return this.bookmarks;
  }

  @Override
  public Bookmark get(Long id) {
    return this.bookmarks.get(id.intValue());
  }

  @Override
  public Bookmark create(Bookmark bookmark) {
    return null;
  }

  @Override
  public Bookmark update(Bookmark bookmark) {
    this.bookmarks.set(bookmark.getId().intValue(), bookmark);
    return bookmark;
  }

  @Override
  public Bookmark delete(Bookmark bookmark) {
    this.bookmarks.remove(bookmark.getId().intValue());
    return bookmark;
  }

}
