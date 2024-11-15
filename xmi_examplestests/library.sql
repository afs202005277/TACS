CREATE TABLE Author(
    id INTEGER NOT NULL,
    name TEXT NOT NULL,
    country TEXT NOT NULL,
    active BOOLEAN NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE Book (
    id INTEGER NOT NULL,
    title TEXT NOT NULL,
    year INTEGER NOT NULL,
    PRIMARY KEY(id),
    author_id INTEGER REFERENCES Author(id),
    publisher_id INTEGER REFERENCES Publisher(id)
);

CREATE TABLE Genre (
    id INTEGER NOT NULL,
    name TEXT NOT NULL,
    PRIMARY KEY(name)
);

CREATE TABLE Publisher (
    id INTEGER NOT NULL,
    name TEXT NOT NULL,
    country TEXT NOT NULL,
    PRIMARY KEY(name)
);

CREATE TABLE BookGenre(
    book_id INTEGER NOT NULL,
    genre_id INTEGER NOT NULL,
    PRIMARY KEY(book_id, genre_id)
);