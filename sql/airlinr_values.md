mysql> INSERT INTO passenger

&nbsp;   -> (P\_id, P\_name, mob\_no, email, seat\_preference)

&nbsp;   -> VALUES

&nbsp;   -> (1,'Rahul Sharma','9899543077','rahul@gmail.com','Middle'),

&nbsp;   -> (2, 'Priya Patil', '9876543211', 'priya@gmail.com', 'Middle'),

&nbsp;   -> (3, 'Amit Verma', '9876543212', 'amit@gmail.com', 'Extra Legroom'),

&nbsp;   -> (4, 'Sneha Kulkarni', '9876543213', 'sneha@gmail.com', 'Window'),

&nbsp;   -> (5, 'Rohit Singh', '9876543214', 'rohit@gmail.com', 'Middle'),

&nbsp;   -> (6, 'Anjali Deshmukh', '9876543215', 'anjali@gmail.com', 'Extra Legroom'),

&nbsp;   -> (7, 'Vikas Gupta', '9876543216', 'vikas@gmail.com', 'Window'),

&nbsp;   -> (8, 'Neha Joshi', '9876543217', 'neha@gmail.com', 'Middle'),

&nbsp;   -> (9, 'Suresh Sul', '9876543218', 'suresh@gmail.com', 'Extra Legroom'),

&nbsp;   -> (10, 'Pooja Mehta', '9876543219', 'pooja@gmail.com', 'Window'),

&nbsp;   -> (11, 'Karan Malhotra', '9876543220', 'karan@gmail.com', 'Middle'),

&nbsp;   -> (12, 'Jay Nair', '9876543221', 'jay@gmail.com', 'Extra Legroom'),

&nbsp;   -> (13, 'Arjun Reddy', '9876543222', 'arjun@gmail.com', 'Window'),

&nbsp;   -> (14, 'Swati Chopra', '9876543223', 'swati@gmail.com','Middle'),

&nbsp;   -> (15, 'Manoj Bansal', '9876543224', 'manoj@gmail.com', 'Middle');





mysql> **table passenger;**

+------+-----------------+------------+------------------+-----------------+

| P\_id | P\_name          | mob\_no     | email            | seat\_preference |

+------+-----------------+------------+------------------+-----------------+

|    1 | Rahul Sharma    | 9899543077 | rahul@gmail.com  | Middle          |

|    2 | Priya Patil     | 9876543211 | priya@gmail.com  | Middle          |

|    3 | Amit Verma      | 9876543212 | amit@gmail.com   | Extra Legroom   |

|    4 | Sneha Kulkarni  | 9876543213 | sneha@gmail.com  | Window          |

|    5 | Rohit Singh     | 9876543214 | rohit@gmail.com  | Middle          |

|    6 | Anjali Deshmukh | 9876543215 | anjali@gmail.com | Extra Legroom   |

|    7 | Vikas Gupta     | 9876543216 | vikas@gmail.com  | Window          |

|    8 | Neha Joshi      | 9876543217 | neha@gmail.com   | Middle          |

|    9 | Suresh Sul      | 9876543218 | suresh@gmail.com | Extra Legroom   |

|   10 | Pooja Mehta     | 9876543219 | pooja@gmail.com  | Window          |

|   11 | Karan Malhotra  | 9876543220 | karan@gmail.com  | Middle          |

|   12 | Jay Nair        | 9876543221 | jay@gmail.com    | Extra Legroom   |

|   13 | Arjun Reddy     | 9876543222 | arjun@gmail.com  | Window          |

|   14 | Swati Chopra    | 9876543223 | swati@gmail.com  | Middle          |

|   15 | Manoj Bansal    | 9876543224 | manoj@gmail.com  | Middle          |

+------+-----------------+------------+------------------+-----------------+





mysql> insert into aircraft

&nbsp;   -> (aircraft\_id, register\_no, total\_seats, aircraft\_type)

&nbsp;   -> values

&nbsp;   -> (1,1001,180,'Boeing 737'),

&nbsp;   -> (2,1002,220,'Airbus A320'),

&nbsp;   -> (3,1003,300,'Boeing 777'),

&nbsp;   -> (4,1004,350,'Airbus A350'),

