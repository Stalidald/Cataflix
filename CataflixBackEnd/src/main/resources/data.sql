/*INSERT INTO achivement  (name, description, version) SELECT * FROM (SELECT "Registration", "Congratulation, you are a member now!", 0) AS tmp
WHERE NOT EXISTS ( SELECT name FROM achivement WHERE name = "Registration") LIMIT 1;

INSERT INTO user  (user_name, password, type, version)
SELECT * FROM (SELECT "Admin", "alma", "administrator", 0) AS tmp
WHERE NOT EXISTS ( SELECT name FROM user WHERE user_name = "Admin") LIMIT 1;

INSERT INTO user  (user_name, password, type, version)
SELECT * FROM (SELECT "Jon_Snow", "Daenerys", "ParentUser", 0) AS tmp
WHERE NOT EXISTS ( SELECT name FROM user WHERE user_name = "Jon_Snow") LIMIT 1;


INSERT INTO movie(title, age_limit, release_year, description, rating, version) SELECT * FROM (SELECT "Titanic", 12, 1997, "Egy hajókatasztrófa megfilmesítése.", 7.8, 0) AS tmp
WHERE NOT EXISTS ( SELECT title FROM movie WHERE title = "Titanic") LIMIT 1;
INSERT INTO movie(title, age_limit, release_year, description, rating, version) SELECT * FROM (SELECT "Avatar", 12, 2009, "Egy másik élőforma felfedezése.", 7.8, 0)AS tmp
WHERE NOT EXISTS ( SELECT title FROM movie WHERE title = "Avatar") LIMIT 1;


INSERT INTO movie_members(name, role, version) SELECT * FROM (SELECT "Leonardo Di Caprio", "Actor", 0)AS tmp
WHERE NOT EXISTS ( SELECT name FROM movie_members WHERE name = "Leonardo Di Caprio") LIMIT 1;
INSERT INTO movie_members(name, role, version) SELECT * FROM (SELECT "Kate Winslet", "Actress", 0)AS tmp
WHERE NOT EXISTS ( SELECT name FROM movie_members WHERE name = "Kate Winslet") LIMIT 1;
INSERT INTO movie_members(name, role, version) SELECT * FROM (SELECT "Zoe Saldana", "Actress", 0)AS tmp
WHERE NOT EXISTS ( SELECT name FROM movie_members WHERE name = "Zoe Saldana") LIMIT 1;


SET FOREIGN_KEY_CHECKS=0;
REPLACE INTO movie_related_movie_members (movie_entity_id, related_movie_members_id)  VALUES (1, 1);
REPLACE INTO movie_related_movie_members (movie_entity_id, related_movie_members_id)  VALUES (1, 2);
REPLACE INTO movie_related_movie_members (movie_entity_id, related_movie_members_id)  VALUES (1, 3);
REPLACE INTO movie_related_movie_members (movie_entity_id, related_movie_members_id)  VALUES (2, 3);
SET FOREIGN_KEY_CHECKS=1;
*/

INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_MODERATOR');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');