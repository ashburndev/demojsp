package com.ashburndev.demojsp;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//   https://www.mkyong.com/spring-boot/spring-boot-hello-world-example-jsp/
//   https://www.mkyong.com/spring-mvc/spring-mvc-dropdown-box-example/
//   https://hellokoding.com/spring-boot-hello-world-example-with-jsp/
//   https://howtodoinjava.com/spring-boot/spring-boot-jsp-view-example/
//   https://docs.spring.io/spring/docs/4.2.x/spring-framework-reference/html/spring-form-tld.html
//   http://fruzenshtein.com/spring-mvc-form-select-tag/
//   https://dzone.com/articles/spring-mvc-jsp-form-tags-example
//   https://docs.spring.io/spring/docs/3.2.x/spring-framework-reference/html/view.html

@Controller
@RequestMapping("/examinerActivity")
public class ActivityController {

  @GetMapping
  public String hello(Model model,
      @RequestParam(value = "name", required = false, defaultValue = "World") String name) {
    model.addAttribute("name", name);

    ActivityCommand examinerActivity = new ActivityCommand();
    Map<String, String> personsAffectedMap = new LinkedHashMap<String, String>();  // preserves order 
    String personsAffectedListJson = "";  // use jackson to create the string
    String personsAffectedMapJson = "";  // use jackson to create the string
    List<String> personsAffectedList = 
        Arrays.asList("For this calendar", "For all Examiners", "For all calendars");
    String personsAffected = personsAffectedList.get(0);

    for (String theString : personsAffectedList) {
      System.out.println(theString);
      personsAffectedMap.put(theString, theString);
    }

    try {
      ObjectMapper mapper = new ObjectMapper();
      personsAffectedListJson = mapper.writeValueAsString(personsAffectedList);
      personsAffectedMapJson = mapper.writeValueAsString(personsAffectedMap);
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }

    System.out.println("personsAffected = " + personsAffected);
    System.out.println("personsAffectedList = " + personsAffectedList);
    System.out.println("personsAffectedMap = " + personsAffectedMap);
    System.out.println("personsAffectedListJson = " + personsAffectedListJson);
    System.out.println("personsAffectedMapJson = " + personsAffectedMapJson);

    examinerActivity.setFirstName("John");
    examinerActivity.setLastName("Smith");
    examinerActivity.setPersonsAffected(personsAffected);
    //  examinerActivity.setPersonsAffectedList(personsAffectedList);
    //  examinerActivity.setPersonsAffectedMap(personsAffectedMap);
    //  examinerActivity.setPersonsAffectedListJson(personsAffectedListJson);
    //  examinerActivity.setPersonsAffectedMapJson(personsAffectedMapJson);

    model.addAttribute("personsAffectedList", personsAffectedList);
    model.addAttribute("personsAffectedMap", personsAffectedMap);
    model.addAttribute("personsAffectedListJson", personsAffectedListJson);
    model.addAttribute("personsAffectedMapJson", personsAffectedMapJson);
    model.addAttribute("examinerActivity", examinerActivity);
    return "examinerActivity";  // the logical name of the view
  }

  //    <form:form method="POST" path="examinerActivity">

  //    <form:form method="POST" modelAttribute="examinerActivity">

  //    <form:form method="POST" commandObject="examinerActivity" commandName="command">

  //    <form:form method="POST" commandObject="examinerActivity" commandName="examinerActivity">

  //    <form:form method="POST" action="activity-result.html">
  //      <form:select path="personsAffected" items="${personsAffectedMap}" />
  //    </form:form>

  //	<form:form method="POST" commandName="activityForm">
  //      <form:select path="personsAffected" id="personsAffected" name="personsAffected" items="${personsAffectedMap}" />
  //	</form:form>	

}
