Feature: Create and Read persons ...

  Background:
    * url baseUrl
    * def path = '/api/multipart'


  Scenario: multipart test
    And def f1 = '<http://example1.com/Thing>  <http://www.w3.org/1999/02/22-rdf-syntax-ns#type>  <http://www.w3.org/2002/07/owl#Class>.'
    And def f2 = '<http://example2.com/Thing>  <http://www.w3.org/1999/02/22-rdf-syntax-ns#type>  <http://www.w3.org/2002/07/owl#Class>.'
    And multipart file files = { value: "#(f1)", filename: "org-emp-img.ttl", contentType: 'text/turtle' }
    And multipart file files = { value: "#(f2)", filename: "prefix-only.ttl" , contentType: 'text/turtle'}
    And multipart field baseIRIForData = 'http://example.com/'
    And multipart field baseIRIForSchema = 'http://example.com/'
    And multipart field defaultLanguageCode = 'en'
    And multipart field enableDataReset = 'YES'
    And multipart field idSetup = 'readOnly'
    And multipart field dryRun = 'true'
    And multipart field existingConfiguration = 'wipe'
    And path path
    When method post

    Then status 200
