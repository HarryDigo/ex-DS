import 'package:flutter/material.dart'; //imports do material, biblioteca de matemática e componentes usados
import 'dart:math';
import 'package:app_review/src/components/classification.dart';
import 'package:app_review/src/components/ideal_weight.dart';


class BmiForm extends StatefulWidget { //parte simples do construtor e estado do widget
    const BmiForm({super.key});

    @override
    State<BmiForm> createState() => _BmiFormState();
}

class _BmiFormState extends State<BmiForm> { //tudo
    final GlobalKey<FormState> _formKey = GlobalKey<FormState>(); //key usada para a validação do formulário
    TextEditingController altController = TextEditingController(); //controladores utilizados para pegar o texto escrito
    TextEditingController pesoController = TextEditingController();

    late String bmiResult; //variavel do resultado do imc (bmi = body mass index = indice de massa corporal = imc)
    late String classif; //variavel do resultado da classificação (classificação -> classif)
    late String idealW; //variavel do resultado do peso ideal (ideal weight -> idealW)

    @override
    void initState() { //estado inicial
        super.initState(); //estado inicial do parente
        bmiResult = "IMC:"; //coloca os textos de resultado como esses padrão para não ficar vazio
        classif = "Classificação:";
        idealW = "Peso Ideal:";
    }

    void _calcBmi() { //função de calcular o imc e todo o resto
        double alt = double.tryParse(altController.text.replaceAll(',', '.')) ?? 0; //pega o texto do controlador da altura, tenta dar parse para um double (se der errado, coloca o valor como 0) e troca todas as virgulas por pontos poruqe é inbgles
        double peso = double.tryParse(pesoController.text.replaceAll(',', '.')) ?? 0; //mema coisa

        double bmi = (peso / pow(alt, 2)); //cria a variavel do imc

        setState(() { //atualiza o estado da pagina/resultados
            if (alt <= 0 || peso <= 0) { //checa se o numero é real ou inválido
                bmiResult = " "; //parece meio estranho, mas deixa os textos do topo e baixo vazios e coloca a mensagem no do meio para ficar centralizado e bonitinho
                classif = "Um ou mais valores inválidos"; //mensagem customizada para esse caso de erro
                idealW = " ";
            } else {
                bmiResult = ("IMC: ${bmi.toStringAsFixed(2)}"); //coloca o texto do resultado com o imc aproximado a 2 casas decimais

                if (bmi < 18.5) {classif = "Classificação: Abaixo do peso";} //checa o imc em todas as categorias e muda o resultado de acordo
                else if (bmi < 25) {classif = "Classificação: Peso normal";}
                else if (bmi < 30) {classif = "Classificação: Sobrepeso";}
                else if (bmi < 35) {classif = "Classificação: Obesidade grau 1";}
                else if (bmi < 40) {classif = "Classificação: Obesidade grau 2";}
                else {classif = "Classificação: Obesidade grau 3";}

                idealW = "Peso ideal: ${(18.5 * pow(alt, 2)).toStringAsFixed(2)} - ${(24.9 * pow(alt, 2)).toStringAsFixed(2)}"; //coloca o resultado como x - x, com os xses sendo os valores calculados aproximados a 2 casas
            }
        });
    }
    

    @override
    Widget build(BuildContext context) { //build do formulário
        return Form( //retorno do form para ser colocado no home
            key: _formKey, //chave de validação dos campos de texto do formulário
            child: Padding( //padding do formlulalio
                padding: const EdgeInsets.all(15), //padding geral da coluna do formulário
                child: Column( //coluna com tudo do input
                    children: [
                        TextFormField( //text field da altura
                            decoration: const InputDecoration( //decoração só com a label
                                labelText: "Altura",
                            ),

                            validator: (String? value) { //validador
                                if (value == null || value.isEmpty) { //checa se o valor interno é nulo ou vazio
                                    return "Insira sua altura"; //retorna a mensagem de erro nesse caso
                                }
                                return null; //nulo nesse caso significa que tudo deu certo
                            },

                            controller: altController, //define o controlador desse field
                        ),
                        TextFormField( //cópia do de altura só que do peso
                            decoration: const InputDecoration(
                                labelText: "Peso"
                            ),

                            validator: (String? value) {
                                if (value == null || value.isEmpty) {
                                    return "Insira seu peso";
                                }
                                return null;
                            },

                            controller: pesoController,
                        ),
                        Padding( //padding do botão de submit do form
                            padding: const EdgeInsets.only(top: 15, bottom: 15),
                            child: Center( //objeto que centraliza o botão
                                child: ElevatedButton( //botão de submit
                                    onPressed: () { //quando clicado
                                        if (_formKey.currentState!.validate()) { //se todos os validadores retornam nulo
                                            _calcBmi(); //roda a função de calcular o imc
                                        }
                                    },
                                    child: const Text("Calcular IMC") //texto dentro do boton
                                ),
                            ),
                        ),
                        Container( //container dos resultados
                            decoration: boxDecor, //define a decoração como o preset definido la embaixo

                            child: Padding( //padding interna do container para não ficar feio
                                padding: const EdgeInsets.all(15.0),

                                child: Column(children: [ //coluna com o texto do resultado do imc e componentes dos outros
                                    Text(bmiResult), //texto simples do resultado de imc
                                    Classification(classif: classif), //componente da classificação
                                    IdealWeight(idealW: idealW) //componente do peso ideal
                                ],
                                ),
                            )
                        )
                    ],
                ),
            ),
        );
    }
}

final boxDecor = BoxDecoration( //decoração do container de resultados
    color: Colors.blue[300],
    borderRadius: const BorderRadius.all(
        Radius.circular(20)
    )
);