package TestFolder;
public class ManusiaTest
{
    private String nama;
    
    //constructor 1
    public ManusiaTest(){
        nama="sebut saja mawar";
    }

    //constructor 2
    public ManusiaTest(String name){
        this.nama = name;
    }

    //encapsulation get-set method
    public void SetNama(String name){
        this.nama = name;
    }

    public String GetNama(){
        return this.nama;
    }

}