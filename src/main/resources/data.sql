
INSERT INTO achivement  (name, description, version) SELECT * FROM (SELECT "Taggá válás", "Sikeres regisztráció", 0) AS tmp
WHERE NOT EXISTS ( SELECT name FROM achivement WHERE name = "Taggá válás") LIMIT 1;
INSERT INTO achivement  (name, description, version) SELECT * FROM (SELECT "Filmgyüjtő I.", "Várásolj 1 darab filmet", 0) AS tmp
WHERE NOT EXISTS ( SELECT name FROM achivement WHERE name = "Filmgyüjtő I.") LIMIT 1;
INSERT INTO achivement  (name, description, version) SELECT * FROM (SELECT "Filmgyüjtő II.", "Várásolj 3 darab filmet", 0) AS tmp
WHERE NOT EXISTS ( SELECT name FROM achivement WHERE name = "Filmgyüjtő II.") LIMIT 1;
INSERT INTO achivement  (name, description, version) SELECT * FROM (SELECT "Filmgyüjtő III.", "Várásolj 5 darab filmet", 0) AS tmp
WHERE NOT EXISTS ( SELECT name FROM achivement WHERE name = "Filmgyüjtő III.") LIMIT 1;

INSERT INTO movie(title, category, price, imageURL,videoURL,age_limit, release_year, description, rating, version) SELECT * FROM (SELECT "Titanic","Dráma", 3, "https://www.mafab.hu/static/profiles/2014/292/23/3261_24.jpg", "2e-eXJ6HgkQ",12, 1997, "A történelem leghíresebb tengeri katasztrófája volt a Titanic óceánjáró 1912. április 15-i jéghegynek ütközése. Egy tizenhét éves lány és egy fiatalember szerelmi kapcsolatának szemszögéből élhetjük át a tragédiát. A zárt, anglikánus világban élő fiatal hölgy szemét az élet igazi dolgaira a nehéz sorsú fiú hívja fel. Szerelmük beteljesülésébe azonban nem csak a jéghegyek szólnak bele...", 7.8, 0) AS tmp
WHERE NOT EXISTS ( SELECT title FROM movie WHERE title = "Titanic") LIMIT 1;
INSERT INTO movie(title, category, price, imageURL,videoURL,age_limit, release_year, description, rating, version) SELECT * FROM (SELECT "Avatar", "Fantasy", 4, "https://i.pinimg.com/originals/17/aa/71/17aa718c1ab15b482505b8431cf596fc.jpg", "5PSNL1qE6VY",12, 2009, "A történet a távolabbi jövőben játszódik, amikor is az emberiség eljutott a hozzánk legközelebb lévő Alpha Centauri csillagrendszerbe, ahol a Pandorának keresztelt bolygón életet fedeznek fel. A bolygó egy eddig ismeretlen, különleges ásványi anyagban gazdag, így megindul a Pandora gyarmatosítása. Ezt a bolygó törzsi közösségekben élő őshonos népe, a na''vik nem nézik jó szemmel. Hogy az idegen atmoszférájú bolygón való mozgást és a fajok közti kommunikációt megkönnyítsék, hibrid avatarokat hoznak létre, amelyeket egy-egy ember telepatikus kapcsolaton keresztül irányít. Jake Sully, a háborús veterán, aki tolószékbe kényszerült, jelentkezik a programba. Azonban miután közelebbről is megismeri a na''vi kultúrát, rádöbben, hogy az emberek gátlástalanul kihasználják a bolygót, és a gyarmatosítók ellen fordul.
", 7.8, 0)AS tmp
WHERE NOT EXISTS ( SELECT title FROM movie WHERE title = "Avatar") LIMIT 1;
INSERT INTO movie(title, category, price, imageURL,videoURL,age_limit, release_year, description, rating, version) SELECT * FROM (SELECT "Kapj el, ha tudsz","Krimi", 3, "https://images-na.ssl-images-amazon.com/images/I/81V%2Bb69u3xL._SY445_.jpg", "zp-Vlhz9Me4",12, 2002, "Frank W. Abagnale dolgozott orvosként, ügyvédként, és egy nagy légitársaság másodpilótájaként - és mindezt a huszonegyedik születésnapja előtt. A szélhámosság nagymestere emellett briliáns csekkhamisító is volt, szakértelme több millió dollárt hozott neki a konyhára. Carl Hanratty FBI ügynök legfontosabb küldetésének tartotta, hogy elkapja Franket, és a törvény színe elé vigye, de Frank mindig egy lépéssel előtte járt, és a hajsza folytatására kényszerítette...", 8.1, 0) AS tmp
WHERE NOT EXISTS ( SELECT title FROM movie WHERE title = "Kapj el, ha tudsz") LIMIT 1;
INSERT INTO movie(title, category, price, imageURL,videoURL,age_limit, release_year, description, rating, version) SELECT * FROM (SELECT "Törvénytisztelő polgár","Thriller", 5, "https://img2.indafoto.hu/5/7/24927_de9cf7fc237bf2217c1c576e4f026fee/5762137_91c2b5e1e21f8bb67c86144dd2fe32fa_l.jpg", "QVICNMPigOE",16, 2009, "Clyde Shelton becsületes családapa, akinek feleségét és lányát brutálisan meggyilkolják a félresikerült betörés során. Miután a gyilkosokat elfogják, az ügy Nick Rice, a feltörekvő ügyész kezében landol. Nick az egyik gyanúsítottnak vádalkut, és ezzel együtt enyhe ítéletet ígér, a gyilkos cserébe a társa ellen vall. Tíz évvel később a vádalkut kötött bűnözőt holtan találják, Clyde Shelton rögtön bevallja, hogy ő a tettes. Amikor előzetes letartóztatásba helyezik, figyelmezteti a ranglétrán már feljebb lépett egykori ügyészt, ha nem ismerik el tévedésüket az ügyet tárgyaló kollégáival együtt, minden résztvevő a gyilkosok sorsára jut...", 7.4, 0) AS tmp
WHERE NOT EXISTS ( SELECT title FROM movie WHERE title = "Törvénytisztelő polgár") LIMIT 1;
INSERT INTO movie(title, category, price, imageURL,videoURL,age_limit, release_year, description, rating, version) SELECT * FROM (SELECT "A Wall Street farkasa","Dráma", 5, "https://media.port.hu/images/000/605/721.jpg", "QbjHgL34kQc",16, 2013, "A pénz sosem elég. Jordan Belfort becsületes tőzsdeügynökként kezdte pályafutását, de az amerikai álom őt is utolérte. A 80-as évek végére az egyik legnagyobb brókercég tulajdonosa lett, 26 évesen heti 1 millió dollárt keresett. Az idáig vezető út azonban korrupcióval, és tisztességtelen üzletekkel kikövezett csábító hullámvasútnak bizonyult. Mert minél nagyobb volt a kísértés ő annál többet akart, mit sem törődve az illegális üzelmekkel, és a nyomában loholó FBI ügynökökkel. Még több pénz, még több hatalom, még több nő, és megint még több pénz: ez Jordan életfilozófiája. És hogy a szerénység egy túlértékelt erény. Jordan és falkája azt sem tudták mit kezdjenek az illegálisan megszerzett milliárdokkal, de vajon a jéghegy csúcsáról merre vezet az út?", 8.2, 0) AS tmp
WHERE NOT EXISTS ( SELECT title FROM movie WHERE title = "A Wall Street farkasa") LIMIT 1;

INSERT INTO movie_members(name, version) SELECT * FROM (SELECT "Leonardo Di Caprio", 0)AS tmp
WHERE NOT EXISTS ( SELECT name FROM movie_members WHERE name = "Leonardo Di Caprio") LIMIT 1;
INSERT INTO movie_members(name, version) SELECT * FROM (SELECT "Kate Winslet",  0)AS tmp
WHERE NOT EXISTS ( SELECT name FROM movie_members WHERE name = "Kate Winslet") LIMIT 1;
INSERT INTO movie_members(name, version) SELECT * FROM (SELECT "Billy Zane", 0)AS tmp
WHERE NOT EXISTS ( SELECT name FROM movie_members WHERE name = "Billy Zane") LIMIT 1;
INSERT INTO movie_members(name, version) SELECT * FROM (SELECT "Sam Worthington", 0)AS tmp
WHERE NOT EXISTS ( SELECT name FROM movie_members WHERE name = "Sam Worthington") LIMIT 1;
INSERT INTO movie_members(name, version) SELECT * FROM (SELECT "Zoe Saldana", 0)AS tmp
WHERE NOT EXISTS ( SELECT name FROM movie_members WHERE name = "Zoe Saldana") LIMIT 1;
INSERT INTO movie_members(name, version) SELECT * FROM (SELECT "Sigourney Weaver", 0)AS tmp
WHERE NOT EXISTS ( SELECT name FROM movie_members WHERE name = "Sigourney Weaver") LIMIT 1;
INSERT INTO movie_members(name, version) SELECT * FROM (SELECT "Tom Hanks", 0)AS tmp
WHERE NOT EXISTS ( SELECT name FROM movie_members WHERE name = "Tom Hanks") LIMIT 1;
INSERT INTO movie_members(name, version) SELECT * FROM (SELECT "Christopher Walken", 0)AS tmp
WHERE NOT EXISTS ( SELECT name FROM movie_members WHERE name = "Christopher Walken") LIMIT 1;
INSERT INTO movie_members(name, version) SELECT * FROM (SELECT "Jamie Foxx", 0)AS tmp
WHERE NOT EXISTS ( SELECT name FROM movie_members WHERE name = "Jamie Foxx") LIMIT 1;
INSERT INTO movie_members(name, version) SELECT * FROM (SELECT "Gerard Butler", 0)AS tmp
WHERE NOT EXISTS ( SELECT name FROM movie_members WHERE name = "Gerard Butler") LIMIT 1;
INSERT INTO movie_members(name, version) SELECT * FROM (SELECT "Colm Meaney", 0)AS tmp
WHERE NOT EXISTS ( SELECT name FROM movie_members WHERE name = "Colm Meaney") LIMIT 1;
INSERT INTO movie_members(name, version) SELECT * FROM (SELECT "Jonah Hill", 0)AS tmp
WHERE NOT EXISTS ( SELECT name FROM movie_members WHERE name = "Jonah Hill") LIMIT 1;
INSERT INTO movie_members(name, version) SELECT * FROM (SELECT "Margot Robbie", 0)AS tmp
WHERE NOT EXISTS ( SELECT name FROM movie_members WHERE name = "Margot Robbie") LIMIT 1;


SET FOREIGN_KEY_CHECKS=0;
REPLACE INTO movie_related_movie_members (movie_entity_id, related_movie_members_id)  VALUES (1, 1);
REPLACE INTO movie_related_movie_members (movie_entity_id, related_movie_members_id)  VALUES (1, 2);
REPLACE INTO movie_related_movie_members (movie_entity_id, related_movie_members_id)  VALUES (1, 3);
REPLACE INTO movie_related_movie_members (movie_entity_id, related_movie_members_id)  VALUES (2, 4);
REPLACE INTO movie_related_movie_members (movie_entity_id, related_movie_members_id)  VALUES (2, 5);
REPLACE INTO movie_related_movie_members (movie_entity_id, related_movie_members_id)  VALUES (2, 6);
REPLACE INTO movie_related_movie_members (movie_entity_id, related_movie_members_id)  VALUES (3, 1);
REPLACE INTO movie_related_movie_members (movie_entity_id, related_movie_members_id)  VALUES (3, 7);
REPLACE INTO movie_related_movie_members (movie_entity_id, related_movie_members_id)  VALUES (3, 8);
REPLACE INTO movie_related_movie_members (movie_entity_id, related_movie_members_id)  VALUES (4, 9);
REPLACE INTO movie_related_movie_members (movie_entity_id, related_movie_members_id)  VALUES (4, 10);
REPLACE INTO movie_related_movie_members (movie_entity_id, related_movie_members_id)  VALUES (4, 11);
REPLACE INTO movie_related_movie_members (movie_entity_id, related_movie_members_id)  VALUES (5, 1);
REPLACE INTO movie_related_movie_members (movie_entity_id, related_movie_members_id)  VALUES (5, 12);
REPLACE INTO movie_related_movie_members (movie_entity_id, related_movie_members_id)  VALUES (5, 13);
SET FOREIGN_KEY_CHECKS=1;

CREATE TABLE temp LIKE movie_related_movie_members;
INSERT INTO temp
    SELECT DISTINCT * FROM movie_related_movie_members;
DROP TABLE movie_related_movie_members;
RENAME TABLE temp TO movie_related_movie_members;

INSERT INTO roles(name) SELECT * FROM (SELECT 'ROLE_USER') AS tmp WHERE NOT EXISTS (SELECT name FROM roles WHERE name = 'ROLE_USER') LIMIT 1;
INSERT INTO roles(name) SELECT * FROM (SELECT 'ROLE_PREMIUM') AS tmp WHERE NOT EXISTS (SELECT name FROM roles WHERE name = 'ROLE_PREMIUM') LIMIT 1;

