package mercadodabola;

import java.math.BigDecimal;

public class Jogador extends Clube {

    String nomeJogador;
    int idadeJogador;
    int reputacaoHistoricaJogador;
    BigDecimal apetiteFinanceiroJogador;
    BigDecimal precoJogador;

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public int getIdadeJogador() {
        return idadeJogador;
    }

    public void setIdadeJogador(int idadeJogador) {
        this.idadeJogador = idadeJogador;
    }

    public int getReputacaoHistoricaJogador() {
        return reputacaoHistoricaJogador;
    }

    public void setReputacaoHistoricaJogador(int reputacaoHistoricaJogador) {
        this.reputacaoHistoricaJogador = reputacaoHistoricaJogador;
    }

    public BigDecimal getApetiteFinanceiroJogador() {
        return apetiteFinanceiroJogador;
    }

    public void setApetiteFinanceiroJogador(BigDecimal apetiteFinanceiroJogador) {
        this.apetiteFinanceiroJogador = apetiteFinanceiroJogador;
    }

    public BigDecimal getPrecoJogador() {
        return precoJogador;
    }

    public void setPrecoJogador(BigDecimal precoJogador) {
        this.precoJogador = precoJogador;
    }

}
