-- Возраст студента не может быть меньше 16 лет.
ALTER TABLE student
    ADD CONSTRAINT age_constraint CHECK (age >= 16);

-- Имена студентов должны быть уникальными и не равно нулю.
ALTER TABLE student
    ADD PRIMARY KEY (name);

-- Нара значений названия и цвета факультета должны быть уникальными.
ALTER TABLE faculty
    ADD CONSTRAINT color_unique UNIQUE (color);
ALTER TABLE faculty
    ADD CONSTRAINT name_unique UNIQUE (name);
-- При создании студента без возраста присваивать ему 20 лет.
CREATE TABLE student(
    age TEXT DEFAULT 20
)