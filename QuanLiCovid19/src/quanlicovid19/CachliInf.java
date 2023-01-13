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
public class CachliInf {
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
    public String khaiBao;
    public String dauHieu;
    public String tiepXuc; 
    public String benh;
    public String thaiKi;
    public CachliInf( String HoVaTen, String CMND, String NamSinh, String GioiTinh, String QuocTich, String BHYT, String CongTy, String BoPhan, String DiaChi, String SDT,String Email,String khaiBao,String dauHieu,String tiepXuc,String benh,String thaiKi){
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
        this.khaiBao=khaiBao;
        this.dauHieu=dauHieu;
        this.tiepXuc=tiepXuc;
        this.benh=benh;
        this.thaiKi=thaiKi;
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
    public String getkhaiBao(){
        return khaiBao;
    
    }
    public String getdauHieu(){
        return dauHieu;
    }
    public String gettiepXuc(){
        return tiepXuc;
    }
    public String getbenh(){
        return benh;
    }
    public String getthaiKi(){
        return thaiKi;
    }
}
