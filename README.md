The example project for Flyweight Pattern

<div align="center">
    <img src="./assets/images/hello_world.png"/>
</div>

## Prerequisites
Make sure following software is installed on your PC
- [JDK 17](https://www.oracle.com/java/technologies/downloads/#java17) or later

## Project structure
```
.
├── flyweight-pattern
│   ├── pom.xml
│   ...
├── pom.xml
|
└── README.md
```

## Start project

```shell
$ ./mvnw clean package
$ java -jar ./flyweight-pattern/target/flyweight-pattern-0.0.1-SNAPSHOT.jar
10:29:47.762 [main] INFO io.github.huypva.flyweightpattern.Main -- Create a flyweight.
10:29:47.764 [main] INFO io.github.huypva.flyweightpattern.ConcreteFlyweight -- Conduct ConcreteFlyweight key1.
10:29:47.765 [main] INFO io.github.huypva.flyweightpattern.ConcreteFlyweight -- ConcreteFlyweight key1 operate.
10:29:47.765 [main] INFO io.github.huypva.flyweightpattern.Main -- Use the flyweight existed
10:29:47.765 [main] INFO io.github.huypva.flyweightpattern.ConcreteFlyweight -- ConcreteFlyweight key1 operate.
```

## Contribute
The code is open sourced. I encourage fellow developers to contribute and help improve it!

- Fork it
- Create your feature branch (git checkout -b new-feature)
- Ensure all tests are passing
- Commit your changes (git commit -am 'Add some feature')
- Push to the branch (git push origin my-new-feature)
- Create new Pull Request

## Reference