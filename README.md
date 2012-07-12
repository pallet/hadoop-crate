# hadoop-crate

Primitives to setup and configure [Apache Hadoop](http://hadoop.apache.org/)
clusters.
 
## Usage

Although you could use this crate directly, we recommend that you use
[pallet-hadoop](https://github.com/pallet/pallet-hadoop) instead,
which wraps this crate providing a higher level way of setting up
hadoop clusters. [This
article](http://palletops.com/create-hadoop-clusters-the-easy-peasy-way-wit/)
can also be used as a reference.

If you are really curious about how it works, we suggest that you
start
[here](https://github.com/pallet/pallet-hadoop/blob/master/src/pallet_hadoop/node.clj#L110). 

## Support

[On the group](http://groups.google.com/group/pallet-clj), or #pallet on freenode irc.

## Installation

This `hadoop-crate` is distributed as jars, and is available in the
[Clojars repository](http://clojars.org). If you are using `leiningen`
as your build tool, then Clojars is already the default repository,
but if you are using `maven`, you will need to add the following to your
`settings.xml`:

```xml
<repository>
  <id>clojars.org</id>
  <url>http://clojars.org/repo</url>
</repository>
```

Then you will need to add `hadoop-crate` as a dependency for your
project:

- Leiningen

    ```clojure
    [org.cloudhoist/hadoop "0.7.0-beta.2"]
    ```
- Maven
    ```xml
    <dependency>
      <groupId>org.cloudhoist</groupId>
      <artifactId>hadoop</artifactId>
      <version>0.7.0-beta.2</version>
    </dependency>
    ```

## License

Licensed under [Apache License](http://www.apache.org/licenses/) version 2.

Copyright © 2012 Hugo Duncan, Antoni Batchelli
