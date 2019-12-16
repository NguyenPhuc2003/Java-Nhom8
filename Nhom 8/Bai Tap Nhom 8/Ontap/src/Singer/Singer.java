/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Singer;

import com.sun.org.apache.xml.internal.serialize.Serializer;
import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class Singer implements Serializable{

   
    private String singerName;
    private int Member;
    private String Country;
    private String Company ;
    private String Gender;

    public Singer() {
    }

   
     public Singer(String singerName, int Member, String Country, String Company, String Gender) {
        this.singerName = singerName;
        this.Member = Member;
        this.Country = Country;
        this.Company = Company;
        this.Gender = Gender;
    }

    /**
     * @return the singerName
     */
    public String getSingerName() {
        return singerName;
    }

    /**
     * @param singerName the singerName to set
     */
    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    /**
     * @return the Member
     */
    public int getMember() {
        return Member;
    }

    /**
     * @param Member the Member to set
     */
    public void setMember(int Member) {
        this.Member = Member;
    }

    /**
     * @return the Country
     */
    public String getCountry() {
        return Country;
    }

    /**
     * @param Country the Country to set
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * @return the Company
     */
    public String getCompany() {
        return Company;
    }

    /**
     * @param Company the Company to set
     */
    public void setCompany(String Company) {
        this.Company = Company;
    }

    /**
     * @return the Gender
     */
    public String getGender() {
        return Gender;
    }

    /**
     * @param Gender the Gender to set
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    @Override
    public String toString() {
        return "Mobile{" + "singerName=" + singerName + ", Member=" + Member + ", Country=" + Country + ", Company=" + Company + ", Gender=" + Gender + '}';
    }
    
     
}
