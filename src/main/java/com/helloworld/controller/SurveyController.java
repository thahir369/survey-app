package com.helloworld.controller;


import com.helloworld.entity.Survey;
import com.helloworld.service.SurveyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SurveyController {

  private final SurveyService surveyService;

  public SurveyController(SurveyService surveyService) {
    this.surveyService = surveyService;
  }


  @GetMapping("/home")
  String home(){
    return "Welcome to survey-app homePage!";
  }
  @PostMapping("/submit")
  String submitSurvey(@RequestBody Survey survey){
   return surveyService.submitSurvey(survey);
  }

  @GetMapping("/surveydetails")
  List<Survey> getAllSurveyDetails(){
    return surveyService.getAllSurveyDetails();
  }
}