&nbsp;   -> (5,1005,150,'Embraer E195'),

&nbsp;   -> (6,1006,280,'Boeing 787'),

&nbsp;   -> (7,1007,240,'Airbus A321'),

&nbsp;   -> (8,1008,200,'Boeing 747'),

&nbsp;   -> (9,1009,310,'Airbus A330'),

&nbsp;   -> (10,1010,300,'Emirates Airbus A380');



mysql> **table aircraft;**

+-------------+-------------+-------------+----------------------+

| aircraft\_id | register\_no | total\_seats | aircraft\_type        |

+-------------+-------------+-------------+----------------------+

|           1 |        1001 |         180 | Boeing 737           |

|           2 |        1002 |         220 | Airbus A320          |

|           3 |        1003 |         300 | Boeing 777           |

|           4 |        1004 |         350 | Airbus A350          |

|           5 |        1005 |         150 | Embraer E195         |

|           6 |        1006 |         280 | Boeing 787           |

|           7 |        1007 |         240 | Airbus A321          |

|           8 |        1008 |         200 | Boeing 747           |

|           9 |        1009 |         310 | Airbus A330          |

|          10 |        1010 |         300 | Emirates Airbus A380 |

+-------------+-------------+-------------+----------------------+



mysql> insert into flight

&nbsp;   -> (F\_id, origin, destination, departure, arrival\_time,aircraft\_id)

&nbsp;   -> values

&nbsp;   -> (1, 'Delhi', 'Mumbai', '2026-01-27 09:00:00', '2026-01-27 11:30:00', 1),

&nbsp;   -> (2, 'Mumbai', 'Bangalore', '2026-01-27 14:00:00', '2026-01-27 16:15:00', 2),

&nbsp;   -> (3, 'Bangalore', 'Chennai', '2026-01-28 06:00:00', '2026-01-28 07:30:00', 3),

&nbsp;   -> (4, 'Chennai', 'Kolkata', '2026-01-28 10:00:00', '2026-01-28 12:45:00', 4),

&nbsp;   -> (5, 'Kolkata', 'Delhi', '2026-01-29 15:00:00', '2026-01-29 17:45:00', 5),

&nbsp;   -> (6, 'Delhi', 'Dubai', '2026-01-29 22:00:00', '2026-01-30 01:30:00', 10),

&nbsp;   -> (7, 'Mumbai', 'Singapore', '2026-01-30 05:00:00', '2026-01-30 13:00:00', 9),

&nbsp;   -> (8, 'Bangalore', 'Doha', '2026-01-30 09:00:00', '2026-01-30 12:30:00', 6),

&nbsp;   -> (9, 'Chennai', 'Abu Dhabi', '2026-01-31 02:00:00', '2026-01-31 05:30:00', 10),

&nbsp;   -> (10, 'Kolkata', 'London', '2026-01-31 21:00:00', '2026-02-01 05:30:00', 8);



mysql> **table flight;**

+------+-----------+-------------+---------------------+---------------------+-------------+

| F\_id | origin    | destination | departure           | arrival\_time        | aircraft\_id |

+------+-----------+-------------+---------------------+---------------------+-------------+

|    1 | Delhi     | Mumbai      | 2026-01-27 09:00:00 | 2026-01-27 11:30:00 |           1 |

|    2 | Mumbai    | Bangalore   | 2026-01-27 14:00:00 | 2026-01-27 16:15:00 |           2 |

|    3 | Bangalore | Chennai     | 2026-01-28 06:00:00 | 2026-01-28 07:30:00 |           3 |

|    4 | Chennai   | Kolkata     | 2026-01-28 10:00:00 | 2026-01-28 12:45:00 |           4 |

|    5 | Kolkata   | Delhi       | 2026-01-29 15:00:00 | 2026-01-29 17:45:00 |           5 |

|    6 | Delhi     | Dubai       | 2026-01-29 22:00:00 | 2026-01-30 01:30:00 |          10 |

|    7 | Mumbai    | Singapore   | 2026-01-30 05:00:00 | 2026-01-30 13:00:00 |           9 |

|    8 | Bangalore | Doha        | 2026-01-30 09:00:00 | 2026-01-30 12:30:00 |           6 |

