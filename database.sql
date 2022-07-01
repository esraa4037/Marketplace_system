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


insert into Product VALUE 
('1','TV','Samsung',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//3.jpg'),'25','1','3000'),
('2','Phone','Samsung',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//2.jpg'),'30','1','10000'),
('3','Phone','Apple',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//3.jpg'),'15','1','12000'),
('4','Laptop','Apple',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//4.jpg'),'22','1','20000'),
('5','Watch','Samsung',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//5.jpg'),'10','1','7000'),
('6','Mouse','HP',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//6.jpg'),'12','1','700'),
('7','Camera','Instax',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//7.jpg'),'30','1','600'),
('8','Keyboard','HP',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//8.jpg'),'27','1','500'),
('9','Microphone','	AVudio',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//9.jpg'),'25','1','2000'),
('10','Printer','Canon',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//10.jpg'),'22','1','2000'),
('11','Bear','MorisMos',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//11.jpg'),'25','2','300'),
('12','Chess','Art Store',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//12.jpg'),'25','2','100'),
('13','Sequence','Art Store',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//13.jpg'),'25','2','100'),
('14','Qwirkle Board Game','Art Store',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//14.jpg'),'25','2','100'),
('15','Eye Found It Board Game','Art Store',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//15.jpg'),'25','2','100'),
('16','Hungry Hungry Hippos','Art Store',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//16.jpg'),'25','2','100'),
('17','Yahtzee','Art Store',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//17.jpg'),'25','2','100'),
('18','Crocodile Dentist','Art Store',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//18.jpg'),'25','2','100'),
('19','Labyrinth Board Game','Art Store',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//19.jpg'),'25','2','100'),
('20','Candy Land','Art Store',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//20.jpg'),'25','3','100'),
('21','Boating Vest','Floortje',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//21.jpg'),'25','3','500'),
('22','Tennis ball','Store',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//22.jpg'),'25','3','100'),
('23','Basketball','Spalding',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//23.jpg'),'25','3','100'),
('24','Football','Addidas',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//24.jpg'),'25','3','100'),
('25','Handball','Kempa',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//25.jpg'),'25','3','100'),
('26','Tennis Racquet','Yonex',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//26.jpg'),'25','3','1000'),
('27','Tennis Net Set','Vermont',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//27.jpg'),'25','3','250'),
('28','Hocky stick set','BABW',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//28.jpg'),'25','3','1000'),
('29','Helmet','Troxel',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//29.jpg'),'25','3','1000'),
('30','bike','JOYSTAR',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//30.jpg'),'25','3','5000'),
('40','Hair Care Shampoo','Sunsilk',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//40.jpg'),'250','4','40'),
('41','Hair Care Conditioner','Sunsilk',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//41.jpg'),'400','4','45'),
('42','Hair Care Oil Replacement','Sunsilk',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//42.jpg'),'150','4','45'),
('43','Anti-dandruff Shampoo','Selengena',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//43.jpg'),'650','4','150'),
('44','Rose Water','NIVEA',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//44.jpg'),'1200','4','123'),
('45','Makeup Remover','Beesline',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//45.jpg'),'2500','4','210'),
('46','Toothpaste','Sensodyne',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//46.jpg'),'1650','4','40'),
('47','Eye Serum','L Oreal Paris',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//47.jpg'),'400','4','216'),
('48','Moisturizing Cream','NIVEA',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//48.jpg'),'3000','4','26'),
('49','Body Lotion','Vaseline',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//49.jpg'),'1500','4','130'),
('50','Sneakers','Adidas',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//50.jpg'),'520','5','1200'),
('51','Black Jacket','Defacto',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//51.jpg'),'950','5','650'),
('52','Polo Shirt','American Eagle',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//52.jpg'),'650','5','420'),
('53','Pink Sneakers','Desert',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//53.jpg'),'520','5','129'),
('54','Slippers','Activ',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//54.jpg'),'120','5','270'),
('55','3-Pieces Man White Low Cut Socks','Defacto',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//55.jpg'),'850','5','60'),
('56','BabyGirl set','Defacto',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//56.jpg'),'560','5','140'),
('57','BabyGirl dress','Defacto',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//57.jpg'),'1800','5','100'),
('58','Jogger Men','Activ',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//58.jpg'),'360','5','550'),
('59','Sunglasses Women white','Fashion',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//59.jpg'),'850','5','540'),
('60','Fettuccine Pasta','Italiano',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//60.jpg'),'5200','6','11'),
('61','Big Rings Pasta','El Maleka',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//61.jpg'),'6500','6','24'),
('62','Vegetables Flavored Noodles','Kellogg',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//62.jpg'),'2400','6','4'),
('63','Grape Vinegar','Paladin',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//63.jpg'),'870','6','30'),
('64','Apple Cider Vinegar','Choice',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//64.jpg'),'5600','6','50'),
('65','Vegetables Cream Soup','Basak',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//65.jpg'),'800','6','15'),
('66','Honey','Shana',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//66.jpg'),'1400','6','60'),
('67','Majdool Dates','Shana',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//67.jpg'),'5000','6','85'),
('68','Carob Syrup','Vitrac',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//68.jpg'),'560','6','35'),
('69','Maple Syrup','Abu Auf',load_file('C://Program Files//MySQL//MySQL Server 8.0//parallel//69.jpg'),'700','6','174');

CREATE TABLE OrderDetails
(
  OrderdetailsID INT NOT NULL auto_increment,
  Price INT NOT NULL,
  Quantity INT NOT NULL,
  Discount INT NOT NULL,
  ProductID INT NOT NULL,
  OrderID INT NOT NULL,
  PRIMARY KEY (OrderdetailsID),
  FOREIGN KEY (ProductID) REFERENCES Product(ProductID)
			on delete Restrict
            on update cascade,
  FOREIGN KEY (OrderID) REFERENCES order_(OrderID)
			on delete Restrict
            on update cascade
);

alter table product modify picture longblob;
alter table server add username varchar(15) not null ;
insert into server value ('Maram','1','1234','Nabil','','admin');
use ya;
select * from product;
