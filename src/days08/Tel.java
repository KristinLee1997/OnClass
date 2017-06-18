package days08;

/**
 * Created by Administrator on 2017/4/18.
 */
public class Tel {
    public static void main(String[] args) {
        Telephone t=new Telephone();
        t.setName("Lee");
        t.setTele("13888888888");
        t.setEmail("321575867@qq.com");
        t.setAddress("Harbin");
        System.out.println(t.getName());
        System.out.println(t.getTele());
        System.out.println(t.getEmail());
        System.out.println(t.getAddress());
    }
}

class Telephone {
    String name;
    String tele;
    String email;
    String address;
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
    void setTele(String tele){
        this.tele=tele;
    }
    String getTele(){
        return tele;
    }
    void setEmail(String email){
        this.email=email;
    }
    String getEmail(){
        return email;
    }
    void setAddress(String address){
        this.address=address;
    }
    String getAddress(){
        return address;
    }
}
