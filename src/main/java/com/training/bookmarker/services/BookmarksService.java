package com.training.bookmarker.services;

import com.training.bookmarker.entities.Bookmark;

import java.util.List;

public interface BookmarksService {

  List<Bookmark> getAll();

  Bookmark get(Long id);

  Bookmark create(Bookmark bookmark);

  Bookmark update(Bookmark bookmark);

  Bookmark delete(Bookmark bookmark);

}
