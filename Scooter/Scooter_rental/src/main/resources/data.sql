/*
Manufacture insert
*/
insert into manufactures (id,name, version)
VALUES (1,'Xiaomi',0),(2,'BMW',0),(3,'Tier',0);

/*
Models insert
*/
insert into models (model_label, service_interval,manufactures_id, version)
VALUES ('Hyper Hyper',50,1,0),('Future',300,1,0),('Future',3,2,0),('SUI',200,3,0);
/*
Countries insert
*/
insert into countries (isocode, version, name)
VALUES ('AUT',0,'Austria'),('GER',0,'Germany'),('FRA',0,'France'),('IRE',0,'Ireland');

/*
Cities
*/
insert into cities (id, version, inhabitants, name, country_isocode)
VALUES (1,0,15000,'Zwettl','AUT'),(2,0,2000000,'Wien','AUT'),(3,0,50000,'Pforzheim','GER');

/*
Scooter
*/
insert into scooters (serial_number, version, battery_level, purchasedate, scrapping_date, city_id, models_manufactures_id, models_model_label)
VALUES ('SEI123GHJ56',0,50,'2022-09-01',null,1,1,'Hyper Hyper'),
       ('SEI123GHJ57',0,90,'2022-05-13',null,1,2,'Future'),
       ('SEI123GHJ58',0,20,'2022-06-21',null,2,1,'Future'),
       ('SEI123GHJ59',0,80,'2022-03-31',null,2,2,'Future'),
       ('SEI123GHJ50',0,35,'2022-01-11',null,3,3,'SUI');

INSERT INTO employees (id, version, first_name, last_name, social_security_number, city_id)
VALUES (1, 0, 'Test', 'Employee', '4221 040203', 1);