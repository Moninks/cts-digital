SELECT u.user_id, u.name, e.event_name, e.city, e.event_date
FROM users u
JOIN registrations r ON u.user_id = r.user_id
JOIN events e ON r.event_id = e.event_id
WHERE e.event_date > CURRENT_DATE AND u.city = e.city
ORDER BY e.event_date;