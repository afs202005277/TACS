CREATE TABLE Pilot(
    id INTEGER NOT NULL,
    name VARCHAR(255) NOT NULL,
    number INTEGER NOT NULL,
    active BOOLEAN NOT NULL,
    height FLOAT NOT NULL,
    team_id INTEGER REFERENCES Team(id),
    PRIMARY KEY(id)
);

CREATE TABLE Team(
    id INTEGER NOT NULL,
    name VARCHAR(255) NOT NULL,
    numberTrophies INTEGER NOT NULL,
    fundedDate DATE NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE Race(
    id INTEGER NOT NULL,
    laps INTEGER NOT NULL,
    date DATE NOT NULL,
    bestLapTime TIME NOT NULL,
    calendar_id INTEGER NOT NULL REFERENCES Calendar(id),
    location_id INTEGER REFERENCES RaceLocation(id),
    PRIMARY KEY(id)
);

CREATE TABLE RaceLocation(
    id INTEGER NOT NULL,
    country TEXT NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE Calendar(
    id INTEGER NOT NULL,
    year integer NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE PilotRace(
    pilot_id INTEGER NOT NULL REFERENCES Pilot(id),
    team_id INTEGER NOT NULL REFERENCES Team(id),
    PRIMARY KEY(pilot_id, team_id)
);