|    9 | Chennai   | Abu Dhabi   | 2026-01-31 02:00:00 | 2026-01-31 05:30:00 |          10 |

|   10 | Kolkata   | London      | 2026-01-31 21:00:00 | 2026-02-01 05:30:00 |           8 |

+------+-----------+-------------+---------------------+---------------------+-------------+





mysql> insert into crew

&nbsp;   -> (crew\_id, name, role, salary)

&nbsp;   -> values

&nbsp;   -> (1, 'Vivek Rao', 'Pilot', 120000.00),

&nbsp;   -> (2, 'Meena Iyer', 'Co-Pilot', 95000.00),

&nbsp;   -> (3, 'Sanjana Kapoor', 'Flight Attendants', 45000.00),

&nbsp;   -> (4, 'Raghav Menon', 'Flight Attendants', 47000.00),

&nbsp;   -> (5, 'Aditya Singh', 'Pilot', 125000.00),

&nbsp;   -> (6, 'Neelam Sharma', 'Co-Pilot', 98000.00),

&nbsp;   -> (7, 'Tanvi Desai', 'Flight Attendants', 46000.00),

&nbsp;   -> (8, 'Kunal Joshi', 'Flight Attendants', 48000.00),

&nbsp;   -> (9, 'Varun Reddy', 'Pilot', 130000.00),

&nbsp;   -> (10, 'Isha Gupta', 'Co-Pilot', 100000.00),

&nbsp;   -> (11, 'Priyanka Nair', 'Flight Attendants', 45000.00),

&nbsp;   -> (12, 'Siddharth Choudhary', 'Flight Attendants', 47000.00),

&nbsp;   -> (13, 'Harsh Vardhan', 'Pilot', 135000.00),

&nbsp;   -> (14, 'Ananya Bansal', 'Co-Pilot', 102000.00),

&nbsp;   -> (15, 'Ritika Mehta', 'Flight Attendants', 46000.00);



mysql> **table crew;**

+---------+---------------------+-------------------+-----------+

| crew\_id | name                | role              | salary    |

+---------+---------------------+-------------------+-----------+

|       1 | Vivek Rao           | Pilot             | 120000.00 |

|       2 | Meena Iyer          | Co-Pilot          |  95000.00 |

|       3 | Sanjana Kapoor      | Flight Attendants |  45000.00 |

|       4 | Raghav Menon        | Flight Attendants |  47000.00 |

|       5 | Aditya Singh        | Pilot             | 125000.00 |

|       6 | Neelam Sharma       | Co-Pilot          |  98000.00 |

|       7 | Tanvi Desai         | Flight Attendants |  46000.00 |

|       8 | Kunal Joshi         | Flight Attendants |  48000.00 |

|       9 | Varun Reddy         | Pilot             | 130000.00 |

|      10 | Isha Gupta          | Co-Pilot          | 100000.00 |

|      11 | Priyanka Nair       | Flight Attendants |  45000.00 |

|      12 | Siddharth Choudhary | Flight Attendants |  47000.00 |

|      13 | Harsh Vardhan       | Pilot             | 135000.00 |

|      14 | Ananya Bansal       | Co-Pilot          | 102000.00 |

|      15 | Ritika Mehta        | Flight Attendants |  46000.00 |

+---------+---------------------+-------------------+-----------+





mysql> INSERT INTO flightcrew\_assignment

&nbsp;   -> (assign\_id, crew\_id, F\_id, crew\_role)

&nbsp;   -> VALUES

&nbsp;   -> (1, 1, 1, 'Pilot'),

&nbsp;   -> (2, 2, 1, 'Co\_Pilot'),

&nbsp;   -> (3, 3, 1, 'Flight Attendants'),

&nbsp;   -> (4, 4, 2, 'Pilot'),

&nbsp;   -> (5, 5, 2, 'Co\_Pilot'),

&nbsp;   -> (6, 6, 2, 'Flight Attendants'),

&nbsp;   -> (7, 7, 3, 'Pilot'),

&nbsp;   -> (8, 8, 3, 'Co\_Pilot'),

&nbsp;   -> (9, 9, 3, 'Flight Attendants'),

&nbsp;   -> (10, 10, 4, 'Pilot');



mysql> **table flightcrew\_assignment;**

