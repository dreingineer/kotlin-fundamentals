#0
CREATE DATABASE timetracker;

USE timetracker;

#1
CREATE TABLE departments (
	id BIGINT NOT NULL,
	name VARCHAR(255)
);

#2
ALTER TABLE departments ADD PRIMARY KEY (id);

#3
CREATE TABLE statuses (
	id BIGINT NOT NULL,
	name VARCHAR(255)	
);

#4
ALTER TABLE statuses ADD PRIMARY KEY (id);

#5
CREATE TABLE timeTypes(
	id BIGINT NOT NULL,
	name VARCHAR(255),
	type VARCHAR(255)
);

#6
ALTER TABLE timeTypes ADD PRIMARY KEY (id);

#7
ALTER TABLE timeTypes MODIFY type INT;

#8
ALTER TABLE timeTypes DROP COLUMN type;

#9
CREATE TABLE timeIns(
	id BIGINT NOT NULL,
	date DATE,
	timeTypeId BIGINT,
	statusId BIGINT,
	PRIMARY KEY (id),
	FOREIGN KEY (timeTypeId) REFERENCES timeTypes(id),
	FOREIGN KEY (statusId) REFERENCES statuses(id)
);

#10
CREATE TABLE employees(
	id BIGINT NOT NULL,
	firstName VARCHAR(255),
	lastName VARCHAR(255),
	employeeId VARCHAR(255),
	designation VARCHAR(255),
	departmentId BIGINT,
	PRIMARY KEY (id),
	FOREIGN KEY (departmentId) REFERENCES departments(id)
);

#WORKING LAHAT