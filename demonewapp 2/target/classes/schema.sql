CREATE TABLE IF NOT EXISTS product (
    prodid INT PRIMARY KEY,
    name VARCHAR(100),
    desc VARCHAR(255),
    brand VARCHAR(100),
    price DECIMAL(10,2),
    category VARCHAR(100),
    releasedate DATE,
    availablity BOOLEAN,
    quantity INT
);