+-----------+---------+------+-------------------+

| assign\_id | crew\_id | f\_id | Crew\_role         |

+-----------+---------+------+-------------------+

|         1 |       1 |    1 | Pilot             |

|         2 |       2 |    1 | Co\_Pilot          |

|         3 |       3 |    1 | Flight Attendants |

|         4 |       4 |    2 | Pilot             |

|         5 |       5 |    2 | Co\_Pilot          |

|         6 |       6 |    2 | Flight Attendants |

|         7 |       7 |    3 | Pilot             |

|         8 |       8 |    3 | Co\_Pilot          |

|         9 |       9 |    3 | Flight Attendants |

|        10 |      10 |    4 | Pilot             |

+-----------+---------+------+-------------------+





mysql> INSERT INTO price

&nbsp;   -> (Price\_id, Fare\_class, price)

&nbsp;   -> VALUES

&nbsp;   -> (1, 'Economy', 3500.00),

&nbsp;   -> (2, 'Economy', 4200.00),

&nbsp;   -> (3, 'Economy', 5000.00),

&nbsp;   ->

&nbsp;   -> (4, 'Business', 8500.00),

&nbsp;   -> (5, 'Business', 9200.00),

&nbsp;   -> (6, 'Business', 11000.00),

&nbsp;   ->

&nbsp;   -> (7, 'First Class', 15000.00),

&nbsp;   -> (8, 'First Class', 18000.00),

&nbsp;   -> (9, 'First Class', 22000.00),

&nbsp;   -> (10,'First Class', 25000.00);





mysql> **table price;**

+----------+-------------+----------+

| Price\_id | Fare\_class  | price    |

+----------+-------------+----------+

|        1 | Economy     |  3500.00 |

|        2 | Economy     |  4200.00 |

|        3 | Economy     |  5000.00 |

|        4 | Business    |  8500.00 |

|        5 | Business    |  9200.00 |

|        6 | Business    | 11000.00 |

|        7 | First Class | 15000.00 |

|        8 | First Class | 18000.00 |

|        9 | First Class | 22000.00 |

|       10 | First Class | 25000.00 |

+----------+-------------+----------+





mysql> UPDATE price SET F\_id = 1 WHERE Price\_id = 1;  -- Economy 3500



mysql> UPDATE price SET F\_id = 1 WHERE Price\_id = 4;  -- Business 8500



mysql> UPDATE price SET F\_id = 1 WHERE Price\_id = 7;  -- First Class 15000



mysql> UPDATE price SET F\_id = 2 WHERE Price\_id = 2;  -- Economy 4200



mysql> UPDATE price SET F\_id = 2 WHERE Price\_id = 5;  -- Business 9200



mysql> UPDATE price SET F\_id = 2 WHERE Price\_id = 8;  -- First Class 18000



mysql> UPDATE price SET F\_id = 3 WHERE Price\_id = 3;  -- Economy 5000



mysql> UPDATE price SET F\_id = 3 WHERE Price\_id = 6;  -- Business 11000



mysql> UPDATE price SET F\_id = 3 WHERE Price\_id = 9;  -- First Class 22000



mysql> UPDATE price SET F\_id = 4 WHERE Price\_id = 10; -- First Class 25000



mysql> SELECT \* FROM price ORDER BY F\_id;

+----------+-------------+----------+------+

| Price\_id | Fare\_class  | price    | F\_id |

+----------+-------------+----------+------+

|        1 | Economy     |  3500.00 |    1 |

|        4 | Business    |  8500.00 |    1 |

|        7 | First Class | 15000.00 |    1 |

|        2 | Economy     |  4200.00 |    2 |

|        5 | Business    |  9200.00 |    2 |

|        8 | First Class | 18000.00 |    2 |

|        3 | Economy     |  5000.00 |    3 |

|        6 | Business    | 11000.00 |    3 |

|        9 | First Class | 22000.00 |    3 |

|       10 | First Class | 25000.00 |    4 |

+----------+-------------+----------+------+



mysql> **table price;**

+----------+-------------+----------+------+

| Price\_id | Fare\_class  | price    | F\_id |

+----------+-------------+----------+------+

|        1 | Economy     |  3500.00 |    1 |

