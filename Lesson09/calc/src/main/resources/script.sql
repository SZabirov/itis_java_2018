--запрос для создания новой таблицы
--INT - для чисел
--VARCHAR(255) - строковое значение, с макс. 255 символами
CREATE TABLE poll(
  id INT,
  question VARCHAR(255)
);
--Запрос для вставки новой строки в таблицу
INSERT INTO poll(id, question)
VALUES (1, 'Ваш возраст');

--запрос для получения всех данных из таблицы
SELECT * FROM poll;

--запрос для получения значений, хранящихся в колонке question
SELECT question FROM poll;

SELECT question, id FROM poll;

INSERT INTO poll(id, question)
VALUES (2, 'Ваше образование');

--удалит все строки, id которых равно 1
DELETE FROM poll WHERE id = 1;

--удаляет всю таблицу. После выполнения указанной таблицы не будет существовать
DROP TABLE poll;
--PRIMARY KEY требует: 1) чтобы значения данной колонки
--были уникальны. 2) чтобы обязательно при вставке новой строки
--передавалось некоторое значение!
CREATE TABLE poll (
  id INT PRIMARY KEY,
  question VARCHAR(255)
);

INSERT INTO poll (id, question) VALUES (1, 'Возраст?');
INSERT INTO poll (id, question) VALUES (1, 'Образование?');--будет ошибка, т. к. такое значение id уже есть в таблице

DROP TABLE poll;

CREATE TABLE poll (
  id SERIAL PRIMARY KEY,
  question VARCHAR(255)
);

INSERT INTO poll (question) VALUES ('Ваш возраст?');
INSERT INTO poll (question) VALUES ('Ваше образование?');

CREATE TABLE option (
  id SERIAL PRIMARY KEY,
  text VARCHAR(255),
  poll_id INT
);

INSERT INTO option(text, poll_id)
VALUES ('> 18', 1), ('< 18', 1), ('Среднее', 2), ('Высшее', 2);

SELECT * FROM option WHERE poll_id =
                           (SELECT id FROM poll WHERE question = 'Ваше образование?');









