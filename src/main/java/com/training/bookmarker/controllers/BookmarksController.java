package com.training.bookmarker.controllers;

import com.training.bookmarker.models.Bookmark;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/bookmarks")
public class BookmarksController {

  @GetMapping
  public ResponseEntity<List<Bookmark>> getAll() {
    List<Bookmark> bookmarks = new ArrayList<>();
    for (int i = 0; i < 100; i++)
      bookmarks.add(
              new Bookmark((long) i, (long) 1, "Title " + i, "Description " + i,
                      "http://gooole.com.ec/" + i, LocalDateTime.now(), LocalDateTime.now()));

    return new ResponseEntity<>(bookmarks, HttpStatus.OK);
  }

}
