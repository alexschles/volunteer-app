<project xmlns="http://maven.apache.org/POM/4.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>com.google.sps</groupId>
  <artifactId>project</artifactId>
  <version>1</version>
  <packaging>war</packaging>

  <properties>
    <!-- This project uses Java 8 -->
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <failOnMissingWebXml>false</failOnMissingWebXml>
  </properties>

  <dependencies>
    <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>javax.servlet-api</artifactId>
      <version>4.0.1</version>
      <scope>provided</scope>
    </dependency>
  </dependencies>

  <build>
    <plugins>
      <!-- Provides `mvn package appengine:run` for local testing
           and `mvn package appengine:deploy` for deploying. -->
      <plugin>
        <groupId>com.google.cloud.tools</groupId>
        <artifactId>appengine-maven-plugin</artifactId>
        <version>2.2.0</version>
        <configuration>
          <!-- TODO: set project ID. -->
          <deploy.projectId>PROJECT_ID_HERE</deploy.projectId>
          <deploy.version>1</deploy.version>
        </configuration>
      </plugin>
    </plugins>
  </build>
</project>