|        2 | Economy     |  4200.00 |    2 |

|        3 | Economy     |  5000.00 |    3 |

|        4 | Business    |  8500.00 |    1 |

|        5 | Business    |  9200.00 |    2 |

|        6 | Business    | 11000.00 |    3 |

|        7 | First Class | 15000.00 |    1 |

|        8 | First Class | 18000.00 |    2 |

|        9 | First Class | 22000.00 |    3 |

|       10 | First Class | 25000.00 |    4 |

+----------+-------------+----------+------+



mysql> insert into booking

&nbsp;   -> (B\_id, P\_id, Booking\_status,Booking\_date, Price\_id)

&nbsp;   -> values

&nbsp;   -> (1, 1, 'Confirmed', '2026-01-20', 1),

&nbsp;   -> (2, 2, 'Confirmed', '2026-01-21', 2),

&nbsp;   -> (3, 3, 'Cancelled', '2026-01-22', 3),

&nbsp;   -> (4, 4, 'Confirmed', '2026-01-23', 4),

&nbsp;   -> (5, 5, 'Confirmed', '2026-01-23', 5),

&nbsp;   -> (6, 6, 'Confirmed', '2026-01-24', 6),

&nbsp;   -> (7, 7, 'Confirmed', '2026-01-24', 7),

&nbsp;   -> (8, 8, 'Confirmed', '2026-01-25', 8),

&nbsp;   -> (9, 9, 'Cancelled', '2026-01-25', 9),

&nbsp;   -> (10, 10, 'Confirmed', '2026-01-26', 10),

&nbsp;   -> (11, 11, 'Confirmed', '2026-01-26', 1),

&nbsp;   -> (12, 12, 'Confirmed', '2026-01-27', 2),

&nbsp;   -> (13, 13, 'Confirmed', '2026-01-27', 3),

&nbsp;   -> (14, 14, 'Confirmed', '2026-01-28', 4),

&nbsp;   -> (15, 15, 'Confirmed', '2026-01-28', 5);



mysql> **table booking**

&nbsp;   -> ;

+------+------+----------------+--------------+----------+

| B\_id | P\_id | Booking\_status | Booking\_date | Price\_id |

+------+------+----------------+--------------+----------+

|    1 |    1 | Confirmed      | 2026-01-20   |        1 |

|    2 |    2 | Confirmed      | 2026-01-21   |        2 |

|    3 |    3 | Cancelled      | 2026-01-22   |        3 |

|    4 |    4 | Confirmed      | 2026-01-23   |        4 |

|    5 |    5 | Confirmed      | 2026-01-23   |        5 |

|    6 |    6 | Confirmed      | 2026-01-24   |        6 |

|    7 |    7 | Confirmed      | 2026-01-24   |        7 |

|    8 |    8 | Confirmed      | 2026-01-25   |        8 |

|    9 |    9 | Cancelled      | 2026-01-25   |        9 |

|   10 |   10 | Confirmed      | 2026-01-26   |       10 |

|   11 |   11 | Confirmed      | 2026-01-26   |        1 |

|   12 |   12 | Confirmed      | 2026-01-27   |        2 |

|   13 |   13 | Confirmed      | 2026-01-27   |        3 |

|   14 |   14 | Confirmed      | 2026-01-28   |        4 |

|   15 |   15 | Confirmed      | 2026-01-28   |        5 |

+------+------+----------------+--------------+----------+





mysql> insert into payment

&nbsp;   -> (Payment\_id, B\_id, payment\_date, amount\_paid,payment\_status, payment\_method)

&nbsp;   -> values

&nbsp;   -> (1,  1, '2026-01-20', 5000.00, 'Completed', 'Credit card'),

&nbsp;   -> (2,  2, '2026-01-21', 4500.00, 'Completed', 'Debit card'),

&nbsp;   -> (3,  3, '2026-01-22', 0.00,    'Failed',    'UPI'),

&nbsp;   -> (4,  4, '2026-01-23', 6000.00, 'Completed', 'Net banking'),

&nbsp;   -> (5,  5, '2026-01-23', 5500.00, 'Completed', 'Cash'),

&nbsp;   -> (6,  6, '2026-01-24', 7000.00, 'Completed', 'Credit card'),

