CREATE TABLE human
(
    name           TEXT,
    age            SMALLSERIAL,
    driver_license BOOLEAN,
    car_id         INTEGER
);

CREATE TABLE car
(
    id        INTEGER PRIMARY KEY,
    car_brand TEXT,
    model     TEXT,
    cost      INTEGER
);

SELECT human.name,
       human.age,
       human.driver_license,
       car.car_brand,
       car.cost,
       car.model
FROM human
         FULL JOIN car on human.car_id = car.id;