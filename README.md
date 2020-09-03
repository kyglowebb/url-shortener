# url-shortener
This is a Java application created in Eclipse that takes a longer url and shortens it.

The user is asked to type the url they wish to have shortened.

The user is then asked to verify they typed the correct url before converting it into a shorter url.

The longer url is given a unique string ID which is then entered into a method in order to shorten it.

Then the String ID, the longer url, and the shortened url are all displayed for the user.

The application will no longer print the shortened url after 10 attempts. 

Example:

Please enter the url you would like to have shortened:

User: https://github.com/kyleewebb7/url-shortener/edit/master/README.md

Please re-enter to verify correct url:

User: https://github.com/kyleewebb7/url-shortener/edit/master/README.md

The string id for https://github.com/kyleewebb7/url-shortener/edit/master/README.md is 125581370
Your original url was: https://github.com/kyleewebb7/url-shortener/edit/master/README.md
The generated short url is iE5B8.io

Then the user is prompted with the ability to enter a new url.
After 10 times however, the user is no longer able to enter a url and the application quits.
