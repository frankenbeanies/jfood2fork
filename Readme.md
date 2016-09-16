jfood2fork
==========

Java Library for the [Food2Fork API](http://food2fork.com/about/api)

Installation
------------

Either download the [latest stable release](https://github.com/frankenbeanies/jfood2fork/releases), or clone and compile the repository. This project is dependent on [genson](https://github.com/owlike/genson) which will need to be downloaded if you choose to compile the library yourself.

Usage
=====

Food2Fork(string apiKey)
------------------------

Simply create a new Food2Fork object, passing your API Key to the constructor. You can get an API Key at [Food2Fork's API Portal](http://food2fork.com/about/api)

```java
Food2Fork api = new Food2Fork("YOUR_API_KEY_HERE");
```

Food2Fork.getRecipe(String id)
------------------------------

Get a Recipe object by id. 

(input)
```java
Recipe recipe = api.getRecipe("29159");
```

Food2Fork.search(String query, char sort, int page)
---------------------------------------------------

Get a list of recipes by querying the Food2Fork database. Each query returns a maximum
of thirty results. 

query - Your search terms

sort - How to sort the results. 'r' sorts by rating, 't' sorts by trending. 

page - Each requests returns a maximum of 30 results. In order to get more, increment the page parameter. 

```java
SearchResults results = api.search("Ham and Cheese", 'r', 2);
```

License
-------

This library can be used for commerical and non-commerical purposes [in compliance with the guidelines set forth by Food2Fork](http://food2fork.com/about/api).