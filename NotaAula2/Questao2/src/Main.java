
        class CorridaUber {
            private double distancia;
            private int tempoEspera;
            private double tarifaBase;
            private double fatorDemanda;

            // Construtor
            public CorridaUber(double distancia, int tempoEspera, double tarifaBase, double fatorDemanda) {
                this.distancia = distancia;
                this.tempoEspera = tempoEspera;
                this.tarifaBase = tarifaBase;
                this.fatorDemanda = fatorDemanda;
            }

            public double calcularValorCorrida() {
                double valorFinal = (distancia * 2) + (tempoEspera * 0.5) + (tarifaBase * fatorDemanda);
                return valorFinal;
            }

            public void exibirDetalhesCorrida() {
                double valorFinal = calcularValorCorrida();
                System.out.println("Detalhes da Corrida:");
                System.out.println("Distância percorrida: " + distancia + " km");
                System.out.println("Tempo de espera: " + tempoEspera + " minutos");
                System.out.println("Tarifa base: R$" + tarifaBase);
                System.out.println("Fator de demanda: " + fatorDemanda);
                System.out.println("Valor final da corrida: R$" + valorFinal);
            }
        }

        public class Main {
            public static void main(String[] args) {
                CorridaUber corrida = new CorridaUber(10,15,7,2);

                corrida.exibirDetalhesCorrida();
            }
        }


