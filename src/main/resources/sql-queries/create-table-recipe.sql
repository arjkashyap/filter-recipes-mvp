CREATE TABLE Recipe (
                        id INTEGER PRIMARY KEY AUTOINCREMENT, -- Auto incrementing primary key
                        name VARCHAR(255) NOT NULL,           -- Name of the recipe, not null
                        description VARCHAR(500),             -- Description of the recipe
                        cover_image VARCHAR(255),             -- Optional cover image
                        rating VARCHAR(5),                    -- Optional rating
                        tier VARCHAR(50) DEFAULT 'MEDIUM',    -- Tier of difficulty with default value 'MEDIUM'
                        spices VARCHAR(255) NOT NULL,         -- Required spices for the recipe
                        ingredients_required_count INT DEFAULT 0,  -- Default to 0
                        ingredients_optional_count INT DEFAULT 0,  -- Default to 0
                        content VARCHAR(255) NOT NULL,        -- Content (e.g., markdown filename)
                        veg BOOLEAN NOT NULL                 -- True or False for vegetarian or not
);
