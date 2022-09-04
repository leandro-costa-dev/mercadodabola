package mercadodabola;

import java.math.BigDecimal;

public abstract class Clube {
    String nomeClube;
    int reputacaoHistoricaClube;
    BigDecimal saldoCaixa;

    public String getNomeClube() {
        return nomeClube;
    }

    public void setNomeClube(String nomeClube) {
        this.nomeClube = nomeClube;
    }

    public int getReputacaoHistoricaClube() {
        return reputacaoHistoricaClube;
    }

    public void setReputacaoHistoricaClube(int reputacaoHistoricaClube) {
        this.reputacaoHistoricaClube = reputacaoHistoricaClube;
    }

    public BigDecimal getSaldoCaixa() {
        return saldoCaixa;
    }

    public void setSaldoCaixa(BigDecimal saldoCaixa) {
        this.saldoCaixa = saldoCaixa;
    }
}

