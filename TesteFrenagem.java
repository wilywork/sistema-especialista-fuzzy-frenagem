import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.FunctionBlock;
import net.sourceforge.jFuzzyLogic.rule.Variable;

public class TesteFrenagem {
    public static void main(String[] args) {
        String fileName = "frenagem.fcl";
        FIS fis = FIS.load(fileName, true);
        
        if (fis == null) {
            System.err.println("Não foi possível carregar o arquivo: '" + fileName + "'");
            return;
        }

        FunctionBlock fb = fis.getFunctionBlock("FrenagemControl");

        System.out.println("Teste 1:");
        executarTeste(fb, 50, 20, 0.6, 1800, 2);

        System.out.println("\nTeste 2:");
        executarTeste(fb, 120, 5, 0.2, 2500, 8);

        System.out.println("\nTeste 3:");
        executarTeste(fb, 30, 80, 0.8, 1000, 0);
    }

    private static void executarTeste(FunctionBlock fb, double velocidade, double distancia, double condicaoEstrada, double pesoVeiculo, double tempo) {
        fb.setVariable("Velocidade", velocidade);
        fb.setVariable("Distancia", distancia);
        fb.setVariable("Condicao_Estrada", condicaoEstrada);
        fb.setVariable("Peso_Veiculo", pesoVeiculo);
        fb.setVariable("Tempo", tempo);

        fb.evaluate();

        Variable frenagem = fb.getVariable("Frenagem");
        System.out.println("Frenagem calculada: " + frenagem.getValue() + "%");
    }
}
