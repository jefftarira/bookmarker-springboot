package com.training.bookmarker.controllers;

import com.training.bookmarker.entities.Bookmark;
import com.training.bookmarker.services.BookmarksService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookmarks")
@AllArgsConstructor
public class BookmarksController {

  private final BookmarksService bookmarksService;

  @GetMapping
  public ResponseEntity<List<Bookmark>> getAll() {
    List<Bookmark> bookmarks = bookmarksService.getAll();
    return new ResponseEntity<>(bookmarks, HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Bookmark> getSingle(@PathVariable long id) {
    Bookmark bookmark = bookmarksService.get(id);
    return new ResponseEntity<>(bookmark, HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<Bookmark> create(@RequestBody Bookmark bookmark) {
    Bookmark bookmarkSaved = bookmarksService.create(bookmark);
    return new ResponseEntity<>(bookmarkSaved, HttpStatus.CREATED);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Bookmark> delete(@PathVariable long id) {
    Bookmark deleteBookmark = bookmarksService.delete(bookmarksService.get(id));
    return new ResponseEntity<>(deleteBookmark, HttpStatus.OK);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Bookmark> update(@PathVariable long id,
                                         @RequestBody Bookmark bookmark) {
    Bookmark updateBookmark = bookmarksService.update(bookmark);
    return new ResponseEntity<>(updateBookmark, HttpStatus.OK);
  }

}
