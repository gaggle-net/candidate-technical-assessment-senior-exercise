# Take Home Challenge Level (Senior-Level)

## Overview
This exercise is meant to showcase your technical implementation & design abilities.

Please implement the following set of requirements. It is expected that you will create a repository in GitHub and share the link with us when complete.


## Functional Requirements

For the purposes of the exercise, pretend you're on a team working on a new website that customers can use to look up information about movies.  Other team members are handling the front end, but you've been given the following task:

* We need to store a catalog of People.  Each person needs a unique ID, name, and what movies they worked on.  
* Create a web service that allows for two operations: searching for a person by either the unique ID, or by their name.  Partial name search should work, so if the a Person's full name is "Bruce Wayne", then it should be reasonable for the function to return this result given any of the following search strings: "bru", "Bruce", "Wayne", "Bruce Wayne", etc.
* Both the inputs and outputs of these operations should be formatted in JSON.


## Non-Functional Requirements

* Include documentation about your development environment and instructions on how to run your program.
* Include tests and instructions on how to run the tests.
* The assignment need only execute from a local machine, and there are no requirements to deploy the implementation anywhere else.
* Unless otherwise specified, feel free to use the language, frameworks, or technogies of your choice, but be prepared to discuss why you chose what you did.
* For the purposes of this task, you don't need to worry about updating the data, but it should be updatable - lots of new movies come out every year!
* Bonus: Leverage dependency injection.


## Some Example Data

(You're not required to use this data, but if you need some test data you can use this to get started.)

- Troy McClure starred in "Earwigs: Eww!", "Man vs. Nature: The Road to Victory", "McBain IV", and "The Contrabulous Fabtraption of Professor Horatio Hufnagel".
- Rainier Wolfcastle starred in "McBain" 1–4, and "Radioactive Man".
- Steve Zissou directed "The Jaguar Shark".
- Antonio Calculon, Sr stars in "All My Circuits".
