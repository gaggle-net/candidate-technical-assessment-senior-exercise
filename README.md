# Overview
The application runs a SpringBoot CRUD server backed by DynamoDb.
You can start the web service locally by running the SpringbootDynamoDbCrudApplication class. The default port is 8080.

# Endpoints
Once started, you can use Postman or equivalent to call the following endpoints:

##	POST /persons
		Creates a new Person and returns the new record with an auto-generated ID
		POST data:
			{
				"name": "Sample Name"
			}
		Sample result:
			{
				"id": "6cddb629-36c7-4111-b7e9-2a8cb51136a9",
				"name": "Sample Name",
				"movies": null
			}
			
##	GET /persons/{id}
		Locates an existing Person by the unique id
		Sample URL: /persons/6cddb629-36c7-4111-b7e9-2a8cb51136a9
		Sample result:
			{
				"id": "6cddb629-36c7-4111-b7e9-2a8cb51136a9",
				"name": "Sample Name",
				"movies": null
			}
			
##	GET /persons
		Returns a list of all Persons in the DB
		Sample result:
			[
				{
					"id": "6de2ad6e-4f7f-4e7b-b106-a3a8c1ef2e47",
					"name": "Rainier Wolfcastle",
					"movies": [
						"McBain",
						"McBain II: You Have the Right to Remain Dead",
						"McBain III",
						"McBain IV",
						"Radioactive Man"
					]
				},
				...
				{
					"id": "6cddb629-36c7-4111-b7e9-2a8cb51136a9",
					"name": "Sample Name",
					"movies": null
				}
			]
			
##	GET /persons/search/{searchTerm}
		Returns a list of all Persons whose name contains the searchTerm (case-independent)
		Sample URL: persons/search/ca
		Sample result:
			[
				{
					"id": "6de2ad6e-4f7f-4e7b-b106-a3a8c1ef2e47",
					"name": "Rainier Wolfcastle",
					"movies": [
						"McBain",
						"McBain II: You Have the Right to Remain Dead",
						"McBain III",
						"McBain IV",
						"Radioactive Man"
					]
				},
				{
					"id": "559e449a-b2e7-4f0b-9d24-0d7fdd476c77",
					"name": "Antonio Calculon",
					"movies": [
						"All My Circuits"
					]
				}
			]
			
##	PUT /persons/{id}
		Updates an existing Person using the unique id
		Sample URL: /persons/6cddb629-36c7-4111-b7e9-2a8cb51136a9
		POST data:
			{
				"id": "6cddb629-36c7-4111-b7e9-2a8cb51136a9",
				"name": "Updated Name",
				"movies": [ "Some movie" ]
			}
		Sample result:
			6cddb629-36c7-4111-b7e9-2a8cb51136a9
			
##	DELETE /persons/{id}
		Deletes an existing Person record from the database
		Sample URL: /persons/6cddb629-36c7-4111-b7e9-2a8cb51136a9
		Sample result:
			Person deleted successfully:: 6cddb629-36c7-4111-b7e9-2a8cb51136a9

# Testing
End-to-end tests of the PersonController are located in the solution under test\java
From the project view, right-click the PersonControllerTests class and select Run PersonControllerTests