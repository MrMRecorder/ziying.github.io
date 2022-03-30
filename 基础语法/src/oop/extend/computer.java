package oop.extend;

public class computer {

    String ram;
    String disk;
    String cpu;

    public computer(String ram, String disk, String cpu) {
        this.ram = ram;
        this.disk = disk;
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }


    public computer() {
    }

    public String getDerails(){

        return "ram: "+ram+"disk"+disk+"cpu"+cpu;

    }

}

class Pc extends computer{

    private String brand;

    public Pc() {
    }

    public Pc(String ram, String disk, String cpu, String brand) {
        super(ram, disk, cpu);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String info(){

        return getDerails()+this.brand;

    }

}

class NotePad extends computer{

    private String color;

    public NotePad() {
    }

    public NotePad(String ram, String disk, String cpu, String color) {
        super(ram, disk, cpu);
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String info(){

        return getDerails()+this.color;

    }
}

