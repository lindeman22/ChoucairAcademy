# Autor: Jose Lindeman

  @stories

  Feature: Academy Choucair

    @scenario1
    Scenario: search for a automation course

      Given that Brandon wants to learn automation at the choucair academy
      |strUser    | strPassword |
      |1066180001 |Choucair2021*|

      When he search for the course on the choucair academy
      |strCourse  |
      |Guías Técnicas - Analista Financial|

      Then he finds the course called
      |strCourse|
      |Guías Técnicas - Analista Financial|