To login, enter the following URL: 
http://localhost:8080/springsecurity3/secure/auth/login
To logout, enter the following URL: 
http://localhost:8080/springsecurity3/secure/auth/logout

To access the common page, enter the following URL: 
http://localhost:8080/springsecurity3/secure/main/common
To access the admin page, enter the following URL: 
http://localhost:8080/springsecurity3/secure/main/admin

To access the persons page, type the following URL in the browser:
http://localhost:8080/springsecurity3/secure/persons

To access the edit page, we need to manually type the following URL in the browser:
http://localhost:8080/springsecurity3/secure/persons/edit/2
Just make sure to change the number to match the id that you want to edit.

try logging-in as john (password is admin) and as jane (password is user). 
Both users can view the list of persons. Both users can access the edit page. 
But only john can do a successful edit,