public class Transport {

    private String name;
    private String color;
    private int sena;

    public Transport(String name, String color, int sena) {
        this.name = name;
        this.color = color;
        this.sena = sena;
    }
    public void method(){
        System.out.println(" медленно едем ");
    }
    public void met(){
        System.out.println("едем дальше");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSena() {
        return sena;
    }

    public void setSena(int sena) {
        this.sena = sena;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", sena=" + sena +
                '}';
    }
}
