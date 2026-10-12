CREATE SEQUENCE IF NOT EXISTS users_seq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE IF NOT EXISTS tours_sequence START WITH 1 INCREMENT BY 1;

CREATE TABLE IF NOT EXISTS users (
                                     id BIGINT PRIMARY KEY DEFAULT nextval('users_seq'),
    username VARCHAR(255) NOT NULL
    );

CREATE TABLE IF NOT EXISTS tours (
                                     id BIGINT PRIMARY KEY DEFAULT nextval('tours_sequence'),
    destination VARCHAR(255) NOT NULL,
    description TEXT,
    budget DOUBLE PRECISION,
    start_date DATE,
    user_id BIGINT NOT NULL,
    CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES users(id)
    );