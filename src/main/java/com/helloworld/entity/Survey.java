package com.helloworld.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Survey {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer surveyId;

  private LocalDateTime surveyTime;

  private String userEmail;

  private String mobile;

  private Integer question1Rating;

  private Integer question2Rating;

  private Integer question3Rating;

  private Integer question4Rating;

  private Integer question5Rating;

  private Double averageRating;

}
