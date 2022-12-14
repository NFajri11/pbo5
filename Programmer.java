public class Programmer extends Pegawai {
    private double bonus;
  // Overloading constructor inherite superclass
  public Programmer() {
    super();
  }
  //SETTER
  public void setBonus(double bonus) {
    this.bonus = bonus;
  }
  //GETTER
  public double getBonus() {
    return bonus;
  }
  //Overriding Method
  @Override
  public void display() {
    super.display();
    System.out.println("Tambah Bonus \t :"+ this.bonus);
    System.out.println("Total Gaji :");
    System.out.println(+getGajipokok()+getBonus());
  }
}