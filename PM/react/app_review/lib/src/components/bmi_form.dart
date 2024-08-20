import 'dart:math';

import 'package:flutter/material.dart';

class BmiForm extends StatefulWidget {
    const BmiForm({super.key});

    @override
    State<BmiForm> createState() => _BmiFormState();
}

class _BmiFormState extends State<BmiForm> {
    final GlobalKey<FormState> _formKey = GlobalKey<FormState>();
    TextEditingController altController = TextEditingController();
    TextEditingController pesoController = TextEditingController();

    late String bmiResult;

    @override
    void initState() {
        super.initState();
        bmiResult = " ";
    }

    void _calcBmi() {
        double alt = double.tryParse(altController.text.replaceAll(',', '.')) ?? 0;
        double peso = double.tryParse(pesoController.text.replaceAll(',', '.')) ?? 0;

        setState(() {
            if (alt == 0 || peso == 0) {
                bmiResult = "Um ou mais Valores Inválidos";
            } else {
                bmiResult = ("IMC: ${(peso / pow(alt, 2)).toStringAsFixed(2)}");
            }
        });
    }
    

    @override
    Widget build(BuildContext context) {
        return Form(
            key: _formKey,
            child: Padding(
                padding: const EdgeInsets.all(15),
                child: Column(
                    children: [
                        TextFormField(
                            decoration: const InputDecoration(
                                labelText: "Altura",
                            ),
                            validator: (String? value) {
                                if (value == null || value.isEmpty) {
                                    return "Insira sua altura";
                                }
                                return null;
                            },
                            controller: altController,
                        ),
                        TextFormField(
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
                        Padding(
                            padding: const EdgeInsets.only(top: 15),
                            child: Center(
                                child: ElevatedButton(
                                    onPressed: () {

                                        if (_formKey.currentState!.validate()) {
                                            _calcBmi();
                                        }
                                    },
                                    child: const Text("Calcular IMC")
                                ),
                            ),
                        ),
                        Text(bmiResult)
                    ],
                ),
            ),
        );
    }
}