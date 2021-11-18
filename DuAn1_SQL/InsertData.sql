USE QL_RAPPHIM
GO

INSERT INTO [TheLoai]([TenTheLoai],[HIDE]) VALUES 
(N'Hành Động',0),
(N'Viễn Tưởng',0),
(N'Tình Cảm',0),
(N'Hài Kịch',0),
(N'Tâm Lý',0);
GO

INSERT INTO [NhanVien]([HoTen],[SDT],[GioiTinh],[ChucVu],[MatKhau],[HIDE]) VALUES 
(N'Phạm Lễ Nghĩa','0990090909',1,1,'123',0),
(N'Trần Chí','0990090908',0,1,'123',0),
(N'Võ Hùng Dương','0990090907',1,0,'123',0),
(N'Ngô Tiên Duy','0990090906',0,0,'123',0),
(N'Đào Đức Nguyên','0990090905',1,0,'123',0);
GO

INSERT INTO [Phim]([TenPhim],[NgayKhoiChieu],[NgayKetThuc],[QuocGia],[MaTheLoai],[DinhDang],[MaNhanVien],[HIDE]) VALUES
(N'MẮT BIẾC','10-10-2010','10-12-2010',N'VIỆT NAM','TL1','2D','NV1',0),
(N'AVENGER SECOND GAME','10-10-2011','10-12-2011',N'VIỆT NAM','TL2','2D','NV2',0),
(N'IRON MAN','10-10-2012','10-12-2012',N'VIỆT NAM','TL3','2D','NV3',0),
(N'NGƯỜI NHỆN MAN','10-10-2013','10-12-2013',N'VIỆT NAM','TL4','3D','NV4',0),
(N'IRON WOMEN','10-10-2014','10-12-2014',N'VIỆT NAM','TL5','3D','NV1',0);
GO

INSERT INTO [Phong]([SoHang],[HIDE]) VALUES 
(10, '0'),
(15, '0'),
(20, '0'),
(7, '0'),
(8, '0');
GO

INSERT INTO [LichChieu]([NgayChieu],[GioChieu],[MaPhim],[MaPhong],[HIDE]) VALUES 
('2021-11-20', '08:30', 'MP1', 'P1', 0),
('2021-11-20', '10:30', 'MP2', 'P2', 0),
('2021-11-20', '18:30', 'MP3', 'P3', 0),
('2021-11-20', '20:30', 'MP4', 'P4', 0),
('2021-11-20', '22:30', 'MP5', 'P5', 0);
GO

EXEC sp_TaoGhe 'P1'
GO
EXEC sp_TaoGhe 'P2'
GO
EXEC sp_TaoGhe 'P3'
GO
EXEC sp_TaoGhe 'P4'
GO
EXEC sp_TaoGhe 'P5'
GO

INSERT INTO [KhuyenMai]([MaKM],[TenKM],[ThongTinKM],[MucGiamGia],[NgayBatDau],[NgayKetThuc],[MaNhanVien],[HIDE]) VALUES --dương sửa
('HALLOWEEN',N'Tưng Bừng Sự Kiện Halloween', N'Mua 2 bắp được tặng 1 cái ống hút', 10 ,'10-10-2010','10-12-2010', 'NV1', 0),
('QUOCKHANH',N'Tưng Bừng Ngày Quốc Khánh 2-9', N'Mua 2 bắp được tặng 1 cái bao bóng',15 , '10-10-2010','10-12-2010', 'NV1', 0),
('QUOCTETHIEUNHI',N'Tưng Bừng Cùng Các Bé Thiếu Nhi 1-6', N'Mua 2 bắp được tặng 1 cái bao bóng', 10,'10-10-2010','10-12-2010' , 'NV1', 0),
('MUNGDANGMUNGXUAN',N'Chào Mừng Đảng Và Nhà Nước Đầu Xuân Năm Mới', N'Mua 2 bắp được tặng 1 cái bao bóng', 20 ,'10-10-2010','10-12-2010', 'NV1', 0),
('TET',N'Chúc Mừng Ngày Tết Đoàn Viên Sum Vầy', N'Mua 2 bắp được tặng 1 cái bao bóng', 10 ,'10-10-2010','10-12-2010', 'NV1', 0);
GO

