Spring/SpringMVC v3.2.1 Integration [![Build Status](https://travis-ci.org/WASdev/sample.Spring.svg?branch=master)](https://travis-ci.org/WASdev/sample.Spring)
==============

This open source integration demonstrates Spring and Spring MVC integration through a simple phonebook sample Web application deployed to Liberty.

This sample demonstrates Spring and Spring MVC integration through a simple phonebook Web application deployed to Liberty.

This sample can be installed onto runtime versions 8.5.5.0 and later.


## Running in Eclipse with Maven

1. Clone this project and import into Eclipse as an 'Existing Maven Project'.
2. Right-click the project and select **Run As > Run on Server**.
3. You should see the following in the console: `Application sample.spring started in XX.XX seconds.`

## Running in Eclipse with Gradle

1. Clone this project and import into Eclipse as an 'Existing Gradle Project'.
2. Go to Help > Eclipse Marketplace > Install Buildship Gradle Integration 2.0 
3. Go to Window > Show View > Other > Gradle Executions & Gradle Tasks
4. Go to Gradle Tasks View build/clean then build/build then liberty/libertyStart
3. You should see the following in the console: `Application sample.spring started in XX.XX seconds.`

## Running with Maven

This project can be built with [Apache Maven]. The project uses [Liberty Maven Plug-in] to automatically download and install the Liberty Java EE 7 Full Platform runtime from [Maven Central]. Liberty Maven Plug-in is also used to create, configure, and run the application on the Liberty server. 

Use the following steps to run the application with Maven:

1. Execute the full Maven build. The Liberty Maven Plug-in will download and install the Liberty runtime and create the server.
    ```bash
    $ mvn clean install
    ```

2. To run the server with the JMS application execute:
    ```bash
    $ mvn liberty:run-server
    ```
    ```
 
## Running with Gradle

This project can be built with [Gradle]. The project uses [Liberty Gradle Plug-in] to automatically download and install Liberty with Java EE 7 Full Platform runtime from [Maven Central]. Liberty Gradle Plug-in is also used to create, configure, and run the application on the Liberty server. 

Use the following steps to run the application with Gradle:

1. Execute full Gradle build. This will cause Liberty Gradle Plug-in to download and install Liberty profile server.
    ```bash
    $ gradle clean build
    ```

2. To run the server with the JMS application execute:
    ```bash
    $ gradle libertyStart
    ```
        
3. To stop the server with the JMS application execute:
    ```bash
    $ gradle libertyStop
    ```
 

In your browser, enter the URL for the application: [http://localhost:9811/sample.spring/](http://localhost:9811/sample.spring/) (where port 9811 assumes the httpEndpoint provided in the sample server.xml has not been modified).
In your browser, you should see the phone book displayed.

# Notice

© Copyright IBM Corporation 2017.

# License

```text
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
````

[Liberty Maven Plug-in]: https://github.com/WASdev/ci.maven
[Liberty Gradle Plug-in]: https://github.com/WASdev/ci.gradle

[Apache Maven]: http://maven.apache.org
[Gradle]: https://gradle.org/

[Maven Central]: https://search.maven.org/


