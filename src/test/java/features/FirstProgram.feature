
Feature: Application Login
Background:
Given Setup the entries in database
When Launch the browser from config variables
And Hit the home page url on banking 




  Scenario: Admin page default Login
  Given User is  on Netbanking Landing Page
  When User  Login into Application "admin" and psssword "1234"
  Then Home Page is Displayed
  And Cards are Displayed 
  # Reusable the steps
  

  Scenario: User page default Login
  Given User is  on Netbanking Landing Page
  When User  Login into Application "user " and psssword "56789"
  Then Home Page is Displayed
  And Cards are Displayed


  Scenario Outline: User page default Login
  Given User is  on Netbanking Landing Page
  When User  Login into Application "<username>" and "<password>" 
  Then Home Page is Displayed
  And Cards are Displayed
  
  Examples:
  | username   | password  |
  | debituser  | hello110  |
  | credituser | setyu1234 |

Scenario: User page default Sign Up
  Given User is  on Practice Landing Page
  When User  Login into Application                  
     * Table:
      | shetty                   |
      | rahulshetty001@gmail.com |
      | 587765768787             |
      
  Then Home Page is Displayed
  And Cards are Displayed
   
  