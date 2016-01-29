# simpleLegacyRescueKata

This kata is a simple adaptation of code found out in the field that needed to be modified but was overly complex in implementation and had no tests. It serves as a nice little teaching tool for people having their first experience with handling legacy code and getting it under test, with the need to mock out some behavior.

The objective is to get this code under test and then refactor the legacy code to a more orderly and readable state, thus making it suitable for modification.

There is a folder for each language and a build tool that will run a properly failing test approriate for the syntax in that folder.

In all languages you should be able to achieve isolated unit tests without the use of a framework for mocking.
