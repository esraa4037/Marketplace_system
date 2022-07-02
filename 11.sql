create schema opa;
use opa;
CREATE TABLE Client
(
  ClientID INT NOT NULL auto_increment,
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

Insert into Client VALUE 
('1','Ahmed','Ali','ahmed1@gmail.com','Cairo','01478951300','123','ahmed_ali','12354'),
('2','Mohamed','Amr','mohmed1@gmail.com','Cairo','01008951358','124','mohamed-amr','123mo'),
('3','Amer','Ali','amer1@gmail.com','Cairo','01951347804','129','amer_ali','al354'),
('4','Menna','Ali','menna1@gmail.com','Cairo','01478951311','123','menna_ali','1235m'),
('5','Ahmed','Hatem','ahatem1@gmail.com','Alexandria','01156095130','523','ahmed_hatem','12354'),
('6','Hossam','Sameh','hsaam@yahoo.com','St1 El sharkia','01258763','158','hussam123','jwm852'),
('7','Farah','Ahmed','farohaa@hotmail.com','St1 El Monufia','012563971','145','farah66','qwer1234'),
('8','Habiba','Alaa','hoba@yahoo.com','St1 Alexandria','0124254412','156','habiba123','poilkjh'),
('9','Youssef','Salah','yoyo12@yahoo.com','Hadaiq el koba share3 el ahram','0145875639','188','yoyo123','asdf9876'),
('10','Hussien','Salam','hushus@yahoo.com','St1 El Qalyubia','0100258875','128','husien8','125793');


 CREATE TABLE Server
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


insert into category VALUes 
('1','Electronics'),
('2','Games'),
('3','Sports'),
('4','Beauty Care'),
('5','Clothes'),
('6','Food');

CREATE TABLE BillingInfo
(
  CreditCardID INT NOT NULL,
  BillingID INT NOT NULL auto_increment,
  Balance INT NOT NULL,
  CreditCardNo INT NOT NULL,
  CreditCardPIN INT NOT NULL,
  BillDate date NOT NULL,
  ClientID INT NOT NULL,
  PRIMARY KEY (BillingID),
  FOREIGN KEY (ClientID) REFERENCES Client(ClientID)
			on delete Restrict
            on update cascade
);

CREATE TABLE Cart
(
  ProductID INT NOT NULL,
  TotalPrice INT NOT NULL,
  NumberOfProducts INT NOT NULL,
  CartID INT NOT NULL auto_increment,
  ClientID INT NOT NULL,
  PRIMARY KEY (CartID,ProductID),
  FOREIGN KEY (ClientID) REFERENCES Client(ClientID)
			on delete Restrict
            on update cascade
);

CREATE TABLE order_
(
  OrderID INT NOT NULL auto_increment,
  RequiredDate date NOT NULL,
  OrderedDate date NOT NULL,
  ClientID INT NOT NULL,
  PRIMARY KEY (OrderID),
  FOREIGN KEY (ClientID) REFERENCES Client(ClientID)
			on delete Restrict
            on update cascade
);

CREATE TABLE Product
(
  ProductID INT NOT NULL,
  ProductName varchar(50) NOT NULL,
  SupplierName varchar(30) NOT NULL,
  Picture varchar(200),
  Quantity INT NOT NULL,
  CategoryID INT NOT NULL,
    Price double NOT NULL,
  PRIMARY KEY (ProductID),
  FOREIGN KEY (CategoryID) REFERENCES category(ID)
			on delete cascade
            on update cascade
            -- ,
 -- FOREIGN KEY (ServerID) REFERENCES Server(ServerID)
--			on delete Restrict
 --           on update cascade
);


insert into Product VALUE 
('1','TV','Samsung','@../ImageProducts/1.jpg','25','1','3000'),
('2','Phone','Samsung','@../ImageProducts/2.jpg','30','1','10000'),
('3','Phone','Apple','@../ImageProducts/3.jpg','15','1','12000'),
('4','Laptop','Apple','@../ImageProducts/4.jpg','22','1','20000');

insert into Product VALUE 
('5','Watch','Samsung','@../ImageProducts/5.jpg','10','1','7000'),
('6','Mouse','HP','@../ImageProducts/6.jpg','12','1','700'),
('7','Camera','Instax','@../ImageProducts/7.jpg','30','1','600'),
('8','Keyboard','HP','@../ImageProducts/8.jpg','27','1','500'),
('9','Microphone','	AVudio','@../ImageProducts/9.jpg','25','1','2000'),
('10','Printer','Canon','@../ImageProducts/10.jpg','22','1','2000'),
('11','Bear','MorisMos','@../ImageProducts/11.jpg','25','2','300'),
('12','Chess','Art Store','@../ImageProducts/12.jpg','25','2','100'),
('13','Sequence','Art Store','@../ImageProducts/13.jpg','25','2','100'),
('14','Qwirkle Board Game','Art Store','@../ImageProducts/14.jpg','25','2','100'),
('15','Eye Found It Board Game','Art Store','@../ImageProducts/15.jpg','25','2','100'),
('16','Hungry Hungry Hippos','Art Store','@../ImageProducts/16.jpg','25' ,'2','100'),
('17','Yahtzee','Art Store','@../ImageProducts/17.jpg','25','2','100'),
('18','Crocodile Dentist','Art Store','@../ImageProducts/18.jpg','25','2','100'),
('19','Labyrinth Board Game','Art Store','@../ImageProducts/19.jpg','25','2','100'),
('20','Candy Land','Art Store','@../ImageProducts/20.jpg','25','3','100'),
('21','Boating Vest','Floortje','@../ImageProducts/21.jpg','25','3','500'),
('22','Tennis ball','Store','@../ImageProducts/22.jpg','25','3','100'),
('23','Basketball','Spalding','@../ImageProducts/23.jpg','25','3','100'),
('24','Football','Addidas','@../ImageProducts/24.jpg','25','3','100'),
('25','Handball','Kempa','@../ImageProducts/25.jpg','25','3','100'),
('26','Tennis Racquet','Yonex','@../ImageProducts/26.jpg','25','3','1000'),
('27','Tennis Net Set','Vermont','@../ImageProducts/27.jpg','25','3','250'),
('28','Hocky stick set','BABW','@../ImageProducts/28.jpg','25','3','1000'),
('29','Helmet','Troxel','@../ImageProducts/29.jpg','25','3','1000'),
('30','bike','JOYSTAR','@../ImageProducts/30.jpg','25','3','5000'),
('40','Hair Care Shampoo','Sunsilk','@../ImageProducts/40.jpg','250','4','40'),
('41','Hair Care Conditioner','Sunsilk','@../ImageProducts/41.jpg','400','4','45'),
('42','Hair Care Oil Replacement','Sunsilk','@../ImageProducts/42.jpg','150','4','45'),
('43','Anti-dandruff Shampoo','Selengena','@../ImageProducts/43.jpg','650','4','150'),
('44','Rose Water','NIVEA','@../ImageProducts/44.jpg','1200','4','123'),
('45','Makeup Remover','Beesline','@../ImageProducts/45.jpg','2500','4','210'),
('46','Toothpaste','Sensodyne','@../ImageProducts/46.jpg','1650','4','40'),
('47','Eye Serum','L Oreal Paris','@../ImageProducts/47.jpg','400','4','216'),
('48','Moisturizing Cream','NIVEA','@../ImageProducts/48.jpg','3000','4','26'),
('49','Body Lotion','Vaseline','@../ImageProducts/49.jpg','1500','4','130'),
('50','Sneakers','Adidas','@../ImageProducts/50.jpg','520','5','1200'),
('51','Black Jacket','Defacto','@../ImageProducts/51.jpg','950','5','650'),
('52','Polo Shirt','American Eagle','@../ImageProducts/52.jpg','650','5','420'),
('53','Pink Sneakers','Desert','@../ImageProducts/53.jpg','520','5','129'),
('54','Slippers','Activ','@../ImageProducts/54.jpg','120','5','270'),
('55','3-Pieces Man White Low Cut Socks','Defacto','@../ImageProducts/55.jpg','850','5','60'),
('56','BabyGirl set','Defacto','@../ImageProducts/56.jpg','560','5','140'),
('57','BabyGirl dress','Defacto','@../ImageProducts/57.jpg','1800','5','100'),
('58','Jogger Men','Activ','@../ImageProducts/58.jpg','360','5','550'),
('59','Sunglasses Women white','Fashion','@../ImageProducts/59.jpg','850','5','540'),
('60','Fettuccine Pasta','Italiano','@../ImageProducts/60.jpg','5200','6','11'),
('61','Big Rings Pasta','El Maleka','@../ImageProducts/61.jpg','6500','6','24'),
('62','Vegetables Flavored Noodles','Kellogg','@../ImageProducts/62.jpg','2400','6','4'),
('63','Grape Vinegar','Paladin','@../ImageProducts/63.jpg','870','6','30'),
('64','Apple Cider Vinegar','Choice','@../ImageProducts/64.jpg','5600','6','50'),
('65','Vegetables Cream Soup','Basak','@../ImageProducts/65.jpg','800','6','15'),
('66','Honey','Shana','@../ImageProducts/66.jpg','1400','6','60'),
('67','Majdool Dates','Shana','@../ImageProducts/67.jpg','5000','6','85'),
('68','Carob Syrup','Vitrac','@../ImageProducts/68.jpg','560','6','35'),
('69','Maple Syrup','Abu Auf','@../ImageProducts/69.jpg','700','6','174');

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

alter table server add username varchar(15) not null ;
insert into server value ('Maram','1','1234','Nabil','','admin');
ALTER TABLE server DROP email;

use opa;
select * from product;