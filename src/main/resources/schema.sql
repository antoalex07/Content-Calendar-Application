CREATE TABLE IF NOT EXISTS Content (
    id INTEGER AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    desc TEXT,
    status VARCHAR(255) NOT NULL,
    contentType VARCHAR(50) NOT NULL,
    dateCreated TIMESTAMP NOT NULL,
    dateUpdated TIMESTAMP,
    url VARCHAR(255),
    PRIMARY KEY(id)
);