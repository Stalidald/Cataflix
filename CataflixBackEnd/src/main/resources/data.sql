INSERT INTO achivement  (name, description, version) VALUES ("Regisztráció", "Gratulálok beregisztálrtál!", 0);

INSERT INTO user (user_name, password, type, version) VALUES ("Admin", "alma", "Admin", 0);
INSERT INTO user (user_name, password, type, version) VALUES ("Jon_Snow", "Daenerys", "ParentUser", 0);

INSERT INTO movie(title, age_limit, release_year, description, rating, version) VALUES ("Titanic", 12, 1997, "Egy hajókatasztrófa megfilmesítése.", 7.8, 0);
INSERT INTO movie(title, age_limit, release_year, description, rating, version) VALUES ("Avatar", 12, 2009, "Egy másik élőforma felfedezése.", 7.8, 0);

INSERT INTO movie_members(name, role, version) VALUES ("Leonardo Di Caprio", "Actor", 0);
INSERT INTO movie_members(name, role, version) VALUES ("Kate Winslet", "Actress", 0);
INSERT INTO movie_members(name, role, version) VALUES ("Zoe Saldana", "Actress", 0);


INSERT INTO movie_related_movie_members (movie_entity_id, related_movie_members_id) VALUES (1,1);
INSERT INTO movie_related_movie_members (movie_entity_id, related_movie_members_id) VALUES (1,2);
INSERT INTO movie_related_movie_members (movie_entity_id, related_movie_members_id) VALUES (1,3);
INSERT INTO movie_related_movie_members (movie_entity_id, related_movie_members_id) VALUES (2,3);
