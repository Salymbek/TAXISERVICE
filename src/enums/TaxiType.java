package enums;

import java.math.BigDecimal;

public enum TaxiType {
    STANDART(new BigDecimal(10),new BigDecimal(50)),
    COMFORT(new BigDecimal(20),new BigDecimal(100)),
    BUSINESS(new BigDecimal(30),new BigDecimal(150));

    private BigDecimal pricePerKM;
    private BigDecimal priceforLanding;

    TaxiType(BigDecimal pricePerKM, BigDecimal priceforLanding) {
        this.pricePerKM = pricePerKM;
        this.priceforLanding = priceforLanding;
    }

    public BigDecimal getPricePerKM() {
        return pricePerKM;
    }

    public void setPricePerKM(BigDecimal pricePerKM) {
        this.pricePerKM = pricePerKM;
    }

    public BigDecimal getPriceforLanding() {
        return priceforLanding;
    }

    public void setPriceforLanding(BigDecimal priceforLanding) {
        this.priceforLanding = priceforLanding;
    }
}
