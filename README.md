Spring/SpringMVC v3.2.1 Integration [![Build Status](https://travis-ci.org/WASdev/sample.Spring.svg?branch=master)](https://travis-ci.org/WASdev/sample.Spring)
==============

This open source integration demonstrates Spring and Spring MVC integration through a simple phonebook sample Web application deployed to Liberty.

This sample demonstrates Spring and Spring MVC integration through a simple phonebook Web application deployed to Liberty.

This sample can be installed onto runtime versions 8.5.5.0 and later.



## Maven
### Running in Eclipse with Maven

1. Clone this project and import into Eclipse as an 'Existing Maven Project'.
2. Right-click the project and select **Run As > Run on Server**.
3. You should see the following in the console: `Application sample.spring started in XX.XX seconds.`

### Running with Maven command-line

This project can be built with [Apache Maven]. The project uses [Liberty Maven Plug-in] to automatically download and install the Liberty Java EE 7 Full Platform runtime from [Maven Central]. Liberty Maven Plug-in is also used to create, configure, and run the application on the Liberty server. 

Use the following steps to run the application with Maven:

1. Execute the full Maven build. The Liberty Maven Plug-in will download and install the Liberty runtime and create the server.
    ```bash
    $ mvn clean install
    ```

2. To run the server with the Spring application execute:
    ```bash
    $ mvn liberty:run-server
    ```

## Gradle
### Running in Eclipse with Gradle
1. Go to Help > Eclipse Marketplace > Install Buildship Gradle Integration 2.0.
2. Clone this project and import into Eclipse as an 'Existing Gradle Project'.
3. Go to Window > Show View > Other > Gradle Executions & Gradle Tasks.
4. Go to Gradle Tasks view and run clean in build folder, then build in build folder, then libertyStart in liberty folder.
5. You should see the following in the console: `Application sample.spring started in XX.XX seconds.`

 
### Running with Gradle command-line

This project can be built with [Gradle]. The project uses [Liberty Gradle Plug-in] to automatically download and install Liberty with Java EE 7 Full Platform runtime from [Maven Central]. Liberty Gradle Plug-in is also used to create, configure, and run the application on the Liberty server. 

Use the following steps to run the application with Gradle:

1. Execute full Gradle build. This will cause Liberty Gradle Plug-in to download and install Liberty profile server.
    ```bash
    $ gradle clean build
    ```

2. To run the server with the Spring application execute:
    ```bash
    $ gradle libertyStart
    ```
        
3. To stop the server with the Spring application execute:
    ```bash
    $ gradle libertyStop
    ```
 

In your browser, enter the URL for the application: [http://localhost:9811/sample.spring/](http://localhost:9811/sample.spring/) (where port 9811 assumes the httpEndpoint provided in the sample server.xml has not been modified).
In your browser, you should see the phone book displayed.

# Notice

© Copyright IBM Corporation 2017.

# License

This information contains sample code provided in source code form. You may copy, modify, and distribute these sample programs in any form without payment to IBM for the purposes of developing, using, marketing or distributing application programs conforming to the application programming interface for the operating platform for which the sample code is written.

Notwithstanding anything to the contrary, IBM PROVIDES THE SAMPLE SOURCE CODE ON AN "AS IS" BASIS AND IBM DISCLAIMS ALL WARRANTIES, EXPRESS OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, ANY IMPLIED WARRANTIES OR CONDITIONS OF MERCHANTABILITY, SATISFACTORY QUALITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE, AND ANY WARRANTY OR CONDITION OF NON-INFRINGEMENT. IBM SHALL NOT BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY OR ECONOMIC CONSEQUENTIAL DAMAGES ARISING OUT OF THE USE OR OPERATION OF THE SAMPLE SOURCE CODE. IBM SHALL NOT BE LIABLE FOR LOSS OF, OR DAMAGE TO, DATA, OR FOR LOST PROFITS, BUSINESS REVENUE, GOODWILL, OR ANTICIPATED SAVINGS. IBM HAS NO OBLIGATION TO PROVIDE MAINTENANCE, SUPPORT, UPDATES, ENHANCEMENTS OR MODIFICATIONS TO THE SAMPLE SOURCE CODE.

[Liberty Maven Plug-in]: https://github.com/WASdev/ci.maven
[Liberty Gradle Plug-in]: https://github.com/WASdev/ci.gradle

[Apache Maven]: http://maven.apache.org
[Gradle]: https://gradle.org/

[Maven Central]: https://search.maven.org/


