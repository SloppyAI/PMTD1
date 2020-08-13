/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * inner join open the template in the editor.
 */
package Database;

import Helper.sql_Helper;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class DAL {

    public static ResultSet GetAllCongViec() {
        String sql = "select TENCTY, TENCV, DIADIEM, Luong, NgayDang "
                + "from CONGTY inner join CONGVIEC "
                + "on CONGTY.ID_CONGTY = CONGVIEC.ID_CONGTY";
        return DBConnection.GetData(sql);
    }

    //Tạo hàm select dữ liệu sắp xếp từ Database
    //Sắp xếp theo ngày đăng mới nhất
    public static ResultSet SXBaiDangMoiNhat() {
        String sql = " select TENCTY, TENCV, DIADIEM, Luong, NgayDang from CONGTY inner join CONGVIEC "
                + "on CONGTY.ID_CONGTY = CONGVIEC.IDCV "
                + "order by NgayDang Desc";
        return DBConnection.GetData(sql);
    }

    //Sắp xếp theo ngày đăng cũ nhất
    public static ResultSet SXBaiDangCuNhat() {
        String sql = " select TENCTY, TENCV, DIADIEM, Luong, NgayDang from CONGTY inner join CONGVIEC "
                + "on CONGTY.ID_CONGTY = CONGVIEC.IDCV "
                + "order by NgayDang Asc";
        return DBConnection.GetData(sql);
    }

    //Sắp xếp theo lương từ cao đến thấp
    public static ResultSet SXBaiDangLuongDESC() {
        String sql = " select TENCTY, TENCV, DIADIEM, Luong, NgayDang from CONGTY inner join CONGVIEC "
                + "on CONGTY.ID_CONGTY = CONGVIEC.IDCV "
                + "order by Luong Desc";
        return DBConnection.GetData(sql);
    }

    //Sắp xếp theo lương từ thấp đến cao
    public static ResultSet SXBaiDangLuongASC() {
        String sql = " select TENCTY, TENCV, DIADIEM, Luong, NgayDang from CONGTY inner join CONGVIEC "
                + "on CONGTY.ID_CONGTY = CONGVIEC.IDCV "
                + "order by Luong Asc";
        return DBConnection.GetData(sql);
    }

    //Hàm tìm kiếm 
    public static ResultSet DALTimKiem(String TenCV, String TenNganh, String MucLuong) {
        String sql = "exec dbo.spTimKiem N'"+TenCV+"', N'"+TenNganh+"', N'"+MucLuong+"'";
                
        System.out.println(sql);
        return DBConnection.GetData(sql);
    }
}
