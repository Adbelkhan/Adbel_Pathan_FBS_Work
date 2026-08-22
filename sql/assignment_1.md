1\. Login to MySQL and view all databases already present. You should get

following result :



mysql> **show databases;**

+--------------------+

| Database           |

+--------------------+

| emp                |

| information\_schema |

| mysql              |

| performance\_schema |

| sakila             |

| sys                |

| world              |

+--------------------+



mysql> **use emp;**



Write an SQL statement to create a simple table countries including columns

country\_id,country\_name and region\_id. After this display the structure of

table as below :



mysql> **create table countries**

&nbsp;   -> **(country\_id int(11) , country\_name varchar(20),region\_id int(11));**



mysql> **desc countries;**

+--------------+-------------+------+-----+---------+-------+

| Field        | Type        | Null | Key | Default | Extra |

+--------------+-------------+------+-----+---------+-------+

| country\_id   | int         | YES  |     | NULL    |       |

| country\_name | varchar(20) | YES  |     | NULL    |       |

| region\_id    | int         | YES  |     | NULL    |       |

+--------------+-------------+------+-----+---------+-------+



3\. Write an SQL statement to create a table named jobs including columns

job\_id, job\_title, min\_salary, max\_salary and check whether the

max\_salary amount exceeding the upper limit 25000. Also set job\_id as

primary key and entering null values for job\_title is not allowed.



mysql> **create table jobs**

&nbsp;   -> **(job\_id int, job\_title varchar(20), min\_salary int, max\_salary int check(max\_salary <= 25000));**



mysql> **desc jobs;**

+------------+-------------+------+-----+---------+-------+

| Field      | Type        | Null | Key | Default | Extra |

+------------+-------------+------+-----+---------+-------+

| job\_id     | int         | YES  |     | NULL    |       |

| job\_title  | varchar(20) | YES  |     | NULL    |       |

| min\_salary | double      | YES  |     | NULL    |       |

| max\_salary | int         | YES  |     | NULL    |       |

+------------+-------------+------+-----+---------+-------+



mysql> **alter table jobs**

&nbsp;   -> **add primary key(job\_id);**



mysql> **alter table jobs**

&nbsp;   -> **modify job\_title varchar(20) not null;**



**mysql> alter table jobs**

    **-> modify column job\_title varchar(20) default '';**



**mysql> alter table jobs**

    **-> modify column min\_salary int check(min\_salary >=8000);**



mysql> **desc jobs;**

+------------+-------------+------+-----+---------+-------+

| Field      | Type        | Null | Key | Default | Extra |

+------------+-------------+------+-----+---------+-------+

| job\_id     | int         | NO   | PRI | NULL    |       |

| job\_title  | varchar(20) | YES  |     |         |       |

| min\_salary | int         | YES  |     | NULL    |       |

| max\_salary | int         | YES  |     | NULL    |       |

+------------+-------------+------+-----+---------+-------+





4\. Write a SQL statement to create a table named job\_histry including columns

employee\_id, start\_date, end\_date, job\_id and department\_id





mysql> **create table job\_histry**

&nbsp;   -> **(employee\_id int , start\_date date, end\_date date,job\_id int, department\_id int);**





mysql> **desc job\_histry;**

+---------------+------+------+-----+---------+-------+

| Field         | Type | Null | Key | Default | Extra |

+---------------+------+------+-----+---------+-------+

| employee\_id   | int  | YES  |     | NULL    |       |

| start\_date    | date | YES  |     | NULL    |       |

| end\_date      | date | YES  |     | NULL    |       |

| job\_id        | int  | YES  |     | NULL    |       |

| department\_id | int  | YES  |     | NULL    |       |

+---------------+------+------+-----+---------+-------+





5\. Write an SQL statement to alter a table named countries to make sure that no

duplicate data against column country\_id will be allowed at the time of

insertion.



mysql> **alter table countries**

&nbsp;   -> **modify column country\_id int unique;**





mysql> **desc countries;**

+--------------+-------------+------+-----+---------+-------+

| Field        | Type        | Null | Key | Default | Extra |

+--------------+-------------+------+-----+---------+-------+

| country\_id   | int         | YES  | UNI | NULL    |       |

| country\_name | varchar(20) | YES  |     | NULL    |       |

| region\_id    | int         | YES  |     | NULL    |       |

+--------------+-------------+------+-----+---------+-------+





mysql> **alter table jobs**

