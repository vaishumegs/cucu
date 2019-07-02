Feature: Shout

  In order to send location-sensitive messages to people nearby
  As a shouter
  I want to broadcast messages to people near me

  Rules:
    - broadcast to all users
    - don't worry about proximity yet

  To do:
    - only shout to people within a certain distance

  
  Scenario: Listener hears a message
    Given Lucy is 10 meters away from Sean
    When Sean shouts "Free Coffee!"
    Then Lucy hears Sean's message


 



