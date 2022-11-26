public class Main {
    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai();
        Manager manager = new Manager();
        Programmer programmer = new Programmer();
        pegawai.setName         ("Nurul ");
        manager.setName         ("Fajri ");
        programmer.setName      ("Steven");
        pegawai.setGajipokok    (3500000);
        manager.setGajipokok    (7000000);
        programmer.setGajipokok (6500000);
        manager.setTunjangan    (2000000);
        programmer.setBonus     (500000);
        pegawai.display();
        manager.display();
        programmer.display();
      }
}