package br.edu.ifsul.objetivo1.model;

import java.sql.Date;
import java.sql.Time;

public class Locacao {
    private int id;
    private Date dataLocacao;
    private Time horaLocacao;
    private Date dataDevolucao;
    private Time horaDevolucao;
    private int quilometragem;
    private double valorCalcao;
    private double valor_locacao;
    private boolean devolvido;

    public Locacao() {
    }

    public Locacao(int id, Date dataLocacao, Time horaLocacao, Date dataDevolucao, Time horaDevolucao, int quilometragem, double valorCalcao, double valor_locacao, boolean devolvido) {
        this.id = id;
        this.dataLocacao = dataLocacao;
        this.horaLocacao = horaLocacao;
        this.dataDevolucao = dataDevolucao;
        this.horaDevolucao = horaDevolucao;
        this.quilometragem = quilometragem;
        this.valorCalcao = valorCalcao;
        this.valor_locacao = valor_locacao;
        this.devolvido = devolvido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Time getHoraLocacao() {
        return horaLocacao;
    }

    public void setHoraLocacao(Time horaLocacao) {
        this.horaLocacao = horaLocacao;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Time getHoraDevolucao() {
        return horaDevolucao;
    }

    public void setHoraDevolucao(Time horaDevolucao) {
        this.horaDevolucao = horaDevolucao;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public double getValorCalcao() {
        return valorCalcao;
    }

    public void setValorCalcao(double valorCalcao) {
        this.valorCalcao = valorCalcao;
    }

    public double getValor_locacao() {
        return valor_locacao;
    }

    public void setValor_locacao(double valor_locacao) {
        this.valor_locacao = valor_locacao;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    @Override
    public String toString() {
        return "Locacao{" +
                "dataLocacao=" + dataLocacao +
                ", horaLocacao=" + horaLocacao +
                ", dataDevolucao=" + dataDevolucao +
                ", horaDevolucao=" + horaDevolucao +
                ", quilometragem=" + quilometragem +
                ", valorCalcao=" + valorCalcao +
                ", valor_locacao=" + valor_locacao +
                ", devolvido=" + devolvido +
                '}';
    }
}
