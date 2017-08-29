# play-scala-swagger-archetype
Maven arcehtype to generate skeleton of a Play+Scala project integrated with Swagger as webjar

1. Checkout this Archetype till it's not added to Maven Central
2. Execute mvn clean install, this will add archetype to your local repo
3. cd to directory you want to generate project from this archetype
4. execute below command
mvn archetype:generate -DarchetypeGroupId=com.hashmap \
-DarchetypeArtifactId=play-scala-swagger-archetype    \
-DarchetypeVersion=1.0-SNAPSHOT                       \
-DgroupId=<Group id of your new project>              \
-DartifactId=<Artifact id for your new project> -e 

5. Accept all the default options, unless you want to override
6. Your new project will be created in the same directory

#TODO
Add Tests
