package com.helloworld.service;

import com.helloworld.entity.Survey;

import java.util.List;

public interface SurveyService {

  String submitSurvey(Survey survey);

  List<Survey> getAllSurveyDetails();
}
