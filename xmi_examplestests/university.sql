CREATE TABLE Student(
    id INTEGER NOT NULL,
    name TEXT NOT NULL,
    number INTEGER NOT NULL,
    age INTEGER NOT NULL,
    gpa FLOAT NOT NULL,
    PRIMARY KEY(id),
    major_id INTEGER REFERENCES Major(id)
);

CREATE TABLE Major(
    id INTEGER NOT NULL,
    name TEXT NOT NULL,
    code TEXT NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE Course(
    id INTEGER NOT NULL,
    name TEXT NOT NULL,
    credits FLOAT NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE Professor(
    id INTEGER NOT NULL,
    name TEXT NOT NULL,
    number TEXT NOT NULL,
    age INTEGER NOT NULL,
    department TEXT NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE MajorCourse(
    major_id INTEGER REFERENCES Major(id),
    course_id INTEGER REFERENCES Course(id),
    PRIMARY KEY(major_id, course_id)
);

CREATE TABLE CourseProfessor(
    course_id INTEGER REFERENCES Course(id),
    professor_id INTEGER REFERENCES Professor(id),
    PRIMARY KEY(course_id, professor_id)
);