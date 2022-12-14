public class Manager extends Pegawai {
    private double tunjangan;

    //Overloading constructor inherite superclass
    public Manager () {
      super();
    }
  
    //SETTER
    public void setTunjangan(double tunjangan) {
      this.tunjangan = tunjangan;
    }
  
    //GETTER
    public double getTunjangan() {
      return tunjangan;
    }
  
    //Overiding Method
    @Override
    public void display() {
      super.display();
      System.out.println("Tambah tunjangan :" + this.tunjangan);
      System.out.println("Total Gaji :");
      System.out.println(+getGajipokok()+getTunjangan());
    }
  }

