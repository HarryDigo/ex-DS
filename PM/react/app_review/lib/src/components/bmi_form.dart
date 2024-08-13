import 'package:flutter/material.dart';

class BmiForm extends StatefulWidget {
    const BmiForm({super.key});

    @override
    State<BmiForm> createState() => _BmiFormState();
}

class _BmiFormState extends State<BmiForm> {
    @override
    Widget build(BuildContext context) {
        return Form(
            child: Padding(
                padding: const EdgeInsets.all(15),
                child: Column(
                    children: [
                        TextFormField(
                            decoration: const InputDecoration(
                                labelText: "Altura"
                            ),
                        ),
                        TextFormField(
                            decoration: const InputDecoration(
                                labelText: "Peso"
                            ),
                        ),
                        Padding(
                            padding: const EdgeInsets.only(top: 15),
                            child: Center(
                                child: ElevatedButton(
                                    onPressed: () {},
                                    child: const Text("Calcular IMC")
                                ),
                            ),
                        )
                    ],
                ),
            ),
        );
    }
}