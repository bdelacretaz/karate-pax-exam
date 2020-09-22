# ----------------------------------------------------------------------------
Feature: Basic test of an HTTP service provided running in an OSGi framework
# ----------------------------------------------------------------------------

# ----------------------------------------------------------------------------
Background:
# ----------------------------------------------------------------------------
    * url baseURL

# ----------------------------------------------------------------------------
Scenario: URL that requires credentials returns 401
# ----------------------------------------------------------------------------
    Given path "system/console"
    When method get
    Then status 401

# ----------------------------------------------------------------------------
Scenario: non-existing URL, 404
# ----------------------------------------------------------------------------
    Given path "something/else"
    When method get
    Then status 404
    
    # Ok, ok, not the most sensible test to run
    Then match response contains "Powered by Jetty"