INSERT INTO [KhachHangThanThiet]([Ten],[SDT],[Email],[NgayDK],[MucGiamGia],[SoLanSuDung],[MaNhanVien],[HIDE]) VALUES
(N'Nguyễn Văn Tèo', '0123456789', 'nvteo@gmail.com', '2021-11-07', 10, '0', 'NV1', 0),
(N'Nguyễn Văn Toàn', '0123456788', 'nvtoan@gmail.com', '2021-11-07', 10, '0', 'NV1', 0),
(N'Nguyễn Văn Tâm', '0123456787', 'nvtam@gmail.com', '2021-11-07', 10, '0', 'NV2', 0),
(N'Nguyễn Văn Thanh', '0123456786', 'nvthanh@gmail.com', '2021-11-07', 10, '0', 'NV3', 0),
(N'Nguyễn Văn Tin', '0123456785', 'nvtin@gmail.com', '2021-11-07', 10, '0', 'NV1', 0);
GO

INSERT INTO [HoaDon]([TongTien],[MaKM],[MaKHTT],[MucGiamGia],[ThanhTien],[NgayLap],[MaNhanVien],[HIDE]) VALUES 
(150000,'HALLOWEEN','KH1',20,120000,'2021-01-04','NV1',0), --2vé thường -1bắp -1nước
(270000,'MUNGDANGMUNGXUAN','KH2',30,189000,'2021-02-12','NV1',0), --2vé vip -combo2
(100000,'QUOCKHANH','KH3',25,75000,'2021-03-16','NV2',0), --1vé thường -1bắp -1nước
(150000,'TET',null,10,135000,'2021-04-01','NV3',0), --1vé vip -combo1
(50000,null,null,0,50000,'2021-05-04','NV1',0); --1vé thường
GO

INSERT INTO [Ve]([MaPhim],[MaLichChieu],[MaPhong],[MaGhe]) VALUES 
('MP1','LC1','P1','A1'), 
('MP1','LC1','P1','B2'),
('MP1','LC1','P1','C3'),
('MP1','LC1','P1','D4'),
('MP1','LC1','P1','E5'),
('MP1','LC2','P1','A1'),
('MP1','LC2','P1','B2'),
('MP1','LC2','P1','B3'),
('MP1','LC2','P1','C3'),
('MP1','LC2','P1','E5'),
('MP2','LC2','P1','A1'),
('MP2','LC2','P1','B2'),
('MP2','LC2','P1','B3'),
('MP2','LC2','P1','C3'),
('MP2','LC2','P1','E5'),
('MP3','LC2','P1','A1'),
('MP3','LC2','P1','B2'),
('MP3','LC2','P1','B3'),
('MP3','LC2','P1','C3'),
('MP3','LC2','P1','E5');
GO

INSERT INTO [DichVu]([MaDichVu],[TenDichVu],[GiaDichVu],[HIDE]) VALUES 
('BAP',N'Bắp',25000,0),
('NUOC',N'COCA',25000,0),
('COMBO1',N'2 BẮP 1 NƯỚC',50000,0),
('COMBO2',N'2 NƯỚC 2 BẮP',70000,0);
GO


INSERT INTO [HoaDonChiTiet]([MaVe],[GiaTien],[SoLuong],[ThanhTien],[MaHoaDon],[HIDE]) VALUES 
('VE1',50000,1,50000,'HD1',0),
('VE2',50000,1,50000,'HD1',0),
('VE5',100000,1,100000,'HD2',0),
('VE10',50000,1,50000,'HD2',0),
('VE3',100000,1,100000,'HD3',0),
('VE15',100000,1,100000,'HD4',0),
('VE4',50000,1,50000,'HD5',0);
GO

INSERT INTO [HoaDonChiTiet]([MaDichVu],[GiaTien],[SoLuong],[ThanhTien],[MaHoaDon],[HIDE]) VALUES 
('BAP',25000,1,25000,'HD1',0),
('NUOC',25000,1,25000,'HD1',0),
('COMBO2',70000,1,70000,'HD2',0),
('BAP',25000,1,25000,'HD3',0),
('NUOC',25000,1,25000,'HD3',0),
('COMBO1',50000,1,50000,'HD4',0);
GO




