# teamcity-matrix-build-plugin

[![Build Status](https://travis-ci.org/presidentio/teamcity-matrix-build-plugin.svg?branch=master)](https://travis-ci.org/presidentio/teamcity-matrix-build-plugin)

## Overview

This teamcity plugin can run builds with matrix configuration. [Jenkins alternative](https://wiki.jenkins-ci.org/display/JENKINS/Building+a+matrix+project).
A matrix-build runner is useful when you want to run you build configuration with different combinations of parameters. 
In usual case you are creating multiple build configurations with the same steps and change specific parameters.
Using this plugin you can just specify possible values for each parameter and run one build, which will trigger child builds with each possible combination of parameters.
It is implementation of teamcity feature [TW-3661](https://youtrack.jetbrains.com/issue/TW-3661)

## Usage

### Install
Download latest version of the plugin from releases tab and install it
```
wget https://github.com/presidentio/teamcity-matrix-build-plugin/releases/download/v1.0.0/matrix-build.zip
cp target/matrix-build.zip <TeamCity Data Directory>/plugins/
service teamcity restart
```
More info: [Installing Additional Plugins for Teamcity](https://confluence.jetbrains.com/display/TCD9/Installing+Additional+Plugins)

### Setup
Create build configuration using parameters placeholders. For example: %hadoop.version%
Go to you project *Build Configuration Settings* and create a new build configuration with *matrix-build* step.
Select previously created *Build Type*. 
List parameters and their values in *Build Parameters*. 
A newline-separated list of properties with comma separated variants of value: <parameter name>=<value1,value2,value3>. 
They must be formatted in java properties style. For example:
```
hadoop.version=2.7.1,2.6.3,2.5.2
hive.version=1.2.1,1.1.1
oozie.version=4.2.0,4.1.0
```
Specify your user credentials. It's required to access server using REST Api. 
If you don't want to use you credentials - create new user and grant him permissions to start and stop builds.
This inconvenience will be removed as soon as build user [will have required permissions](https://youtrack.jetbrains.com/issue/TW-39206).
At this point you have configured build.

#####Vcs Revision
If you want to guarantee that each child build will be run with the same source revision, you need to attache both build configurations to the same vcs root.
In this case build revision will be promoted from parent build to all child.

### Viewing Results
You can look at child builds list at *Matrix build* tab on build page. 
There are listed finished, running and queued builds with there parameters.

Licensing
=========

[![][license img]][license]

This software is licensed under the terms in the file named "LICENSE" in this directory.


[license]:LICENSE
[license img]:https://img.shields.io/badge/license-Apache%202.0-brightgreen.svg
