#create table users
#firstName, lastName

# id -> BIGINT, NOT NULL
# hindi pwedeng null value
firstName -> VARCHAR(50) NOT NULL
lastName -> VARCHAR(255) NOT NULL

CREATE TABLE <nameOfTable> (
	column1 dataType,
	column2 dataType
);

CREATE TABLE users (
	id BIGINT NOT NULL,
	firstName VARCHAR(255)
	lastName VARCHAR(255)
);


#SHOW TABLES

#DESCRIBE users

#PRACTICE
#Create a table named addresses with the following attributes
#street, city, province

CREATE TABLE addresses (
	id BIGINT NOT NULL,
	street VARCHAR(255),
	city VARCHAR(255),
	province VARCHAR(255)
)

#Add a field called gender in the users table
#gender VARCHAR(255)

//alter modifies table
ALTER TABLE <tableName> ADD <columnName> <dataType>;

ALTER TABLE users ADD gender VARCHAR(255);

#add a field in address
# zipCode INT

ALTER TABLE addresses ADD zipCode INT;
DESCRIBE addresses

#Change data of zipCode from INT to VARCHAR(255)
ALTER TABLE <tableName> MODIFY <columnName> <dataType>

ALTER TABLE addresses MODIFY zipCode VARCHAR(255);
DESCRIBE addresses; 

#PRACTICE
#change the data type of zipCode back to INT
ALTER TABLE addresses MODIFY zipCode INT;

#To delete a field in the table
ALTER TABLE <tableName> DROP COLUMN <columnName>
ALTER TABLE addresses DROP COLUMN zipCode;
DESCRIBE addresses;
//wala na si zipCode

#DELETE GENDER in users table
ALTER TABLE users DROP COLUMN gender;

FOREIGN KEY
foreign key identifier ng kabilang table
usually id

CREATE TABLE contactDetails (
	id BIGINT NOT NULL,
	phoneNumber VARCHAR(255),
	userId BIGINT NOT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (userId) REFERENCES users(id)
);

#ADD Primary Key in users
ADD TABLE <tableName> ADD CONSTRAINT PRIMARY KEY (id);

#add constraint
ALTER TABLE users ADD CONSTRAINT PRIMARY KEY (id);
#//primary key na si id
#// check with google hindi magawang primary key
#dapat: 
ALTER TABLE user ADD PRIMARY KEY (id);
#//worked for me!

#DELETE A TABLE
DROP TABLE <tableName>
DROP TABLE addresses; //wala nang table
DROP DATABASE timetracker; // wala nang DB

#ACTIVITY DECIDE whats the best data type for that.
#NAME of database: timetracker

#create a repo connected to bitbucket. file name sql

#SQL QUERY LANGUAGE
#STRUCTURED QUERY LANGUAGE

#communicates with the database what to store or get
# DML DDL

#DAY 12
#FILTERING
#WHERE ->

#GET ALL DATA
SELECT * FROM employees;

#SELECT SPECIFIC COLUMN
SELECT firstName, lastName FROM employees;

SELECT * FROM employees WHERE departmentId = 2;

#MULTIPLE CONDITION
#FROM HR AND MALES
SELECT * FROM employees WHERE departmentId = 2 AND gender = 'Male';

#DAY 12 SORTING
#SORT BY FIRSTNAME
#ORDER BY
#DEFAULT -> ASC
#OTHER OPTION DESC
SELECT firstName, lastName, gender FROM employees WHERE departmentId = 2 AND gender = 'Male' ORDER BY firstName DESC;


#LIMIT / PAGINATE
SELECT firstName, lastName FROM employees LIMIT 10;
#RETURNS 10 items

SELECT firstName, lastName, gender FROM employees WHERE departmentId = 2 AND gender = 'Male' ORDER BY firstName DESC LIMIT 10;

#OFFSET STARTS AT 11 / PAGINATE
#Skip the data
SELECT firstName, lastName, gender FROM employees WHERE departmentId = 2 AND gender = 'Male' ORDER BY firstName DESC LIMIT 10 OFFSET 10;


SELECT designation FROM employees;
SELECT gender FROM employees;

#GET UNIQUE
#DISTINCT
SELECT DISTINCT(gender) FROM employees;

#SEARCH STRING
#search "m"
#LIKE (by default, not case sensistive)
#M -> M% regardless kung ilang characters ang kasunod
#% -> denotes any number of characters
SELECT firstName FROM employees WHERE firstName LIKE "M%";

# _ -> denotes one character
# M_ -> 1 charater ater M
# M___

SELECT firstName FROM employees WHERE firstName LIKE "M___";
#"mer"
SELECT firstName FROM employees WHERE firstName LIKE "%mer%";
SELECT firstName FROM employees WHERE firstName LIKE "M%a";

