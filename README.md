[![Build Status](https://travis-ci.org/Stalidald/Cataflix.svg?branch=develop)](https://travis-ci.org/Stalidald/Cataflix)
# CataFlix

* [Bevezetés](README.md#intro)
* [Elérhetőség](README.md#access)
* [Frontend Dokumentáció](/CataflixFrontEnd/README.md)
* [Backend Dokumentáció helye](/CataflixBackEnd/README.md)
* [Funkciók](README.md#features)
* [CI](README.md#CI)
* [Megjegyzés](README.md#notification)
* [Fejlesztők](README.md#developers)


## [Bevezetés](#intro)

A projekt célja egy webapplikáció elkészítése PC-re. Az applikáció abban különleges, hogy míg a mostani rendszereknél előfizetés van és minden az ölünkbe csöppen akár akarjuk akár nem, itt kiválaszthatjuk, mi is érdekel minket, így nem lesz sok felesleges tartalom és nem kívánt, órákon át tartó lapozgatás.

## [Elérhetőség](#access)
Az alkalmazás megtekinthető és használható a [Cataflix](http://stalidald.web.elte.hu/Cataflix) oldalon.
A deployt a Travis CI rendszer végzi minden commit után. A CataflixFrontEnd/deploy.sh és a CataflixBackEnd/deploy_be.sh scriptek alapján.

## [Funkciók](#features)

A Kezdőlapról elérhetőek: 
* Keresés (szűrés, rendezés)
* Ajánlott műsorok
* Kifizetett műsorok
* Profil műveletek (Regisztráció, Belépés, Saját Profil)

## [CI rendszer](#CI)
CI rendszernek az online elérhető [Travis](https://travis-ci.org/) -t választottuk. 
* Telepítés és bejelentkezés nélkül láthatjuk a felületet.
* Egyidőben buildeli a Front-end és a Back-end részt.
* Gyökérkönyvtárban a .travis.yml konfigurációs fájl felelős a buildelésért.
* A README.md tetején található jelzés mutatja a build legutolsó állapotát.
* Teszteket futtat automatikusan.

## [Megjegyzés](#notification)

Az alkalmazás fejlesztés alatt áll. Az éppen futó problémák a projekt [issue board](https://github.com/Stalidald/Cataflix/issues)-ján találhatóak.

## [Fejlesztők](#developers)

* Szvetnik Ferenc
* Tóth Tamás
* Barton Patrik

(ELTE @IK, 2020 - Projekt Eszközök)

