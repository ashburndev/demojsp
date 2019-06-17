5:02 AM 6/17/2019

git remote add origin git@github.com:ashburndev/demojsp.git
git push -u origin master

http://localhost:8080/examinerActivity



<html lang="en">
  <head>
    <meta charset="UTF-8">
    <title>Hello World!</title>
    <script>
      var personsAffectedListJson = '["For this calendar","For all Examiners","For all calendars"]';
      var personsAffectedMapJson = '{"For this calendar":"For this calendar","For all Examiners":"For all Examiners","For all calendars":"For all calendars"}';
      // var personsAffectedList = YAHOO.lang.JSON.parse(personsAffectedListJson);
      // var personsAffectedMap = YAHOO.lang.JSON.parse(personsAffectedMapJson);
    </script>
  </head>
  <body>
    <h2>Hello World!</h2>
    
    <form id="examinerActivity" action="/examinerActivity;jsessionid=DB47F7586E0FD2003C55EAD649545E66" method="POST">
      
        
          <select id="personsAffected" name="personsAffected"><option value="For this calendar" selected="selected">For this calendar</option><option value="For all Examiners">For all Examiners</option><option value="For all calendars">For all calendars</option></select>
        
        
      
      <br/><br/>
      <label for="firstName">first name:</label>
      <input id="firstName" name="firstName" type="text" value="John"/>
      <br/><br/>
      <label for="lastName">last name:</label>
      <input id="lastName" name="lastName" type="text" value="Smith"/>
      <br/><br/>
      <input type="submit" value="Save Changes" />
    </form>
    
  </body>
</html>




<html lang="en">
  <head>
    <meta charset="UTF-8">
    <title>Hello World!</title>
    <script>
      var personsAffectedListJson = '["For this calendar","For all Examiners","For all calendars"]';
      var personsAffectedMapJson = '{"For this calendar":"For this calendar","For all Examiners":"For all Examiners","For all calendars":"For all calendars"}';
      // var personsAffectedList = YAHOO.lang.JSON.parse(personsAffectedListJson);
      // var personsAffectedMap = YAHOO.lang.JSON.parse(personsAffectedMapJson);
    </script>
  </head>
  <body>
    <h2>Hello World!</h2>
    
    <form id="examinerActivity" action="/examinerActivity" method="POST">
      
        
        
          <input id="personsAffected" name="personsAffected" value="For this calendar" type="hidden" value="For this calendar"/>
        
      
      <br/><br/>
      <label for="firstName">first name:</label>
      <input id="firstName" name="firstName" type="text" value="John"/>
      <br/><br/>
      <label for="lastName">last name:</label>
      <input id="lastName" name="lastName" type="text" value="Smith"/>
      <br/><br/>
      <input type="submit" value="Save Changes" />
    </form>
    
  </body>
</html>





                                                                                                                                                            