package back.vuedongsanback.models;

import java.util.List;

public class Consumes {
    private Integer total;
    private Integer year;
    private List<Consume>  consumes;
    public Consumes(Integer total, Integer year, List<Consume> consumes) {
        this.total = total;
        this.year = year;
        this.consumes = consumes;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public List<Consume> getConsumes() {
        return consumes;
    }

    public void setConsumes(List<Consume> consumes) {
        this.consumes = consumes;
    }


}
