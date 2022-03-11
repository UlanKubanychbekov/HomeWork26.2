package peaksoft;

public class City implements Comparable<City> {
    private int code;
    private String name;

    public City() {

    }

    public City(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(City code) {

      if (this.code > code.getCode()) {
            return -1;
        } else
            return 1;
    }

    @Override
    public String toString() {
        return
                "code: " + code +
                        ", name: '" + name;
    }


}
