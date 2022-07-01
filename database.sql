create database onlinesupermarket;
use onlinesupermarket;
CREATE TABLE Client_
(
  ClientID int not null auto_increment,
  Fname varchar(30) NOT NULL,
  Lname varchar(30) NOT NULL,
  Email varchar(30) NOT NULL,
  Address varchar(40) ,
  Phone varchar(15) NOT NULL,
  PostalCode INT ,
  UserName varchar(30) NOT NULL,
  Pass varchar(30) NOT NULL,
  PRIMARY KEY (ClientID)
);
-- alter table client_ modify phone Varchar(15) not null;
-- alter table client_ modify ClientID int not null auto_increment;
Insert into Client_ VALUE 
('1','Ahmed','Ali','ahmed1@gmail.com','Abbasya,Cairo','01478951300','123','ahmedali8','123hjjkko'),
('2','Mohamed','Amr','mohmed1@gmail.com','Abdo Basha,Cairo','01008951358','124','mohamed2amr','123mo'),
('3','Amer','Ali','amer1@gmail.com','Aswan','01951347804','929','amerali4','al354dswq'),
('4','Menna','Ali','menna1@gmail.com','Tahrir Square,Cairo','01478951311','123','mennaali7','1235m'),
('5','Ahmed','Hatem','ahatem1@gmail.com','Alexandria','01156095130','523','61ahmedhatem','12354'),
('6','Hossam','Sameh','hsaam@yahoo.com','St1 El sharkia','01258763','158','hussam123','jwm852'),
('7','Farah','Ahmed','farohaa@hotmail.com','St1 El Monufia','012563971','145','farah66','qwer1234'),
('8','Habiba','Alaa','hoba@yahoo.com','St1 Alexandria','0124254412','156','habiba123','poilkjh'),
('9','Youssef','Salah','yoyo12@yahoo.com','Hadaiq el koba share3 el ahram','0145875639','188','yoyo123','asdf9876'),
('10','Hussien','Salam','hushus@yahoo.com','St1 El Qalyubia','0100258875','128','husien8','125793'),
(null,'Wael','Khaled','wael1235@gmail.com','Hadaiq el koba ','01001471478','196','wael89','123sdf');

CREATE TABLE Server_
(
  FName varchar(30) NOT NULL,
  ServerID INT NOT NULL,
  pass varchar(30) NOT NULL,
  LName varchar(30) NOT NULL,
  Email varchar(30) NOT NULL,
  PRIMARY KEY (ServerID)
 );

CREATE TABLE category
(
  ID INT NOT NULL,
  Name varchar(30) NOT NULL,
  PRIMARY KEY (ID)
);


insert into category VALUE 
('1','Electronics'),
('2','Games'),
('3','Sports'),
('4','Beauty Care'),
('5','Clothes');
insert into category VALUE ('6','Food');


CREATE TABLE BillingInfo
(
  CreditCardID INT NOT NULL,
  BillingID INT NOT NULL,
  Balance INT NOT NULL,
  CreditCardNo INT NOT NULL,
  CreditCardPIN INT NOT NULL,
  BillDate date NOT NULL,
  ClientID INT NOT NULL,
  PRIMARY KEY (BillingID),
  FOREIGN KEY (ClientID) REFERENCES Client_(ClientID)
			on delete Restrict
            on update cascade
);
-- drop table cart;
CREATE TABLE Cart
(
  ProductID INT NOT NULL,
  TotalPrice INT NOT NULL,
  NumberOfProducts INT NOT NULL,
  CartID INT NOT NULL auto_increment,
  ClientID INT NOT NULL,
  PRIMARY KEY (CartID,ProductID),
  FOREIGN KEY (ClientID) REFERENCES Client_(ClientID)
			on delete Restrict
            on update cascade
);
drop table cart; 

CREATE TABLE order_
(
  OrderID INT NOT NULL auto_increment ,
  RequiredDate date NOT NULL,
  OrderedDate date NOT NULL,
  ClientID INT NOT NULL,
  PRIMARY KEY (OrderID),
  FOREIGN KEY (ClientID) REFERENCES Client_(ClientID)
			on delete Restrict
            on update cascade
);

CREATE TABLE Product
(
  ProductID INT NOT NULL,
  ProductName varchar(30) NOT NULL,
  SupplierName varchar(30) NOT NULL,
  Picture blob NOT NULL,
  Price INT NOT NULL,
  Quantity INT NOT NULL,
  CategoryID INT NOT NULL,
 -- ServerID INT NOT NULL,
  PRIMARY KEY (ProductID),
  FOREIGN KEY (CategoryID) REFERENCES category(ID)
			on delete Restrict
            on update cascade
            -- ,
 -- FOREIGN KEY (ServerID) REFERENCES Server(ServerID)
--			on delete Restrict
 --           on update cascade
);
