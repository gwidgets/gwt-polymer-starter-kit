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

## License

This is the license published by the polymer-starter-kit project team: 

                
                Everything in this repo is BSD style license unless otherwise specified.
                Copyright (c) 2015 The Polymer Authors. All rights reserved.
                Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
                
                Redistributions of source code must retain the above copyright
                notice, this list of conditions and the following disclaimer.
                Redistributions in binary form must reproduce the above
                copyright notice, this list of conditions and the following disclaimer
                in the documentation and/or other materials provided with the
                distribution.
                Neither the name of Google Inc. nor the names of its
                contributors may be used to endorse or promote products derived from
                this software without specific prior written permission.

                THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS &quot;AS IS&quot; AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

## GWT version

The project uses version 2.8.0-rc1 