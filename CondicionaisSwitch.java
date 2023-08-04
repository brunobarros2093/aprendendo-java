public class CondicionaisSwitch {

    public static void main(String[] args) {
        int mes = 8;
        switch (mes) {
            case 1:
                System.out.println("O mês é janeiro");
                break; // break = para = sai do fluxo
            case 2:
                System.out.println("O mês é fevereiro");
                break;
            case 3:
                System.out.println("O mês é março");
                break;
            case 4:
                System.out.println("O mês é abril");
                break;
            case 5:
                System.out.println("O mês é maio");
                break;
            case 6:
                System.out.println("O mês é junho");
                break;
            case 7:
                System.out.println("O mês é julho");
                break;
            case 8:
                System.out.println("O mês é agosto");
                break;
            case 9:
                System.out.println("O mês é setembro");
                break;
            case 10:
                System.out.println("O mês é outubro");
                break;
            case 11:
                System.out.println("O mês é novembro");
                break;
            case 12:
                System.out.println("O mês é dezembro");
                break;
            default: // default = padrão
                System.out.println("Mês inválido");
                break;
        }
    }
}