
-- egg bhurji
INSERT INTO Recipe_To_Ingredient_Map (recipe_id, ingredient_id)
VALUES
    ((SELECT id FROM Recipe WHERE name = 'egg bhuji'), (SELECT id FROM Ingredient WHERE name = 'onions')),
    ((SELECT id FROM Recipe WHERE name = 'egg bhuji'), (SELECT id FROM Ingredient WHERE name = 'tomatoes')),
    ((SELECT id FROM Recipe WHERE name = 'egg bhuji'), (SELECT id FROM Ingredient WHERE name = 'eggs'));

-- paneer butter masala
INSERT INTO Recipe_To_Ingredient_Map (recipe_id, ingredient_id)
VALUES
    ((SELECT id FROM Recipe WHERE name = 'paneer butter masala'), (SELECT id FROM Ingredient WHERE name = 'paneer')),
    ((SELECT id FROM Recipe WHERE name = 'paneer butter masala'), (SELECT id FROM Ingredient WHERE name = 'butter')),
    ((SELECT id FROM Recipe WHERE name = 'paneer butter masala'), (SELECT id FROM Ingredient WHERE name = 'tomatoes')),
    ((SELECT id FROM Recipe WHERE name = 'paneer butter masala'), (SELECT id FROM Ingredient WHERE name = 'onions'));

-- aloo paratha
INSERT INTO Recipe_To_Ingredient_Map (recipe_id, ingredient_id)
VALUES
    ((SELECT id FROM Recipe WHERE name = 'aloo paratha'), (SELECT id FROM Ingredient WHERE name = 'potatoes')),
    ((SELECT id FROM Recipe WHERE name = 'aloo paratha'), (SELECT id FROM Ingredient WHERE name = 'wheat flour')),
    ((SELECT id FROM Recipe WHERE name = 'aloo paratha'), (SELECT id FROM Ingredient WHERE name = 'onions'));

-- daal tadka
INSERT INTO Recipe_To_Ingredient_Map (recipe_id, ingredient_id)
VALUES
    ((SELECT id FROM Recipe WHERE name = 'dal tadka'), (SELECT id FROM Ingredient WHERE name = 'tomatoes')),
    ((SELECT id FROM Recipe WHERE name = 'dal tadka'), (SELECT id FROM Ingredient WHERE name = 'Toor Dal (Pigeon Pea Lentils)')),
    ((SELECT id FROM Recipe WHERE name = 'dal tadka'), (SELECT id FROM Ingredient WHERE name = 'onions'));

-- veg pulao
INSERT INTO Recipe_To_Ingredient_Map (recipe_id, ingredient_id)
VALUES
    ((SELECT id FROM Recipe WHERE name = 'veg pulao'), (SELECT id FROM Ingredient WHERE name = 'rice')),
    ((SELECT id FROM Recipe WHERE name = 'veg pulao'), (SELECT id FROM Ingredient WHERE name = 'carrots')),
    ((SELECT id FROM Recipe WHERE name = 'veg pulao'), (SELECT id FROM Ingredient WHERE name = 'peas'));

-- kadhi pakora
INSERT INTO Recipe_To_Ingredient_Map (recipe_id, ingredient_id)
VALUES
    ((SELECT id FROM Recipe WHERE name = 'kadhi pakora'), (SELECT id FROM Ingredient WHERE name = 'gram flour')),
    ((SELECT id FROM Recipe WHERE name = 'kadhi pakora'), (SELECT id FROM Ingredient WHERE name = 'yogurt'));

-- Recipe table
-- 1|egg bhuji|easy egg bhuji (scrambled eggs) with onions and tomato|https://www.dummy-image.com|4.1|EASY|turmeric,salt,pepper|3|1|recipe_1.md|1
-- 2|paneer butter masala|creamy paneer curry in rich tomato and butter gravy|https://www.dummy-image.com|4.5|MEDIUM|garam_masala,turmeric,salt|3|1|recipe_2.md|1
-- 3|aloo paratha|stuffed flatbread with spiced mashed potatoes|https://www.dummy-image.com|4.3|EASY|salt,chili_powder,cumin|2|2|recipe_3.md|1
-- 4|dal tadka|yellow lentils tempered with cumin, garlic, and red chili|https://www.dummy-image.com|4.2|EASY|turmeric,salt,cumin|3|1|recipe_4.md|1
-- 5|veg pulao|flavored rice cooked with vegetables and mild spices|https://www.dummy-image.com|4.4|EASY|turmeric,cardamom,cumin|3|2|recipe_5.md|1
-- 6|kadhi pakora|yogurt-based curry with gram flour fritters|https://www.dummy-image.com|4.3|EASY|cumin,salt,pepper|3|2|recipe_6.md|1
-- 7|chole bhature|spicy chickpea curry served with fried bread|https://www.dummy-image.com|4.6|MEDIUM|garam_masala,salt,cumin|4|1|recipe_7.md|1
-- 8|palak paneer|spinach and paneer cooked in a creamy gravy|https://www.dummy-image.com|4.5|MEDIUM|turmeric,garam_masala,cumin|3|1|recipe_8.md|1
-- 9|maggi|instant noodles cooked with spices and vegetables|https://www.dummy-image.com|4.9|EASY|maggi_masala,salt,pepper|1|2|recipe_9.md|1
-- 10|mix veg curry|mixed vegetables cooked in a flavorful curry sauce|https://www.dummy-image.com|4.2|MEDIUM|turmeric,salt,cumin|4|1|recipe_10.md|1

-- Ingredients
-- 1|onions|
-- 2|tomatoes|
-- 3|eggs|
-- 4|paneer|
-- 5|butter|
-- 6|cream|
-- 7|rice|
-- 8|carrots|
-- 9|peas|
-- 10|beans|
-- 11|potatoes|
-- 12|wheat flour|
-- 13|yogurt|
-- 14|gram flour|
-- 15|chickpeas|
-- 16|spinach|
-- 17|instant noodles|
-- 18|cabbage|