&nbsp;   -> (7,  7, '2026-01-24', 6500.00, 'Completed', 'Debit card'),

&nbsp;   -> (8,  8, '2026-01-25', 7200.00, 'Completed', 'UPI'),

&nbsp;   -> (9,  9, '2026-01-25', 0.00,    'Failed',    'Net banking'),

&nbsp;   -> (10, 10, '2026-01-26', 8000.00, 'Completed', 'Credit card'),

&nbsp;   -> (11, 11, '2026-01-26', 5000.00, 'Completed', 'Cash'),

&nbsp;   -> (12, 12, '2026-01-27', 4500.00, 'Completed', 'Debit card'),

&nbsp;   -> (13, 13, '2026-01-27', 4800.00, 'Completed', 'UPI'),

&nbsp;   -> (14, 14, '2026-01-28', 6000.00, 'Completed', 'Net banking'),

&nbsp;   -> (15, 15, '2026-01-28', 5500.00, 'Completed', 'Credit card');





mysql> **table payment;**

+------------+------+--------------+-------------+----------------+----------------+

| Payment\_id | B\_id | payment\_date | amount\_paid | payment\_status | payment\_method |

+------------+------+--------------+-------------+----------------+----------------+

|          1 |    1 | 2026-01-20   |     5000.00 | Completed      | Credit card    |

|          2 |    2 | 2026-01-21   |     4500.00 | Completed      | Debit card     |

|          3 |    3 | 2026-01-22   |        0.00 | Failed         | UPI            |

|          4 |    4 | 2026-01-23   |     6000.00 | Completed      | Net banking    |

|          5 |    5 | 2026-01-23   |     5500.00 | Completed      | Cash           |

|          6 |    6 | 2026-01-24   |     7000.00 | Completed      | Credit card    |

|          7 |    7 | 2026-01-24   |     6500.00 | Completed      | Debit card     |

|          8 |    8 | 2026-01-25   |     7200.00 | Completed      | UPI            |

|          9 |    9 | 2026-01-25   |        0.00 | Failed         | Net banking    |

|         10 |   10 | 2026-01-26   |     8000.00 | Completed      | Credit card    |

|         11 |   11 | 2026-01-26   |     5000.00 | Completed      | Cash           |

|         12 |   12 | 2026-01-27   |     4500.00 | Completed      | Debit card     |

|         13 |   13 | 2026-01-27   |     4800.00 | Completed      | UPI            |

|         14 |   14 | 2026-01-28   |     6000.00 | Completed      | Net banking    |

|         15 |   15 | 2026-01-28   |     5500.00 | Completed      | Credit card    |

+------------+------+--------------+-------------+----------------+----------------+





mysql> insert into itineray

&nbsp;   -> (itineray\_id, B\_id, start\_date,end\_date,origin , destination)

&nbsp;   -> values

&nbsp;   -> (101,  1, '2026-01-20', '2026-01-20', 'Delhi',      'Mumbai'),

&nbsp;   -> (102,  2, '2026-01-21', '2026-01-21', 'Mumbai',     'Bangalore'),

&nbsp;   -> (103,  3, '2026-01-22', '2026-01-22', 'Bangalore',  'Chennai'),

&nbsp;   -> (104,  4, '2026-01-23', '2026-01-23', 'Chennai',    'Kolkata'),

&nbsp;   -> (105,  5, '2026-01-23', '2026-01-23', 'Kolkata',    'Delhi'),

&nbsp;   -> (106,  6, '2026-01-24', '2026-01-24', 'Delhi',      'Dubai'),

&nbsp;   -> (107,  7, '2026-01-24', '2026-01-24', 'Mumbai',     'Singapore'),

&nbsp;   -> (108,  8, '2026-01-25', '2026-01-25', 'Bangalore',  'Doha'),

&nbsp;   -> (109,  9, '2026-01-25', '2026-01-25', 'Chennai',    'Abu Dhabi'),

&nbsp;   -> (110, 10, '2026-01-26', '2026-01-26', 'Kolkata',   'London'),

&nbsp;   -> (111, 11, '2026-01-26', '2026-01-26', 'Delhi',     'Mumbai'),

