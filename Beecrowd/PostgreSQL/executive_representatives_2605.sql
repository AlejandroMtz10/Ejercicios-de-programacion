-- Executive Representatives
-- Problem Number: 2605
-- https://www.beecrowd.com.br/judge/es/problems/view/2605
-- Command Solution
SELECT p.name AS product_name, pr.name AS provider_name FROM products p
JOIN providers pr ON p.id_providers = pr.id WHERE p.id_categories = 6;