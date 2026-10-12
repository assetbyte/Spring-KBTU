INSERT INTO users (id, username)
VALUES (nextval('users_seq'), 'asset_user')
    ON CONFLICT (id) DO NOTHING;

INSERT INTO tours (id, destination, description, budget, start_date, user_id)
VALUES (nextval('tours_sequence'), 'Almaty', 'Charyn Canyon Tour', 25000.0, '2026-06-15', 1)
    ON CONFLICT (id) DO NOTHING;

INSERT INTO tours (id, destination, description, budget, start_date, user_id)
VALUES (nextval('tours_sequence'), 'Astana', 'Capital City Sightseeing', 40000.0, '2026-07-01', 1)
    ON CONFLICT (id) DO NOTHING;