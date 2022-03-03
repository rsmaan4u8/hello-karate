Feature: repeat

  Scenario: run same multipart request many times
    * def resetResult = karate.call('classpath:karate/person/test.feature')
    * def resetResult = karate.call('classpath:karate/person/test.feature')
    * def resetResult = karate.call('classpath:karate/person/test.feature')
    * def resetResult = karate.call('classpath:karate/person/test.feature')
    * def resetResult = karate.call('classpath:karate/person/test.feature')
    * def resetResult = karate.call('classpath:karate/person/test.feature')
    * def resetResult = karate.call('classpath:karate/person/test.feature')
    * def resetResult = karate.call('classpath:karate/person/test.feature')
    * def resetResult = karate.call('classpath:karate/person/test.feature')
    * def resetResult = karate.call('classpath:karate/person/test.feature')
    * def resetResult = karate.call('classpath:karate/person/test.feature')
