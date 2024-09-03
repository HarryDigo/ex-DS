import 'dart:math';

import 'package:app_review/src/components/classification.dart';
import 'package:app_review/src/components/ideal_weight.dart';
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
    late String classif;
    late String idealW;

    @override
    void initState() {
        super.initState();
        bmiResult = "IMC:";
        classif = "Classificação:";
        idealW = "Peso Ideal:";
    }

    void _calcBmi() {
        double alt = double.tryParse(altController.text.replaceAll(',', '.')) ?? 0;
        double peso = double.tryParse(pesoController.text.replaceAll(',', '.')) ?? 0;

        double bmi = (peso / pow(alt, 2));

        setState(() {
            if (alt == 0 || peso == 0) {
                bmiResult = " ";
                classif = "Um ou mais valores inválidos";
                idealW = " ";
            } else {
                bmiResult = ("IMC: ${bmi.toStringAsFixed(2)}");
                if (bmi < 18) classif = ""
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
                            padding: const EdgeInsets.only(top: 15, bottom: 15),
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
                        Container(
                            child: Column(children: [
                                Text(bmiResult),
                                Classification(classif: classif),
                                IdealWeight(idealW: idealW)
                            ],
                            )
                        )
                    ],
                ),
            ),
        );
    }
}