package com.training.bookmarker.controllers;

import com.training.bookmarker.models.Bookmark;
import com.training.bookmarker.services.BookmarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bookmarks")
public class BookmarksController {

  private BookmarksService bookmarksService;

  @Autowired
  public void setBookmarkService(BookmarksService bookmarksService) {
    this.bookmarksService = bookmarksService;
  }

  @GetMapping
  public ResponseEntity<List<Bookmark>> getAll() {
    List<Bookmark> bookmarks = this.bookmarksService.getAll();
    return new ResponseEntity<>(bookmarks, HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Bookmark> getSingle(@PathVariable long id) {
    Bookmark bookmark = this.bookmarksService.get(id);
    return new ResponseEntity<>(bookmark, HttpStatus.OK);
  }

}
