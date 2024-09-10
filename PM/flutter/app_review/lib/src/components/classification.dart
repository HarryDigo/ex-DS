import 'package:flutter/material.dart'; //import do material

class Classification extends StatelessWidget { //widget simplão pra mostrar o resultado da classificação
    const Classification({super.key, required this.classif,}); //mesma coisa do peso ideal, com o construtor e a string resultado

    final String classif; //variavel com o resultado da classificação (classif -> classificação)

    @override
    Widget build(BuildContext context) {
        return Padding( //padding do texto pra não ficar grudado
            padding: const EdgeInsets.only(top: 8),

            child: Text(classif), //texto sem estilo porque fica bonito ainda
        );
    }
}