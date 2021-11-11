USE QL_RAPPHIM
GO

--Tạo ghế
CREATE PROC sp_TaoGhe(@MaPhong VARCHAR(10))
as begin
	DECLARE @i int = 1, @j int =1, @maHang varchar(50)
	DECLARE @Hang varchar(50) = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
	DECLARE @soHang int = (SELECT SoHang from Phong where MaPhong = @MaPhong)
	while @i <= @soHang 
		begin
			SET @maHang = SUBSTRING(@Hang,@i,1)
			while @j <=20
				begin
					if @i > 4 
						insert into Ghe values (@maHang + CAST(@j AS varchar(5)),1,100000, @MaPhong, 0)
					else 
						insert into Ghe values (@maHang + CAST(@j AS varchar(5)),0,50000, @MaPhong, 0)
					set @j = @j +1
				end
				set @j = 1
				set @i = @i +1
		end
end
GO

--Doanh thu theo năm truyền tham số
CREATE PROCEDURE SP_DOANHTHUTHEONAM @year varchar(4)
	AS BEGIN
		SELECT 
		COUNT(MAHOADON) AS 'SOHOADON',
		SUM(THANHTIEN) AS 'TONG',YEAR(NGAYLAP) as 'Nam'
		FROM HOADON
		WHERE YEAR(ngaylap) like @YEAR
		group by YEAR(ngaylap)
	END
GO

--Doanh thu theo năm không truyền tham số
CREATE PROCEDURE SP_DOANHTHUNAM
	AS BEGIN
		SELECT 
		COUNT(MAHOADON) AS 'SOHOADON',
		SUM(THANHTIEN) AS 'TONG',YEAR(NGAYLAP) as 'Nam'
		FROM HOADON
		group by YEAR(NGAYLAP)
	END
GO

--Doanh thu theo tháng truyền tham số
CREATE PROCEDURE SP_DOANHTHUTHEOTHANG @MONTH varchar(2)
	AS BEGIN
		SELECT 
		COUNT(MAHOADON) AS 'SOHOADON',
		SUM(THANHTIEN) AS 'TONG',MONTH(NGAYLAP) as 'Nam'
		FROM HOADON
		WHERE MONTH(NGAYLAP) like @MONTH
		group by MONTH(NGAYLAP)
	END
GO

--Doanh thu theo tháng không truyền tham số
CREATE PROCEDURE SP_DOANHTHUTHANG
	AS BEGIN
		SELECT 
		COUNT(MAHOADON) AS 'SOHOADON',
		SUM(THANHTIEN) AS 'TONG',MONTH(NGAYLAP) as 'Nam'
		FROM HOADON
		group by MONTH(NGAYLAP)
	END
GO

--Thống kê Doanh thu từ time1 đến time2
CREATE PROCEDURE SP_DOANHTHUBETWEEN @TIME1 DATE, @TIME2 DATE
	AS BEGIN
		SELECT 
		COUNT(MAHOADON) AS 'SOHOADON',
		SUM(THANHTIEN) AS 'TONG'
		FROM HOADON
		WHERE NGAYLAP BETWEEN @TIME1 AND @TIME2
	END
GO

--THỐNG KÊ DOANH THU THEO  MÃ PHIM VÀ THEO NĂM /// đã sửa
CREATE PROCEDURE SP_DOANHTHUPHIM @YEAR VARCHAR(4)
	AS BEGIN
		SELECT VE.MAPHIM AS 'MAPHIM',
		SUM(HOADON.THANHTIEN) AS 'DOANHTHU',
		YEAR(HOADON.NGAYLAP) AS 'NAM'
		FROM ve JOIN HOADONCHITIET
		ON VE.MAVE=HOADONCHITIET.MAVE
		JOIN HOADON ON HOADONCHITIET.MAHOADON = HOADON.MAHOADON
		WHERE MAPHIM LIKE MAPHIM AND YEAR(HOADON.NGAYLAP) LIKE @YEAR
		GROUP BY MAPHIM,YEAR(HOADON.NGAYLAP)
	END
GO

CREATE PROCEDURE sp_TKKH_TheoThang (@Thang INT)
as BEGIN
	SELECT COUNT(khtt.MaKHTT) as SoLuongKhachHang,
		MONTH(khtt.NgayDK) as ThangDangKy
	FROM KhachHangThanThiet khtt
	WHERE MONTH(khtt.NgayDK) = @Thang
	GROUP BY khtt.MaKHTT, MONTH(khtt.NgayDK)
END
GO

CREATE PROCEDURE sp_TKKH_TheoNam (@Nam INT)
as BEGIN
	SELECT COUNT(khtt.MaKHTT) as SoLuongKhachHang,
		YEAR(khtt.NgayDK) as NamDangKy
	FROM KhachHangThanThiet khtt
	WHERE YEAR(khtt.NgayDK) = @Nam
	GROUP BY khtt.MaKHTT, YEAR(khtt.NgayDK)
END
GO

CREATE PROCEDURE sp_TKLX_TheoPhim (@MaPhim VARCHAR(10))
as BEGIN
	SELECT ph.TenPhim,
		COUNT(hdct.MAVE) as SoLuongNguoiXem
	FROM Phim ph
		INNER JOIN Ve v ON ph.MaPhim = v.MaPhim
		INNER JOIN HoaDonChiTiet hdct ON v.MaVe = hdct.MAVE
	WHERE ph.MaPhim = @MaPhim
	GROUP BY ph.TenPhim
	ORDER BY COUNT(hdct.MAVE) DESC
END
GO

-- SPECIFIC
CREATE PROCEDURE sp_TKKH_TheoThangspc (@Thang INT)
as BEGIN
	SELECT Ten, SoLanSuDung, MONTH(NgayDK) as ThangDangKy
	FROM KhachHangThanThiet
	WHERE MONTH(NgayDK) = @Thang
	GROUP BY MaKHTT, Ten, SoLanSuDung, MONTH(NgayDK)
END
GO

CREATE PROCEDURE sp_TKKH_TheoNamspc (@Nam INT)
as BEGIN
	SELECT Ten, SoLanSuDung, YEAR(NgayDK) as NamDangKy
	FROM KhachHangThanThiet
	WHERE YEAR(NgayDK) = @Nam
	GROUP BY MaKHTT, Ten, SoLanSuDung, YEAR(NgayDK)
END
GO


