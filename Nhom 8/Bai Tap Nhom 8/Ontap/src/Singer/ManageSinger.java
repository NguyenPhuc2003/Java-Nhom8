/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Singer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class ManageSinger {
    ArrayList<Singer> list;

    public ManageSinger() {
        list = new ArrayList<>();
    }

    public ManageSinger(ArrayList<Singer> list) {
        this.list = list;
    }
    
    public void addSinger(Singer mb)
    {
        list.add(mb);
    }

    public ArrayList<Singer> getList() {
        return list;
    }  
    
    public void update (Singer sg)
    {
        for (Singer singer : list) {
            if(singer.getSingerName() .equals(sg.getSingerName()))
            {
                singer.setMember(sg.getMember());
                singer.setCountry(sg.getCountry());
                singer.setGender(sg.getGender());
                singer.setCompany(sg.getCompany());
            }
        }
    }
    public void delete (Singer mb)
    {
        for(Singer singer : list)
        {
            if(singer.getSingerName().equals(mb.getSingerName()))
            {
                list.remove(singer);
                return;
            }
            
        }
    }
    
    public Singer timKiem(String Name){
        
        for (Singer mobile : list) {
           if(mobile.getSingerName().equals(Name)){
               return mobile;
           } 
        }
        return null;
    }
    public void sortName(){
        Collections.sort(list,new Comparator<Singer>() {

            @Override
            public int compare(Singer t, Singer t1) {
                return t.getSingerName().compareTo(t1.getSingerName());
            }
        });
       
    }
    public void sortSL(){
        Collections.sort(list,new Comparator<Singer>() {

            @Override
            public int compare(Singer t, Singer t1) {
                int tt1 = t.getMember();
                int tt2 = t1.getMember();
               if(tt1 == tt2)
               {
                   return 0;
               }
               else if(tt1>=tt2)
               {
                   return 1;
               }
               else
               {
                   return -1;
               }
                
            }
        });
       
    }
}
    
    

