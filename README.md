# play-scala-swagger-archetype
Maven arcehtype to generate skeleton of a Play+Scala project integrated with Swagger as webjar

1. Checkout this Archetype till it's not added to Maven Central
2. Execute ``mvn clean install`` this will add archetype to your local repo
3. cd to directory you want to generate project from this archetype
4. execute below command

        mvn archetype:generate -DarchetypeGroupId=com.hashmap \
        -DarchetypeArtifactId=play-scala-swagger-archetype    \
        -DarchetypeVersion=1.0-SNAPSHOT                       \
        -DgroupId=<Group id of your new project>              \
        -DartifactId=<Artifact id for your new project> -e 

5. Accept all the default options, unless you want to override
6. Next to start your project in Dev mode execute below commands sequentially

         cd your_project
         mvn clean install
         mvn play2:run
         
7. In case you want to deploy it in production mode you have to change value for ``play.crypto.secret`` in application.conf
         
8. Dist will be generated as a zip file under target folder, which can be transferred to server and installed as Play application.

### Process to deploy on Production
1. Copy zip file to server
2. Unzip it on server
3. cd to unzipped directory
4. check if start script has execute mode, if not give it
5. Set the conf file appropriate for server e.g. for production environment set ststem variable as ``export ENV=PROD`` Note: This environment if not set will load application.conf if set there should be file with name like prod.conf 
6. To start as a daemon process execute following command

        nohup ./start -Dhttp.port=<your_app_port> -Dpidfile.path=/dev/null &

#TODO
Add Tests
