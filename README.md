## Overview

gwt-polymer-starter kit is an adaptation of the [Polymer Starter Kit](https://github.com/PolymerElements/polymer-starter-kit) developed by the Polymer team to GWT. It is a starting point for developing Web applications using Polymer. This adaptation uses GWT, Vaadin's [gwt-polymer-elements](https://github.com/vaadin/gwt-polymer-elements), and [Maven GWT Plugin](https://github.com/gwt-maven-plugin/gwt-maven-plugin) as a build tool.  

## Building and Running

* Dev Mode:

  
Before the first run and after each clean
```sh
mvn package gwt:run
```
after the first run, there is no need for mvn package
```sh
mvn gwt:run
```

* Production:

```sh
mvn clean gwt:compile package
```

## Browser Histroy management

The application uses GWT Activities and Places to handle routing and section change.  

## Dependency Injection 

There are two versions so far. The version that uses DI is under the directory gwt-polymer-starter-kit-with-di.  Google Dagger 2 is used for dependency injection, as GIN is outdated and not maintained anymore. Annotations are automatically processed after running mvn compile.

## GWT version

The project uses version 2.8.1