/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlicovid19;

/**
 *
 * @author admin
 */
public class InfCachLi {
     public String HoVaTen;
    public String CMND;
    public String NamSinh;
    public String GioiTinh;
    public String QuocTich;
    public String BHYT;
    public String CongTy;
    public String BoPhan;
    public String DiaChi;
    public String SDT;
    public String Email;
    public String TgianBatDauCachLi;
    public String TgianCachLi;
    public String MucDo; 
    public String DiaDiem;
    public String DaTest;
     public String HinhThucTest;
    public InfCachLi( String HoVaTen, String CMND, String NamSinh, String GioiTinh, String QuocTich, String BHYT, String CongTy, String BoPhan, String DiaChi, String SDT,String Email,String TgianBatDauCachLi,String TgianCachLi,String MucDo,String DiaDiem,String DaTest,String HinhThucTest){
        this.BHYT=BHYT;
        this.BoPhan=BoPhan;
        this.CMND=CMND;
        this.CongTy=CongTy;
        this.DiaChi=DiaChi;
        this.Email=Email;
        this.GioiTinh=GioiTinh;
        this.HoVaTen=HoVaTen;
        this.NamSinh=NamSinh;
        this.QuocTich=QuocTich;
        this.SDT=SDT;
        this.TgianBatDauCachLi=TgianBatDauCachLi;
        this.TgianCachLi=TgianCachLi;
        this.MucDo=MucDo;
        this.DiaDiem=DiaDiem;
        this.DaTest=DaTest;
        this.HinhThucTest = HinhThucTest;
    }
    public String getBHYT(){
        return BHYT;
    }
    public String getBoPhan(){
        return BoPhan;
    }
    public String getCMND(){
        return CMND;
    }
    public String getCty(){
        return CongTy;
    } 
    public String getDiaChi(){
        return DiaChi;
    } 
    public String getEmail(){
        return Email;
    } 
    public String getGioiTinh(){
        return GioiTinh;
    } 
    public String getHovaTen(){
        return HoVaTen;
    } 
    public String getNamSinh(){
        return NamSinh;
    } 
    public String getQuocTich(){
        return QuocTich;
    } 
    public String getSDT(){
        return SDT;
    } 
    public String getTgianBatDauCachLi(){
        return TgianBatDauCachLi;
    
    }
    public String getTgianCachLi(){
        return TgianCachLi;
    }
    public String getMucDo(){
        return MucDo;
    }
    public String getDiaDiem(){
        return DiaDiem;
    }
    public String getDaTest(){
        return DaTest;
    }
     public String getHinhThucTest(){
        return HinhThucTest;
    }
}
