CREATE TABLE Ingredient (
                             id INTEGER PRIMARY KEY AUTOINCREMENT, -- Auto incrementing primary key
                             name VARCHAR(255) NOT NULL,           -- Name of the ingredient, not null
                             price DECIMAL(10, 2)     ,             -- Optional price of the ingredient
                             is_spice BOOLEAN DEFAULT false        -- True or False if or not recipe
);
