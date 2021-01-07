package com.training.bookmarker.models;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Bookmark implements Serializable {
  private Long id;
  private Long userId;
  private String title;
  private String description;
  private String url;
  private LocalDateTime created;
  private LocalDateTime modified;

  public Bookmark() {
  }

  public Bookmark(Long id, Long userId, String title, String description, String url, LocalDateTime created,
                  LocalDateTime modified) {
    this.id = id;
    this.userId = userId;
    this.title = title;
    this.description = description;
    this.url = url;
    this.created = created;
    this.modified = modified;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public LocalDateTime getCreated() {
    return created;
  }

  public void setCreated(LocalDateTime created) {
    this.created = created;
  }

  public LocalDateTime getModified() {
    return modified;
  }

  public void setModified(LocalDateTime modified) {
    this.modified = modified;
  }
}
