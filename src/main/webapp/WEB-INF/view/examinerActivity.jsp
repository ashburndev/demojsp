<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
  <head>
    <meta charset="UTF-8">
    <title>Hello ${name}!</title>
    <script>
      var personsAffectedListJson = '${personsAffectedListJson}';
      var personsAffectedMapJson = '${personsAffectedMapJson}';
      // var personsAffectedList = YAHOO.lang.JSON.parse(personsAffectedListJson);
      // var personsAffectedMap = YAHOO.lang.JSON.parse(personsAffectedMapJson);
    </script>
  </head>
  <body>
    <h2>Hello ${name}!</h2>
    
    <form:form method="POST" modelAttribute="examinerActivity">
      <form:select path="personsAffected" items="${personsAffectedMap}" />
      <br/><br/>
      <form:label path="firstName">first name:</form:label>
      <form:input path="firstName"/>
      <br/><br/>
      <form:label path="lastName">last name:</form:label>
      <form:input path="lastName"/>
      <br/><br/>
      <input type="submit" value="Save Changes" />
    </form:form>
    
  </body>
</html>