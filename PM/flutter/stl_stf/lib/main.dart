import 'package:flutter/material.dart';

void main() {
    runApp(const MyApp());
}

class MyApp extends StatelessWidget {
    const MyApp({super.key});

    @override
    Widget build(BuildContext context) {
        return const MaterialApp(
            home: Home(),
        );
    }
}

class Home extends StatefulWidget {
    const Home({super.key});

    @override
    State<Home> createState() => _HomeState();
}

class _HomeState extends State<Home> {
    double tamanho = 400.0;

    @override
    Widget build(BuildContext context) {
        return  Scaffold(
            body: Column(
                children: [
                    Center(
                        child: Icon(Icons.add_moderator_outlined, size: tamanho),
                    ),
                    Row(
                        mainAxisAlignment: MainAxisAlignment.spaceAround,
                        children: [
                            OutlinedButton.icon(
                                onPressed: () {
                                    setState(() {
                                        if (tamanho + 16 < MediaQuery.of(context).size.width && tamanho + 16 < MediaQuery.of(context).size.height) {
                                            tamanho += 16;
                                        }
                                    });
                                },
                                icon: const Icon(Icons.add),
                                label: const Text("amogus", textAlign: TextAlign.center,),
                            ),
                            OutlinedButton.icon(
                                onPressed: () {
                                    setState(() {
                                        if (tamanho  - 16 > 0) {
                                            tamanho -= 16;
                                        }
                                    });
                                },
                                icon: const Icon(Icons.remove),
                                label: const Text("ayaya", textAlign: TextAlign.center,),
                            ),
                        ],
                    ),
                ],
            ),
        );
    }
}