package exercicioPOO;

public class Invoice {

    int itemFaturado;
    String descricaoItem;
    int qtnCompradaItem;
    float precoItem;

    public Invoice(int itemFaturado, String descricaoItem, int qtnCompradaItem, float precoItem) {
        this.setItemFaturado(itemFaturado);
        this.setDescricaoItem(descricaoItem);
        this.setQtnCompradaItem(qtnCompradaItem);
        this.setPrecoItem(precoItem);
    }

    public double getInvoiceAmount() {
        return qtnCompradaItem * precoItem;

    }

    public int getItemFaturado() {
        return itemFaturado;
    }

    public void setItemFaturado(int itemFaturado) {
        this.itemFaturado = itemFaturado;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getQtnCompradaItem() {
        return qtnCompradaItem;
    }

    public void setQtnCompradaItem(int qtnCompradaItem) {

        if (qtnCompradaItem < 0) {
            this.qtnCompradaItem = 0;
        } else {
            this.qtnCompradaItem = qtnCompradaItem;
        }
    }

    public float getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(float precoItem) {
        if (precoItem < 0) {
            this.precoItem = 0;
        } else {
            this.precoItem = precoItem;
        }
    }

}
