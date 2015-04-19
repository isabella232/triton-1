## Sample Project: triton

## License

This sample is currently MIT licenced, see the included LICENSE file. The client project is a modified version of 
[w11k/fabs-boilerplate](https://github.com/w11k/fabs-boilerplate) authored by Philipp Burgmer. 

## Overview
This sample project demonstrates the integration of JAVA and AngularJS projects with gradle und fabs.
It contains the 4 sub projects:

1. common: The models and interfaces describing the callable service.

2. service: the implementation of the interface. 

3. client: a singe page application derived from fabs-boilderplate.

4. server: an integration project that includes the other projects.


Note: The service and the client projects are web-fragment enabled web applications.

### Getting started

The following software needs to be installed on your system

- Oracle JDK 1.8: It _should_ work without installing any other software, but not tested. 

Because gradle installs it's own versions of the following it _could_ be installed if needed:

- nodejs (tested using version 0.12.2)
- grunt installed via NPM globally (npm -g install grunt)
- gradle installed by your favourite package manager (tested with 2.3) .


#### Development Mode

Use `./gradlew :client:dev` or `cd client && grunt dev` to start a node server on port 9000 for development. The directory 
client/src/main/webap is being watched for changes. If a change is detected, the web page is reloaded automatically.
Fabs is configured to use the servlet container on port 8080 for service calls, so you might want to start the Jetty container.

#### Building the distributable web archive (WAR)
Use `./gradlew :server:jettyRun` to start a servlet container. It contains the service and the minified version of
the client. It starts the Jetty on port 8080.

 
#### Simple Testing with curl  
* Simple echo Service: curl -X GET localhost:8080/server/service/product/echo?text=hello
* Product list: curl -X GET localhost:8080/server/service/product/list

## Open Issues

* The mock and e2e tests of client project has not been tested, but it should work out of the box.
* It is not possible to use the gradle jetty plugin, because web-fragments is not available with this plugin. The gretty
  plugin is used instead.
* The incremental build feature of the gradle-grunt plugin is not used.
* :client:clean is not implemented the right way, because it should delete node_modules. 


         
