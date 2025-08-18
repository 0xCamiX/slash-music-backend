-- V2__Insert_sample_data.sql
-- Insert sample data for testing

-- Insert sample users
INSERT INTO users (name, email, password_hash, created_at, updated_at) VALUES
('Admin User', 'admin@lash.com', 'admin123', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Test User', 'test@lash.com', 'test123', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP)
ON CONFLICT (email) DO NOTHING;

-- Insert sample artists
INSERT INTO artists (name, created_at, updated_at) VALUES
('The Beatles', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Queen', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Pink Floyd', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP)
ON CONFLICT (id) DO NOTHING;

-- Insert sample songs
INSERT INTO songs (title, artist, album, genre, duration, created_at, updated_at) VALUES
('Hey Jude', 'The Beatles', 'The Beatles 1967-1970', 'Rock', 431, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Bohemian Rhapsody', 'Queen', 'A Night at the Opera', 'Rock', 354, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Comfortably Numb', 'Pink Floyd', 'The Wall', 'Progressive Rock', 383, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP)
ON CONFLICT (id) DO NOTHING;
