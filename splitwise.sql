DROP DATABASE IF EXISTS Splitwise;
CREATE DATABASE IF NOT EXISTS Splitwise;

USE Splitwise;

/**---------------------------User Details--------------------------**/
Create table Splitwise.User
(
User_Id int AUTO_INCREMENT,
User_Name Varchar(45) NOT NULL,	
User_Email varchar(45) UNIQUE NOT NULL,
User_Password varchar(45) NOT NULL,

CONSTRAINT UserID_PK PRIMARY KEY (User_Id)
);
/**---------------------------User Details--------------------------**/

/**---------------------------Group Details--------------------------**/
Create table Splitwise.Grouping
(
Group_Id int AUTO_INCREMENT,
Group_Name varchar(45),

CONSTRAINT PK_GroupID PRIMARY KEY (Group_Id)
);
/**---------------------------Group Details--------------------------**/

/**---------------------------Expense of a group--------------------------**/
create table Splitwise.Expense
(
Expense_Id int AUTO_INCREMENT,
Expense_Amt double NOT NULL,
Group_Id int NOT NULL,

CONSTRAINT PK_ExpenId PRIMARY KEY (Expense_Id),
CONSTRAINT FK_GroupidX FOREIGN KEY (Group_Id) REFERENCES Splitwise.Grouping(Group_Id)
);
/**---------------------------Expense of a group--------------------------**/

/**---------------------------User belongs to group--------------------------**/
create table Splitwise.User_Group
(
id int NOT NULL,
User_Id int,
Group_Id int,

CONSTRAINT UserGroup PRIMARY KEY(id),
Constraint FK_IdUser FOREIGN KEY (User_Id) REFERENCES Splitwise.User(User_Id),
Constraint FK_IdGroup FOREIGN KEY (Group_Id) REFERENCES Splitwise.Grouping(Group_Id)
);
/**---------------------------User belongs to group--------------------------**/


/**---------------------------Expense of a user--------------------------**/
create table Splitwise.User_Exp
(
id int NOT NULL AUTO_INCREMENT,
User_Id int NOT NULL,
Expense_Amt double NOT NULL,

CONSTRAINT UserExpId PRIMARY KEY(id),
CONSTRAINT FK_User_Id FOREIGN KEY (User_Id) REFERENCES Splitwise.User (User_Id)
);
/**---------------------------Expense of a user--------------------------**/

/**---------------------------Debt of a group--------------------------**/
create table Splitwise.Debt
(
Debt_Id int NOT NULL AUTO_INCREMENT,
Debt_Amt double NOT NULL,
Group_Id int NOT NULL,

CONSTRAINT PK_DebtID PRIMARY KEY(Debt_Id),
CONSTRAINT FKGroupID FOREIGN KEY (Group_Id) REFERENCES Splitwise.Grouping(Group_Id)
);
/**---------------------------Debt of a group--------------------------**/

/**---------------------------User_Debt--------------------------**/
create table Splitwise.User_debt
(
id int NOT NULL AUTO_INCREMENT,
User_Id int NOT NULL,
Debt_Id int NOT NULL,

CONSTRAINT UserDebtPK PRIMARY KEY(id),
CONSTRAINT UserIDFK FOREIGN KEY(User_Id) REFERENCES Splitwise.User(User_Id),
 CONSTRAINT DebtIDFK FOREIGN KEY(Debt_Id) REFERENCES Splitwise.Debt(Debt_Id)
);
/**---------------------------User_Debt--------------------------**/

/************** Insert Table **********************************/

/**------Inserting values into 'User' table-----------------**/
Insert into Splitwise.User values(1,"Lidochka Ruslan","LR@gmail.com","x3E!@9cQ");
Insert into Splitwise.User values(2,"Volya Murali","VM@gmail.com","w$c1O0x!");
Insert into Splitwise.User values(3,"Marta Violetta","MV@yahoo.com","8EcAo(d!");
Insert into Splitwise.User values(4,"Benedikt Anita","BA@yahoo.com","C3@9w*&f");
Insert into Splitwise.User values(5,"Florence Mwagwabi","FM@zmail.com","8si$2ScS");
/**---------------------------------------------------------**/

/**------Inserting values into 'Grouping' table-----------------**/
Insert into Splitwise.Grouping values(1,"The Ufinity");
Insert into Splitwise.Grouping values(2,"Zenika");
Insert into Splitwise.Grouping values(3,"Coral ref");

/**---------------------------------------------------------**/

/**------Inserting values into 'Expense' table-----------------**/
Insert into Splitwise.Expense values(1, 500,1);
Insert into Splitwise.Expense values(2, 800,2);
Insert into Splitwise.Expense values(3, 200,3);

/**---------------------------------------------------------**/

/**------Inserting values into 'User_Group' table-----------------**/
Insert into Splitwise.User_Group values(1, 1,1);
Insert into Splitwise.User_Group values(2, 2,1);
Insert into Splitwise.User_Group values(3, 3,2);
Insert into Splitwise.User_Group values(4, 4,3);
Insert into Splitwise.User_Group values(5, 5,3);

/**---------------------------------------------------------**/

/**------Inserting values into 'User_Exp' table-----------------**/
Insert into Splitwise.User_Exp values(1, 1,500);
Insert into Splitwise.User_Exp values(2, 2,500);
Insert into Splitwise.User_Exp values(3, 3,800);
Insert into Splitwise.User_Exp values(4, 4,200);
Insert into Splitwise.User_Exp values(5, 5,2000);

/**---------------------------------------------------------**/

/**------Inserting values into 'Debt' table-----------------**/
Insert into Splitwise.Debt values(1,0,1);
Insert into Splitwise.Debt values(2,0,2);
Insert into Splitwise.Debt values(3,0,3);
/**---------------------------------------------------------**/

/**------Inserting values into 'User_Debt' table-----------------**/
Insert into Splitwise.User_Debt values(1, 1,1);
Insert into Splitwise.User_Debt values(2, 2,1);
Insert into Splitwise.User_Debt values(3, 3,2);
Insert into Splitwise.User_Debt values(4, 4,3);
Insert into Splitwise.User_Debt values(5, 5,3);
/**---------------------------------------------------------**/

/**************************************************************

/*****************Drop Table*********************************
drop table Splitwise.User_debt;
drop table Splitwise.Debt;
drop table Splitwise.User_Exp;
drop table Splitwise.User_Group;
drop table Splitwise.Expense;
drop table Splitwise.Grouping;
drop table Splitwise.User;
*****************Drop Table*********************************/