#CASE SENSITIVE
#BINARY
SELECT firstName FROM employees WHERE firstName LIKE BINARY "%mer%";

SELECT designation FROM employees WHERE desination LIKE BINARY "%mer%";
SELECT designation FROM employees WHERE desination LIKE BINARY "%eer%";

SELECT designation FROM employees WHERE desination LIKE BINARY "% %"

#exercise
#Write a query to get all the employees from IT OR HR
SELECT firstName, lastName, departmentId FROM employees WHERE departmentId = 1 OR departmentId = 2;

#Sub-Queries
SELECT id FROM departments WHERE name = 'HR' OR name = 'IT'

#IN
SELECT firstName, lastName, departmentId FROM employees WHERE departmentId IN (1,2);

SELECT firstName, lastName, departmentId FROM employees WHERE departmentId IN 
(SELECT id FROM departments WHERE name = "HR" OR name = "IT");

#Write a quesry to get all sales department employees with age > 35;
SELECT firstName, lastName, age, departmentId FROM employees WHERE age > 35 AND departmentId IN
(SELECT id FROM departments WHERE name = "SALES");

#ACTIVITY DATABASE
#database name movieIndustry

CREATE DATABASE movieIndustry;
USE movieIndustry;

CREATE TABLE studios (
	id BIGINT NOT NULL AUTO_INCREMENT,
	name VARCHAR(255),
	address VARCHAR(255),
	PRIMARY KEY(id)
);

CREATE TABLE artists (
	id BIGINT NOT NULL AUTO_INCREMENT,
	name VARCHAR(255),
	address VARCHAR(255),
	gender VARCHAR(255),
	birthday DATE,
	studioId BIGINT,
	PRIMARY KEY(id),
	FOREIGN KEY (studioId) REFERENCES studios(id)
);

CREATE TABLE movies (
	id BIGINT NOT NULL AUTO_INCREMENT,
	title VARCHAR(255),
	year YEAR,
	length INT,
	genre VARCHAR(255),
	PRIMARY KEY(id)
);

CREATE TABLE producers (
	id BIGINT NOT NULL AUTO_INCREMENT,
	name VARCHAR(255),
	address VARCHAR(255),
	PRIMARY KEY(id)
);

CREATE TABLE movies_artists (
	id BIGINT NOT NULL AUTO_INCREMENT,
	movieId BIGINT,
	artistId BIGINT,
	PRIMARY KEY(id),
	FOREIGN KEY(movieId) REFERENCES movies(id),
	FOREIGN KEY(artistId) REFERENCES artists(id)	
);


CREATE TABLE producers_movies (
	id BIGINT NOT NULL AUTO_INCREMENT,
	producerId BIGINT,
	movieId BIGINT,
	PRIMARY KEY(id),
	FOREIGN KEY(producerId) REFERENCES producers(id),
	FOREIGN KEY(movieId) REFERENCES movies(id)
);

#SEED DATA
INSERT INTO studios (name, address) VALUES ('ABS-CBN', 'Eugenio Lopez Dr, Diliman, Quezon City, Metro Manila');
INSERT INTO studios (name, address) VALUES ('GMA', 'GMA Internation, 10F GMA Network Center, EDSA cor. Timog Ave, Diliman, Quezon City, 1103 Metro Manila');
INSERT INTO studios (name, address) VALUES ('TV5', 'Reliance St., Mandaluyong City, Metro Manila');

INSERT INTO artists (name, address, gender, birthday, studioId) VALUES ('Alden Richards', '121 Thorne Ave. Petersburg VA 23803', 'heterosexual', '1991-01-02', 2);
INSERT INTO artists (name, address, gender, birthday, studioId) VALUES ('Bea Alonzo', '7142 E. Greystone Drive Johnson City, Tn 37601', 'bisexual', '1987-10-17', 1);
INSERT INTO artists (name, address, gender, birthday, studioId) VALUES ('Christopher de Leon', '135 Suplhur Springs St. Nazareth, PA 18064', 'bisexual', '1956-10-31', 3);
INSERT INTO artists (name, address, gender, birthday, studioId) VALUES ('Robin Padilla', '94 Cedar Swamp Rd. Seymour, IN 47274', 'asexual', '1969-11-23', 1);
INSERT INTO artists (name, address, gender, birthday, studioId) VALUES ('Kathryn Bernardo', '143 Oakwood St. Beverly Hills, CA ', 'heterosexual', '1997-12-12', 1);

INSERT INTO movies (year, title, length, genre) VALUES ('2019', 'Hello, Love, Goodbye', 7020, 'romance');
INSERT INTO movies (year, title, length, genre) VALUES ('2000', 'One More Chance', 8400, 'drama');
INSERT INTO movies (year, title, length, genre) VALUES ('1980', 'Kakabakaba kaba?', 6420, 'thriller');
INSERT INTO movies (year, title, length, genre) VALUES ('1990', 'Barumbado', 7456, 'action');
INSERT INTO movies (year, title, length, genre) VALUES ('2010', 'Sa ''yo Lamang', 8345, 'drama');

