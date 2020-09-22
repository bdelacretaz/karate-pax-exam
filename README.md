# karate-pax-exam

A minimal example using Karate to test OSGi services.

Running the tests with

    mvn clean install

Starts an OSGi framework with the Apache Felix Web Console, and tests
access via HTTP "from the outside".

This test mimics the [AcceptanceTestApiTest](https://github.com/ops4j/org.ops4j.pax.exam2/blob/master/drivers/pax-exam-acceptance/src/test/java/org/ops4j/pax/exam/acceptance/AcceptanceTestApiTest.java) from the (unreleased so far)
`pax-exam-acceptance` module, to show how to run Karate tests against
OSGi-based HTTP services.