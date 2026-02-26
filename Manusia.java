public class Manusia
{
    private String nama = "noname";
    private boolean punyaTV = false;

    public Manusia(){

    }

    public Manusia(String nama){
        this.nama = nama;
    }

    public String namaSaya(){
        return this.nama;
    }

    public void beliTV(TV tiviku){
        this.punyaTV = true;
    }

    public void jualSemuaTV(){
        this.punyaTV = false;
    }

    public boolean cekTV(){
        return this.punyaTV;
    }

}