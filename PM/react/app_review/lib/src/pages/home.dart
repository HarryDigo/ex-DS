import 'package:flutter/material.dart'; //imports do material e dos componentes utilizados.
import '../components/general_appbar.dart';
import '../components/bmi_form.dart';

class Home extends StatefulWidget { //parte simples do stateful widget, que só define o construtor e cria o estado da página
    const Home({super.key});

    @override
    _HomeState createState() => _HomeState();
}

class _HomeState extends State<Home> {
    @override
    Widget build(BuildContext context) {
        return Scaffold( //scaffold principal
            body: Padding( //padding da coluna com o título e o container do formulário
                padding: const EdgeInsets.all(8.0),
                child: Column(
                    children: [
                        const Text("BQ Health", style: titleStyle,), //título, estilizado com o preset definido lá embaixo do arquivo

                        Padding( //container principal, com o formulário
                            padding: const EdgeInsets.only(top: 30), //margem no topo do container do form
                            child: Container(
                                decoration: boxDecor, //estilizado com o preset la embaixo
                                width: double.infinity, //define o tamanho como
                                child: const BmiForm(), //componente do formulário
                            ),
                        )
                    ],
                ),
            ),
            appBar: appBarGen, //componente de uma appbar bem vazia

            drawer: const Drawer(), //drawer vazio pelo botão bonitinho :3

            floatingActionButton: FloatingActionButton( //botão basico no canto (porque é bonitinho também)
                child: const Icon(Icons.adb), //icone de "debug"

                onPressed: () {print("teste");}, //printa uma mensagem de debug no console
            ),
        );
    }
}

const titleStyle = TextStyle( //dois estilos utilizados aqui
    fontSize: 32,
    fontFamily: "Arial",
    color: Color(0xff3399ff),
    fontWeight: FontWeight.bold,
);

const boxDecor = BoxDecoration(
    color: Color(0xffd1d5d9),
    borderRadius: BorderRadius.all(
        Radius.circular(20)
    )
);