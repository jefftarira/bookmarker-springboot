package com.training.bookmarker.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "bookmarks")

public class Bookmark {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String title;
  private String description;
  private String url;
  private LocalDateTime created;
  private LocalDateTime modified;

  public Bookmark(String title, String description, String url) {
    this.title = title;
    this.description = description;
    this.url = url;
  }
}
