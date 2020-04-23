# Cataflix Back-end

## Alkalmazott technológiák
Java SE 8, Java Spring keretrendszer. A back-end alkalmazás egy Rest API, amellyel http kérésekkel lehet kommunikálni. Az alkalmazás a localhost:8080 címen érhető el.

### Build
Az alkalmazás buildhez Mavent használunk ezért a fordításához a Maven telepítése szükséges [Maven link](https://maven.apache.org/download.cgi).
A szükséges függőségeket a Maven tölti le a felhasználó számára. Windows operációs rendszer esetén a gyökérkönyvtárban található build.ps1 [script](build.ps1), 
Linux és MAC operációs rendszer esetén pedig a build.sh [script](build.sh).
A futtatható alkalmazás a target mappában található (CataflixBackEnd-0.0.1-SNAPSHOT.jar).

### Adatbázis
MySQL adatbázis kezelőt használ az alkalmazás. A fejlesztés során WAMP szerver biztosítja az adatbázist [WAMP](http://www.wampserver.com/en/). 
Az adatbázis használatához szükséges konfigurációkat (felhasználónév, jelszó, host, adatbázis neve) az [application.properties](src/main/resources/application.properties) tartalmazza.
Az adatbázis létrehozása szükséges az első indítás előtt a megfelelő névvel, ezután az alkalmazás magától fogja legenerálni az entitás táblákat és azoknak a kapcsolatait.

### Javadoc generálás
Az alkalmazás az automatikus buildelés során generál egy javadocot amit a Cataflix\CataflixBackEnd\target\site\apidocs\index.html -en tudunk megtekinteni.
Ehhez le kell tölteni az alkalmazást és lokális környezetbe buildelni azt.