INSERT INTO producers (name, address) VALUES ('Erik Matti', '9510 Shirley St. Logansport, IN 46947');
INSERT INTO producers (name, address) VALUES ('Joyce Jimenez', '3 N. Fifth Ave. Fort Walton Beach, FL 32547');
INSERT INTO producers (name, address) VALUES ('Lily Monteverde', '9970 Newbridge Ave. Blackwood, NJ 08012');
INSERT INTO producers (name, address) VALUES ('Lav Diaz', '9325 Rockwell Ave. Memphis, TN 38106');

INSERT INTO movies_artists (movieId, artistId) VALUES (1, 1);
INSERT INTO movies_artists (movieId, artistId) VALUES (2, 2);
INSERT INTO movies_artists (movieId, artistId) VALUES (3, 3);
INSERT INTO movies_artists (movieId, artistId) VALUES (4, 4);
INSERT INTO movies_artists (movieId, artistId) VALUES (5, 2);
INSERT INTO movies_artists (movieId, artistId) VALUES (5, 3);

INSERT INTO producers_movies (producerId, movieId) VALUES (1,1);
INSERT INTO producers_movies (producerId, movieId) VALUES (1,2);
INSERT INTO producers_movies (producerId, movieId) VALUES (2,1);
INSERT INTO producers_movies (producerId, movieId) VALUES (3,4);
INSERT INTO producers_movies (producerId, movieId) VALUES (3,3);
INSERT INTO producers_movies (producerId, movieId) VALUES (4,5);

#Using subqueries, find all movies by artist from GMA.
#FIRST STEP get id of GMA
SELECT id FROM studios WHERE name = "GMA";
#SECOND get the ids of all artists from GMA
SELECT id FROM artists WHERE studioId = ();
#THIRD get the movieIds of the Movies of the artists from the above's query
SELECT movieId FROM movies_artists WHERE artistId IN ();
#LAST get the actual movies;
SELECT name FROM movies WHERE id IN();
#hello love goodbye ang sagot








#GET the names of the producers who produced movies of asexual or bisexual artists
SELECT id FROM artists WHERE gender = "asexual" OR gender = "bisexual";
#GET the movieIds of the artists;
SELECT movieId FROM movies_artists WHERE artistId IN ();
#GET the producerIds of the movies;
SELECT producerId FROM producers_movies WHERE movieId IN ();
#GET the name of the producers
SELECT name FROM producers WHERE id IN();
#Erik Matti, Lily Monteverde, Lav Diaz.

#AFTERNOON JOINS & AGGREGATE


#may b sa gitna : "%b%"
#DISTINCT para unique ung result
#LIMIT control number of result set/rows na ibabalik

#HOW TO DESIGN A DATABASE

#diagrams.net
#ENTITIES tables
#songs
	#title
	#duration
	#year
#artists
	#name
	#gender
#albums
	#name
	#releaseDate
#genre
	#name
#playlists
	#name
#users
	#name
	#email
	#password
	#subscriptionType
#subscriptionType
	#name
	#access

#next define the relationship
# 3 types
# one to one, one to many, many to many

# one to one
# A has one B

# one to many
# A has multiple B

# many to many
# A has multiple B and B has multiple A
# has pivot table


#genre and songs
#many-to-many

CREATE TABLE songs (
	id BIGINT NOT NULL AUTO_INCREMENT,
	title VARCHAR(255),
	duration INT,
	year YEAR,
	albumId BIGINT,
	PRIMARY KEY(id),
	FOREIGN KEY (albumId) REFERENCES albums(id)
);

CREATE TABLE genres (
	id BIGINT NOT NULL AUTO_INCREMENT,
	name VARCHAR(255),
	songId BIGINT,
	PRIMARY KEY(id),

);
#eto ung pivot table!
CREATE TABLE genresSongs (
	id BIGINT NOT NULL AUTO_INCREMENT,
	songId BIGINT NOT NULL,
	genreId BIGINT NOT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (songId) REFERENCES songs(songId),
	FOREIGN KEY (genreId) REFERENCES genres(id)
);

#one-to-many
#FK ay mapupunta sa "many" table

#users to playlist
#one to many
#FK kay playlist
#mag aadd ng userId(primary key ng userId) kay playlist na table //pwede din irename



#many-to-many (genres-songs)
#pivot table
# GenresSongs (pivot table)
	#1 to many si A kay pivot table (genre kay GenresSongs) (FK)
	#1 to many si B kay pivot table (pivot kay GenresSongs) (FK)
	
