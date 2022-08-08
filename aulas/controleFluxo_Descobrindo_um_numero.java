package aulas;

public class controleFluxo_Descobrindo_um_numero {
    public static void main(String[] args) {
        /*Dado o valor de uma carro descubra em quantas vezes
        ele pode ser parcelado, porem: as parcelas nao podem ser mnores
        que mil reias.
         */
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000) {
                System.out.println("parcela" + parcela + " R$" + valorParcela);
            } else {
                System.out.println("saindo do laço");
                break;
            }
            System.out.println("fora do laço");

        }

    }
}
