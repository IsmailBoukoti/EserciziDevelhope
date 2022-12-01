import java.util.Objects;
public class Smartphone implements Cloneable{
    String brandName;
    String modelName;
    int batterMah;
    SmartphonePrice producerPrice;
    SmartphonePrice retailPrice;
    @Override
    public String toString() {
        return "Smartphone{" +
                "brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", batterMah=" + batterMah +
                ", producerPrice=" + producerPrice +
                ", retailPrice=" + retailPrice +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return batterMah == that.batterMah && brandName.equals(that.brandName)
                && modelName.equals(that.modelName) && producerPrice.equals(that.producerPrice)
                && retailPrice.equals(that.retailPrice);
    }
    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterMah, producerPrice, retailPrice);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Smartphone clonedSmartphone = (Smartphone)super.clone();
        clonedSmartphone.producerPrice = this.producerPrice;
        clonedSmartphone.retailPrice = this.retailPrice;
        return clonedSmartphone;
    }
    public Smartphone(String brandName,String modelName,
                      int batterMah,SmartphonePrice producerPrice, SmartphonePrice retailPrice){
        this.brandName = brandName;
        this.modelName = modelName;
        this.batterMah = batterMah;
        this.producerPrice = producerPrice;
        this.retailPrice = retailPrice;
    }
}