#FK ang laman ng pivot table
	#genreId
	#songId

# product cart users
# cart is like pivot table

#one to one either para mas madaling bashin ung table


#ACTIVITY#
DROP DATABASE musixtore;
CREATE DATABASE musixtore;
 
USE musixtore;
 
 
 CREATE TABLE genres (
	id BIGINT NOT NULL AUTO_INCREMENT,
	name VARCHAR(255),
	PRIMARY KEY(id)
);


CREATE TABLE albums(
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255),
    releaseDate DATE,
    PRIMARY KEY (id)
);


CREATE TABLE artists(
id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(255),
gender VARCHAR(255)
);


CREATE TABLE subscriptionType (
  id BIGINT NOT NULL AUTO_INCREMENT,
  name VARCHAR(30),
  accessType VARCHAR(30),
  PRIMARY KEY (id)
);

CREATE TABLE songs (
	id BIGINT NOT NULL AUTO_INCREMENT,
  title VARCHAR(255),
  duration INT,
  year YEAR,
  albumId BIGINT,
  PRIMARY KEY (id),
  FOREIGN KEY (albumId) REFERENCES albums(id)
);

CREATE TABLE genresSongs (
id BIGINT NOT NULL AUTO_INCREMENT,
songId BIGINT NOT NULL,
genreId BIGINT NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (songId) REFERENCES songs(id),
FOREIGN KEY (genreId) REFERENCES genres(id)
);

CREATE TABLE albumsArtists (
	id BIGINT NOT NULL AUTO_INCREMENT,
  artistId BIGINT NOT NULL,
  albumId BIGINT NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (artistId) REFERENCES artists(id),
  FOREIGN KEY (albumId) REFERENCES albums(id)
);


CREATE TABLE users (
  id BIGINT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255),
  email VARCHAR(255),
  password VARCHAR(255),
  subscriptionId BIGINT NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (subscriptionId) REFERENCES subscriptionType(id)
 );
 
 
CREATE TABLE addresses (
  id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT UNIQUE,
  streetAddress VARCHAR(255),
  city VARCHAR(255),
  country VARCHAR(255),
  userId BIGINT NOT NULL,
  FOREIGN KEY (userId) REFERENCES users(id)
);

CREATE TABLE playlist (
	id BIGINT NOT NULL AUTO_INCREMENT,
	name VARCHAR(255),
  songId BIGINT NOT NULL,
  userId BIGINT NOT NULL,
	PRIMARY KEY(id),
  FOREIGN KEY (songId) REFERENCES songs(id),
  FOREIGN KEY (userId) REFERENCES users(id)
);


#QUERYING
#SELECT COUNT(*) FROM employees;

SELECT firstName, lastName, date, time FROM timeIns
JOIN employees ON timeIns.employeeId = employees.id;

# dugtong JOIN and ON to FROM
#join employees and timeIns

#JOIN another table 
SELECT firstName, lastName, date, time, name FROM timeIns 
JOIN employees ON timeIns.employeeId = employees.id JOIN timeTypes ON timeIns.timeTypesId = timeTypes.id;

#DUGTONG UNG STATUSES
SELECT firstName, lastName, date, time, name FROM timeIns 
JOIN employees ON timeIns.employeeId = employees.id JOIN timeTypes ON timeIns.timeTypesId = timeTypes.id 
JOIN statuses ON timeIns.statusId = statuses.id;

#ambiguous dahil sa name and then you need alias
SELECT firstName, lastName, date, time, statuses.name AS "status", timeTypes.name AS 'timeType' FROM timeIns 
JOIN employees ON timeIns.employeeId = employees.id JOIN timeTypes ON timeIns.timeTypesId = timeTypes.id 
JOIN statuses ON timeIns.statusId = statuses.id;

#kung may space
SELECT firstName, lastName, date, time, statuses.name AS "status", timeTypes.name AS 'time Type' FROM timeIns 
JOIN employees ON timeIns.employeeId = employees.id JOIN timeTypes ON timeIns.timeTypesId = timeTypes.id 
JOIN statuses ON timeIns.statusId = statuses.id;
#Maurisse, Kort, Kort

#pagka join saka idudugtong si where
SELECT employeeId, firstName, lastName, date, time, statuses.name AS "status", timeTypes.name AS 'time Type' FROM timeIns 
JOIN employees ON timeIns.employeeId = employees.id JOIN timeTypes ON timeIns.timeTypesId = timeTypes.id 
JOIN statuses ON timeIns.statusId = statuses.id WHERE employees.id = 1;
#si Maurise

#queries .sql sa capstone
#erd

#what worked well? ano nagustuhan sa week?
#samples

#CAPSTONE ERD AND TABLE STRUCTURE
