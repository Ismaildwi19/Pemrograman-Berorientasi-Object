package TestFolder;
class test
{
    public static void main(String args[]) {
        ManusiaTest mawar = new ManusiaTest();
        //System.out.println(mawar.nama);
        mawar.SetNama("mawar melati");
        System.out.println(mawar.GetNama());
        ManusiaTest human = new ManusiaTest("eko");
        System.out.println(human.GetNama());
    }
}