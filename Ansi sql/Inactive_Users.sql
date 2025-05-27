SELECT u.user_id, u.name
FROM users u
LEFT JOIN registrations r ON u.user_id = r.user_id
GROUP BY u.user_id, u.name
HAVING MAX(r.registration_date) IS NULL OR MAX(r.registration_date) < CURRENT_DATE - INTERVAL '90 days';