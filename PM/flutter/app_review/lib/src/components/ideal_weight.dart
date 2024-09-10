import 'package:flutter/material.dart'; //import do material (como sempre)

class IdealWeight extends StatelessWidget { //widget simples com um texto com o resultado gerado do método no formulário
    const IdealWeight({super.key, required this.idealW,}); //construtor com a variavel para o texto de resultado necessário

    final String idealW; //definição da variavel de peso ideal (ideal weight -> idealW)

    @override
    Widget build(BuildContext context) {
        return Padding( //padding do texto para não ficar grudado
            padding: const EdgeInsets.only(top: 8),

            child: Text(idealW), //texto sem estilização, acho que até ficou bem bonito
        );
    }
}