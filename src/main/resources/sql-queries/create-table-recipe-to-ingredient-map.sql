CREATE TABLE Recipe_To_Ingredient_Map (
                                           id INTEGER PRIMARY KEY AUTOINCREMENT, -- Auto incrementing primary key
                                           recipe_id INTEGER NOT NULL,           -- Foreign key pointing to Recipe table
                                           ingredient_id INTEGER NOT NULL,       -- Foreign key pointing to Ingredients table,
                                           FOREIGN KEY (recipe_id) REFERENCES Recipe(id),
                                           FOREIGN KEY (ingredient_id) REFERENCES Ingredients(id)
);
