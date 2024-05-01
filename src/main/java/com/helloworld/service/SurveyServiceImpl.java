package com.helloworld.service;


import com.helloworld.entity.Survey;
import com.helloworld.repository.SurveyRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


@Service
public class SurveyServiceImpl implements SurveyService{


  private final SurveyRepository surveyRepository;

  public SurveyServiceImpl(SurveyRepository surveyRepository) {
    this.surveyRepository = surveyRepository;
  }

  @Override
  public String submitSurvey(Survey survey) {
    Integer totalRating=survey.getQuestion1Rating()+survey.getQuestion2Rating()
        +survey.getQuestion3Rating()+survey.getQuestion4Rating()+survey.getQuestion5Rating();
    survey.setAverageRating(totalRating/5.0);
    survey.setSurveyTime(LocalDateTime.now());
    surveyRepository.save(survey);
    return "Thanks for completing survey";
  }

  @Override
  public List<Survey> getAllSurveyDetails() {
    return surveyRepository.findAll();
  }
}
