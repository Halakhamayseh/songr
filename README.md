# songr
## Lab: 11 - Spring for Full-Stack Web Apps
###  Feature Tasks
As you work on these feature tasks, remember to consider your basic application setup. What classes should you create? How should they be related?

1. Ensure that you can run the Spring app.

2. Create a hello world route at /hello, and ensure that you can visit that route in your browser and see a rendered template come back.
3. Create a route that turns words into UPPER CASE. For instance, I should be able to visit /capitalize/hello and get back an HTML page containing the response HELLO, or I could visit /capitalize/this is Kinda Capitalized and get an HTML page containing the response THIS IS KINDA CAPITALIZED.
4. Create a basic splash page for the Songr app, available at the root route, and style it appropriately with CSS.
5. Create an Album class to act as a model in our app.
An Album has a title, an artist, a songCount, a length (in seconds), and an imageUrl that is a link to that album’s art.
6. Create a route at /albums that shows three album instances. (These will be hardcoded for today’s lab; create an array that contains three albums, and then display those three on the page.)

### Testing
 Ensure you have tested the constructor, getters, and setters for the Album class.
## Lab: 12 - Spring and REST
### Feature Tasks
1. Update your Album model so that it can be saved in a database.
An Album has a title, an artist, a songCount, a length (in seconds), and an imageUrl that is a link to that album’s art.
2. A user should be able to see information about all the albums on the site.
3. A user should be able to add albums to the site.
### Testing
We will talk more about integration testing in future lectures. For now, visually ensure that each of your routes is working. You are NOT required to write any tests for this lab.

Make sure your server fails gracefully. The server shouldn’t crash and the database shouldn’t be corrupted in any way if a user attempts to read or manipulate information that doesn’t exist
## Lab: 13 - Related Resources and Integration Testing
### Feature Tasks
1. Create a Song model.
A Song has a title, a length (in seconds), a trackNumber, and the album on which that song appears.
Ensure that the relationship between Albums and Songs is appropriately set up.
2. A user should be able to see information about all the songs on the site.
3. A user should be able to view a page with data about one particular album.
4. A user should be able to add songs to an album.
5. A user should be able to see the songs that belong to an album when looking at that album.
 #### How to run application
 use http://localhost:8080

 ### Author : Hala khamayseh