&nbsp;   -> **modify column job\_title varchar(20) default '';**



mysql> **desc jobs;**

+------------+-------------+------+-----+---------+-------+

| Field      | Type        | Null | Key | Default | Extra |

+------------+-------------+------+-----+---------+-------+

| job\_id     | int         | NO   | PRI | NULL    |       |

| job\_title  | varchar(20) | YES  |     |         |       |

| min\_salary | double      | YES  |     | NULL    |       |

| max\_salary | int         | YES  |     | NULL    |       |

+------------+-------------+------+-----+---------+-------+





mysql> **alter table jobs**

&nbsp;   -> **modify column min\_salary int;**



mysql> **alter table jobs**

&nbsp;   -> **modify column min\_salary int check(min\_salary >=8000);**



mysql> **desc jobs;**

+------------+-------------+------+-----+---------+-------+

| Field      | Type        | Null | Key | Default | Extra |

+------------+-------------+------+-----+---------+-------+

| job\_id     | int         | NO   | PRI | NULL    |       |

| job\_title  | varchar(20) | YES  |     |         |       |

| min\_salary | int         | YES  |     | NULL    |       |

| max\_salary | int         | YES  |     | NULL    |       |

+------------+-------------+------+-----+---------+-------+





mysql> **create table Department**

&nbsp;   -> **(DEPARTMENT\_ID decimal(4,0), DEPARTMENT\_NAME varchar(30), MANAGER\_ID decimal(6,0), LOCATION\_ID decimal(4,0));**





mysql> **desc department;**

+-----------------+--------------+------+-----+---------+-------+

| Field           | Type         | Null | Key | Default | Extra |

+-----------------+--------------+------+-----+---------+-------+

| DEPARTMENT\_ID   | decimal(4,0) | YES  |     | NULL    |       |

| DEPARTMENT\_NAME | varchar(30)  | YES  |     | NULL    |       |

| MANAGER\_ID      | decimal(6,0) | YES  |     | NULL    |       |

| LOCATION\_ID     | decimal(4,0) | YES  |     | NULL    |       |

+-----------------+--------------+------+-----+---------+-------+



mysql> **alter table department**

&nbsp;   -> **add primary key(DEPARTMENT\_ID,MANAGER\_ID);**



mysql> **desc department;**

+-----------------+--------------+------+-----+---------+-------+

| Field           | Type         | Null | Key | Default | Extra |

+-----------------+--------------+------+-----+---------+-------+

| DEPARTMENT\_ID   | decimal(4,0) | NO   | PRI | NULL    |       |

| DEPARTMENT\_NAME | varchar(30)  | YES  |     | NULL    |       |

| MANAGER\_ID      | decimal(6,0) | NO   | PRI | NULL    |       |

| LOCATION\_ID     | decimal(4,0) | YES  |     | NULL    |       |

+-----------------+--------------+------+-----+---------+-------+



mysql> **alter table department**

&nbsp;   -> **modify column  DEPARTMENT\_ID decimal(4,0) default 0,**

&nbsp;   -> **modify column  MANAGER\_ID decimal(6,0) default 0;**



mysql> **desc department;**

+-----------------+--------------+------+-----+---------+-------+

| Field           | Type         | Null | Key | Default | Extra |

+-----------------+--------------+------+-----+---------+-------+

| DEPARTMENT\_ID   | decimal(4,0) | NO   | PRI | 0       |       |

| DEPARTMENT\_NAME | varchar(30)  | YES  |     | NULL    |       |

| MANAGER\_ID      | decimal(6,0) | NO   | PRI | 0       |       |

| LOCATION\_ID     | decimal(4,0) | YES  |     | NULL    |       |

+-----------------+--------------+------+-----+---------+-------+



mysql> **alter table department**

&nbsp;   -> **modify column  DEPARTMENT\_NAME varchar(30) not null;**



mysql> **desc department;**

+-----------------+--------------+------+-----+---------+-------+

| Field           | Type         | Null | Key | Default | Extra |

+-----------------+--------------+------+-----+---------+-------+

| DEPARTMENT\_ID   | decimal(4,0) | NO   | PRI | 0       |       |

| DEPARTMENT\_NAME | varchar(30)  | NO   |     | NULL    |       |

| MANAGER\_ID      | decimal(6,0) | NO   | PRI | 0       |       |

| LOCATION\_ID     | decimal(4,0) | YES  |     | NULL    |       |

+-----------------+--------------+------+-----+---------+-------+

























