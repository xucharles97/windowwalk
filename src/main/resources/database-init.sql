DROP TABLE IF EXISTS order_items;
DROP TABLE IF EXISTS menu_items;
DROP TABLE IF EXISTS restaurants;
DROP TABLE IF EXISTS carts;
DROP TABLE IF EXISTS authorities;
DROP TABLE IF EXISTS customers;


CREATE TABLE customers
(
    id         SERIAL PRIMARY KEY   NOT NULL,
    email      TEXT UNIQUE          NOT NULL,
    enabled    BOOLEAN DEFAULT TRUE NOT NULL,
    password   TEXT                 NOT NULL,
    first_name TEXT,
    last_name  TEXT
);


CREATE TABLE carts
(
    id          SERIAL PRIMARY KEY NOT NULL,
    customer_id INTEGER UNIQUE     NOT NULL,
    total_price NUMERIC            NOT NULL,
    CONSTRAINT fk_customer FOREIGN KEY (customer_id) REFERENCES customers (id) ON DELETE CASCADE
);


CREATE TABLE restaurants
(
    id        SERIAL PRIMARY KEY NOT NULL,
    name      TEXT               NOT NULL,
    address   TEXT,
    image_url TEXT,
    phone     TEXT
);


CREATE TABLE menu_items
(
    id            SERIAL PRIMARY KEY NOT NULL,
    restaurant_id INTEGER            NOT NULL,
    name          TEXT               NOT NULL,
    price         NUMERIC            NOT NULL,
    description   TEXT,
    image_url     TEXT,
    CONSTRAINT fk_restaurant FOREIGN KEY (restaurant_id) REFERENCES restaurants (id) ON DELETE CASCADE
);


CREATE TABLE order_items
(
    id           SERIAL PRIMARY KEY NOT NULL,
    menu_item_id INTEGER            NOT NULL,
    cart_id      INTEGER            NOT NULL,
    price        NUMERIC            NOT NULL,
    quantity     INTEGER            NOT NULL,
    CONSTRAINT fk_cart FOREIGN KEY (cart_id) REFERENCES carts (id) ON DELETE CASCADE,
    CONSTRAINT fk_menu_item FOREIGN KEY (menu_item_id) REFERENCES menu_items (id) ON DELETE CASCADE
);


CREATE TABLE authorities
(
    id        SERIAL PRIMARY KEY NOT NULL,
    email     TEXT               NOT NULL,
    authority TEXT               NOT NULL,
    CONSTRAINT fk_customer FOREIGN KEY (email) REFERENCES customers (email) ON DELETE CASCADE
);


INSERT INTO restaurants (name, address, image_url, phone)
VALUES ('WcDonalds', '123 Burger St, Fry City, CA 98579',
        'https://fortune.com/img-assets/wp-content/uploads/2024/07/GettyImages-2061707064-e1720018092958.jpg?w=1440&q=75',
        '(408) 777-7777'),
       ('Great Wok of China', '689 Chinatown St, Woktown, CA 98689',
        'https://media.istockphoto.com/id/1250406797/vector/wok-asian-street-food-cartoon-style-vector-illustration-isolated-on-white-background.jpg?s=1024x1024&w=is&k=20&c=0_9cuM96IDMJjnngHc_fpo3wdTigNvqXAZJwZhMbcVE=',
        '(650) 888-8888'),
       ('Big Tacorrito', '456 Bean St, Tacoland, CA 98578',
        'https://img.freepik.com/premium-vector/cute-taco-burrito-food-cartoon-food-icon-concept_11393-586.jpg',
        '(408) 999-9999');

INSERT INTO menu_items (description, image_url, name, price, restaurant_id)
VALUES ('One of the Macs of All Time',
        'https://topsecretrecipes.com/images/product/Big%20Mac%201200.jpg',
        'Medium Mac', 5.99, 1),
       ('Made the WcDonalds Way',
        'https://latourangelle.com/cdn/shop/articles/hikynvl8pjkjqhvpnok6_1200x.jpg?v=1619198610',
        'Wrench Fries', 2.99, 1),
       ('A Hash Brown to wash everything down',
        'https://www.emmymade.com/wp-content/uploads/2021/05/homemade_mcdonalds_hashbrowns-500x500.jpeg',
        'Wash Brown', 3.99, 1),
       ('The recipe from when he was just a captain',
        'https://www.recipetineats.com/tachyon/2020/10/General-Tsao-Chicken_1-SQ.jpg?resize=500%2C375',
        'Captain Tso Chicken', 12.99, 2),
       ('Chow down on this delicious mein',
        'https://tastesbetterfromscratch.com/wp-content/uploads/2023/10/Chow-Mein-1.jpg',
        'Chowed Mein', 12.99, 2),
       ('Rice.',
        'https://instafreshmeals.com/wp-content/uploads/2018/04/Perfect-White-Rice-3-of-4.jpg',
        'Rice', 3.99, 2),
       ('Taco.',
        'https://media.gq.com/photos/586e7b422b7fa5e464f03f7c/master/pass/jack-in-the-box-tacos.jpg',
        'Taco', 2.99, 3),
       ('Burrito.',
        'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT33c5zJFsbKUm_6qyZVgdtnYy1fQQbQGHcRQ&s',
        'Burrito', 12.99, 3),
       ('Guac.',
        'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRpHuADElFXidt48YEa-zWmgCzaiheRTv5HdQ&s',
        'Guacamole', 1.99, 3);
