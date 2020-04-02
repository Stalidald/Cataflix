INSERT INTO achivement  (name, description, version) SELECT * FROM (SELECT "Registration", "Congratulation, you are a member now!", 0) AS tmp
WHERE NOT EXISTS ( SELECT name FROM achivement WHERE name = "Registration") LIMIT 1;


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
--REPLACE INTO movie_related_movie_members (movie_entity_id, related_movie_members_id)  VALUES (1, 1);
--REPLACE INTO movie_related_movie_members (movie_entity_id, related_movie_members_id)  VALUES (1, 2);
--REPLACE INTO movie_related_movie_members (movie_entity_id, related_movie_members_id)  VALUES (1, 3);
--REPLACE INTO movie_related_movie_members (movie_entity_id, related_movie_members_id)  VALUES (2, 3);
SET FOREIGN_KEY_CHECKS=1;


INSERT INTO roles(name) SELECT * FROM (SELECT 'ROLE_USER') AS tmp WHERE NOT EXISTS (SELECT name FROM roles WHERE name = 'ROLE_USER') LIMIT 1;
INSERT INTO roles(name) SELECT * FROM (SELECT 'ROLE_PARENT') AS tmp WHERE NOT EXISTS (SELECT name FROM roles WHERE name = 'ROLE_PARENT') LIMIT 1;
INSERT INTO roles(name) SELECT * FROM (SELECT 'ROLE_CHILD') AS tmp WHERE NOT EXISTS (SELECT name FROM roles WHERE name = 'ROLE_CHILD') LIMIT 1;
INSERT INTO roles(name) SELECT * FROM (SELECT 'ROLE_ADMIN') AS tmp WHERE NOT EXISTS (SELECT name FROM roles WHERE name = 'ROLE_ADMIN') LIMIT 1;
