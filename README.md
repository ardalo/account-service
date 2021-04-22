# Ardalo Digital Platform Account Service
![Build Status](https://github.com/ardalo/account-service/workflows/Build/badge.svg)
[![Code Coverage](https://sonarcloud.io/api/project_badges/measure?project=ardalo_account-service&metric=coverage)](https://sonarcloud.io/dashboard?id=ardalo_account-service)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=ardalo_account-service&metric=ncloc)](https://sonarcloud.io/dashboard?id=ardalo_account-service)

The Account Service of the Ardalo Digital Platform is responsible for registration and authentication.

## Tech Info
__Java Spring Boot Service__
* Gradle
* Template Engine: Thymeleaf
* Testing: Spock, Spring MockMvc
* Metrics: Prometheus
* API Documentation: Swagger UI
* Access and Application Logs in JSON format
* JaCoCo Code Coverage Report
* Static Code Analysis via SonarCloud
* Docker
* CI/CD: GitHub Actions

## Quick Start
* Run via Docker using `docker compose` and find API docs at http://localhost:8083/apidoc
  ```console
  $ docker compose build && docker compose up
  ```
* Start application and find API docs at http://localhost:8083/apidoc
  ```console
  $ ./gradlew bootRun
  ```
* Run tests
  ```console
  $ ./gradlew test
  ```
* Generate Code Coverage Report. HTML Report can be found in `./build/reports/jacoco/test/html`
  ```console
  $ ./gradlew check jacocoTestReport
  ```
* Check for outdated dependencies via [Gradle Versions Plugin](https://github.com/ben-manes/gradle-versions-plugin)
  ```console
  $ ./gradlew dependencyUpdates -Drevision=release
  ```

## API Documentation
Swagger UI is accessible via `/apidoc`
