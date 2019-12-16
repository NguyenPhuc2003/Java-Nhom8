CREATE DATABASE QuanLiNT
USE QuanLiNT

----TAO BANG THUOC----
CREATE TABLE THUOC
(MATHUOC NVARCHAR(20), TENTHUOC NVARCHAR (30),HANSUDUNG DATETIME,NGAYNHAP DATETIME,LOAITHUOC NVARCHAR (50),
SOLUONG INT,DONGIA INT ,PRIMARY KEY (MATHUOC));
 ----TAO BANG NHAP THUOC------
 CREATE TABLE NHAPTHUOC
(MATHUOC NVARCHAR(20), TENTHUOC NVARCHAR (30),HANSUDUNG NVARCHAR (50),NGAYNHAP NVARCHAR (50),LOAITHUOC NVARCHAR (50),SOLUONG INT,
NGUOINHAP NVARCHAR (50),DONGIA INT );
 -----TAO BANG XUAT THUOC---------
 CREATE TABLE XUATTHUOC
 (ID INT IDENTITY(1,1) PRIMARY KEY, TENTHUOC NVARCHAR (30),TENKH NVARCHAR (30),NGAYXUAT NVARCHAR (50),LOAITHUOC NVARCHAR (50),SOLUONG INT,
NGUOIBAN NVARCHAR (50),DONGIA INT ,THANHTIEN INT);
 
  CREATE TABLE HOADONNHAP
(ID INT IDENTITY(1,1) PRIMARY KEY,MATHUOC NVARCHAR(20), TENTHUOC NVARCHAR (30),HANSUDUNG NVARCHAR (50),NGAYNHAP NVARCHAR (50),LOAITHUOC NVARCHAR (50),SOLUONG INT,
NGUOINHAP NVARCHAR (50),DONGIA INT );
 
 CREATE TABLE HOADONXUAT
 (ID INT IDENTITY(1,1) PRIMARY KEY, TENTHUOC NVARCHAR (30),TENKH NVARCHAR (30),NGAYXUAT NVARCHAR (50),LOAITHUOC NVARCHAR (50),SOLUONG INT,
NGUOIBAN NVARCHAR (50),DONGIA INT ,THANHTIEN INT) ;
 drop table HOADONNHAP
 ----NHAP DU LIEU BANG THUOC-----
 INSERT INTO THUOC(MATHUOC,TENTHUOC,HANSUDUNG,NGAYNHAP,LOAITHUOC,SOLUONG,DONGIA) 
 VALUES ('DX1','Paracetamol','2023-8-21','2019-8-21',N'Giảm đau,hạ sốt',5,50000);
 INSERT INTO THUOC(MATHUOC,TENTHUOC,HANSUDUNG,NGAYNHAP,LOAITHUOC,SOLUONG,DONGIA) 
 VALUES ('DX2','Vitamin','2024-5-23','2019-8-3',N'Thuốc bổ',10,150000);
 
 ----NHAP DU LIEU BANG NHAP THUOC-----
 INSERT INTO NHAPTHUOC(MATHUOC,TENTHUOC,HANSUDUNG,NGAYNHAP,LOAITHUOC,SOLUONG,NGUOINHAP,DONGIA)
  VALUES ('DC1','Kirkland ','2025-10-10','2018-11-20',N'Trị đau khớp',7,N'Lê Văn Tèo',20000);
 INSERT INTO NHAPTHUOC(MATHUOC,TENTHUOC,HANSUDUNG,NGAYNHAP,LOAITHUOC,SOLUONG,NGUOINHAP,DONGIA)
  VALUES ('DP1','Kirkland ','2024-10-10','2018-11-20',N'Trị đau trĩ',7,N'Lê Văn Tủn',40000);
 ----NHAP DU LIEU BANG XUAT THUOC-----
INSERT INTO XUATTHUOC(MATHUOC,TENTHUOC,TENKH,NGAYXUAT,LOAITHUOC,SOLUONG,NGUOIBAN,DONGIA,THANHTIEN)
  VALUES ('DX1','Folic Acid',N'Võ Đình Trinh','2020-12-12','Trị thiếu máu',56,N'Trần Hết',5000,122222222);
 

----XOA BANG----
DROP TABLE THUOC;

DROP TABLE NHAPTHUOC;
DROP TABLE XUATTHUOC;

---TAO RANG BUOC---
ALTER TABLE NHAPTHUOC 
ADD CONSTRAINT NP_NT
FOREIGN KEY (MATHUOC)
REFERENCES THUOC(MATHUOC)

ALTER TABLE XUATTHUOC 
ADD CONSTRAINT NP_XT
FOREIGN KEY (MATHUOC)
REFERENCES THUOC(MATHUOC)


-----XOA RANG BUOC---
ALTER TABLE NHAPTHUOC DROP NP_NT
ALTER TABLE XUATTHUOC DROP NP_XT