&nbsp;   -> (112, 12, '2026-01-27', '2026-01-27', 'Mumbai',    'Bangalore'),

&nbsp;   -> (113, 13, '2026-01-27', '2026-01-27', 'Bangalore', 'Chennai'),

&nbsp;   -> (114, 14, '2026-01-28', '2026-01-28', 'Chennai',   'Kolkata'),

&nbsp;   -> (115, 15, '2026-01-28', '2026-01-28', 'Kolkata',   'Delhi');



mysql> **table itineray;**

+-------------+------+------------+------------+-----------+-------------+

| itineray\_id | B\_id | Start\_date | end\_date   | origin    | destination |

+-------------+------+------------+------------+-----------+-------------+

|         101 |    1 | 2026-01-20 | 2026-01-20 | Delhi     | Mumbai      |

|         102 |    2 | 2026-01-21 | 2026-01-21 | Mumbai    | Bangalore   |

|         103 |    3 | 2026-01-22 | 2026-01-22 | Bangalore | Chennai     |

|         104 |    4 | 2026-01-23 | 2026-01-23 | Chennai   | Kolkata     |

|         105 |    5 | 2026-01-23 | 2026-01-23 | Kolkata   | Delhi       |

|         106 |    6 | 2026-01-24 | 2026-01-24 | Delhi     | Dubai       |

|         107 |    7 | 2026-01-24 | 2026-01-24 | Mumbai    | Singapore   |

|         108 |    8 | 2026-01-25 | 2026-01-25 | Bangalore | Doha        |

|         109 |    9 | 2026-01-25 | 2026-01-25 | Chennai   | Abu Dhabi   |

|         110 |   10 | 2026-01-26 | 2026-01-26 | Kolkata   | London      |

|         111 |   11 | 2026-01-26 | 2026-01-26 | Delhi     | Mumbai      |

|         112 |   12 | 2026-01-27 | 2026-01-27 | Mumbai    | Bangalore   |

|         113 |   13 | 2026-01-27 | 2026-01-27 | Bangalore | Chennai     |

|         114 |   14 | 2026-01-28 | 2026-01-28 | Chennai   | Kolkata     |

|         115 |   15 | 2026-01-28 | 2026-01-28 | Kolkata   | Delhi       |

+-------------+------+------------+------------+-----------+-------------+





mysql> insert into itineray\_flight

&nbsp;   -> (itineray\_flight\_id, itineray\_id, F\_id, Flight\_seq\_no)

&nbsp;   -> values

&nbsp;   -> (201, 101, 1, 1),

&nbsp;   -> (202, 102, 2, 1),

&nbsp;   -> (203, 103, 3, 1),

&nbsp;   -> (204, 104, 4, 1),

&nbsp;   -> (205, 105, 5, 1),

&nbsp;   -> (206, 106, 6, 1),

&nbsp;   -> (207, 107, 7, 1),

&nbsp;   -> (208, 108, 8, 1),

&nbsp;   -> (209, 109, 9, 1),

&nbsp;   -> (210, 110, 10, 1),

&nbsp;   -> (211, 111, 1, 1),

&nbsp;   -> (212, 112, 2, 1),

&nbsp;   -> (213, 113, 3, 1),

&nbsp;   -> (214, 114, 4, 1),

&nbsp;   -> (215, 115, 5, 1);



mysql> **table itineray\_flight;**

+--------------------+-------------+------+---------------+

| itineray\_flight\_id | itineray\_id | F\_id | Flight\_seq\_no |

+--------------------+-------------+------+---------------+

|                201 |         101 |    1 |             1 |

|                202 |         102 |    2 |             1 |

|                203 |         103 |    3 |             1 |

|                204 |         104 |    4 |             1 |

|                205 |         105 |    5 |             1 |

|                206 |         106 |    6 |             1 |

|                207 |         107 |    7 |             1 |

|                208 |         108 |    8 |             1 |

|                209 |         109 |    9 |             1 |

|                210 |         110 |   10 |             1 |

|                211 |         111 |    1 |             1 |

|                212 |         112 |    2 |             1 |

|                213 |         113 |    3 |             1 |

|                214 |         114 |    4 |             1 |

|                215 |         115 |    5 |             1 |

+--------------------+-------------+------+---------------+



