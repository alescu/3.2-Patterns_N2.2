import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Map;
import java.util.LinkedHashMap;

public class Stockbroker {
    private String name, assessment;
    private Double reliability, price;
    private Map<String, String> news = new LinkedHashMap<String, String>();

    public Stockbroker(String name, String assessment, Double reliability, Double price){
        this.name=name;
        this.assessment = assessment;
        this.reliability = reliability;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAssessment() {
        return assessment;
    }

    public void setAssessment(String assessment) {
        this.assessment = assessment;
    }

    public Double getReliability() {
        return reliability;
    }

    public void setReliability(Double reliability) {
        this.reliability = reliability;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
