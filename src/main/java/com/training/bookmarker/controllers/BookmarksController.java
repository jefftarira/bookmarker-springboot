package com.training.bookmarker.controllers;

import com.training.bookmarker.models.Bookmark;
import com.training.bookmarker.services.BookmarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

  @DeleteMapping("/{id}")
  public ResponseEntity<Bookmark> delete(@PathVariable long id) {
    Bookmark deleteBookmark = this.bookmarksService.delete(this.bookmarksService.get(id));
    return new ResponseEntity<>(deleteBookmark, HttpStatus.OK);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Bookmark> update(@PathVariable long id,
                                         @RequestBody Bookmark bookmark) {
    Bookmark updateBookmark = this.bookmarksService.update(bookmark);
    return new ResponseEntity<>(updateBookmark, HttpStatus.OK);
  }


}
