SELECT e.event_id, e.event_name,
       SUM(CASE WHEN r.resource_type = 'PDF' THEN 1 ELSE 0 END) AS pdf_count,
       SUM(CASE WHEN r.resource_type = 'Image' THEN 1 ELSE 0 END) AS image_count,
       SUM(CASE WHEN r.resource_type = 'Link' THEN 1 ELSE 0 END) AS link_count
FROM events e
LEFT JOIN resources r ON e.event_id = r.event_id
GROUP BY e.event_id, e.event_name;
