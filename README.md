# GraphGen
Graph and Tree Generation for Java-Based Algorithms

This tool is used to faciliate auto-generating graphs that you can traverse for common search algorithms and tree/graph based algorithms. 

Read in file in following structure:

```
1 -> 2, 3, 4
2 -> 5, 6
3 -> 7, 8
4 -> 9, 10
``` 

The generator will in turn create a traversable `Graph` structure that formulates the following:

![Graph](https://i.imgur.com/OQEc7QW.png)

### Lexicon

`Graph`: Contains `Node` type that contains any type of metadata

`Node`: Simple data object that holds metadata. You can set a primary key on a particular node that can be used for searching against, etc. 
