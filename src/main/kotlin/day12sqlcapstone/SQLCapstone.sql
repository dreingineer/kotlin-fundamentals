DROP DATABASE usapangAnimal;
CREATE DATABASE usapangAnimal;
USE usapangAnimal;

CREATE TABLE owners (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255),
    age VARCHAR(255),
    PRIMARY KEY (id)
);

CREATE TABLE pets (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255),
    size VARCHAR(255),
    numberOfLegs VARCHAR(255),
    category VARCHAR(255),
    type VARCHAR(255),
    birthday DATE,
    ownerId BIGINT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (ownerId) REFERENCES owners(id)
);

CREATE TABLE faveFood (
    id BIGINT NOT NULL AUTO_INCREMENT,
    foodName VARCHAR(255),
    brand VARCHAR(255),
    type VARCHAR(255),
    PRIMARY KEY (id)
);

CREATE TABLE petFaveFood (
    id BIGINT NOT NULL AUTO_INCREMENT,
    petId BIGINT NOT NULL,
    faveFoodId BIGINT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (petId) REFERENCES pets(id),
    FOREIGN KEY (faveFoodId) REFERENCES faveFood(id)
);

CREATE TABLE clothes (
    id BIGINT NOT NULL AUTO_INCREMENT,
    description VARCHAR(255),
    size VARCHAR(255),
    brand VARCHAR(255),
    PRIMARY KEY (id)
);

CREATE TABLE petClothes (
    id BIGINT NOT NULL AUTO_INCREMENT,
    petId BIGINT NOT NULL,
    clothesId BIGINT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (petId) REFERENCES pets(id),
    FOREIGN KEY (clothesId) REFERENCES clothes(id)
);

CREATE TABLE toys (
    id BIGINT NOT NULL AUTO_INCREMENT,
    description VARCHAR(255),
    category VARCHAR(255),
    PRIMARY KEY (id)
);

CREATE TABLE petToys (
    id BIGINT NOT NULL AUTO_INCREMENT,
    petId BIGINT NOT NULL,
    toyId BIGINT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (petId) REFERENCES pets(id),
    FOREIGN KEY (toyId) REFERENCES toys(id)
);

#---> LIKE
SELECT name, size, type, category FROM pets WHERE category LIKE 'o%';

#---> DISTINCT
SELECT DISTINCT(brand) FROM clothes;

#---> LIMIT
SELECT name, age FROM owners LIMIT 5;

#--->SORTING
SELECT name, category, type FROM pets WHERE category LIKE 'Outdoor' ORDER BY name DESC;

#---> JOIN
SELECT owners.name, pets.name, category, ownerId type FROM pets JOIN owners ON pets.ownerId = owners.id;


#SUBQUERY SCRATCH
SELECT id FROM faveFood WHERE type = "wet"
SELECT petId FROM petFaveFood WHERE faveFoodId IN ()
SELECT id FROM pets WHERE id IN ()



#WORKING SUBQUERY

#Duck
#Horned rattlesnake
SELECT name, size FROM pets WHERE id IN (SELECT petId FROM petFaveFood WHERE faveFoodId IN (SELECT id FROM faveFood WHERE type = "wet"));

#OWNERS OF DUCK and HORNED RATTLESNAKE
#RUBIN MALLISON
#GEORGETA HILLBORNE
SELECT name, age FROM owners WHERE id IN (SELECT id FROM pets WHERE id IN (SELECT petId FROM petFaveFood WHERE faveFoodId IN (SELECT id FROM faveFood WHERE type = "wet")));


#SELECT petId FROM petFaveFood WHERE faveFoodId IN (SELECT id FROM faveFood WHERE type = "wet");